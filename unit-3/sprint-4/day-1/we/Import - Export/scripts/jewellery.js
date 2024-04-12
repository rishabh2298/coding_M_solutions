import navb from "../components/navbar.js"
document.querySelector("#navbar").innerHTML = navb();

import {get_data,append_data} from "../components/fetch.js"

const url = "https://fakestoreapi.com/products/category/jewelery"

get_data(url).then((res) => {
    let container = document.querySelector("#container");
    append_data(res,container)
})