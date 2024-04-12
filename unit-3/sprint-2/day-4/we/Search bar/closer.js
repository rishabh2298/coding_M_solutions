async function main() {
  let query = document.querySelector("#query").value;
  let display = await getData(query);
  append(display);
}

async function getData(query) {
  const url = `http://www.omdbapi.com/?s=${query}&apikey=7431da88`;

  let res = await fetch(url);
  let data = await res.json();
  return data.Search;
}

function append(data) {
    if(!data){
        return;
    }

  let container = document.querySelector("#movies");
  container.innerHTML = null;

  data.forEach(function (el) {
    let image = document.createElement("img");
    image.src = el.Poster;

    let h4 = document.createElement("h3");
    h4.innerText = el.Title;

    div = document.createElement("div");
    div.append(image, h4);

    container.append(div);
  });
}

let id;
function debounce(fun,delay){
    if(id){
        clearTimeout(id);
    }

    id = setTimeout(function(){
        fun();
    },delay)
}
