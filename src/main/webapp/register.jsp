
<html>

<head>
<title>Spring Boot Normal Web Application</title>

<style>
body {
   font-family: Arial, Helvetica, sans-serif;
   background-color: rgb(135, 192, 212);
}
* {
	margin:0px;
	padding:0px;
   box-sizing: border-box;
}
form {
   align-items: center;
}
form label {
   margin: 5px 10px 5px 0;
}
form input{
	margin: 5px 10px 5px 0;
   padding: 10px;
}
.input {
   margin: 5px 10px 5px 0;
   width: 100%;
   padding: 10px;
}
#subject{
	margin: 5px 10px 5px 0;
   padding: 10px;
}
.bgimage{
	width:60%;
	position:absolute;
	height:117%;
	right:0px;
}
.container{
	padding:20px;
	width:500px;
	position:absolute;
}
.button {
   padding: 10px 20px;
   font-size: 20px;
   background-color: rgb(109, 110, 106);
   border: 1px solid #ddd;
   color: white;
   cursor: pointer;
   font-weight: bolder;
   border-radius: 4px;
}
.button:hover {
   background-color: black;
}
@media (max-width: 800px) {
   form input {
      margin: 10px 0;
   }
   form {
      flex-direction: column;
      align-items: stretch;
   }
}
</style>
</head>

<body>
		<img class="bgimage" src="register2.png" alt="register">
		<form class= "container" method="post" action="/register" modelAttribute="user">
			<label>name:</label><br> 
			<input class="input" type="text" id="name" name="name"><br> 
			
			<label>email:</label><br> 
			<input class="input" type="email" id="email" name="email"><br>
			
			<label>phone:</label><br> 
			<input class="input" type="text" id="phone" name="phone"><br>
			
			<label>date of birth:</label><br> 
			<input type="date" id="dob" name="dob"><br>
			
			<p>Please select your gender:</p>
  			<input type="radio" id="male" name="gender" value="male">
  			<label for="male">male</label><br>
  			<input type="radio" id="female" name="gender" value="female">
  			<label for="female">female</label><br>
  			<input type="radio" id="others" name="gender" value="others">
  			<label for="others">others</label><br><br>

			<label for="subject">Choose a subject:</label>
  			<select name="subject" id="subject">
    			<option value="java">Java</option>
    			<option value="DBMS">DBMS</option>
    			<option value="DS">DS</option>
  			</select>
  			<br><br>
			
			<p>Please choose materials:</p>
			<input type="checkbox" id="video" name="materials" value="video">
  			<label for="video"> video</label><br>
  			<input type="checkbox" id="documents" name="materials" value="documents">
  			<label for="documents"> documents</label><br>
  			<input type="checkbox" id="liveclass" name="materials" value="live class">
  			<label for="liveclass"> live class</label><br><br>
  			
  			<p>Enter address:</p>
  			<label>PIN:</label><br> 
			<input class="input"  type="number" id="pin" name="pin"><br>
			<label>Street:</label><br> 
			<input class="input"  type="text" id="street" name="street"><br>
			<label>Land-mark:</label><br> 
			<input class="input"  type="text" id="landmark" name="landmark"><br>
			
			<input class = "button" type="submit" value="register">
		</form>
	
</body>