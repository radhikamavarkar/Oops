
function valName() { 
	
	
	
	var uname = document.getElementById("firstname").value;  
	var pass = document.getElementById("firstname").value;
	if (firstname.length >= 3 && firstname.length <= 10) {
		firstname = firstname.toUpeercase();
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
	document.getElementById("res").innerHTML=message;  
	
	
	
	if(password.length>=4 && password.length<=8){ 
		password=password.toUppercase(); 
		message="give valid password";
		
	
	} 
	else{ 
		message="password length should be between 4 to 8";
	} 
	document.getElementById("res").innerHTML=message; 
	
	
	var mname=document.getElementById("middlename").value;
	if(middlename.length>=4 && middlename.length<=8){ 
		middlename=middlename.toUppercase(); 
		message="give valid middlename";
		
	
	} 
	else{ 
		message="middlename length should be between 4 to 8";
	} 
	document.getElementById("res").innerHTML=message;
	
	
	
	var lname=document.getElementById("lastname").value; 
	if(lastname.length>=4 && lastname.length<=8){ 
		lastname=lastname.toUppercase(); 
		message="give valid lastname";
		
	
	} 
	else{ 
		message="lastname length should be between 4 to 8";
	} 
	document.getElementById("res").innerHTML=message;
	
	
	
	var num=document.getElementById("number").value; 
	if(number.length>=6 && password.length<=10){ 
		number=number.number(); 
		message="give valid number";
		
	
	} 
	else{ 
		message="number length should be between 6 to 10";
	} 
	document.getElementById("res").innerHTML=message;
	
	
	var d=document.getElementById("date").value; 
	if(date.length>=4 && date.length<=8){ 
		date=date.number(); 
		message="give valid number";
		
	
	} 
	else{ 
		message="date length should be between 4 to 8";
	} 
	document.getElementById("res").innerHTML=message;
	
	
	
	var g=document.getElementById("gender").value; 
	if(gender.length>=4 && gender.length<=8){ 
		password=password.toUppercase(); 
		message="enter gender";
		
	
	} 
	else{ 
		message="gender length should be between 4 to 8";
	} 
	document.getElementById("res").innerHTML=message;
	
	
}




