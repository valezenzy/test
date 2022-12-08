<!DOCTYPE html>
<html>
	<head>
	<meta charset="utf-8">
	<title>BinarySearch</title>
	</head>
	
	<body>
	
		<form action="Prova" method="get">
			<div align="center">
		
				<label >Ricerca Binaria</label>
				<input type="number" name="numeri" min ="0" required>
				<input type="submit" name="Verifica" value="Verifica">
			</div>
			<div align="center">
				
	 		</div>
		</form>
		<% if(request.getAttribute("risposta")!=null)   {%>
	 			<p><%= request.getAttribute("risposta") %>
	 			<% } %>
	</body>
</html>