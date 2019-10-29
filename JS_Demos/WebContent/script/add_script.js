/**
 * 
 */
  function countRabbits() { 
    for(let i=1; i<=3; i++) { 
      alert("Rabbit number " + i); 
    } 
  } 
  
  button.onclick = function(){ 
	  alert('Click!'); 
	  }; 


	function sayThanks() { 
	  alert('Thanks!'); 
	} 
	elem.onclick = sayThanks; 
	
	function handler1() { 
	    alert('Thanks!'); 
	  }; 
	 
	  function handler2() { 
	    alert('Thanks again!'); 
	  } 
	 
	  elem.onclick = () => alert("Hello"); 
	  elem.addEventListener("click", handler1); // Thanks! 
	  elem.addEventListener("click", handler2); // Thanks again! 
	  
	  var x=document.getElementById("hand");
	  x.addEventListener("Click", dofunction);
	  x.addEventListener("Click", somefunction);
	  function dofunction(){
		  alert("Doing fuction");
	  }
	  function somefunction(){
		  alert("Some fuction");
	  }