import { navbar, navbar_buttons } from "../components/navbar.js";
import { get_data, append_data } from "../components/page_content.js";

document.querySelector("#navbar").innerHTML = navbar();

navbar_buttons();

// Content of Page

let display_recipe = () => {
  let query = document.querySelector("#query").value;

  get_data(query).then((res) => {
    // console.log(res);
    let container = document.querySelector("#container");
    append_data(res,container);
  });
};

document.querySelector("#query").addEventListener("input", display_recipe);


// User Details 
let details = JSON.parse(localStorage.getItem("details"))
document.querySelector("#details").innerHTML = details.email;



// Onload function 

let id = setTimeout(()=>{
  alert("***** Please Log-In First *****")
},10000)
