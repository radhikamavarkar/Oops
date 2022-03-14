function valName() { 
	
	
	var ema = document.getElementById("username").Lvalue;
	
	if (username.length >= 3 && username.length <= 10) {
		username = username.toUpeercase();
		message = "valid name";
	}

	else {
		message = "Name length should be between 3 to 10";
	}
	document.getElementById("res").innerHTML = message; 
	
	
	var ema = document.getElementById("email").Lvalue;
	if(email.length>=3 && email.length<=18){ 
		email=email.tolowercase(); 
		message="valid email id";
	} 
	
	else{ 
		message="Email length should be between 3 to 18";
	} 
	document.getElementById("mail").innerHTML=message; 
	
	
	var pass = document.getElementById("password").value;
	if(password.length>=4 && password.length<=8){ 
		password=password.toUppercase(); 
		message="give valid password";
		
	
	} 
	else{ 
		message="password length should be between 4 to 8";
	} 
	document.getElementById("res").innerHTML=message;
	
	}




