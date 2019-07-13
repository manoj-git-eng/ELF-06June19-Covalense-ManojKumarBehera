/* var a= 10;
console.log(a);
var b= a;
console.log(b);
b=20;
console.log(a);
console.log(b);


console.log("================");
 */
/* var person = {
    firstName: 'Manoj',
    laststName: 'Behera',
    age: 24,
    getFullName: function(){
        return this.firstName+" "+this.laststName;

    },
    address:{
        city: 'bangalore',
        state: 'karnataka',
        pincode: 560037
    },
    hobbies: ['sleeping','singing']
};
 console.log("first Name ="+person.firstName);
 console.log("City Name ="+person.address.city);
 console.log("Full Name ="+person.getFullName());
 console.log("Hobbies ="+person.hobbies);


 console.log("================");

 var library=[
     {
         id : 1,
         author: 'Billgates',
         name: 'mso'
     },
     {
        id : 2,
        author: 'Steve Jobs',
        name: 'Apple'
    },
    {
        id : 3,
        author: 'Narayana',
        name: 'Infosys'
    }
 ];

 console.log("Object1= "+library[1]); */


/*   var hobbies = ['cricket', 'vollyball', 'football', 'reading books'];  */
/* document.getElementById('demo').innerHTML = hobbies; */
/* var person = {
    name: 'soundarya',
    age: 23,
    city: 'raichur'
};

for (var i = 0; i < hobbies.length; i++) {
    console.log("values are " + hobbies[i]);
};
console.log("==================");
for (var i = 0; i < person.length; i++) {
    console.log("values are " + person[i]);
};
console.log("==================");
for (var i = 0; i < person.length; i++) {
    console.log("values are " + person[i]);
};
console.log("==================");
for (var val of hobbies) {
    console.log("values are " +val);
};

hobbies ['test'] = 'some value';
for(var i in hobbies){
    console.log("values are " +hobbies[i]);
} */
/* console.log("============for loop started");
console.time("forof");
for(var i of hobbies){
    var a=[];
}
console.timeEnd("forof");
console.log("============for of ended"); */


/* function alertMessage(val,number){
    alert(`This is Named function value =${val}   number=${number}`); */
/* } */
/* (function(){
    alert("This is IIFE");
}());
(function(){
    alert("This is IIFE1111");
}()); */
/* alertMessage("aa",12); */

/* varKey();
function varKey(){
    a=20;
    console.log("aaa= "+a);
}
console.log("aaa= "+a);
console.log(a);
var a=10; */


/* function letKey(){
    b=20;
    console.log("bbbb= "+b);
}
console.log("bbbb= "+b);

function constKey(){
    c=20;
    console.log("cccc= "+c);
}
console.log("cccc= "+c); */
/* var a={};
console.log(typeof hobbies);
console.log(Array.isArray(hobbies));
console.log(Array.isArray(a)); */
/* var incl = hobbies.includes("crick");
console.log(incl);

hobbies.push("kabbadi");
console.log(hobbies);
console.log("======");
hobbies.pop();
console.log(hobbies);
console.log("======");
hobbies.shift();
console.log(hobbies);
console.log("======");
hobbies.unshift("new value");
console.log(hobbies); */

/* var hobbies = ['cricket', 'vollyball', 'football', 'reading books'];  */

/* hobbies.splice(0,2,"ffff","jjjjj");
console.log(hobbies); */


/* let hobbies1= hobbies.slice(2); */
/* console.log(hobbies.join('-----'));
console.log(hobbies); */

//indexOf
/* console.log(hobbies.indexOf('cricket')); */
/* 
function first(){
    setTimeout(()=>{
        console.log("this is first");
    },0);
    
}
function second(){
    console.log("this is second");
}
first();
second(); */

/* function first(sec){
    setTimeout(()=>{
        console.log("this is first");
        sec();
    });
    
}
function second(){
    console.log("this is second");
}
first(second); */
/* const items = [
    {
        id:1,
        name: "book",
        price: 200
    },
    {
        id:2,
        name: "pen",
        price: 260
    },
    
    {
        id:3,
        name: "alu",
        price: 50
    },
    {
        id:4,
        name: "saru",
        price: 20
    },
    {
        id:5,
        name: "piaja",
        price: 40
    }

];
console.log(items);
let mappedIds=items.map((value)=>{
    return value.name;
}
);
console.log(mappedIds);


console.log(items);
let filteredValue = items.filter((value)=>{
    return value.name=="alu";
}
);
console.log(filteredValue); */