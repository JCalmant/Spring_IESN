<%@ include file="../include/importTags.jsp" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE HTML>
<html>
<head>
    <meta http-equiv="Content-Type" content="type=text/html; charset=utf-8">

    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link type="text/css" href="<spring:url value='/css/first.css'/>"
          rel="Stylesheet"/>

    <img src='<spring:url value="/images/localeEn.png"/>'/>

    <img src='<spring:url value="/images/localeFr.png"/>'/>

</head>
<body>
    <div>
        <table>
            <tr>
                <td colspan="2">
                    <div class="headerTemplate">
                        <p>Header</p>
                    </div>
                </td>
            </tr>
            <tr>
                <td>
                    <div>
                        <h1 style="background-color: DodgerBlue;">Menu</h1>
                    </div>
                </td>
                <td>
                    <div>
                        <tiles:insertAttribute name = "main-content" />
                    </div>
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <div class="footerTemplate">
                        <p>Footer</p>
                    </div>
                </td>
            </tr>
        </table>
    </div>
</body>
</html>