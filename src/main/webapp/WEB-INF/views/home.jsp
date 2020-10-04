<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Info planner</title>
</head>
<body>
<h1>Enter the stock info below</h1>
<div class="searchBox">
<input type="text" name="search" placeholder="Enter ticker" />
<input  type="submit" class="btn-primary" value="search" />
</div>
<p>
<c:out value="${result.regularMarketPrice }" />
<c:out value="${result.bid }" />
<c:out value="${result.ask }" />
</p>
</body>
</html>