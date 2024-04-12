
let form = document.querySelector("form")
form.addEventListener("submit",my_function)

function my_function(event){
    event.preventDefault();
    setTimeout(function(){
        alert("Your order is confirmed ")
    },1000)
    setTimeout(function(){
        alert(" Your order is being Packed ")
    },3000)
    setTimeout(function(){
        alert(" Your order is in transit ")
    },8000)
    setTimeout(function(){
        alert(" Your order is out for delivery ")
    },10000)
    setTimeout(function(){
        alert("Order delivered ")
    },12000)
}