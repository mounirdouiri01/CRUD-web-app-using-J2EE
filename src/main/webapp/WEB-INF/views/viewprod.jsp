<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  

<html>
<head>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" type="text/css" href="resources/css/file.css"/>
</head>
<body>
<div class="div1"> 
<a href="viewprod"><button class="btn">Produit</button></a>
<a href="viewlp"><button class="btn">Lignes produit</button></a>
</div>
<div class="div2"><center><a href="prod_form"><button class="btn1">Operations  de produits</button></a></center></div>
<div class="div3">
</br>
<p class="txt">Liste de produits</p>
</br>
<table class="content-table">
<thead>  
<tr><th>Code Produit</th><th>Nom Produit</th><th>Ligne Produit</th><th>Echelle Produit</th><th>Fournisseur</th><th>Description</th><th>Quantite Stockague</th><th>Prix de vente</th><th>MSRP</th><th>Action</th></tr>  
   </thead> 
   <c:forEach var="prod" items="${list}">  
   <tbody> 
   <tr>  
   <td>${prod.codeproduit}</td>  
   <td>${prod.nomproduit}</td>  
   <td>${prod.ligne_produit}</td>  
   <td>${prod.echelle_produit}</td>
   <td>${prod.fournisseur}</td>
   <td>${prod.description}</td>
   <td>${prod.quantite_Stock}</td>
   <td>${prod.prix_vente}</td>
   <td>${prod.MSRP}</td>  
  
   <td><a href="deleteprod/${prod.codeproduit}" style="color: black"><i class="fa fa-trash" aria-hidden="true"></i></a></td>  
   </tr>  
   </tbody>
   </c:forEach>  
   </table>  
     
   </div> 

</body>

</html>