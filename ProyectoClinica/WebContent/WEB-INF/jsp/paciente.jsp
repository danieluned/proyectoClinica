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
		<link href="css/bootstrap.css" rel="stylesheet"/>
		<link href="css/main.css" rel="stylesheet"/>
		<script src="js/modernizr-2.6.2-respond-1.1.0.min.js"></script>
		<script src="js/jquery-1.10.2.js"></script>
		<script src="js/jquery-ui-1.10.4.custom.js"></script>
		<script src="js/bootstrap.js"></script>
		
	</head>
	 <body>
	 	<!-- Static navbar -->
	    <div class="navbar navbar-inverse navbar-static-top" role="navigation">
	      <div class="container">
	        <div class="navbar-header">
	          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
	            <span class="sr-only">Toggle navigation</span>
	            <span class="icon-bar"></span>
	            <span class="icon-bar"></span>
	            <span class="icon-bar"></span>
	          </button>
	          <a class="navbar-brand" href="#" class="blanco">App Medic</a>
	        </div>
	        <div class="navbar-collapse collapse">
	         <!--
	          <ul class="nav navbar-nav">
	          	<li class="active"><a href="#">Home</a></li>
	            <li><a href="#about">About</a></li>
	            <li><a href="#contact">Contact</a></li>
	            <li class="dropdown">
	              <a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown <span class="caret"></span></a>
	              <ul class="dropdown-menu" role="menu">
	                <li><a href="#">Action</a></li>
	                <li><a href="#">Another action</a></li>
	                <li><a href="#">Something else here</a></li>
	                <li class="divider"></li>
	                <li class="dropdown-header">Nav header</li>
	                <li><a href="#">Separated link</a></li>
	                <li><a href="#">One more separated link</a></li>
	              </ul>
	            </li>
	          </ul>
	          -->
	          <ul class="nav navbar-nav navbar-right">
	           
	            <li class="active"><a href="#">${session.Usuario}</a></li>
	            <li><a href="#">Salir</a></li>
	          </ul>
	        </div><!--/.nav-collapse -->
	      </div>
	    </div>
	 	
	 	
	 	<div class="container">
			<div class="col-sm-6 col-sm-offset-3">
		   	<h1>Página de Paciene</h1>
			<p></p>
			</div>
		</div>
	 </body>
</html>



		
		
		
			
			
			
		


