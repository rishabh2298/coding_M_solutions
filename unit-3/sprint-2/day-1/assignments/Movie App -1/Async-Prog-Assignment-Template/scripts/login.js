
let form = document.querySelector("form");
form.addEventListener("submit",check_id)

let data = JSON.parse(localStorage.getItem("Slide_Data"));

function check_id(event){
    event.preventDefault();

    let obj={
        email:form.email.value,
        password:form.password.value,
    }    

    if(check_data(obj)){
        alert("Logged In successfuly")
        window.location.href="index.html"
    }
    else{
        alert("Wrong ID or Password");
        form.reset();
    }
}

function check_data(obj){
    let arr = data.filter(function(el){
        return (el.email===obj.email && el.password===obj.password)
    })
    if(arr.length>0){
        return true;
    }
    else{
        return false;
    }
}
