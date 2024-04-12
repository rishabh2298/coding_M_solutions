// nested_if 
let email_id = "abc@gmail.com";
let password = "34567";
let input_email = "abc@gmail.com";
let input_password = "234567";

if(email_id==input_email){
  if(password==input_password){
    console.log("You are logged in");
  }else{
    console.log("You entered wrong password");
  }
}else{
  console.log("Wrong email id entered");
}