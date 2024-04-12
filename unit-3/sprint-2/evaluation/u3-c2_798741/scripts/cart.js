
let cart_items = JSON.parse(localStorage.getItem("cart_items"));
let cart_total = document.querySelector("#cart_total");

console.log(cart_items)

//  total price 

let sum = 0;
for(let i=0; i<cart_items.length; i++){
    sum += cart_items[i].price
}
cart_total.innerText = sum;
 
// Append data 
append_data(cart_items)

function append_data(cart_items){
    let cart = document.querySelector("#cart")

    cart_items.forEach(function(elem,index){

        let cards = document.createElement("div")
        cards.setAttribute("class","item")

        let name = document.createElement("h3")
        name.innerText=elem.name

        let image = document.createElement("img");
        image.src=elem.image;

        let price = document.createElement("h4")
        price.innerText=elem.price;

        let button = document.createElement("button");
        button.setAttribute("class","remove")
        button.innerText="Remove";
        button.addEventListener("click",function(){
            remove_item(elem,index)
        })

        cards.append(name,image,price,button)
        cart.append(cards);
        
    })
}
 
//  Price calculation

function remove_item(elem,index){
    cart_items.splice(index,1);
    localStorage.setItem("cart_items",JSON.stringify(cart_items))
    sum -= elem.price;
    window.location.href="cart.html"
}