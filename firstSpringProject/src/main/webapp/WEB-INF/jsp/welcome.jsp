<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="include/importTags.jsp"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <title>${title}</title>
</head>
<body>
Welcome to our wonderful world!
<form:form id="form"
           method="POST"
           action="/firstSpring/hello/send"
           modelAttribute="magicKeyForm">
    <form:label path="magicKey">Magic Key</form:label>
    <form:input path="magicKey"/>

    <form:button>Send</form:button>

</form:form>

</body>
</html>