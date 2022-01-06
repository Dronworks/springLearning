<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<title>Student Registration form</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">
		First name: <form:input path="firstName" />
		<br>
		<br>
		Last name: <form:input path="lastName" />
		<br>
		<br>
		Country:
		<form:select path="country">
			<form:options items="${student.countryOptions}"/>
		</form:select>
		<br>
		<br>
		Programming Language:
		Java <form:radiobutton path="favoriteLanguage" value="Java"/>
		C# <form:radiobutton path="favoriteLanguage" value="C#"/>
		
		<br>
		<br>
		OS:
		<br>
		<form:checkboxes path="operationSystems" items="${student.oses}" />
		
		<br>
		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>