//  API Key =  184d991fc17c9b857dc3400759fc39bb

// https://api.openweathermap.org/data/2.5/weather?q=${city}&appid=184d991fc17c9b857dc3400759fc39bb

// https://maps.google.com/maps?q=delhi&t=&z=13&ie=UTF8&iwloc=&output=embed

let get_data = () => {
  let city = document.querySelector("#query").value;

  let url = `https://api.openweathermap.org/data/2.5/weather?q=${city}&appid=184d991fc17c9b857dc3400759fc39bb`;

  let show_temp = async () => {
    let res = await fetch(url);
    let data = await res.json();
    // console.log(data);
    append_data(data);
  };
  show_temp();
};

let append_data = (data) => {
  let container = document.querySelector("#container");
  container.innerHTML = null;

  let div1 = document.createElement("div");
  div1.setAttribute("class", "cards");
  let logo1 = document.createElement("h2");
  logo1.innerHTML = '<i id="name" class="fa-solid fa-location-dot"></i>';
  let name = document.createElement("h2");
  name.innerText = data.name;
  div1.append(logo1, name);

  let div2 = document.createElement("div");
  div2.setAttribute("class", "cards");
  let logo2 = document.createElement("h2");
  logo2.innerHTML =
    '<i id="min_temp" class="fa-solid fa-temperature-arrow-down"></i>';
  let min_temp = document.createElement("h3");
  min_temp.innerText = `${(data.main.temp_min - 275).toFixed(2)} C`;
  div2.append(logo2, min_temp);

  let div3 = document.createElement("div");
  div3.setAttribute("class", "cards");
  let logo3 = document.createElement("h2");
  logo3.innerHTML =
    '<i id="max_temp" class="fa-solid fa-temperature-arrow-up"></i>';
  let max_temp = document.createElement("h3");
  max_temp.innerText = `${(data.main.temp_max - 270).toFixed(2)} C`;
  div3.append(logo3, max_temp);

  let div4 = document.createElement("div");
  div4.setAttribute("class", "cards");
  let logo4 = document.createElement("h2");
  logo4.innerHTML = '<i id="wind" class="fa-solid fa-wind"></i>';
  let wind = document.createElement("h3");
  wind.innerText =
    `Degree : ${data.wind.deg}` + "\n" + `Speed : ${data.wind.speed}`;
  div4.append(logo4, wind);

  let div5 = document.createElement("div");
  div5.setAttribute("class", "cards");
  let logo5 = document.createElement("h2");
  logo5.innerHTML = `<i id="cloud" class="fa-solid fa-cloud"></i>`;
  let cloud = document.createElement("h3");
  cloud.innerText = `${data.clouds.all}`;
  div5.append(logo5, cloud);

  container.append(div1, div3, div2, div4, div5);

  // Map section

  let url = `https://maps.google.com/maps?q=${data.name}&t=&z=13&ie=UTF8&iwloc=&output=embed`;
  let iframe = document.querySelector("#gmap_canvas");
  iframe.src = url;
};


// current location 


function user_location() {
  navigator.geolocation.getCurrentPosition(success);

  function success(pos) {
    const crd = pos.coords;

    console.log("Your current position is:");
    console.log(`Latitude : ${crd.latitude}`);
    console.log(`Longitude: ${crd.longitude}`);
    console.log(`More or less ${crd.accuracy} meters.`);
    device_location(crd.latitude,crd.longitude)
  }
}

function device_location(lat, lon) {
  let url = `https://api.openweathermap.org/data/2.5/weather?lat=${lat}&lon=${lon}&appid=184d991fc17c9b857dc3400759fc39bb`;

  fetch(url)
    .then(function (res) {
      return res.json();
    })
    .then(function (res) {
      append_data(res);
    })
    .catch(function (rej) {
        console.log(rej)
    });
}