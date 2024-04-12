// Problem 1. Write a custom function that has the same behavior of inbuilt Array Join

function clone_arr_join(arr,seperator){

    let bag="";
  
    for(let i=0; i<arr.length; i++){
      if(i==0){
        bag=bag+arr[0];
      }
      else if(seperator==null){
        bag=bag+","+arr[i];
      }
      else if(seperator=="+"||seperator=="_"||seperator=="-"||seperator=="*"||seperator=="&"||seperator=="^"||seperator=="%"||seperator=="$"||seperator=="#"||seperator=="@"||seperator=="!"||seperator==","||seperator=="."||seperator=="?"||seperator=="<"||seperator==">"||seperator==" "){
        bag=bag+seperator+arr[i];
      }
      else if(seperator==""){
          bag=bag+arr[i];
      }
    }
    return bag;
  }
  
  
  let arr=["dev","sonal","aman","sanju","bobby"];
  
  let x=clone_arr_join(arr,"%")
  console.log(x);