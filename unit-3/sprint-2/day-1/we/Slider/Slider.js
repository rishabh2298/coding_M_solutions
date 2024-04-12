//   SLider

let img_url = document.querySelector("#img_url");
let img_data = JSON.parse(localStorage.getItem("image")) || [];

function add_img() {
  img_data.push(img_url.value);
  localStorage.setItem("image", JSON.stringify(img_data));
  img_url.value = null;
}

let id;
let i = 0;
function slide_show() {
  let box = document.getElementById("box");

  id = setInterval(function () {
    if (i == img_data.length) {
      i = 0;
    }
    let show = document.createElement("img");
    show.src = img_data[i];
    i++;
    box.innerHTML = null;
    box.append(show);
  }, 2000);
}

function pause() {
  clearInterval(id);
}