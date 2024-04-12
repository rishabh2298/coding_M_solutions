//  Fetching Data from API 

const url = "https://fakestoreapi.com/products";


async function getData(){
    try{
        let res = await fetch(url);
        let data= await res.json();
        console.log(data)
    }
    catch(err){
        console.log(err);
    }
}

getData()