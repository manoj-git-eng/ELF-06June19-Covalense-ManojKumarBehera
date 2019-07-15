/* var library=[
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
var jsonLibrary =JSON.stringify(jsonLibrary);
console.log(jsonLibrary);


var objLibrary =JSON.stringify(jsonLibrary);
console.log(jsonLibrary); */






/* let number=  prompt("Enter a number");
console.log(factorial(number));
function factorial(n){
if(n===0||n===1){
    return 1;
} else{
    return factorial(n-1)*n;
}
 } */  

/*     
console.log("==============");
function counter(){
    var counter =0;
    function getCount(){
        counter++;
        return counter;
    }
    return getCount;
}
let count = counter();
var value = count();
console.log(value);
var value1 = count();
console.log(value1);


console.log("==============");
var dwightSalary = (function(){
    var salary = 60000;
    function changeBy(amount){
        salary +=amount;
    }
    return{
        raise : function(){
            changeBy(5000);
        },
        lower : function(){
            changeBy(-5000);
        },
        currentAmount : function(){
            return salary;
        }
    };
})();

alert(dwightSalary.currentAmount()); // $60,000.
dwightSalary.raise(); 
alert(dwightSalary.currentAmount()); //$65,000.
dwightSalary.lower(); 

alert(dwightSalary.currentAmount()); //$55,000.


dwightSalary.changeBy(1000); //TypeError: undefined is not a function. */

/* let promise1=new Promise((res,rej)=>{
    const items = [{id:1,name:'manoj'},{id:2,name:'ayushi'}];
    if(items.length>0){
        res(items);
    }else{
        rej("rejected");
    }
});
let promise2=new Promise((res,rej)=>{
    const items = [{id:1,name:'manoj'},{id:2,name:'ayushi'}];
    if(items.length>0){
        res(items);
    }else{
        rej("rejected");
    }
});
let promise3=new Promise((res,rej)=>{
    const items = [{id:1,name:'manoj'},{id:2,name:'ayushi'}];
    if(items.length>0){
        res(items);
    }else{
        rej("rejected");
    }
});
 */
/* promise.then((data)=>{
    console.log(data);
}).catch((reason)=>{
    console.log(reason);
}); */


/* Promise.race(promise1,promise2,promise3).then((data)=>{
    console.log(data);
});
 */
 var a=10;
 /*console.log(this);  //window
console.log(window); //window
console.log(this.a); //10
console.log(window.a); //10 */

var person ={
    name: 'jhon',
    age: 25,
    getName:function(){
        console.log(this);

    }
};
person.getName();

/* function checkThis(){
    console.log(this);  //window

    console.log(window); //window
    console.log(this.a); //10
    console.log(window.a); //10

    console.log(this===window);
    

}
checkThis(); */

var john = {
    name: 'jhon',
    age: 25,
    presentation:function(style,message){
        if(style==='formal'){
            console.log("hi "+this.name+' good '+message );
        } else{
            console.log("hey "+this.name+'  '+message );
        }
    }
};
//john.presentation('formal','Morning');

var mike = {
    name: "mike",
    age:26
};
/* john.presentation.call(mike,'friendly','Evening');
john.presentation.apply(mike,['friendly','Evening']); */

var johnFormal = john.presentation.bind(mike,'formal');
johnFormal('night');