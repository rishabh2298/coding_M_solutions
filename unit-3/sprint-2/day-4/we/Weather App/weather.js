//    Weather App

// https://api.openweathermap.org/data/2.5/weather?q=dongargarh&appid=184d991fc17c9b857dc3400
// "https://maps.google.com/maps?q=delhi&t=&z=13&ie=UTF8&iwloc=&output=embed"

// https://api.openweathermap.org/data/2.5/weather?lat={lat}&lon={lon}&appid={API key}

function getData() {
  let city = document.getElementById("query").value;

  let url = `https://api.openweathermap.org/data/2.5/weather?q=${city}&appid=184d991fc17c9b857dc3400759fc39bb`;

  async function get_temp() {
    try {
      let res = await fetch(url);
      let data = await res.json();
      append_data(data);
      console.log(data);
    } catch (err) {
      console.log(err);
    }
  }
  get_temp();
}

function append_data(data) {
  let container = document.getElementById("container");
  container.innerHTML = null;

  let h2 = document.createElement("h2");
  h2.innerText = data.name;

  let temp = document.createElement("h3");
  temp.innerText = `Temperature : ${(data.main.temp - 273).toFixed(3)}C`;

  let temp_max = document.createElement("h3");
  temp_max.innerText = `Max_temp : ${(data.main.temp_max - 273).toFixed(3)}C`;

  let temp_min = document.createElement("h3");
  temp_min.innerText = `Min_temp : ${(data.main.temp_min - 273).toFixed(3)}C`;

  container.append(h2, temp, temp_max, temp_min);

  // Map
  let url = `https://maps.google.com/maps?q=${data.name}&t=&z=13&ie=UTF8&iwloc=&output=embed`;
  let iframe = document.querySelector("#gmap_canvas");
  iframe.src = url;
}

//  current location

function user_location() {
  navigator.geolocation.getCurrentPosition(success);

  function success(pos) {
    const crd = pos.coords;

    console.log("Your current position is:");
    console.log(`Latitude : ${crd.latitude}`);
    console.log(`Longitude: ${crd.longitude}`);
    console.log(`More or less ${crd.accuracy} meters.`);
    device_location(crd.latitude, crd.longitude)
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
      console.log(res);
    })
    .catch(function (rej) {
      console.log(rej);
    });
}
