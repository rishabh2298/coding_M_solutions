
let details={
    data : [],
    add : function(name,quantity,price){
      for(let i=0; i<name.length; i++){
        let obj={};
        obj.name=name[i];
        obj.quantity=quantity[i];
        obj.price=price[i];
        this.data.push(obj);
      }
    },
    total : function(){
      let sum=0;
      for(let i=0; i<this.data.length; i++){
        let net_price=(this.data[i].quantity)*(this.data[i].price);
        sum += net_price;
      }
      console.log("Total of this details data",sum);
    }
  }
  
  
  let N = ["Rice", "Dal", "Salt"]
  let Q = [2, 3, 1]
  let P = [60, 50, 20]
  
  details.add(N,Q,P);              // add info to data
  console.log(details.data);      // print updated data
  details.total();               // give total of details.data