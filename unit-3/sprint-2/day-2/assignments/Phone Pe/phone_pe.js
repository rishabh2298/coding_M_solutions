
function bankserver(){
    return true;
}

let payment = new Promise(function(res,rej){

    setTimeout(function(){
        check = bankserver();

        if(check){
            res("Payment successful")
        }
        else{
            rej("Something went wrong please try again")
        }
    },3000)
})


let image = document.querySelector("img")

content();
async function content(){

    try{
        res = await payment;
        image.src = "https://www.vogue.in/wp-content/themes/vogue/images/check-circle.gif"
        setTimeout(function(){
            image.src = "https://www.consumercomplaints.in/thumb.php?complaints=2100255&comment=3758082&src=16044178633525.jpg&wmax=900&hmax=900&quality=85&nocrop=1"
        },3000)
    }
    catch(error){
        image.src = "https://www.bhimappdownload.in/wp-content/uploads/2017/04/pnb-upi-error.jpg";
    }
} 