
import {selected_recipe} from "../components/page_content.js"

let selected_data = JSON.parse(localStorage.getItem("selected_recipe"))
let container = document.querySelector("#container");

selected_recipe(selected_data,container);