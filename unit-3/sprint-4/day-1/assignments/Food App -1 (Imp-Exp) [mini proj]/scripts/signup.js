
import { signup_form,signup_data } from "../components/navbar.js";

document.querySelector("#form_tag").innerHTML = signup_form();


let my_function = (event)=>{
    event.preventDefault();

    signup_data();
}


document.querySelector("form").addEventListener("submit",my_function)

// let userData = JSON.parse(localStorage.getItem("userData"))
// signup_data(userData);