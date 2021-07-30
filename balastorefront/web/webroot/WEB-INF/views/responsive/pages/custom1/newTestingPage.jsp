<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>

<template:page pageTitle="${pageTitle}">

  hi

  <cms:pageSlot position="TestingComponentSlotName1" var="feature" element="div" class="span-24 section5 cms_disp-img_slot">
    <cms:component component="${feature}" />
  </cms:pageSlot>


  <cms:pageSlot position="DisplayComponentSlotName" var="feature" element="div" class="span-24 section5 cms_disp-img_slot">
    <cms:component component="${feature}" />
  </cms:pageSlot>


  <cms:pageSlot position="paragraph1" var="feature" element="div" class="span-24 section5 cms_disp-img_slot">
    <cms:component component="${feature}" />
  </cms:pageSlot>

  <cms:pageSlot position="customBanner" var="feature" element="div" class="span-24 section5 cms_disp-img_slot">
    <cms:component component="${feature}" />
  </cms:pageSlot>

  <div class="col-xs-12 col-md-6 no-space">
    <cms:pageSlot position="customBanner" var="feature" element="div" class="row no-margin">
      <cms:component component="${feature}" element="div" class="col-xs-12 col-sm-6 no-space yComponentWrapper"/>
    </cms:pageSlot>
  </div>
  <div class="col-xs-12">
    <cms:pageSlot position="customBanner" var="feature" element="div" class="landingLayout2PageSection2C">
      <cms:component component="${feature}" element="div" class="yComponentWrapper"/>
    </cms:pageSlot>
  </div>
</template:page>
