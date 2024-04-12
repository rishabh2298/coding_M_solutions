document.querySelector("form").addEventListener("submit",my_function)


let userData=[];

function my_function(event){
    event.preventDefault()
    let obj={
        userName:document.querySelector("#name").value,
        userAge:document.querySelector("#age").value,
        userGender:document.querySelector("#gender").value,
        userEmail:document.querySelector("#email").value,
        userPhone:document.querySelector("#phone").value,
    }
    userData.push(obj)
    console.log(userData)
    document.querySelector("form").reset()
}