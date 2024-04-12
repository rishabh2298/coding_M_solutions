// change _ to % in String

let string="Aman Kumar Singh";

bag="";
for(let i=0; i<=string.length-1; i++){
  if(i==4 || i==10){
    bag=bag+"%";
  }else{
    bag=bag+string[i];
  }
}
console.log(bag);