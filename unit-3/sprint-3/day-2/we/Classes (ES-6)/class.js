//  push, remove, peek, isEmpty  
class Stack{
    constructor(){
        this.length = 0;
        this.stack = []
    }

    push(...arr){
        arr.forEach((el)=>{
            let index = this.length;
            this.stack[index] = el;
            this.length++;
        })
        console.log("after-push",this.stack)
    }

    remove(){
        let index = this.length;
        if(index==0){
            console.log("under-flow")
            return;
        }
        delete this.stack[index]
        this.stack.length--;
        this.length--;
        console.log("after-remove",this.stack)
    }

    peek(){
        let index = this.length-1;
        console.log("peek-vlaue",this.stack[index])
    }

    isEmpty(){
        (this.stack.length==0)? console.log("Yes it is Empty") : console.log("Not Empty")
        // if(this.stack.length==0){
        //     console.log("Yes Empty");
        // }
        // else{
        //     console.log("Not Empty");
        // }
    }
}


let s1 = new Stack();
s1.isEmpty();

s1.push(1,2,3,4,5,6,7,8)
s1.push(9)
// console.log(s1)
s1.remove();
s1.remove();

s1.push(12)

s1.peek()

s1.isEmpty();