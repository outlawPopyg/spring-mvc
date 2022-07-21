<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="ru">
<head>
    <title>Emp details</title>
</head>
<body style="background: lightblue">
<h3>Enter details</h3>
<form:form action="showDetails" modelAttribute="employee">
    <div>
        Name: <form:input path="name"/>
        <form:errors path="name" cssStyle="color: darkred"/>
    </div>
    <div>
        Last name: <form:input path="lastName"/>
        <form:errors path="lastName" cssStyle="color: darkred" />
    </div>
    <div>
        Salary: <form:input path="salary" />
        <form:errors path="salary" cssStyle="color: darkred" />
    </div>

    <div>Department:
        <form:select path="department">
            <form:options items="${employee.depMap}" />
        </form:select>
    </div>

    <div>
        Favorite gun:
        <form:radiobuttons path="gun" items="${employee.gunMap}" />
    </div>

    <div>
        Favorite horses
        Morgan: <form:checkbox path="favoriteHorses" value="Морган"/>
        Кентукийская: <form:checkbox path="favoriteHorses" value="Кентукийская"/>
        Арабская: <form:checkbox path="favoriteHorses" value="Арабская"/>
    </div>

    <div>
        Phone number:
        <form:input path="phoneNumber" />
        <form:errors path="phoneNumber" cssStyle="color: darkred" />
    </div>

    <div>
        Email:
        <form:input path="email" />
        <form:errors path="email" cssStyle="color: darkred" />
    </div>

    <button>submit</button>

</form:form>
</body>
</html>
