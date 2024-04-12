// print last 5 values of arrays and skip last 3rd one

let numbers=[3,4,5,6,7,8,9,10,11,12,13,14,15];

let start=numbers.length-5;
let end=numbers.length;

for(let i=start; i<end; i++){
  if(i==numbers.length-3){
    console.log("-");
    continue;
  }
  console.log(numbers[i]);
}