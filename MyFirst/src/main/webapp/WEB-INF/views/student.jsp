<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
   <head>
      <title>Spring MVC Form Handling</title>
      <style>
	.error {
	 color: #ff0000;
	}
	
	</style>
   </head>
   <body>
   <%-- --%>
	<form:errors path="SpringWeb.*" />
      <h2>Student Information</h2>
      <form:form method = "POST"  action = "addStudent" modelAttribute="SpringWeb"  >
      	
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
				<td><input name="students[${status.index}].age" value="${student.age}"/><form:errors path="students[${status.index}].age" cssClass="error"/></td>
				<td><input name="students[${status.index}].name" value="${student.name}"/><form:errors path="students[${status.index}].name" cssClass="error"/></td>
				<td><input name="students[${status.index}].id" value="${student.id}"/><form:errors path="students[${status.index}].id" cssClass="error"/></td>
				<td><input name="students[${status.index}].dob" value="${student.dob}"/><form:errors path="students[${status.index}].dob" cssClass="error"/></td>
			</tr>
		</c:forEach>
		<%--
		<c:forEach items="${SpringWeb.students}" var="student" varStatus="status">
			<tr>
				<td align="center">${status.count + 2}</td>
				<td><input name="students[${status.index + 2}].age" value="${student.age}"/></td>
				<td><input name="students[${status.index + 2}].name" value="${student.name}"/></td>
				<td><input name="students[${status.index + 2}].id" value="${student.id}"/></td>
			</tr>
		</c:forEach>
		 --%>
            <tr>
               <td colspan = "2">
                  <input type = "submit" value = "Submit"/>
               </td>
            </tr>
         </table>  
      </form:form>
   </body>
</html>