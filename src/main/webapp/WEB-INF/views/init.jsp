
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<portlet:defineObjects />

<portlet:renderURL var="secondUrl">
    <portlet:param name="render" value="second" />
</portlet:renderURL>

<portlet:actionURL var="actionOneUrl">
    <portlet:param name="action" value="action-one" />
</portlet:actionURL>

<portlet:actionURL var="actionTwoUrl">
    <portlet:param name="action" value="action-two" />
</portlet:actionURL>

<nav>
    <ul>
        <li> <a href="<portlet:renderURL />"> First View </a></li>
        <li> <a href="${secondUrl}"> Second View </a></li>
        <li> <a href="${actionOneUrl}"> Action One </a></li>
        <li> <a href="${actionTwoUrl}"> Action Two </a></li>
    </ul>
</nav>