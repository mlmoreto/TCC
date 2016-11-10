<!-- Nesta página são exibidos todos os dados do cliente selecionado,
além de todo o histório de agendamentos já realizados para esse cliente -->

<%@ page session="false" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="petclinic" tagdir="/WEB-INF/tags" %>

<petclinic:layout pageName="owners">

    <h2>Informações do cliente</h2>


    <table class="table table-striped">
        <tr>
            <th>Nome</th>
            <td><b><c:out value="${owner.firstName} ${owner.lastName}"/></b></td>
        </tr>
        <tr>
            <th>Endereço</th>
            <td><c:out value="${owner.address}"/></td>
        </tr>
        <tr>
            <th>Cidade</th>
            <td><c:out value="${owner.city}"/></td>
        </tr>
        <tr>
            <th>Telefone</th>
            <td><c:out value="${owner.telephone}"/></td>
        </tr>
    </table>

    <spring:url value="{ownerId}/edit.html" var="editUrl">
        <spring:param name="ownerId" value="${owner.id}"/>
    </spring:url>
    <a href="${fn:escapeXml(editUrl)}" class="btn btn-default">Editar cliente</a>

    <spring:url value="{ownerId}/pets/new.html" var="addUrl">
        <spring:param name="ownerId" value="${owner.id}"/>
    </spring:url>
    <a href="${fn:escapeXml(addUrl)}" class="btn btn-default">Agendar</a>

    <br/>
    <br/>
    <br/>
    <h2>Agendamentos</h2>

    <table class="table table-striped">
        <c:forEach var="pet" items="${owner.pets}">

            <tr>
                <td valign="top">
                    <dl class="dl-horizontal">
                        <dt>Serviço</dt>
                        <dd><c:out value="${pet.name}"/></dd>
                        <dt>Data</dt>
                        <dd><fmt:formatDate value="${pet.birthDate}" pattern="yyyy-MM-dd"/></dd>
                        <dt>Profissional</dt>
                        <dd><c:out value="${pet.type.name}"/></dd>
                    </dl>
                </td>
                <td valign="top">
                    <table class="table-condensed">
                        <thead>
                        <tr>
                            <th>Data de alteração</th>
                            <th>Motivo</th>
                        </tr>
                        </thead>
                        <c:forEach var="visit" items="${pet.visits}">
                            <tr>
                                <td><fmt:formatDate value="${visit.date}" pattern="yyyy-MM-dd"/></td>
                                <td><c:out value="${visit.description}"/></td>
                            </tr>
                        </c:forEach>
                        <tr>
                            <td>
                                <spring:url value="/owners/{ownerId}/pets/{petId}/edit" var="petUrl">
                                    <spring:param name="ownerId" value="${owner.id}"/>
                                    <spring:param name="petId" value="${pet.id}"/>
                                </spring:url>
                                <a href="${fn:escapeXml(petUrl)}">Editar agendamento</a>
                            </td>
                            <td>
                                <spring:url value="/owners/{ownerId}/pets/{petId}/visits/new" var="visitUrl">
                                    <spring:param name="ownerId" value="${owner.id}"/>
                                    <spring:param name="petId" value="${pet.id}"/>
                                </spring:url>
                                <a href="${fn:escapeXml(visitUrl)}">Adicionar observação</a>
                            </td>
                        </tr>
                    </table>
                </td>
            </tr>

        </c:forEach>
    </table>

</petclinic:layout>
