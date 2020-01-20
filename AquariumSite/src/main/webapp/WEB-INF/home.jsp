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
  	
  	<div id="tank"></div>
  	
  	<h2>Aquarium Database</h2>
  	<p>Keep track of the animals in your aquarium!
  	Create, update, and delete entries into the database.</p>
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