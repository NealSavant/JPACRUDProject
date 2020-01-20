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
		<h1> <a href="/">Aquarium Database</a></h1>
	</header>
	
	<nav>
  		<ul>
 	 	<li><a href="createPage.do">Add Critter to Database</a></li>
 		<li><a href="searchPage.do">Search for a Critter</a></li>
  		<li><a href="listPage.do">List all Critters</a></li>
 		</ul>
  	</nav>
  		
  	<article>
  	
  	<form action="addOrganism.do" method="Post">
			<fieldset>
				<legend>Create Organism</legend>
				<div class="form-group">
					<label for="name">Name: </label>
					<input type="text" name="name" id="name" class="form-control" required />
				</div>
				<div class="form-group">
					<label for="type">Type: </label>
					<input type="text" name="type" id="type" class="form-control" required/>
				</div>
				<div class="form-group">
					 <label for="lifeSpan">Life Span (Years): </label>
					 <input type="number" name="lifeSpan" id="lifeSpan" class="form-control" required/>
				</div>
				<div class="form-group">
					<label for="rentalDuration">Color: </label>
					<input type="text" name="color" id="color" class="form-control" required />
				</div>
				<div class="form-group">
					<label for="gender">Gender</label>
					<select name="gender" id="gender" class="btn btn-secondary dropdown-toggle" required>
						<option value="M">M</option>
						<option value="F">F</option>
						<option value="NA">NA</option>
					</select>				
				</div>
				<input type="submit" value="Add Organism" class="btn btn-primary"/>
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