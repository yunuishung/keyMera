<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

    <title>Hello, world!</title>
  </head>
  <body>
  
<style>
 .bd-placeholder-img {
   font-size: 1.125rem;
   text-anchor: middle;
   -webkit-user-select: none;
   -moz-user-select: none;
   -ms-user-select: none;
   user-select: none;
 }

 @media (min-width: 768px) {
   .bd-placeholder-img-lg {
     font-size: 3.5rem;
   }
 }
* {
  box-sizing:border-box;
}

body {
  margin: 0;
  font-family: Arial, Helvetica, sans-serif;
}

.container {
  padding: 64px;
}

.row:after {
  content: "";
  display: table;
  clear: both
}

.column-66 {
  float: left;
  width: 66.66666%;
  padding: 20px;
}

.column-33 {
  float: left;
  width: 33.33333%;
  padding: 20px;
}

.large-font {
  font-size: 48px;
}

.xlarge-font {
  font-size: 64px
}

.button {
  border: none;
  color: white;
  padding: 14px 28px;
  font-size: 16px;
  cursor: pointer;
  background-color: #4CAF50;
}

img {
  display: block;
  height: auto;
  max-width: 100%;
}

@media screen and (max-width: 1000px) {
  .column-66,
  .column-33 {
    width: 100%;
    text-align: center;
  }
  img {
    margin: auto;
  }
}
</style>
</head>
<body>
<div class="d-flex flex-column flex-md-row align-items-center p-3 px-md-4 mb-3 bg-white border-bottom shadow-sm">
  <h5 class="my-0 mr-md-auto font-weight-normal">Company name</h5>
  <nav class="my-2 my-md-0 mr-md-3">
    <a class="p-2 text-dark" href="#">Features</a>
    <a class="p-2 text-dark" href="#">Enterprise</a>
    <a class="p-2 text-dark" href="#">Support</a>
    <a class="p-2 text-dark" href="#">Pricing</a>
  </nav>
  <a class="btn btn-outline-primary" href="#">Sign up</a>
</div>
<div style="text-align:center">
  <h3>Responsive Zig Zag Layout Example</h2>
  <p>Resize the browser window to see the effect.</p>
</div>
<!-- The App Section -->
<div class="container">
  <div class="row">
    <div class="column-66">
      <h1 class="xlarge-font"><b>We Technology</b></h1>
      <h1 class="large-font" style="color:MediumSeaGreen;"><b>Facial recognition ?</b></h1>
      <p><span style="font-size:36px">안면인식 기술.</span> 스티븐 스필버그 감독과 톰 크루즈 주연의 영화 ‘마이너리티 리포트’는 예술적 측면뿐 아니라 사회적으로도 다양한 이슈를 만들었습니다. 톰 크루즈가 맡은 주인공 존 앤더튼은 도시 곳곳에 설치돼 신원을 확인하는 홍채 인식 시스템으로부터 숨기 위해 안구 이식 수술을 받는데요.
영화와 달리 안구 이식 수술은 현실에서 아직 가야 할 길이 멉니다. 하지만 ‘편재형 개인 식별 시스템(pervasive individual identification systems)’ 개념은 거의 현실화되고 있습니다. 
그 중에서도 오늘은 안면 인식(facial recognition) 기술을 선 보이고져  합니다!.</p>
      <button class="button">Download Application</button> <button class="button">Login</button>
    </div>
    <div class="column-33">
        <img src="/resources/img/img_app.jpg" height="471">
    </div>
  </div>
</div>
<div class="container">
  <div class="row">
    <div class="column-66">
      <h1 class="xlarge-font"><b>We Technology</b></h1>
      <h1 class="large-font" style="color:MediumSeaGreen;"><b>Facial recognition ?</b></
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
  </div>
</div>

</body>
</html>