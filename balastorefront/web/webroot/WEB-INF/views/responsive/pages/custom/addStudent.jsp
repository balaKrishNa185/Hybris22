<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h1 align ="center">Student Details </h1><hr>
<br>

<form:form modelAttribute="stu" action="saveStudent" method="post" align="center">
    ID :<form:input path="id" />
    <br><br>
    Name :<form:input path="name" />
    <br><br>
    Standard :<form:input path="standard" />
    <br><br>
    Address:<form:input path="address" />
    <br><br>
    <input type="submit" value="Save"/>
</form:form>