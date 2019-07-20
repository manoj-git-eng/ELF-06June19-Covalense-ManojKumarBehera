
window.onload=function(){

};
function validateForm(){
    let myEmail=document.forms[0].email.value;
    let myPassword = document.forms[0].password.value;
    if(myEmail.length>6&&
        myPassword.length>5){
            document.forms[0].myButton.disabled=false;
        }else{
            document.forms[0].myButton.disabled=true;
        }
}

function changeImgOnClick1(obj) {
    var obj = document.getElementById('myPassword');
    obj.type = "text";
  }
  function changeImgOnClick2(obj) {
    var obj = document.getElementById('myPassword');
    obj.type = "password";
    
  }