
let data=JSON.parse(localStorage.getItem("Products"))

data.forEach(function(elem,index){
    //  Counter
    let count=document.querySelector("#counter")
    if(count.innerText=="No. of Products"){
        count.innerText=1;
    }
    else{
        `total ${count.innerText++}`
    }

    // Data for Append 

    let box=document.createElement("div");
    box.setAttribute("class","product");

    let name=document.createElement("h2");
    name.innerText=elem.name;

    let category=document.createElement("h4")
    category.innerText=elem.category;

    let image=document.createElement("img");
    image.setAttribute("src",elem.image);

    let price=document.createElement("h3");
    price.innerText=elem.price;

    let gender=document.createElement("h4")
    gender.innerText=elem.gender;

    let div=document.createElement("div");

    let sold=document.createElement("button")
    sold.innerText=elem.sold;
    if(sold.innerText=="True"){
        sold.style.backgroundColor="red"
        sold.style.color="white"
    }
    else{
        sold.style.backgroundColor="green"
        sold.style.color="white"
    }
    sold.setAttribute("id","sold")
    sold.addEventListener("click",function(){
        if(sold.innerText=="False"){
            sold.innerText="True"
            sold.style.backgroundColor="red"
            sold.style.color="white"
        }
        else{
            sold.innerText="False"
            sold.style.backgroundColor="green"
            sold.style.color="white"
        }
    })

    let remove=document.createElement("button");
    remove.innerText="Remove";
    remove.setAttribute("id","remove")
    remove.addEventListener("click",function(){
        remove_elem(elem,index)})

    div.append(sold,remove);
    box.append(name,category,image,price,gender,div)
    document.querySelector("#container").append(box);
})

function remove_elem(elem,index){
    data.splice(index,1)
    localStorage.setItem("Products",JSON.stringify(data));
    window.location.reload();
}