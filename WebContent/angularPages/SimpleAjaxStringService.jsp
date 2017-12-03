<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AjaxRequest jsp</title>
<script type="text/javascript" src="../js/angular.js"></script>
<script type="text/javascript">

function callAjaxFunction() {
	console.log('ajax functiton started');
		var scoped=angular.element(document.getElementById('ngButtonId')).scope();
		scoped.callAjaxRequest();
	console.log('after calling callajaxrequest');
	
}
var app=angular.module("simpleAjaxApp",[]);

app.controller('simpleNgController',function($scope) {
	console.log('ng controller started');
	$scope.callAjaxRequest=function() {
		console.log('ajax function started');
		 var xhttp = new XMLHttpRequest();
		  xhttp.onreadystatechange = function() {
		    if (this.readyState == 4 && this.status == 200) {
		    	console.log('response received');
		     document.getElementById("demo").innerHTML = this.responseText+" called at="+new Date();
		    }
		  };
		  xhttp.open("GET", "../rest/SimpleAjaxStringService", true);
		 
		  xhttp.send();
		  xhttp.open("GET", "../rest/SimpleAjaxStringService", true);
		  xhttp.send();

		
		
	}
	
	
}		
		
		
);


</script>


</head>
<body ng-app="simpleAjaxApp" ng-controller="simpleNgController">

<input type="button" value="ajaxfunctioncallNormalJavascirpt" onclick="callAjaxFunction()"/>
Ajax response check <br/>
<div id="demo" style="background-color:red;width:100%;">ajax response will return</div>
<button ng-click="callAjaxRequest()" id="ngButtonId" >simple angular button</button>
</body>
</html>