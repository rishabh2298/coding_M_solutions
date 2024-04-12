
// Problem-1 Rectangle Object

// Create a rectangle object with length and width properties
// Create two methods area and perimeter, that will return the area and perimeter of the rectangle

let rectangle={
  length : 7,
  width : 4,
  area : function(){
    return this.length*this.width;
  },
  perimeter : function(){
    return 2*(this.length+this.width);
  }
}

let Area = rectangle.area();
let Peri = rectangle.perimeter();

console.log("Area is =",Area+"\n"+"Perimeter is =",Peri);