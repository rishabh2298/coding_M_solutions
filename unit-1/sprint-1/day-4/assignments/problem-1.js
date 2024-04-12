// Given the year of birth, if the age is between 13 and 19 (both included) print Teenage and in between 20 and 29 (both included) print Twenties
let year_of_birth = 1997;
let age = 2022-year_of_birth;

if(13<=age && age<=19){
  console.log("Teenage");
}else if(20<=age && age<=29){
  console.log("Twenties");
}else{
  console.log("Above Twenties");
}