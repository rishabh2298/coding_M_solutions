
import { login_form,login_data } from "../components/navbar.js";

document.querySelector("#login_form").innerHTML = login_form()

let my_function = (event) => {
    event.preventDefault();

    login_data();
}


document.querySelector("form").addEventListener("submit",my_function)