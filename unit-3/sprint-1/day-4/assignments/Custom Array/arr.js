
let arr1 = [2,4,6,8];

Array.prototype.my_push=function (elem){
    let index = this.length;
    this[index] = elem;
}
 
Array.prototype.my_pop = function (){
    let index = this.length;
    delete this[index-1];
    this.length--;
}

Array.prototype.my_forEach = function(my_func){
    let length = this.length;
    for(let i=0; i<length; i++){
        let result =  my_func(this[i]);
        console.log("my_forEach",result)
    }
}

Array.prototype.my_map = function(my_func){
    let length = this.length;
    let result = [];
    for(let i=0; i<length; i++){
        let ans = my_func(this[i])
        result.my_push(ans);
    }
    return result;
}

Array.prototype.my_filter = function(my_func){
    let length = this.length;
    let result = [];

    for(let i=0; i<length; i++){
        let ans = my_func(this[i]);
        if(ans){
            result.push(this[i])
        }
    }
    return result;
}

Array.prototype.my_reduce = function(my_func){
    let length = this.length;
    let acc;
    let result = 0;

    for(let i=0; i<length; i++){
        if(acc==null){
            acc=this[0];
        }
        let ans = my_func(acc,this[i+1],i)
        result+=ans;
    }
    console.log("my_reduce",result)
}


arr1.my_push(19)
arr1.my_push(22)
arr1.my_push(55)

console.log("my_push",arr1)

arr1.my_pop()

console.log("my_pop",arr1)

arr1.my_forEach(function(el){
    return el+2;
})


let ans = arr1.my_map(function(el){
    return el/10;
})

console.log("my_map",ans) 

let ans2 = arr1.my_filter(function(el){
    return el%2==0;
})
console.log("my_filter",ans2)

arr1.my_reduce(function(el){
    return el/2;
})