<%--
  Created by IntelliJ IDEA.
  User: kishor
  Date: 22/01/22
  Time: 12:57 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>empreg</title>
</head>
<body>
    <h2>Enter Employee Details</h2>
<%--    <form action="empreg" method="post">--%>
<%--        ID : <input type="text" name="id"><br><br>--%>
<%--        Name : <input type="text" name="name"><br><br>--%>
<%--        Dept No : <input type="text" name="deptno"><br><br>--%>
<%--        <input type="submit" value="Register">--%>
<%--        <input type="reset" value="Cancel">--%>
<%--    </form>--%>
        <form:form action="empreg" method="post">
            <table>
                <tr>
                    <td><form:label path="id">ID</form:label></td>
                    <td><form:input path="id"/> </td>
                </tr>
                <tr>
                    <td><form:label path="name">Name</form:label></td>
                    <td><form:input path="name"/></td>
                </tr>
                <tr>
                    <td><form:label path="deptno">DeptNo</form:label></td>
                    <td><form:input path="deptno"/></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Register"/></td>
                    <td><input type="reset" value="Cancel"/> </td>
                </tr>
            </table>
        </form:form>

</body>
</html>
