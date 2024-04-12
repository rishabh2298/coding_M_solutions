
//   Get data from link 

let data;
function get_data(){
    const url = "https://grocery-masai.herokuapp.com/items"

    fetch(url)
    .then(function(res){
        return (res.json())
    })
    .then(function(res){
        data = res.data;
        console.log("list", data)
        append_data(data);
    })
}
get_data();

//  Wallet Section 
let wallet = document.querySelector("#wallet")


// Home Display Section 

let cart_items = JSON.parse(localStorage.getItem("cart_items"))  || [];

function append_data(data){
    let container = document.querySelector("#groceries")
    
    data.forEach(function(elem){

        let cards = document.createElement("div")
        cards.setAttribute("class","item")

        let name = document.createElement("h3")
        name.innerText=elem.name

        let image = document.createElement("img");
        image.src=elem.image;

        let price = document.createElement("h4")
        price.innerText=elem.price;

        let button = document.createElement("button");
        button.setAttribute("class","add_to_cart")
        button.innerText="Add to cart";
        button.addEventListener("click",function(){
            cart_items.push(elem);
            if(Number(wallet.innerText)>elem.price){
                let balance = eval(wallet.innerText - elem.price)
                wallet.innerText = balance;
                localStorage.setItem("cart_items",JSON.stringify(cart_items))
            }
            else{
                alert("Insufficient balance")
            }
        })

        cards.append(name,image,price,button)
        container.append(cards);
        
    })
}
