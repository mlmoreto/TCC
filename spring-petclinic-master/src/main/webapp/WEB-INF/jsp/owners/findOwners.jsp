<!-- Nesta página, a busca pode ser realizada pelo sobrenome ou, caso nao saiba, a busca é feita
na base de dados por completa -->

<%@ page session="false" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="petclinic" tagdir="/WEB-INF/tags" %>

<petclinic:layout pageName="Agenda">

    <h2>Agenda</h2>

    <spring:url value="/owners.html" var="formUrl"/>
    <form:form modelAttribute="owner" action="${fn:escapeXml(formUrl)}" method="get" class="form-horizontal"
               id="search-owner-form">
        <div class="form-group">
            <div class="control-group" id="lastName">
                <label class="col-sm-2 control-label">Sobrenome do cliente</label>
                <div class="col-sm-10">
                    <form:input class="form-control" path="lastName" size="30" maxlength="80"/>
                    <span class="help-inline"><form:errors path="*"/></span>
                </div>
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn btn-default">Pesquisar Cliente</button>
            </div>
        </div>

    </form:form>

    <br/>
    <a class="btn btn-default" href='<spring:url value="/owners/new" htmlEscape="true"/>'>Cadastrar Cliente</a>
</petclinic:layout>
