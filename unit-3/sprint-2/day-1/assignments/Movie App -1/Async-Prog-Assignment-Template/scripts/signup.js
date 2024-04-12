
let form=document.querySelector("form");
form.addEventListener("submit",add_data)


let data=JSON.parse(localStorage.getItem("Slide_Data")) || [];

function add_data(event){
    event.preventDefault();

    let name=document.getElementById("name").value;
    let contact=document.getElementById("contact").value;
    let email=document.getElementById("email").value;
    let password=document.getElementById("password").value;

    let obj = new constructor(name,contact,email,password)

    if(check_id(obj)){
        data.push(obj);
        localStorage.setItem("Slide_Data",JSON.stringify(data));
        alert("Sign-Up Done Successfully...")
        window.location.href="login.html"
    }
    else{
        alert("Sorry this ID is already exist !!!")
        form.reset();
    }
}

function constructor(name,contact,email,password){
    this.name=name;
    this.contact=contact;
    this.email=email;
    this.password=password
}

function check_id(obj){
    let arr = data.filter(function(el){
        return (el.email==obj.email)
    })
    if(arr.length>0){
        return false;
    }
    else{
        return true;
    }
}