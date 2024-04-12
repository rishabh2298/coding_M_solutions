import {navbar,navbar_buttons} from "../components/navbar.js"

document.querySelector("#navbar").innerHTML = navbar();

navbar_buttons();

import { recipe_of_day } from "../components/page_content.js";

let container = document.querySelector("#container")
recipe_of_day(container);

// User Details 
let details = JSON.parse(localStorage.getItem("details"))
document.querySelector("#details").innerHTML = details.email;