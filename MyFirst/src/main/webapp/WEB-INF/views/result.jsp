<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
   <head>
      <title>Spring MVC Form Handling</title>
   </head>
   <body>

      <h2>Submitted Student Information</h2>
      <table>
      	<c:forEach var="listVar" items="${SpringWeb.students}"> 
         <tr>
            <td>Name</td>
            <td>${listVar.name}</td>
         </tr>
         <tr>
            <td>Age</td>
            <td>${listVar.age}</td>
         </tr>
         <tr>
            <td>ID</td>
            <td>${listVar.id}</td>
         </tr>
         </c:forEach>
      </table>  
   </body>
</html>