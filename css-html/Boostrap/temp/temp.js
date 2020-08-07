var request = new XMLHttpRequest();

request.addEventListener("readystatechange", function (event){
  if (event.target.readyState == 4){
    console.log(event)
  }
})

request.open("GET", "http://puzzle.mead.io/puzzle")
request.send();