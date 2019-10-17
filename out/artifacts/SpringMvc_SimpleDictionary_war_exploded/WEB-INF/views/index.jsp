<%--
  Created by IntelliJ IDEA.
  User: 19tha
  Date: 10/17/2019
  Time: 2:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Dictionary</title>
  </head>
  <body>
  <form method="get" action="/dictionary">
  <h3>Vietnam:</h3>
  <input type="text" name="english"/>
  <br>
  <input type="submit" value="Dictionary">
    Vietnamese:<span>${vn}</span>
  </form>
  </body>
</html>
