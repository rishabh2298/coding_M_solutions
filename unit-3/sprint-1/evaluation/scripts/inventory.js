
let data=JSON.parse(localStorage.getItem("data"))

data.forEach(function(elem,index){
    let box=document.createElement("div")
    box.setAttribute("class","box")

    let brand=document.createElement("h3");
    brand.innerText=elem.brand;

    let name=document.createElement("h4");
    name.innerText=elem.name;

    let price=document.createElement("h4");
    price.innerText=elem.price;

    let image=document.createElement("img");
    image.setAttribute("src",elem.image);

    let remove=document.createElement("button");
    remove.innerText="Remove Product"
    remove.addEventListener("click",function(elem,index){
        remove_elem(elem,index)
    })

    box.append(brand,name,price,image,remove)
    document.querySelector("#products_data").append(box)
})

function remove_elem(elem,index){
    data.splice(index,1);
    localStorage.setItem("data",JSON.stringify(data))
    window.location.reload();
}