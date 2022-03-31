<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="fr" lang="fr">
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8">
<title>Formulaire d'inscription en Javascript</title>
<meta name="description" content="Contrôler et valider les saisies d'un formulaire d'inscription Web par le code client Javascript" />
<meta name="robots" content="index,follow" />
<meta http-equiv="content-language" content="fr" />
<link href='styles/mef.css' rel='stylesheet' type='text/css' />
<script language="javascript" type="text/javascript">
</script>
<script language="javascript" src="js/v_inscr.js"></script>
</head>
<body">

	<div class="div_conteneur_parent">

		<div class="div_conteneur_page">
			<div class="titre_page"  style="width:100%;height:70px;text-align:center;" >
			 <img src="image/le_formateur.png" style="height:60px;width:80px;border:none;" align="left" alt="formateur informatique" />
		     <img src="image/le_formateur.png" style="height:60px;width:80px;border:none;" align="right" alt="formateur informatique" />
			
			</a><h1>Plateforme de Gestion et Suivi des elections   &#160; &#160; &#160;</h1></div>
			<div class="div_int_page">

			<div class="div_int_page">

				<div class="div_saut_ligne"></div>

				<div style="float: left; width: 10%; height: 40px;"></div>
				<div 
					style="float: left; width: 80%; height: 40px; text-align: center;">
					<div id="GTitre" >
						<h3>Connexion</h3>
					</div>
					
				</div>
				<div style="float: left; width: 10%; height: 40px;"></div>

				<div class="div_saut_ligne" style="height: 60px"></div>

				<div style="width: 100%; height: auto; text-align: center;">

					<div style="width: 1000px; display: inline-block;" id="conteneur">
						<div id="centre">
							<div id="message" style="float: left; width: 100%; height: 10%; text-align: center" >
								<b>Tous les champs sont obligatoires</b></div>
							
								<form id="inscription" name="inscription" method="post" action="<%= request.getContextPath() %>/LoginServelet">
										<br />
									<div class="div_input_form" >
										Saisir Votre Username :<br />
										<input type="text" name="username" id="username"
											maxlength="150" class="input_form" value='username' />
									</div>
									<div class="div_saut_ligne" style="height: 30px"></div>
									<br/>
									<div class="div_input_form">
										Saisir Votre mot de passe :<br />
										<input type="password" name="password" id="password"
											maxlength="150" class="input_form" value='password' />
									</div>
									<br />
									<br />
									<div class="div_saut_ligne" style="height: 40px"></div>
									<br/>
									<br />
									<br />
									<div class="div_input_form" align="left">
									<jsp:include page="submit.jsp">
								            <jsp:param name="year" value="2010"/>
								        </jsp:include>		
									</div>
								</form>
						</div>
					</div>

				</div>

				<div class="div_saut_ligne" style="height: 150px;"></div>

			</div>
		</div>

	</div>

</body>
<script type="text/javascript" language="javascript">
	//alert(document.getElementById("civilite").value);
</script>
</html>