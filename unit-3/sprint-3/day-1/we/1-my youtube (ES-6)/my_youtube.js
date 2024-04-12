// API Key = AIzaSyDV4GiEVSKZq4rnAIZx-kWdt325wRpQYoQ

//   Key board button press

document.querySelector("#query").addEventListener("keypress", function (event) {
  if (event.key === "Enter") {
    document.querySelector("#btn").click();
  }
});

// Search Section
let query;
let search = async () => {
  query = document.getElementById("query").value;
  let data = await get_data(query);
  append(data);
};

let get_data = async (query) => {
  const url = `https://youtube.googleapis.com/youtube/v3/search?part=snippet&maxResults=20&q=${query}&key=AIzaSyDV4GiEVSKZq4rnAIZx-kWdt325wRpQYoQ`;

  let res = await fetch(url);
  let data = await res.json();
  // console.log(data);
  return data.items;
};

let append = (data) => {
  let container = document.querySelector("#container");
  container.innerHTML = null;

  data.forEach((elem) => {
    let image = document.createElement("img");
    image.src = elem.snippet.thumbnails.medium.url;

    let title = document.createElement("h4");
    title.innerText = elem.snippet.title;

    let div = document.createElement("div");
    div.setAttribute("class", "video");
    div.onclick = ()=> {
      save_video(elem);
    }

    div.append(image, title);
    container.append(div);
  });
};


let save_video = (elem) =>{
  localStorage.setItem("video",JSON.stringify(elem))
  window.location.href="video.html";
}


  // Sort 

  let sort = document.getElementById("sort_by_time");
  sort.onclick = async () =>{
    let data = await get_data(query)
    console.log(data)

    data.sort((a,b)=>{
      if(a.snippet.publishTime>b.snippet.publishTime) return 1;
    })
  }