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
					<div id="GTitre">
						<h3>Inscription</h3>
					</div>	
			</div>
			
			<div class="div_saut_ligne" style="height:15px">
			</div>
			
			
			<div id="centre">
		
					<div class="div_saut_ligne" style="height:30px"></div>
				<div id="centre">
				 <div id="message" style="float: left; width: 100%; height: 10%; text-align: center" >
				<b>Tous les champs sont obligatoires</b></div>
					<form id="inscription" name="inscription" method="post" action="<%= request.getContextPath() %>/UserServelet">				
										
						<div class="div_input_form">
						<input type="text" name="prenom" id="prenom" maxlength="50" class="input_form" value='Votre Nom' />
						</div>
						<div class="div_input_form">
						<input type="text" name="nom" id="nom" maxlength="50" class="input_form" value='Votre Prénom'  />
						</div>
						<div class="div_input_form">
						<input type="text" name="date_naiss" id="date_naiss" maxlength="50" class="input_form" value='Date de Naissance 19/04/1996'  />
						</div>
						<div class="div_input_form">
						<input type="text" name="cni" id="cni" maxlength="50" class="input_form" value='Votre Numeiro Cni'  />
						</div>
						<div class="div_input_form">
						<input type="text" name="adresse" id="adresse" maxlength="50" class="input_form" value='Votre Adresse'  />
						</div>
						<div class="div_input_form">
						<input type="text" name="email" id="email" maxlength="150" class="input_form" value='Votre Adresse mail'  />
						</div>
						<div class="div_input_form">
						Votre mot de passe : entre 5 et 10 caractères<br />
						<input type="password" name="password" id="password" maxlength="10" class="input_form" value="Mot de passe"  />
						</div>
						<div class="div_input_form">
						Confirmer le mot de passe :<br />
						<input type="password" name="mp_conf" id="mp_conf" maxlength="10" class="input_form" value="Mot de passe"  />
						</div>	
						<div class="div_saut_ligne" style="height:30px">
						</div>						
						<div class="div_input_form" align="left">
									<jsp:include page="submit.jsp">
								            <jsp:param name="year" value="2010"/>
								        </jsp:include>		
									</div>
					</form>			
				</div>      
				</div>                    
			</div>
			</div>
			<div class="div_saut_ligne" style="height:150px;">
			</div>	
			</div>
		</div>
	</div>
</body>
<script type="text/javascript" language="javascript">
	//alert(document.getElementById("civilite").value);
</script>
</html>