<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">
<h3> product code: ${product.prodCode}</h3>
<h3>product Name : ${product.prodName}</h3>
<h3>product cateogery : ${product.cateogery}</h3>
<h3>product description : ${product.prodDesc}</h3>
<h3>product price : ${product.prodPrice}</h3>
<h3>product quantity : ${quantity}</h3>
<h3>product total cost : ${product.prodPrice * quantity}</h3>
<!-- <h3>product  ${productmap}</h3>  -->

</body>
</html>