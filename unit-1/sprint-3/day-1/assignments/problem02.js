// Problem-2
// Write code to find the absolute difference of two numbers

// Sample Input-1 12,4
// Sample Output-1 8
// Sample Input-2 4,18
// Sample Output-2 14
// NOTE: It must consist of two functions 1. To find the difference 2. To find the absolute value


function difference(a,b){
    return a-b;
  }
  
  function absolute_value(x){
    if(x<0){
      return -(x);
    }
    else{
    return x;
    }
  }
  
  let mode=difference(4,18)
  let y=absolute_value(mode)
  
  console.log(y);