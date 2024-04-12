// Problem 3
// Write a custom function that has the same behavior of inbuilt Array Slice Function

function clone_slice(start,end){
    let new_arr=[];
    if(start<0){
      start=(-start)+1;
    }
    if(start==null){
      start=0;
    }
    if(end<0){
      end=(-end);
    }
    if(end>arr.length){
      end=arr.length;
    }
    if(end==null){
      end=arr.length;
    }
    for(let i=start; i<=end-1; i++){
      new_arr.push(arr[i]);
    }
    console.log(new_arr)
  }
  
  
  let arr=["Rahul","Aman","Babu","Rabit",34,23,"Ajit"];
  clone_slice(2,6);