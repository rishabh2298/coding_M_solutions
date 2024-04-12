// Problem 4
// Write a custom function that has the same behavior of inbuilt String Substring Function

function clone_substring(start,end){
    let new_str="";
  
    if(start==null){
      start=0;
    }
    if(start==end){
      console.log("");
    }
    if(end==null){
      end=str.length
    }
    if(start>str.length || start<0 || end>str.length || end<0){
      start=0;
      end=str.length
    }
  
    if(start<end){
      for(let i=start; i<=end-1; i++){
        new_str=new_str+str[i];
      }
    }
    if(start>end){
      for(let j=end; j<=start-1; j++){
        new_str=new_str+str[j];
      }
    }
    if(start==end){
      console.log(new_str);
    }
    console.log(new_str);
  }
  
  
  let str="Microsoft";
  clone_substring(2,7)