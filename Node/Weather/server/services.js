let bent = require('bent')

const getJson = bent('json')

async function getWeatherDetails(req, res) {
  let search_place = req.query.place;

  let place = await getLocation(search_place)

  const urlWeather = "https://api.darksky.net/forecast//"
    + place.geometry[1] + "," + place.geometry[0];
  
    let weather = await getJson(urlWeather)

    res.json(weather)
    console.log(weather)
  }

async function getLocation(search_place) {
  // returns latitude and longitude of given place

  let geoRes = "https://api.mapbox.com/geocoding/v5/mapbox.places/"
    + encodeURIComponent(search_place)
    + ".json?access_token="

  let data = await getJson(geoRes);

  let place = {
    place_name: data.features[0].place_name,
    properties: data.features[0].properties,
    geometry: data.features[0].geometry.coordinates
  }
  console.log(place)
  return place;
}


module.exports.getWeatherDetails = getWeatherDetails;
module.exports.getLocation = getLocation;