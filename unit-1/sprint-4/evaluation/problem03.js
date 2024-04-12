function firstLetterCapital(arr){
    let lower="abcdefghijklmnopqrstuvwxyz"
    let upper="ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    let arr2=[];
    
    for(let k=0;k<arr.length;k++){
      let bag="";
      let str=arr[k]
      for(let i=0; i<str.length; i++){
        for(let j=0; j<lower.lenght; j++){
          if(str[0]==lower[j]){
            bag=bag+upper[j];
            break;
          }
        }
        if(i>=1){
          bag+=str[i]
        }
      }
      arr2.push(bag);
    }
    console.log(arr2)
  }
 
 let array = ["hi", "john", "how", "are", "you"]
 firstLetterCapital(array);