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
    <div class="title">Ajouter une nouvelle ligne de produit</div>
    <div class="content">
      <form:form method="post" action="savelp" modelAttribute="ligneprod">
        <div class="user-details">
        
        <div class="input-box">
            <span class="details">Ajouter une Ligne de produit</span>
            <form:input path="lignes_produits" required="required"/>
          </div>
      
          <div class="input-box">
            <span class="details">Description</span>
            <form:input path="description" required="required"/>
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
    <div class="title">Modifier ligne de produit</div>
    <div class="content">
      <form:form method="post" action="editsavelp" modelAttribute="ligneprod">
        <div class="user-details">
        <div class="input-box">
            <span class="details">Ligne de produit</span>
            <form:select name="lignes_produits"  class="form-control" path="lignes_produits">
									<c:forEach var="lignes_produits" items="${colonnelp}">
										<option value="${lignes_produits}">
											${lignes_produits}
										</option>
									</c:forEach>
								</form:select>
          </div>
          
          <div class="input-box">
            <span class="details">Description</span>
            <form:input path="description" required="required"/>
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