let form=document.querySelector("form");
form.addEventListener("submit",submit_data)

let data= JSON.parse(localStorage.getItem("Products")) || [];

function submit_data(event){
    event.preventDefault()

    let nam=form.name.value;
    let category=form.category.value;
    let image=form.image.value;
    let price=form.price.value;
    let gender=form.gender.value;
    let sold=form.sold.value;

    let obj= new construct(nam,category,image,price,gender,sold)

    data.push(obj)

    localStorage.setItem("Products",JSON.stringify(data))
    form.reset();
}

function construct(nam,category,image,price,gender,sold){
    this.name=nam;
    this.category=category;
    this.image=image;
    this.price=price;
    this.gender=gender;
    this.sold=sold;
}