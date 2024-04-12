// Problem-3
// Write a function isOdd which returns a boolean value based on the number is odd or not
// Use this function to print the odd numbers from 0 to a given limit(included)

function isOdd(value){
    if(value%2!=0){
      return true;
    }
    else{
      return false;
    }
  }
  
  
  limit=17;
  
  for(let i=0; i<=limit; i++){
    x=isOdd(i)
    if(x==true){
      console.log(i,"is odd number under",limit)
    }
  }