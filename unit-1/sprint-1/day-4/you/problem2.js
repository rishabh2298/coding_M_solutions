// same ques of nasted if using &&
let gender = "female";
let age = 20;

if(gender=="male" && age>=21){
  console.log(gender,"of age",age,"can marry");
}else if(gender=="female" && age>=18){
  console.log(gender,"of age",age,"can marry");
}else{
  console.log("Not allowed");
}