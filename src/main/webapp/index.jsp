<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html; charset=UTF-8" %>
<html>
    <body>

    <jsp:include page="header.jsp"/>

        <table>

            <th>
                Data dodania
            </th>

            <th>
                Opis
            </th>

            <c:forEach items="${solutions}" var="solution">

                <tr>

                    <td>
                        ${solution.created}
                    </td>

                    <td>
                        ${solution.description}
                    </td>

                </tr>

            </c:forEach>

        </table>

    <jsp:include page="footer.jsp"/>

    </body>
</html>