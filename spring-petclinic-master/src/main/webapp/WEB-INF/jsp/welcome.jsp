<!-- Essa é a página de boas-vindas ao estabelecimento -->

<%@ page session="false" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="petclinic" tagdir="/WEB-INF/tags" %>

<petclinic:layout pageName="home">
    <h3><b>Seja Bem-Vindo(a)!</b></h3>
    <div class="row">
        <div class="col-md-12">
            <spring:url value="/resources/images/sice.jpg" htmlEscape="true" var="petsImage"/>
            <img class="img-responsive" src="${petsImage}"/>
        </div>
    </div>
</petclinic:layout>
