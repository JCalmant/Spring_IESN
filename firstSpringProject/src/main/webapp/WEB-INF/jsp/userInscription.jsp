<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="include/importTags.jsp"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="webjars/bootstrap/4.5.0/css/bootstrap.min.css" rel="stylesheet" />
    <script src="webjars/bootstrap/4.5.0/js/bootstrap.min.js" ></script>
    <script src="webjars/jquery/3.5.1/jquery.min.js" ></script>

    <title>${title}</title>
</head>
<body>
<div class="container">
    <form:form
               class="needs-validation"
               id="inscriptionForm"
               method="POST"
               action="/firstSpring/inscription/userInscription"
               modelAttribute="currentUser">
        <table>
            <tr>
                <td>
                    <div class="form-group">
                        <form:label class="col-sm-2 control-label" path="name">Name</form:label>
                        <form:input id="namefield" class="form-control" path="name"/>
                        <form:errors class="invalid-feedback" path="name"/>
                    </div>
                </td>
            </tr>
            <tr>
                <td>
                    <div class="form-group">
                        <form:label class="col-sm-2 control-label" path="age">Age</form:label>
                        <form:input id="agefield" class="form-control" path="age"/>
                        <form:errors class="invalid-feedback" path="age"/>
                    </div>
                </td>
            </tr>
            <tr>
                <td><form:radiobutton path="male" value="true"/>Boy
                    <form:radiobutton path="male" value="false"/>Girl</td>
            </tr>
            <tr>
                <td>What's your preferred hobby?
                    <form:select path="hobby">
                        <form:options items="${hobbies}" itemValue="id" itemLabel="name" />
                    </form:select>
                </td>
            </tr>
            <tr>
                <td><form:button>Submit</form:button></td>
            </tr>
            <tr>
                <c:if test="${not empty message}">${message}</c:if>
            </tr>
        </table>
    </form:form>
</div>
</body>
</html>