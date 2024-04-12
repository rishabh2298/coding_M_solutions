// ARRAY STRING FIRST CHARACTER - HOF
// Given an array of string generate an array with their first characters

// Sample Input - ["Masai", "School"]

// Sample Output - ["M", "S"]


let name= ["Masai", "School"];

let result=name.map(function(el){
  return el[0]
})
console.log(result)