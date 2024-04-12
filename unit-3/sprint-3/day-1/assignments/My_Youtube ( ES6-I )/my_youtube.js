
// API = AIzaSyDV4GiEVSKZq4rnAIZx-kWdt325wRpQYoQ


// Keyboard enter button 

document.querySelector("#query").addEventListener("keypress",(event) => {
    if(event.key === "Enter"){
        document.querySelector("#btn").click();
    }
})

// show data on the page 

let query;
let main = async ()=>{
    query = document.getElementById("query").value;
    let data = await get_data(query)
    append(data);
}

let get_data = async (query)=> {
    const url = `https://youtube.googleapis.com/youtube/v3/search?part=snippet&maxResults=20&q=${query}f&key=AIzaSyDV4GiEVSKZq4rnAIZx-kWdt325wRpQYoQ`

    let res = await fetch(url);
    let data = await res.json();
    // console.log(data.items)
    return data.items;
}

let append = (data)=> {
    let container = document.querySelector("#container")
    container.innerHTML = null;
    
    data.forEach((elem) => {

        let image = document.createElement("img");
        image.src = elem.snippet.thumbnails.medium.url

        let title = document.createElement("h4");
        title.innerText = elem.snippet.title;

        let div = document.createElement("div");
        div.setAttribute("class","video")
        div.onclick = ()=>{
            save_video(elem);
        }

        div.append(image,title);
        container.append(div);
    })
}


let save_video = (elem) => {
    localStorage.setItem("video",JSON.stringify(elem));
    window.location.href="video.html"
}


// Default Popular videos Playlist

let data2;
let landing_videos = async () => {
    const dash = "https://youtube.googleapis.com/youtube/v3/videos?part=snippet&chart=mostPopular&maxResults=20&regionCode=IN&key=AIzaSyDV4GiEVSKZq4rnAIZx-kWdt325wRpQYoQ"

    let res = await fetch(dash);
    let arr = await res.json();
    data2 = arr.items
    console.log(data2)
    append(data2)
}

landing_videos();


//  Filter based on Channel Id

let filter_id = document.querySelector("#filter_id") 
filter_id.onclick = ()=>{

    let after_filter = data2.filter((elem) => {
        return elem.snippet.channelId == "UCz1D0n02BR3t51KuBOPmfTQ"
        // console.log(a.snippet.channelId)
    })
    append(after_filter);
}