<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form data</title>
</head>
<body>
Name: <%= request.getParameter("fullname") %> <br>
Gender: <%= request.getParameter("gender") %> <br>
Country: <%= request.getParameter("country") %> <br>
Languages known:
<% 

String[] languages = request.getParameterValues("languages");
if(languages != null){
	for(String language: languages){
		out.print(" "); 	
		out.print(language);
	}
}

%>


</body>
</html>