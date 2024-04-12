// ARRAY STRING LENGTH - HOF
// Given an array of strings print the length of each string

// example : ["apple", "windows", "ubuntu"]

let str= ["apple", "windows", "ubuntu"];

let result=str.map(function(el){
  return (el.length)
})
console.log(result)