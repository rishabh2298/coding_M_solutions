// sub_string

let s="masai"

for(let i=0; i<s.length; i++){
  bag="";
  for(let j=i; j<=s.length-1; j++){
    bag=bag+s[j];
    console.log(bag)
  }
}