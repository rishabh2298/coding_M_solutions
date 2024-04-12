// Problem 4: Write a function to check if the char is a small case or not.

function check(char){
  
    let lower="abcdefghijklmnopqrstuvwxyz";
    
    for(let i=0; i<=lower.length-1; i++){
      if(char===lower[i]){
        return true;
      }
    }
    return false;
  }
  
  
  input="g";
  
  let x=check(input);
  if(x==true){
    console.log(input,"is a smaller case");
  }
  else{
    console.log(input,"is not a smaller case");
  }