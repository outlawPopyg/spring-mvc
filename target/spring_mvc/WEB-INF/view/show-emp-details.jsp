<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" pageEncoding="UTF-8" %>
<html lang="ru">
<head>
    <title>Title</title>
</head>
<body>
    <h2>Welcome</h2>
    <div>Your name: ${employee.name}</div>
    <div>Your last name: ${employee.lastName}</div>
    <div>Your salary: ${employee.salary}</div>
    <div>Your department: ${employee.department}</div>
    <div>Favorite gun: ${employee.gun}</div>
    <div>
        Favorite horses:
        <ul>
            <c:forEach var="horse" items="${employee.favoriteHorses}">
                <li>${horse}</li>
            </c:forEach>
        </ul>
    </div>
    <div>Phone number: ${employee.phoneNumber}</div>
    <div>Phone number: ${employee.email}</div>
</body>
</html>
