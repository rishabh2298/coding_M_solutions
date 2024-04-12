import {navbar,navbar_buttons} from "../components/navbar.js"

document.querySelector("#navbar").innerHTML = navbar();

navbar_buttons();

import { random_recipe,recipe_content } from "../components/page_content.js";

let url = "https://www.themealdb.com/api/json/v1/1/random.php"

random_recipe(url).then((res)=>{
    // console.log(res);
    let container = document.querySelector("#container")
    recipe_content(res[0],container);
})

// User Details 
let details = JSON.parse(localStorage.getItem("details"))
document.querySelector("#details").innerHTML = details.email;