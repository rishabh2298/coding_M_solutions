//store the products array in localstorage as "data"
let form=document.querySelector("#product_form");
form.addEventListener("submit",submit_data)

let data=JSON.parse(localStorage.getItem("data")) || [];


function submit_data(event){
    event.preventDefault();

    let brand=form.product_brand.value;
    let name=form.product_name.value;
    let price=form.product_price.value;
    let image=form.product_image.value;

    let obj= new construct(brand,name,price,image)

    data.push(obj)

    localStorage.setItem("data",JSON.stringify(data))
}

function construct(brand,name,price,image){
    this.brand=brand;
    this.name=name;
    this.price=price;
    this.image=image;
}