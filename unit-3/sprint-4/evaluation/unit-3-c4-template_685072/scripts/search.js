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
            get_search(query).then((res)=>{
                let data=res
                let container = document.querySelector("#results");
                get_append_list(data,container)
            });
    }
})

let new_query = JSON.parse(localStorage.getItem("query"))
get_search(new_query).then((res)=>{
    let data=res
    let container = document.querySelector("#results");
    get_append_list(data,container)
});