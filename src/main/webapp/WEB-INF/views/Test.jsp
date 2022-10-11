<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<title>Test</title>
<link href="<c:url value="/resources/css/style.css" />">

<style type="text/css">


.hero{
	display: flex;
}

.hero .static-txt{
	color:#fff;
	font-size: 60px;
	font-weight: 400;
}

.hero .dynamic-txts{
	margin-left: 15px;
	height: 90px;
	line-height: 90px;
	overflow: hidden;
}

.dynamic-txts{
	list-style: none;
	color: #16f37d;
	font-size: 60px;
	font-weight: 500;
	position: relative;
	top: 0;
	animation: slide 12s steps(3) infinite;
}

@keyframes slide{
	100%{
	top:-360px;
	}
}


.dynamic-txts li span::after{
	content: "";
	position: absolute;
	left: 0;
	height: 100%;
	width: 100%;
	background: #000;
	border-left: 2px solid #16f37d;
	animation:typing 3s steps(10) infinite;
}

@keyframes typing{
	40%,60%{
	left:calc(100%+30px);
	}
	100%{
	left:0;
	}
}




</style>
</head>
<body>
	<div class="hero">
		<div class="static-txt">I`m a</div>
		<ul class="dynamic-txts">
			<li><span>Desinger</span></li>
			<li><span>Developer</span></li>
			<li><span>Freelancer</span></li>
		
		</ul>
	</div>
	
	
	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
</body>
</html>