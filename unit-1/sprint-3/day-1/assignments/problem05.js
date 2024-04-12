// Problem-5
// Write a function to convert a character to lower case
// Use this function to convert a given word to lower case
// Use that function to convert an array of strings to array of lower case strings
// Sample Input ["MA", "SA", "I", "SCH", "OOL"]
// Sample Output ["ma", "sa", "i", "sch", "ool"]


function lower(value){

    let upper="ABCDEFGHIJKLMNOPQRSTUVWXYZ "
    let lower="abcdefghijklmnopqrstuvwxyz "
  
    bag="";
    for(let j=0; j<value.length; j++){
      for(let i=0; i<upper.length; i++){
        if(value[j]==upper[i]){
          bag=bag+lower[i];
        }
      }
    }
    return bag;
  }
  
  
  
  let input=["MA", "SA", "I", "SCH", "OOL"];
  
  let jhoola=[];
  for(let i=0; i<input.length; i++){
    let b=input[i];
    let c=lower(b);
    jhoola.push(c);
  }
  console.log(jhoola);