<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
</head>
<body>
<h1>JSP Scriplet</h1>
<h1>Declaration Scriplet</h1>
<%! int a, b, c; double m, d, s; %>
<h1>Simple Scriplet</h1>
<%
a = 400; 
b = 500;
c = a + b; 
m = a * b;
d = (double) a / b; // Cast to double for precise division
s = a - b;
%>
<h1>Expression Scriplet</h1>
<h1><%="Addition of two numbers: " + c %></h1><br>
<h1><%="Multiplication of two numbers: " + m %></h1><br>
<h1><%="Division of two numbers: " + d %></h1><br>
<h1><%="Subtraction of two numbers: " + s %></h1><br>
</body>
</html>
