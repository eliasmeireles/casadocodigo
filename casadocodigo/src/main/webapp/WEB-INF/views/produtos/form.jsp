<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<style>
form{
	width: 174px;
	margin: 0 auto;
}
label {
	font-size: 25px;
	font-style: italic;
}
.btnCadastrar {
	font-family: sans-serif;
	padding: 1em;
	background-color: #E4E7FA;
}
</style>
<head>
<meta charset=UTF-8">
<title>Livros de java, Android, Iphone, PHP, Ruby e muito mais - Casa do código</title>
</head>
<body>
	<form action="produtos">
		<div>
			<label>Titulo do livro</label><br />
			<input type="text" name="titulo"><br />
		</div>
		<div>
			<label>Páginas</label><br />
			<input type="number" name="paginas"><br />
		</div>
		<div>
			<label>Descrição</label><br />
			<textarea style="overflow:auto;resize:none" rows="3" cols="19" name="descricao"></textarea><br />
		</div>
		
		<c:forEach items="${tipos}" var="tipoPreco" varStatus="status">
            <div>
                <label>${tipoPreco}</label> <br />
                <input type="text" name="precos[${status.index}].valor">
                <input type="hidden" name="precos[${status.index}].tipo" value="${tipoPreco}">
            </div>
		</c:forEach>
		<input class="btnCadastrar" type="submit" value="Cadastrar">
	</form>
</body>
</html>