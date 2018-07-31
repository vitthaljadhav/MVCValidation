<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${headermessage }

<h1>Congrats Engineering Collage proceesd has  Your Application Form...</h1>
<table>
<tr>
<td>Student Name :</td>
<td>${st.name}</td>
</tr>
<tr>
<td>Student Hobby :</td>
<td>${st.hobby}</td>
</tr>

<tr>
<td>Student Mobile :</td>
<td>${st.mobile}</td>
</tr>

<tr>
<td>Student Date OF Birth :</td>
<td>${st.dob}</td>
</tr>

<tr>
<td>Student Skills :</td>
<td>${st.skill}</td>
</tr>

<tr>
<td>Student_Address</td>
<td>Country_Name:${st.add.country }
     City_Name:${st.add.city }
     Street_Name:${st.add.street }
     Pincode:${st.add.pincode }
</td>





</tr>

</table>

</body>
</html>