<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<%--
SICE :: Sistema de Agendamento On-Line para Clínicas de Estética
--%>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <%-- The above 4 meta tags *must* come first in the head; any other head content must come *after* these tags --%>

    <spring:url value="/resources/images/favicon.png" var="favicon"/>
    <link rel="shortcut icon" type="image/x-icon" href="${favicon}">

    <title>SICE :: Sistema de Agendamento On-Line para Clínicas de Estética</title>

    <%-- CSS generated from LESS --%>
    <spring:url value="/resources/css/petclinic.css" var="petclinicCss"/>
    <link href="${petclinicCss}" rel="stylesheet"/>

    <!-- Only datepicker is used -->
    <spring:url value="/vendors/jquery-ui/themes/base/minified/jquery-ui.min.css" var="jQueryUiCss"/>
    <link href="${jQueryUiCss}" rel="stylesheet"/>
    <spring:url value="/vendors/jquery-ui/themes/base/minified/jquery.ui.theme.min.css" var="jQueryUiThemeCss"/>
    <link href="${jQueryUiThemeCss}" rel="stylesheet"/>
    <spring:url value="/vendors/jquery-ui/themes/base/minified/jquery.ui.datepicker.min.css" var="jQueryUiDatePickerCss"/>
    <link href="${jQueryUiDatePickerCss}" rel="stylesheet"/>
</head>
