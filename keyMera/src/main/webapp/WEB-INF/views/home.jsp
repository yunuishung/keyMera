<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@include file="./includes/header.jsp" %>


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
	      <button class="button">Download Application</button> <a class="btn btn-outline-primary" href="#">Sign up</a>
	    </div>
	    <div class="column-33">
	        <img src="/resources/img/img_app.jpg" height="471">
	    </div>
	  </div>
	</div>

<%@include file="./includes/footer.jsp" %>