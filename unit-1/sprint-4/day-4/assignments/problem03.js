// ARRAY STRING PATTERN- HOF
// Given an array of string generate an array whose first or last character is a
// Sample Input - ["assignment", "problem", "media", "upload"]
// Sample Output - ["assignment", "media"]



let input=["assignment", "problem", "media", "upload"];

let result=input.filter(function(el){
  if(el[0]=="a" || el[el.length-1]=="a"){
    return el;
  }
})
console.log(result)