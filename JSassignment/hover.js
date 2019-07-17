function showImages() {
//change other images
 document.getElementById('im2').innerHTML = "<img class='imgheight' src='https://cdn.pixabay.com/photo/2016/02/05/17/30/vintage-1181585__340.jpg'/>";
 document.getElementById('im3').innerHTML = "<img class='imgheight' src='https://cdn.pixabay.com/photo/2018/01/04/14/16/woman-3060784__340.jpg'/>";
 document.getElementById('im4').innerHTML = "<img class='imgheight' src='https://cdn.pixabay.com/photo/2016/11/23/00/32/apple-1851464__340.jpg'/>";
//create elements
  var containerElem = document.createElement("div");
  containerElem.setAttribute("id", "container");
  containerElem.setAttribute("class", "container row margin-for-element");
  document.body.appendChild(containerElem);
  var firstImg = document.createElement("img");
  firstImg.setAttribute("class", "col-3 imgheight");
  firstImg.setAttribute("src", 'https://cdn.pixabay.com/photo/2016/01/25/14/52/husky-1160768_960_720.jpg');
  containerElem.appendChild(firstImg);
  var SecondImg = document.createElement("img");
  SecondImg.setAttribute("class", "col-3 imgheight");
  SecondImg.setAttribute("src", 'https://cdn.pixabay.com/photo/2019/04/26/00/18/notebook-4156348__340.jpg');
  containerElem.appendChild(SecondImg);
  var thirdImg = document.createElement("img");
  thirdImg.setAttribute("class", "col-3 imgheight");
  thirdImg.setAttribute("src", 'https://cdn.pixabay.com/photo/2018/03/18/18/25/cows-on-pasture-3237797__340.jpg');
  containerElem.appendChild(thirdImg);
}

function hideImages() {
    //change back other images
    document.getElementById('im2').innerHTML = "<img class='imgheight' src='https://cdn.pixabay.com/photo/2016/03/26/13/09/cup-of-coffee-1280537__340.jpg'/>";
    document.getElementById('im3').innerHTML = "<img class='imgheight' src='https://cdn.pixabay.com/photo/2014/05/02/21/50/home-office-336378__340.jpg'/>";
    document.getElementById('im4').innerHTML = "<img class='imgheight' src='https://cdn.pixabay.com/photo/2016/11/29/08/41/apple-1868496__340.jpg'/>";
    //remove elements
    var container = document.getElementById('container');
    document.body.removeChild(container);
}