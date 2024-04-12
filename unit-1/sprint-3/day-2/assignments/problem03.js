// Write a custom function that has the same behavior of inbuilt Array Last Index Of Function


function last_index_of(element,start_index){
    if(start_index==null || start_index<0){
       for(let i=arr.length-1; i>=(-1); i--){
        if(element===arr[i]){
          console.log(i);
          break;
        }
        if(i==(-1)){
          console.log("-1");
        }
      }
    }
    else{
      for(let j=start_index; j>=0; j--){
        if(arr[j]===element){
          console.log(j);
          break;
        }
      }
    }
  }
  
  
  let arr=[33,2,23,45,4,6,44,12,33,4,15,23,22]
  last_index_of(23,4);