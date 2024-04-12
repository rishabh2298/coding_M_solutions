
let form = document.querySelector("#form_tag");
form.addEventListener("submit","save_data")

let users = JSON.parse(localStorage.getItem("users")) || [];

let save_data = (event)=> {
    event.preventDefault();
    class user_data{
        constructor(name,email,pass){
            this.name=name;
            this.email=email;
            this.password=pass;
        }
        check_data(){
            for(let x of users){
                if(this.email == x.email){
                    alert("This Email Id alreay Exist");
                    return;
                }
                else if(x==users[users.length-1]){
                    users.push(this);
                    localStorage.setItem(("users"),JSON.stringify(users))
                    alert("Sign-Up Successful");
                    return;
                }
            }
        }
    }

    let u1 = new user_data(form.name.value,form.email.value,form.password.value)
    u1.check_data()
}