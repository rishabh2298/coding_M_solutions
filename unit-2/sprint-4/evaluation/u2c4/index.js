// All the JS Code for the Add Students Page Goes Here
document.querySelector("form").addEventListener("submit",add_data)
let userData=JSON.parse(localStorage.getItem("admission")) || []

function add_data(event){
    event.preventDefault()
    let obj={
        userName:document.querySelector("#name").value,
        userEmail:document.querySelector("#email").value,
        userPhone:document.querySelector("#phone").value,
        userGender:document.querySelector("#gender").value,
        userCourse:document.querySelector("#course").value,
    }
    userData.push(obj);
    localStorage.setItem("admission",JSON.stringify(userData))
}