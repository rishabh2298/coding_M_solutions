// Problem 5: Write a function to replace spaces in a given string with -

function replace(string){
    let bag="";
    for(let i=0; i<=string.length-1; i++){
      if(string[i]==" "){
        bag=bag+"-";
      }
      else{
        bag=bag+string[i]
      }
    }
    console.log(bag);
  }
  
  
  let input="Once upon a time there was a cute lion who's name was dolly";
  
  console.log(replace(input));