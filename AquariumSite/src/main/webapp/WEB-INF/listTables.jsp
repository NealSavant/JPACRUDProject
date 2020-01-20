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
  		<h2>List of Organisms</h2>
  		<table class="table table-striped">
		<thead class="thead thead-dark">
			<tr>
				<th>Name</th>
				<th>Type</th>
				<th>Life Span</th>
				<th>Color</th>
				<th>Gender</th>
				<th></th>
				<th></th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="o" items="${organisms}">
				<tr>
					<td>${o.name}</td>
					<td>${o.type}</td>
					<td>${o.lifeSpan}</td>
					<td>${o.color}</td>
					<td>${o.gender}</td>
					<td><input type="submit" value="Update" class="btn btn-primary"/></td>
					<td><input type="submit" value="Delete" class="btn btn-danger"/></td>
				</tr>
			</c:forEach>
			
		</tbody>
		</table>
		
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