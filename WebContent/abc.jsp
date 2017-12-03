<html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="java.io.*" %>

<body>

body is coming 


<a href="rkmServletExampleHandler">servlet link</a>


<a href="TestServletHandler">check TestSevletHandler</a>
<br/>

<a href="SpringFirstBeansLoadBeanHandler" >SpringFirstBeansLoadBeanHandler</a>
<br/>

<a href="rest/FirstRestService/geetGreting">FirstRestService getgreeting</a>
<br/>

<a href="FirstRestService/geetGreting">FirstRestService getgreeting check if it works</a>
<br/>

<a href="FirstRestService/getFlatDetails">FirstRestService getgreeting get flat detatils</a>
<br/>

<a href="rest/FirstRestService/getFlatDetails">FirstRestService getgreeting get flat detatils</a>
<br/>

<a href="rest/ListMultiElementService/getCityList" >getCityList</a>
<br/>

<a href="rest/ListOneElementService/getOneString" >getOneString</a>
<br/>



<a href="angularPages/simpleAjaxRequest.jsp">simple ajax request example call to calss SimpleAjaxStringService</a>
<br/>

Angular page exercise done

<% 

String[] listOfFolders=new String[]{"angularPages","angularInclude"};

for (int j=0;j<listOfFolders.length;j++) 
{

String file = application.getRealPath("/"+listOfFolders[j]);
File f = new File(file);
String [] fileNames = f.list();
File [] fileObjects= f.listFiles();
for (int i = 0; i < fileObjects.length; i++) {
if(!fileObjects[i].isDirectory()){
    String fname = file+fileNames[i];
%>
<a href='<%=listOfFolders[j] %>/<%=fileNames[i]%>' ><%=fileNames[i]%></a>
<br/>
<% 
 }
}
}
%>

</body>
</html>
