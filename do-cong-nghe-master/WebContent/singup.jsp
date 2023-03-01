<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

  <style>
  .container .wave{
    position: absolute;
    bottom: 0;
    left: 0;
    width: 100%;
    height: 100px;
    background: url(./img/15db5f82-b700-475d-b863-7c3ac14b037e/wave.png);
    background-size: 1000px 100px;
   }
   <jsp:include page="include/login.css" />
     </style>
<body>
 <div class="container">
        <div class="login">
            <h1>đăng ký</h1>
            <form action="singup" method="post">
               
                <div class="form-group">
                    <input type="text" name="username" placeholder="name">
                </div>

                <div class="form-group">
                    <input type="email" name="email" value="" placeholder="email">
                </div>

               
                <div class="form-group">
                    <input type="password" name="password" id="" placeholder="password">
                </div>

               

                <input type="checkbox" name="" id=""> <span>hiển thị</span>
                <br>
                <input type="submit" value="login">
               
               
            </form>
        </div>
       <div class="wave wave1"></div>
       <div class="wave wave2"></div>
       <!-- <div class="wave wave3"></div>
       <div class="wave wave4"></div> -->
</div>
</body>
</html>