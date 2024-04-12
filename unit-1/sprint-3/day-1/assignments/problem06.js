// Problem-6
// Given a string swap the case and print the output
// Sample Input - Test
// Sample Output - tEST
// NOTE: Use multiple functions to achieve the result, NOT one single code block

function swap_string(value){
    let bag="";
    let lower="abcdefghijklmnopqrstuvwxyz ";
    let upper="ABCDEFGHIJKLMNOPQRSTUVWXYZ ";
  
    for(let i=0; i<value.length; i++){
      for(let j=0; j<lower.length; j++){
        if(value[i]==lower[j]){
          bag=bag+upper[j];
          break;
        }
        else if(value[i]==upper[j]){
          bag=bag+lower[j]
          break;
        }
      }
    }
    return bag;
  }
  
  let string="Test";
  
  console.log(swap_string(string));