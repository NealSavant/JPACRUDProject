<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Aquarium Database</title>
<jsp:include page="nav.jsp"/>
</head>
<body>
<div id="wrapper">

	<header>
		<h1> <a href="home.do">Aquarium Database</a></h1>
	</header>
	
	<nav>
  		<ul>
 	 	<li><a href="createPage.do">Add Organism to Aquarium</a></li>
  		<li><a href="listPage.do">List all Organisms</a></li>
 		</ul>
  	</nav>
  		
  	<article>
  	
  	<form action="updateOrganism.do" method="Post">
			<fieldset>
				<legend>Update Organism</legend>
				<div class="form-group">
					<label for="name">Name: </label>
					<input type="text" value = "${o.name}" name="name" id="name" class="form-control" required />
				</div>
				<div class="form-group">
					<label for="type">Type: </label>
					<input type="text" value = "${o.type}"  name="type" id="type" class="form-control" required/>
				</div>
				<div class="form-group">
					 <label for="lifeSpan">Life Span (Years): </label>
					 <input type="number" value = "${o.lifeSpan}"  name="lifeSpan" id="lifeSpan" class="form-control" required/>
				</div>
				<div class="form-group">
					<label for="rentalDuration">Color: </label>
					<input type="text" value = "${o.color}"  name="color" id="color" class="form-control" required />
				</div>
				<div class="form-group">
					<label for="gender">Gender</label>
					<select name="gender" selected = "${o.gender}"  id="gender" class="btn btn-secondary dropdown-toggle" required>
						<option value="M">M</option>
						<option value="F">F</option>
						<option value="NA">NA</option>
					</select>				
				</div>
				<input type = "hidden" name = "id" value = "${o.id}"/>
				<input type="submit" value="Update Organism" class="btn btn-primary"/>
			</fieldset>
		</form>
  
  	</article>
  	
  	
  	
  	
  	<footer>
  		<a> A web page by Neal Savant</a>
  		<br>
  		<a href="https://www.linkedin.com/in/neal-savant-090159187/">LinkedIn: Neal Savant</a>
  	
  	</footer>

</div>


<jsp:include page="footer.jsp"/>
</body>
</html>