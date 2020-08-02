function myFunction(imgs) {
  var expandImg = document.getElementById("expandedImg");
  expandImg.src = imgs.src;
  expandImgAnimation();
}

function expandImgAnimation(){
  var expandImg = document.getElementById("expandedImg");
  expandImg.style.webkitAnimation = 'none';
  setTimeout(function () {
    expandImg.style.webkitAnimation = '';
  }, 1);
}

function toggleMenubar(elm) {
  elm.classList.toggle("toggle");
  
  var leftSection = document.getElementById("left-section");
  var rightSection = document.getElementById("right-section");
  leftSection.classList.toggle("toggle-left-section");
  rightSection.classList.toggle("toggle-right-section");
  /*
  if (window.getComputedStyle(leftSection).display === "none") {

  } else {
    leftSection.style.display = "none";
    rightSection.style.width = "100%";
    rightSection.style.marginLeft = "0%";
  }*/

}


/* slide show */
var slideIndex = 1;
showSlides(slideIndex);

function plusSlides(n) {
  showSlides(slideIndex += n);
}

function showSlides(n) {
  var images = ["1.jpg", "2.jpg", "3.jpg","4.jpg"];
  var i;
  var length = images.length;
  var slides = document.getElementsByClassName("mySlides");
  var dots = document.getElementsByClassName("dot");
  slideIndex = n;
  if (slideIndex > length) {
    slideIndex = 1;
    console.log("slideIndex is greater")
  } else if (slideIndex < 1) {
    slideIndex = length;
    console.log("slideIndex is less")
  }
  console.log("images no : " + images[slideIndex-1]);
  var expandedImg = document.getElementById("expandedImg");
  expandedImg.src = "images/" + images[slideIndex-1];
  
  expandImgAnimation();

}