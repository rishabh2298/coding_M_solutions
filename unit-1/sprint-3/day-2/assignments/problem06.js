// Problem 5
// Write a custom function that has the same behavior of inbuilt Array Includes Function

function clone_includes(value){
    for(let i=0; i<=arr.length-1; i++){
      if(value===arr[i]){
        return true;
      }
      else if(i==arr.length-1){
        return false;
      }
    }
  }
  
  let arr=[2,4,5,"aman","rajiv","Abhi"];
  
  let result=clone_includes(5);
  console.log(result);