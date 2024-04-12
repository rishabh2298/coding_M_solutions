let product=["macbook", "iphone", "ipad"];
let price=[250000,80000,55000];

//output
// data=[
//   {product:"macbook", price:250000},
//   {product:"iphone", price:80000},
//   {product:"ipad", price:55000},
// ];


let data=[];
for(let i=0; i<product.length; i++){
  let obj={};
  obj["product"]=product[i];
  obj["price"]=price[i];
  data.push(obj);
}
console.log(data);