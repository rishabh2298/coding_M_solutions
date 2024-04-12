//  API

const url = "https://reqres.in/api/users?page=2";

fetch(url)
  .then(function (res) {
    return res.json();
  })
  .then(function (resol) {
    console.log(resol.data);
    append(resol.data)      //appending data
  })
  .catch(function (rej) {
    console.log(rej);
  });


  function append(data){
      box=document.getElementById("container");
      data.forEach(function(elem){
          let image=document.createElement("img");
          image.src=elem.avatar;

          let name=document.createElement("h4");
          name.innerText=`${elem.first_name} ${elem.last_name}`

          let div=document.createElement("div")

          div.append(image,name);
          box.append(div);
      })
  }