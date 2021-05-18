<%-- 
    Document   : Booking
    Created on : May 18, 2021, 12:59:50 PM
    Author     : Asus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> CAR RENTAL SYSTEM</title>
        <link href="RegistrationForm.css" rel="stylesheet" type="text/css"/>
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
</head>

<body>
    <div class="container">
        <h3>Booking Form</h3>
        <form name="Register" action="UserBooking" method="POST">
            <table border="0">
                 <tr>
                            <td>Selected Car: </td>
                            <td><input type="text" name="booked_car" value="" size="50" class="userInput" /></td>
                        </tr>
                        <tr>
                            <td>User Name : </td>
                            <td><input type="text" name="user_name" value="" size="50" class="userInput" /></td>
                        </tr>
                        
                        <tr>
                            <td>Booking Date: </td>
                            <td><input type="text" name="booking_date" placeholder="dd/mm/yyyy" size="50" class = "userInput"/></td>
                        </tr>
                        
                        <tr>
                            <td>Car PickUp Branch : </td>
                            <td><input type="text" name="car_pickup_branch" value=""  class="userInput" /></td>
                        </tr>
                        
                        <tr>
                            <td>Car DropOff Branch : </td>
                            <td><input type="text" name="car_dropoff_branch" value="" size="50" class="userInput" /></td>
                        </tr>
                    </tbody>
                </table>
                <input type="submit" value="Submit" name="submit" class="registerbtn"</>
            </form>
            
        </div>
        
    </body>
</html>
