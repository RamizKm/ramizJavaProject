<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AjaxRequest jsp</title>

<script type="text/javascript">

function callAjaxFunction() {
	console.log('ajax functiton started');
	
	 var xhttp = new XMLHttpRequest();
	  xhttp.onreadystatechange = function() {
	    if (this.readyState == 4 && this.status == 200) {
	    	console.log('response received');
	     document.getElementById("demo").innerHTML = this.responseText;
	    }
	  };
	  xhttp.open("GET", "../AjaxServletHandler", true);
	 
	  xhttp.send();
	  xhttp.open("GET", "/zRamizRestWebWork/AjaxServletHandler", true);
	  xhttp.send();
	
}



</script>


</head>
<body>

<input type="button" value="ajaxfunctioncall" onclick="callAjaxFunction()"/>
Ajax response check <br/>
<div id="demo" style="background-color:red;width:100%;">ajax response will return</div>

</body>
</html>