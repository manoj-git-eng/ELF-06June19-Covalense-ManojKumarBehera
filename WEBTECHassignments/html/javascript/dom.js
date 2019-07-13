/* let name=document.getElementById("name");
console.log(name);
console.log(name.textcontent);
name.style.color="pink";

var clasCollection=document.getElementsByClassName("demo");
console.log(clasCollection);
clasCollection[0].style.fontSize = "30px";

clasCollection[1].style.display="none";



//document.getElementById("myButton").className="button";

document.getElementById("myButton").classList="button button1";

//var querySelector=document.querySelector("p");


var querySelector=document.querySelectorAll(".demo");

console.log(querySelector);


let input=document.createElement("input");

document.body.appendChild(input); */


 /* var demoClass= document.getElementsByClassName("demo");
 console.log("By class name "+demoClass.length);



 var demoClass1= document.querySelectorAll(".demo");
 console.log("By query selector "+demoClass1.length);


//write the number of elements in each array.(values match).
 console.log("Number of elements with query selector "+demoClass1.length);
 console.log("Number of elements with class name "+demoClass.length);
 


 //write one elements class to blue.
 document.getElementById("pele").className ="blue";


//write the number of elements in each array.(values digffer).
console.log("Number of elements with query selector "+demoClass1.length);
 console.log("Number of elements with class name "+demoClass.length);

document.write("Aita");
 */


let button= document.getElementById("myButton");
/* button.onclick=function createNewElement(){
    document.getElementById("myButton").innerHTML = '<a href = "https://www.google.com">Anchor Tag</a>';
}; */

window.onload=function(){
    document.getElementById("myButton").textContent ="Dont click";
};

button.