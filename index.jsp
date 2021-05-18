<%-- 
    Document   : index
    Created on : May 12, 2021, 3:43:10 PM
    Author     : Asus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <link href="css/style.css" rel="stylesheet"/> 

  
<body>

<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">OOP Car Rental</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav ml-auto">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="WelcomePage.jsp">Home</a>
        </li>
       
        </li>
        <li class="nav-item">
          <a class="nav-link" href="booking.jsp">Booking</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="show_car.jsp">Cars</a>
        </li>

        <li class="nav-item">
          <a class="nav-link" href="show_branches.jsp">Branches</a>
        </li>
        
         
      </ul>
      <form class="d-flex">
        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
        <button class="btn btn-outline-success" type="submit">Search</button>
      </form>
    </div>
  </div>
</nav>
        <title> CAR RENTAL SYSTEM</title>
    </head>
    <body>
        <h1>To Log-IN</h1>
        <form action="login" method="post">
            Enter UserName: <input type="text" name="user_name"><br/>
            Enter Password: <input type="password" name="user_password"><br/>
            <input type ="submit" value="Login">
            
        </form>
        <a href="UserRegistrationForm.jsp"> Click Here to Register </a>
        
        
        
    </body>
</html>
