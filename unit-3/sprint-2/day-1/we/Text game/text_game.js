//  Text Game 

let name= document.getElementById("name");
let display=document.getElementById("display")
let target="Kar Har Maidan Fhateh"
let count=0;

game();
function game(){
    let limit=setInterval(function(){
        if(name.value==target){
            name.disabled = true;
            clearInterval(limit)
            alert("You Have WON")
        }
        
        if(count>15){
            clearInterval(limit)
            name.disabled=true;
            alert("Try Again !!")
        }
        display.innerText=count++;
    },1000)    
}