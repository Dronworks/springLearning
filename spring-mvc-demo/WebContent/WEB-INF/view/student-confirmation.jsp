<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> <!-- For loops -->
<!DOCTYPE html>
<html>
<head>
<title>Student Confirmation form</title>
</head>
<body>
	The student is confirmed: ${student.firstName} ${student.lastName}
	<br><br>
	Country: ${student.country}
	<br><br>
	Programming: ${student.favoriteLanguage}
	<br><br>
	Selected OS: 
	<ul>
		<c:forEach var="os" items="${student.operationSystems }">
			<li> ${os} </li>	
		</c:forEach>
	</ul>
	
</body>
</html>