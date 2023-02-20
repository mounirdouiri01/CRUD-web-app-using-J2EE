<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  

<html>
<head>
<link rel="stylesheet" type="text/css" href="resources/css/file.css"/>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
<div class="div1"> 
<a href="viewprod"><button class="btn">Produit</button></a>
<a href="viewlp"><button class="btn">Lignes produit</button></a>
</div>
<div class="div2"><center><a href="ligneprodform"><button class="btn1">Operations de lignes des produits</button></a></center></div>
<div class="div3">
<br/>
<p class="txt">Liste de lignes des produits</p>
<br/>
<table class="content-table">  
<thead>
<tr><th>Ligne Produit: </th><th>Description: </th><th>Action</th></tr> </thead> 
   <c:forEach var="ligneprod" items="${liste}">   
   <tbody>
   <tr>  
   <td>${ligneprod.lignes_produits}</td>  
   <td>${ligneprod.description}</td>    
   <td><a href="deletelp/${ligneprod.lignes_produits}" style="color: black"> <i class="fa fa-trash" aria-hidden="true"></i></a></td>  
   </tr>  
   </tbody>
   </c:forEach>  
   </table>  

</div>


   
</body>

</html>