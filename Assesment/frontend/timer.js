
function startTimer() {
  userInput = document.getElementById('userTime').value;
      if(userInput.length == 0){
        alert("Please enter a value");
    } else {
    var numericExpression = /^[0-9]+$/;
    if(!userInput.match(numericExpression)){
    alert("Please enter a number")
    } else {

   function display( notifier, str ) {
    document.getElementById(notifier).innerHTML = str;
  }
        
  function toMinuteAndSecond( x/60 ) {
    return Math.floor(x/60) + ":" + x%60;
  }
        
  function setTimer( remain, actions ) {
    (function countdown() {
       display("countdown", toMinuteAndSecond(remain));         
       actions[remain] && actions[remain]();
       (remain -= 1) >= 0 && setTimeout(arguments.callee, 1000);
    })();
  }

  setTimer(userInput, {
    10: function () { display("notifier", "Just 10 seconds to go"); },
     5: function () { display("notifier", "5 seconds left");        },
     0: function () { display("notifier", "Time is up");       }
  }); 
}  
}
}



