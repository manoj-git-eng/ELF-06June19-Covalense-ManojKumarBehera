/* window.onload=function(){
    function validateForm(){
        let myEmail=document.forms[0].email.value;
        console.log(myEmail);
    }
} */
/* window.oninput= function(){
    if(document.forms[0].email.value!=null){
        document.getElementsByClassName("submit").
    }

} */

window.onload=function(){

};
function validateForm(){
    let myEmail=document.forms[0].email.value;
    let myPassword = document.forms[0].password.value;
    let confirmPassword=
    document.forms[0].confirmpassword.value;
    if(myEmail.length>6&&
        myPassword.length>6 &&
        confirmPassword.length>6 &&
        myPassword===confirmPassword){
            document.forms[0].myButton.disabled=false;
        }else{
            document.forms[0].myButton.disabled=true;
        }
}
