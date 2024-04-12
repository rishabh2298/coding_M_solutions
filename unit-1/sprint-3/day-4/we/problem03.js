//how to access the data inside the objects, if the objects are present inside an array.

let amazon=[
    {name:"speaker", price:5400, rating:4},
    {name:"headphones", price:3000, rating:3},
    {name:"playstation", price:50000, rating:5},
    {name:"watch", price:3000, rating:4}
  ];
  
  for(let i=0; i<amazon.length; i++){
    console.log(amazon[i].name, amazon[i]["price"]);
  }