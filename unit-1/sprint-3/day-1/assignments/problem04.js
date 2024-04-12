// Problem-4
// Write code to calculate the average of an array
// If there are no items in the array it should return 0
// NOTE: Create a function to find the sum of elements in an array and use that function to find out the average

function addition(value){
  
    if(value.length>0){
      sum=0;
      for(let i=0; i<value.length; i++){
        sum=sum+value[i];
      }
      return sum;
    }
    else{
      return 0;
    }
  }
  
  
  let arr=[1,2,3,4,5,6,7,8,9,10];
  
  let x=addition(arr);
  if(x>0){
    console.log("Average of sum of array is",x/arr.length)
  }
  else{
    console.log(x);
  }