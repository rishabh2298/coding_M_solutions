
let query;
let arr;
async function main() {
    query = document.querySelector("#query").value;
    
    let data = await get_data(query)
   
    for(let i=0; i<data.Search.length; i++){
        data.Search[i].Rating =+ (Math.random()*10).toFixed(2);
        let year =+ data.Search[i].Year
        data.Search[i].Year =+year;
    }
    arr = data.Search
    console.log(arr)
    append(data.Search)
}

async function get_data(query) {
    const url = `http://www.omdbapi.com/?s=${query}&apikey=7431da88`

    let res = await fetch(url);
    let data = await res.json();
    return(data);
}

function append(data){
    let container = document.querySelector("#container");
    container.innerHTML = null;

    data.forEach(function(elem){

        let box = document.createElement("div");
        box.setAttribute("class","box");

        let title = document.createElement("h3");
        title.innerText = elem.Title;

        let poster = document.createElement("img");
        poster.src = elem.Poster;

        let release_date = document.createElement("h4");
        release_date.innerText = elem.Year; 

        let rating = document.createElement("h4");
        rating.innerText = "Rating : "+elem.Rating;

        let div = document.createElement("div");
        div.append(release_date,rating)

        let p = document.createElement("p");
        p.setAttribute("class","recomend")
        p.innerText = "RECOMENDED"
        if(elem.Rating > 8.50){
            box.append(p,title,poster,div)
            container.append(box);
        }
        if(elem.Rating<=8.50){
            box.append(title,poster,div);
            container.append(box);
        }

    })
}

let id;
function debounce(func,delay){
    if(id){
        clearTimeout(id)
    }

    id = setTimeout(async function(){
        let data = await get_data(query)
        if(func()){
            func();
            if(data.length==undefined){
                let container =document.querySelector("#container")
                let image = document.createElement("img");
                image.setAttribute("id","error_display")
                image.src = "https://c.tenor.com/jwAkhSG3BWEAAAAC/error.gif"
                container.innerHTML = null;
                container.append(image);
                return;
            }
        }
    },delay); 
}

//  Sorting based on year

let sort_year = document.querySelector("#sort");
sort_year.addEventListener("click",function(){

    arr.sort(function(a,b){
        return a.Year - b.Year;
    })
    append(arr);
})


//  Filter for movie 2021 and above 

let filter = document.querySelector("#filter")
filter.addEventListener("click",function(){

    let result = arr.filter(function(elem){
        if(elem.Year>=2021){
            return elem;
        }
    })
    append(result);
})