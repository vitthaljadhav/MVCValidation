<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="frm" uri="http://www.springframework.org/tags/form"  %>
<%@ taglib prefix="spring"  uri="http://www.springframework.org/tags"%>

    <%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- link rel="stylesheet" href="<spring:theme code='stylesheet' />" type="text/css"/>

<p><a href="http://localhost:4580/Binding_with_User_defineDataType/admissionForm.html?siteTheme=green">Green</a>|
<a href="http://localhost:4580/Binding_with_User_defineDataType/admissionForm.html?siteTheme=red">Red</a>
</p>

 --%>



<a href="http://localhost:4580/Binding_with_User_defineDataType/admissionForm.html?siteLanguage=en">English</a>|
<a href="http://localhost:4580/Binding_with_User_defineDataType/admissionForm.html?siteLanguage=fr">French</a>

<h1>STUDENT ADMISSION FORM FOR ENGINEERING COURSE</h1>
<%-- <h1> <spring:message code="label.admission"/></h1> --%>
<frm:errors path="st.*"></frm:errors>
<form action="./Admission.html" method="post">
<pre>
Student_Name <input type="text" name="name"><br>

Student_Hobby<input type="text" name="hobby"><br>

 Student_Mobile_Number:<input type="text" name="mobile"><br>

Student_Date Of Birth: <input type="text" name="dob"><br>

Student Skills:<select  name="skill" multiple>
<option value="Core Java">Core Java</option>
<option value="Spring MVC">Spring MVc</option>
<option value="Servlet">Servlet</option>
<option value="Hibernate">hibernate</option>

<option value="jsp">jsp</option>
<option value="Oracle">Oracle</option>
</select>


Student_Country:<input type="text" name="add.country">

Student_City:<input type="text" name="add.city">

Student_Street:<input type="text" name="add.street">

Pincode:<input type="text" name="add.pincode">

 <input type="submit" value="Sumit the form Clicking here...">


</pre>


</form>
</body>
</html>