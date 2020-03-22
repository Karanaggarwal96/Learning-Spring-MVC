<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>

<html>

<head>


<title>Student Registration Form</title>
<style>
.error{
color:red
}

</style>
</head>
<body>
<form:form action="processForm"  modelAttribute="student">

First Name:<form:input path="firstName"/>
<br><br>
Last Name(*):<form:input path="lastName"/>
<form:errors path="lastName" cssClass="error" />

<br><br>

Country

<form:select path="country">

<form:options items="${student.countryoptions}" />
</form:select>


<br><br>

Favourite Language:
Java<form:radiobutton path="language" value ="Java"/>
Node.js<form:radiobutton path="language" value="Node.js"/>
React.js<form:radiobutton path="language" value="React.js"/>


<br><br>

Favourite Operating Systems:
Linux<form:checkbox path="operatingsystems" value="Linux"/>
Windows<form:checkbox path="operatingsystems" value="Windows"/>
Mac<form:checkbox path="operatingsystems" value="Mac"/>


<br><br>

<input type="submit" value="Submit">

</form:form>




</body>

</html>