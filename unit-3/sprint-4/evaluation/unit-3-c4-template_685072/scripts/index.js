// Ude Import export (MANDATORY)
// Onclicking store the news in local storage with key "news" so that you can access that on news.html page

import {navbar,get_search,sidebar,get_result,get_append_list} from "../components/navbar.js"


let nav = document.querySelector("#navbar");
nav.innerHTML = navbar();

// Search by Enter 
let search_input = document.querySelector("#search_input");

search_input.addEventListener("keypress", (event) =>{
    if(event.key == "Enter"){
        document.querySelector("#search_input").click();
        let query = search_input.value;
        localStorage.setItem("query",JSON.stringify(query))

        window.location.href = "search.html" 
    }
})

// Side Bar 

let leftbar = document.querySelector("#sidebar")
leftbar.innerHTML = sidebar();

let country1 = () =>{
    let id="in"
    get_result(id).then((res)=>{
        let data=res
        let container = document.querySelector("#results");
        get_append_list(data,container)
    });
}
country1();
document.querySelector("#in").addEventListener("click",country1);

let country2 = () =>{
    let id="ch"
    get_result(id).then((res)=>{
        let data=res
        let container = document.querySelector("#results");
        get_append_list(data,container)
    });
}
document.querySelector("#ch").addEventListener("click",country2);

let country3 = () =>{
    let id="us"
    get_result(id).then((res)=>{
        let data=res
        let container = document.querySelector("#results");
        get_append_list(data,container)
    });
}
document.querySelector("#us").addEventListener("click",country3);

let country4 = () =>{
    let id="uk"
    get_result(id).then((res)=>{
        let data=res
        let container = document.querySelector("#results");
        get_append_list(data,container)
    });
}
document.querySelector("#uk").addEventListener("click",country4);

let country5 = () =>{
    let id="nz"
    get_result(id).then((res)=>{
        let data=res
        let container = document.querySelector("#results");
        get_append_list(data,container)
    });
}
document.querySelector("#nz").addEventListener("click",country5);

// Append News 
