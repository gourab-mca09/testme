<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
   <head>
      <title>Spring MVC Form Handling</title>
   </head>
   <body>

      <h2>Student Information</h2>
      <form:form method = "POST"  action = "addStudent" modelAttribute="SpringWeb" >
      	
         <table>
		<tr>
			<th>No.</th>
			<th>Age</th>
			<th>Name</th>
			<th>ID</th>
		</tr>
		<c:forEach items="${SpringWeb.students}" var="student" varStatus="status">
			<tr>
				<td align="center">${status.count}</td>
				<td><input name="students[${status.index}].age" value="${student.age}"/></td>
				<td><input name="students[${status.index}].name" value="${student.name}"/></td>
				<td><input name="students[${status.index}].id" value="${student.id}"/></td>
			</tr>
		</c:forEach>
            <tr>
               <td colspan = "2">
                  <input type = "submit" value = "Submit"/>
               </td>
            </tr>
         </table>  
      </form:form>
   </body>
</html>