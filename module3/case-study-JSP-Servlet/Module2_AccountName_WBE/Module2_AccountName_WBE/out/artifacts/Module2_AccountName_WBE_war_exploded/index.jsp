<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 01/06/2021
  Time: 8:58 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
  <head>
    <title>$Title$</title>

    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    <link rel="stylesheet" href="../../bootstrap-4.6.0-dist/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="../../bootstrap-4.6.0-dist/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="css/home.css">
  </head>
  <body>
  <div class="container-fluid">
    <div class="banner">
      <img src="images/FURAMA.png" alt="">
    </div>
  </div>
  <div class="header navbar-fixed-top">
    <input type="checkbox" id="check">
    <label for="check">
      <i class="fa fa-bars" id="check-btn"></i>
      <i class="fa fa-times" id="cancel"></i>
    </label>
    <div class="logo">
      <img src="images/logo.png" alt="">
    </div>
    <div class="list-menu">
      <ul>
        <li><a href="#">Home</a></li>
        <li>
          <a href="/employee">Employee</a>
        </li>
        <li>
          <a href="/customer">Customer </a>
        </li>
        <li>
          <a href="#">Service </a>
        </li>
        <li>
          <a href="#">Contract</a>
        </li>
        <li class="search">
          <div class="tt">
            <input type="text" placeholder="search...">
            <button type="submit">Search</button>
          </div>

        </li>
      </ul>
    </div>
  </div>
  <div id="carouselExampleControls" class="carousel slide" data-ride="carousel">
    <div class="carousel-inner">
      <div class="carousel-item active">
        <img src="images/slide.jpg" class="d-block w-100" alt="...">
      </div>
      <div class="carousel-item">
        <img src="images/slide2.jpg" class="d-block w-100" alt="...">
      </div>
      <div class="carousel-item">
        <img src="images/khu-nghi-duong-furama.jpg" class="d-block w-100" alt="...">
      </div>
    </div>
    <a class="carousel-control-prev" href="#carouselExampleControls" role="button" data-slide="prev">
      <span class="carousel-control-prev-icon" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="carousel-control-next" href="#carouselExampleControls" role="button" data-slide="next">
      <span class="carousel-control-next-icon" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
  </body>
  <script src="js/home.js">
  </script>
</html>
