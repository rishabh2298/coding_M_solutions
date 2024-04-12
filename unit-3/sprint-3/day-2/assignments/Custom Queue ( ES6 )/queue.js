//  Custom  Queue

class Queue{
    constructor(){
        this.length = 0;
        this.arr = [];
    }
    enQueue(...arr){
        arr.forEach((elem)=>{
            let index = this.length;
            this.arr[index] = elem;
            this.length++;
        })
        return this.arr;
    }
    deQueue(...arr ){
        if(this.length==0){
            console.log("Queue is Empty");
            return;
        };
        if(arr.length==0){
            this.arr.shift();
            this.length--;
        }
        arr.forEach(() => {
            this.arr.shift();
            this.length--;
        })
        return this.arr;
    }
}

let s1 = new Queue()

s1.deQueue()

s1.enQueue(3,2,4,6,7)
console.log("enQueue",s1)

s1.deQueue()
console.log("deQueue",s1)