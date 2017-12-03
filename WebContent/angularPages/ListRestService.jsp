<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ListRestService</title>





<script type="text/javascript">
console.log('javascript started');




</script>










</head>
<body>
<body ng-app="listRestNgApp" ng-controller="listNgController">

<input type="button" onclick="getCityList()" />

<li ng-repeat='x in cityList'> {{x}}<br/> </li>


</body>
</body>
</html>