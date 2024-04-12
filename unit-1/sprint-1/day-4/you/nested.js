// Nested If

let gender = "male";
let age = 2;

if(gender=="male"){
  if(age>=21){
    console.log("can marry");
  }else{
    console.log("not allowed");
  }
}else if(gender=="female"){
  if(age>=18){
    console.log("can marry");
  }else{
    console.log("not allowed");
  }
}else{
  console.log("Invalid Input");
}