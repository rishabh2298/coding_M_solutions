// Problem 2 :
// Given a string print, the number of times each character appears

let str="greatest of all time";

let obj={};
for(let i=0; i<str.length; i++){
  let char=str[i];
  if(obj[char]==undefined){
    obj[char]=1;
  }
  else{
    obj[char]++;
  }
}

for(let j in obj){
  console.log(j+":"+obj[j]);
}