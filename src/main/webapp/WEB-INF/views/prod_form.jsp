<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  

<html>
<head>
<link rel="stylesheet" type="text/css" href="resources/css/file.css"/>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>

<body>
 <div class="ABCD">
  <div class="container">
    <div class="title">Ajouter nouvelle produit</div>
    <div class="content">
      <form:form method="post" action="save" modelAttribute="prod">
        <div class="user-details">
        <div class="input-box">
            <span class="details">Code Produit</span>
            <form:input path="codeproduit" required="required"/>
          </div>
          
          <div class="input-box">
            <span class="details">Nom Produit</span>
            <form:input path="nomproduit" required="required"/>
          </div>
          <div class="input-box">
				<span class="details">Ligne de produit</span>				
								<form:select name="ligne_produit"  class="form-control" path="ligne_produit" width="25px">
									<c:forEach var="ligne_produit" items="${coloonelp}">
										<option value="${ligne_produit}" >
											${ligne_produit}
										</option>
									</c:forEach>
								</form:select>		
          </div>
          <div class="input-box">
            <span class="details">echelle produit</span>
            <form:input path="echelle_produit" required="required" />
          </div>
          <div class="input-box">
            <span class="details">Fournisseur</span>
            <form:input path="fournisseur" required="required" />
          </div>
          <div class="input-box">
            <span class="details">Prix vente</span>
            <form:input path="prix_vente" required="required"/>
          </div>
          <div class="input-box">
            <span class="details">Quantite Stockage</span>
            <form:input path="quantite_Stock" required="required" />
          </div>
           <div class="input-box">
            <span class="details">Description</span>
            <form:input path="description" required="required" />
          </div>
           <div class="input-box">
            <span class="details">MSRP</span>
            <form:input path="MSRP" required="required"/>
          </div>
        </div>
   
        <div class="button">
          <input type="submit" value="Ajouter">
        </div>
      </form:form>
    </div>
  
</div>
 
 <div class="contrainer"><i class="fa fa-cog" aria-hidden="true"></i></div>
 
 <div class="container">
    <div class="title">Modifier un produit </div>
    <div class="content">
      <form:form method="post" action="editsave" modelAttribute="prod">
        <div class="user-details">
        <div class="input-box">
            <span class="details">Code Produit</span>
            <form:select name="codeproduit"  class="form-control" path="codeproduit">
									<c:forEach var="codeproduit" items="${colooneprod}">
										<option value="${codeproduit}">
											${codeproduit}
										</option>
									</c:forEach>
								</form:select>
          </div>
          
          <div class="input-box">
            <span class="details">Nom Produit</span>
            <form:input path="nomproduit" required="required"/>
          </div>
          <div class="input-box">
				<span class="details">Ligne de produit</span>				
								<form:select name="ligne_produit"  class="form-control" path="ligne_produit" width="25px">
									<c:forEach var="ligne_produit" items="${coloonelp}">
										<option value="${ligne_produit}" >
											${ligne_produit}
										</option>
									</c:forEach>
								</form:select>		
          </div>
          <div class="input-box">
            <span class="details">echelle produit</span>
            <form:input path="echelle_produit" required="required" />
          </div>
          <div class="input-box">
            <span class="details">Fournisseur</span>
            <form:input path="fournisseur" required="required" />
          </div>
          <div class="input-box">
            <span class="details">Prix vente</span>
            <form:input path="prix_vente" required="required"/>
          </div>
          <div class="input-box">
            <span class="details">Quantite Stockage</span>
            <form:input path="quantite_Stock" required="required" />
          </div>
           <div class="input-box">
            <span class="details">Description</span>
            <form:input path="description" required="required" />
          </div>
           <div class="input-box">
            <span class="details">MSRP</span>
            <form:input path="MSRP" required="required"/>
          </div>
        </div>
   
        <div class="button">
          <input type="submit" value="Modifier">
        </div>
      </form:form>
    </div>
  




</div>
</div>

</body>

</html>