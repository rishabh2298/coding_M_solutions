// ARRAY ODD LENGTH STRINGS SUM- HOF
// Given an array of strings print the sum of lengths if the characters in the string are odd
// Sample Input - ["A", "Good", "Problem"]
// Sample Output - 8

let names= ["A", "Good", "Problem"];

let oddvalues=names.filter(function(el){
  if(el.length%2==1){
    return el;
  }
})

let size=oddvalues.map(function(el){
  return el.length;
})

let result=size.reduce(function(acc,el){
  return acc+el;
})
console.log(result)       