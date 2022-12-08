<!DOCTYPE html>
<html>
	<head>
	<meta charset="utf-8">
	<title>Isogramma</title>
	</head>
	
	<body>
	
			
		
		<form action="Prova" method="get">
			<div align="center">
				<h1>Verifica Isogramma</h1>
				<label >Inserisci la frase</label>
				<input type="text" name="frase" style="width:400px">
				<input type="submit" name="Verifica" value="Verifica">
			</div>
			<div align="center">
				<% if(request.getAttribute("risposta")!=null)   {%>
	 			<p><%= request.getAttribute("risposta") %>
	 			<% } %>
	 		</div>
		</form>
	</body>
</html>