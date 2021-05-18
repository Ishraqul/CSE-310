<%-- 
    Document   : WelcomePage
    Created on : May 14, 2021, 12:09:41 AM
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
    <div class="py-5">
    <h2 class="text-center" style="font-size:75px">Welcome To OOP Car Rental</h2>
  </div>


  <div class= "text-center">
    <p style="font-size:25px"> What Cars Do We Offer ? </p>
  </div>
  <p></p>
  <div class="text-center">
   <a href="show_car.jsp" class="btn btn-success"> Our Cars </a>
 </div>

<div>
  <p></p>
</div>

 <div class= "text-center">
    <p style="font-size:25px"> Where is 370 Car Rental located ? </p>
  </div>

  <div class= "text-center">
   <a href="show_branches.jsp" class="btn btn-success"> Our Branches </a>
 </div>

<div>
  <p></p>
</div>

 <div class= "text-center">
    <p style="font-size:25px"> Plan your next car ride with us. </p>
  </div>
  <div class= "text-center">
   <a href="booking.jsp" class="btn btn-success"> Create A Booking </a>
 </div>
  
  <div>
      <p>
          
      </p>
  </div>
  
    <div>
      <p>
          
      </p>
  </div>
  <div class= "text-center">
    <p style="font-size:25px"> To Logout </p>
  </div>
  <form action = "logout" mothod = "POST" class="text-center">
            <input type = "submit" value = "Logout" class="btn btn-success">
        </form>


</body>
</head>
</html>

