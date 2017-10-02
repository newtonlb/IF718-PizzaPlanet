<!DOCTYPE html>
<html>
	<head>
		<title>Login</title>
		<asset:stylesheet href="cliente.css" />
		<meta name="layout" content="main">
	</head>
	<body>
  <div id="wrapper">
  <div id="inputs">
  <div>
<center>
<form name="pedido" action="#" method="post" class="">
  <h1>Pedido</h1>
  Primeira metade (30$): <input type="text" name="metade1" placeholder="Muçarela" required><br/>
  Segunda metade (+10$): <input type="text" name="metade2" placeholder="Opcional"><br/>
  Borda (+7.50$): <input type="text" name="border" placeholder="Sem borda"><br/>
  <input type="submit" name="submit" value="submit" href="#">
</form>
</div>
</div>
		<asset:javascript src="pedido/cliente.js" />
</body>
</html>
