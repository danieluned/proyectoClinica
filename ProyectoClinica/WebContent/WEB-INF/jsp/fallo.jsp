<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js"> <!--<![endif]-->
	<head>
		<meta charset="UTF-8"/>
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"/>
		<meta name="viewport" content="width=device-width, initial-scale=1"/>
		<meta name="description" content="Pantalla de juego"/>
		<title><s:text name="patallaJuego"/></title>
		<link rel="stylesheet" href="css/normalize.min.css"/>
        <link rel="stylesheet" href="css/black-tie/jquery-ui-1.10.4.custom.css"/>
		<link href="css/bootstrap.css" rel="stylesheet">
		<script src="js/modernizr-2.6.2-respond-1.1.0.min.js"></script>
		<script src="js/jquery-1.10.2.js"></script>
		<script src="js/jquery-ui-1.10.4.custom.js"></script>
		<script src="js/bootstrap.js"></script>
		<style>
			.form-signin{
				
				margin-top:150px;	
			}
			.navbar-inverse {
			    background-color: #3276B1;
			    border-color: #080808;
			}
		</style>
	</head>
	 <body>
	 	<!-- Cabecera -->
	 	<div class="navbar navbar-inverse navbar-static-top" role="navigation">
			  <div class="container-fluid">
				<div class="navbar-header">
				 <a class="navbar-brand" href="#" style="color: white;font-weight: bolder;">App Medic</a>
				</div>
			 </div>
		</div>	
	 	<!-- Fin Cabecera -->
	 	
	 	<div class="container">
			<div class="col-sm-6 col-sm-offset-3">
		   	<h1>Página de Falloi</h1>
			<p>${session.Usuario}</p>
			</div>
		</div>
	 </body>
</html>



		
		
		
			
			
			
		


