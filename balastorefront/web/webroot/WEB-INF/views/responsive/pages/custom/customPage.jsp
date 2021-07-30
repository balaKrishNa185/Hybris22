<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>

<template:page pageTitle="${pageTitle}">


    <h1 align ="center">Manufacturer Details </h1><hr>
    <br>

    <form:form modelAttribute="manu" action="save" method="post" align="center">
        ID :<form:input path="id" />
        <br><br>
        Name :<form:input path="name" />
        <br><br>
        State:<form:input path="state" />
        <br><br>
        <input type="submit" value="Save"/>
    </form:form>



</template:page>