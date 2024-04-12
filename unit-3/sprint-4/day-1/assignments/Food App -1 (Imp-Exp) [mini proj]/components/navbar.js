// NavBar

let navbar = () => {
    return `<h3 id="details">User_Details</h3>
    <h3 id="home">Home</h3>
    <div id="one">
      <input id="query" type="text" placeholder="Search Food" />
    </div>
    <div id="two">
      <button id="rod">Recipe of Day</button>
      <button id="rr">Random Recipe</button>
      <a href="signup.html"><h3>Sign-Up</h3></a>
      <a href="login.html"><h3>Log-In</h3></a>`
}

let navbar_buttons = () => {

document.querySelector("#home").addEventListener("click",() => {
    window.location.href = "index.html"
})
document.querySelector("#rod").addEventListener("click",() => {
    window.location.href = "receipe_of_day.html"
})
document.querySelector("#rr").addEventListener("click",() => {
    window.location.href = "random_receipe.html"
})
}

// Sign-Up Section 

let signup_form = () =>{
    return `<form>
    <label>Name</label><br>
    <input id="name" type="text" placeholder="Enter Name"><br>
    <label>Email</label><br>
    <input id="email" type="text" placeholder="Enter Email"><br>
    <label>Password</label><br>
    <input id="password" type="password" placeholder="Enter Password"><br>
    <input id="submit" type="submit" value="Sign Up">
</form>`
}

let signup_data = () => {
    let userData = JSON.parse(localStorage.getItem("user")) || [];
    let obj = {
        name : document.querySelector("#name").value,
        email: document.querySelector("#email").value,
        password:document.querySelector("#password").value,
    }

    let check_id = ()=>{
        let arr = userData.filter((el)=>{
            return (el.email==obj.email)
        })
        if(arr.length>0){
            return false
        }
        else{
            return true;
        }
    }

    if(check_id()){
        userData.push(obj);
        alert("Sign-Up Successful")
        localStorage.setItem("user",JSON.stringify(userData));
        window.location.href = "login.html"
    }
    else{
        alert("This Id is already Exist 'Please Login'")
    }

}


// Login Section 

let login_form = () => {
    return `<form>
    <label>Email</label><br>
    <input id="email" type="email" placeholder="Enter Email"><br>
    <label>Password</label><br>
    <input id="password" type="password" placeholder="Enter Password"><br>
    <input id="submit" type="submit" value="Log-In">
</form>`
}

let login_data = () => {
    let userData = JSON.parse(localStorage.getItem("user"));

    let obj = {
        email : document.querySelector("#email").value,
        password : document.querySelector("#password").value,
    }

    let check_id = () => {
        let arr = userData.filter((el) => {
            return (el.email==obj.email && el.password==obj.password)
        })
        if(arr.length>0){
            return true;
        }
        else{
            return false;
        }
    }

    if(check_id()){
        alert("You have logged-in successfully")
        localStorage.setItem("details",JSON.stringify(obj))
        window.location.href="index.html"
    }
    else{
        alert("Wrong Credentials")
    }
}

export {navbar,navbar_buttons,signup_form,signup_data,login_form,login_data};
