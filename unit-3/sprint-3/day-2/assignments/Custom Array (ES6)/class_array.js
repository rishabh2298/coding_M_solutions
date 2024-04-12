

class Stack{
    constructor(){
        this.length = 0;
        this.arr = [];
    }
    my_pop(){
        let index = this.length;
        delete this.arr[index];
        this.length--;
        this.arr.length--;
        console.log("after-pop :",this.arr)
    }
    my_push(...Array){
        Array.forEach((element)=>{
            let index = this.length;
            this.arr[index] = element;
            this.length++;
        })
        console.log("after-push :",this.arr)
    }
    my_forEach(my_function){
        for(let i=0; i<this.arr.length; i++){
            let ans = my_function(this.arr[i],i)
            console.log("my_filter : index",i,"value",ans)
        }
    }
    my_map(my_function){
        let result=[];
        for(let i=0; i<this.arr.length; i++){
            let ans = my_function(this.arr[i],i)
            result.push(ans);
        }
        return result;
    };
    my_filter(my_function){
        let result = [];
        for(let i=0; i<this.arr.length; i++){
            let ans = my_function(this.arr[i],i)
            if(ans){
                result.push(this.arr[i])
            }
        }
        return result;
    };
    my_reduce(my_function){
        let result = 0
        let value;
        let initial_value;
        for(let i=0; i<this.arr.length; i++){
            if(initial_value=null){
                initial_value = this.arr[i];
                this.arr[i]=i;
            }
            value = my_function(initial_value,this.arr[i],i)
            result+=value
        }
        return result;
    }
}

let arr = new Stack();
// console.log(arr)
arr.my_push(1,2,3,4)
arr.my_push(12,15,16,8) 

arr.my_pop();

let my_map = arr.my_map((elem,index)=>{
    return elem*10
})
console.log("my_map :",my_map)

let for_each = arr.my_forEach((elem,index)=>{
    return elem+1
})

let filter = arr.my_filter((elem,index)=>{
    return elem%2==0;
})
console.log("my_filter :",filter)


let my_reduce = arr.my_reduce((accu=10,elem,index)=>{
    return accu+elem;
})
console.log("reduce",my_reduce)