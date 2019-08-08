<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="WEB-INF/murach.tld" prefix="m" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Current Date Tag</title>
</head>
<body>
	<m:currentDate />
	<br />
	<m:currentTime />
	<br />
	<m:ifWeekday>
		<p>Today is weekday</p>
	</m:ifWeekday>
	
	<p>
		<m:ifEmptyMark color="blue" field="" /> marks required fields
	</p>
	<br />
	<label class="pad_top">Last Name:</label>
	<input type="text" name="lastName" value="${user.lastName}">
	<m:ifEmptyMark color="blue" field="${user.lastName}" />
	<br />
</body>
</html>