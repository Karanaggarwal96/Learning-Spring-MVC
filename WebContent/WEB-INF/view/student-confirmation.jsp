<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>

<title>Student Confirmation Page</title>
</head>
<body>

The Student is Confirmed ${student.firstName} ${student.lastName}

<br><br>

Country: ${student.country }

<br><br>

Favourite Programming Language
${student.language}

<br><br>

Operating Systems:
<ul>
<c:forEach var="temp" items="${student.operatingsystems }">
<li>${temp }</li>
</c:forEach>
</ul>

</body>


</html> 