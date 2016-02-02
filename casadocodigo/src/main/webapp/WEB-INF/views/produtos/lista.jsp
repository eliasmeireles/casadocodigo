<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="cV" %>
<!DOCTYPE html>
<html>
<style>
h1{
	text-align: center;
}
main {
	width: 980px;
	margin: 0 auto;
}

</style>
<head>
<meta charset="UTF-8">
<title>Livros de java, Android, Iphone, PHP, Ruby e muito mais -
    Casa do código</title>
</head>
<body>
	<main>
	    <h1>Lista de produtos</h1>
	    <table style="height: 10px; width: 100%;" border="1">
	        <tr>
	            <th>Título</th>
	            <th>Descrição</th>
	            <th>Página</th>
	        </tr>
	
	        <c:forEach items="${produtos}" var="produto">
	            <tr>
	                <td>${produto.titulo}</td>
	                <td>${produto.descricao}</td>
	                <td>${produto.paginas}</td>
	            </tr> 
	        </c:forEach>
	    </table>
    </main>
</body>
</html>