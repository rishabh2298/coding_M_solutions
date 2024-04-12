// Problem 1 : Given a string count the number of words in that string

let str="Once upon a time there was a rabbit";

if(str.length>0){
  let count=0;
  
  for(let i=0; i<=str.length-1; i++){
    if(str[i]==" "){
      count++;
    }
  }
  console.log("There are",count+1,"words in the sentence");
}else{
  console.log("There are",0,"words in the sentence");
}