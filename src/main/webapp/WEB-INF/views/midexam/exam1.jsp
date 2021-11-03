<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
  div.container { width: 600px; margin: 40px ; }
  form div { margin-bottom: 10px; }
  input { width: 200px; padding: 4px; }
  button { padding: 0.4em 3em; margin-top: 10px; }
</style>
</head>
<body>
  <div class="container">
    <form method="post">
      <h1>Exam1</h1>

      <div>
        <label>이름:</label> 
        <input type="text" name="param1" value="${ param1 }" />
      </div>

      <div>
        <label>학번:</label> 
        <input type="text" name="param2" value="${ param2 }" />
      </div>
      
      <div>
        <label>소속:</label> 
        <input type="text" name="param3" value="${ param3 }" />
      </div>
      
      <button type="submit">확인</button>

    </form>
    <p>${ param1 }</p>
    <p>${ param2 }</p>
    <p>${ param3 }</p>
    <p> <fmt:formatDate pattern = "yyyy-MM-dd HH:mm:ss" value = "${ now }" /> </p>
  </div>
</body>
</html>

