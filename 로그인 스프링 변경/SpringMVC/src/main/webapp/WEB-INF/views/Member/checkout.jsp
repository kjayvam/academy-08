<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<!-- Basic -->

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">

    <!-- Mobile Metas -->
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Site Metas -->
    <title>착한가격업소 - 계정</title>
    <meta name="keywords" content="">
    <meta name="description" content="">
    <meta name="author" content="">

    <!-- Site Icons -->
    <link rel="shortcut icon" href="${pageContext.request.contextPath}/resources/images/favicon.ico" type="image/x-icon">
    <link rel="apple-touch-icon" href="${pageContext.request.contextPath}/resources/images/apple-touch-icon.png">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
    <!-- Site CSS -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
    <!-- Responsive CSS -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/responsive.css">
    <!-- Custom CSS -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/custom.css">
    
    <!-- 로고 css -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/logo.css">
    <!-- 체크 js -->
    <script src="${pageContext.request.contextPath}/resources/js/loginCheck.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/signUpCheck.js"></script>
    <!-- 상단 메뉴 링크 js -->
    <script src="${pageContext.request.contextPath}/resources/js/topmenu.js"></script>

    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>
    <!-- Start Main Top -->
    <header class="main-header">
        <!-- Start Navigation -->
        <nav class="navbar navbar-expand-lg navbar-light bg-light navbar-default bootsnav">
            <div class="container">
                <!-- Start Header Navigation -->
                <div class="navbar-header">
                    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbar-menu" aria-controls="navbars-rs-food" aria-expanded="false" aria-label="Toggle navigation">
                    <i class="fa fa-bars"></i>
                    </button>
                    <a class="navbar-brand" href="#" onclick="index()">착한가격업소</a>
                </div>
                <!-- End Header Navigation -->

                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse" id="navbar-menu">
                    <ul class="nav navbar-nav ml-auto" data-in="fadeInDown" data-out="fadeOutUp">
                        <li class="nav-item active"><a class="nav-link" href="#" onclick="map()">Map</a></li>
                        <li class="dropdown">
                            <a href="#" class="nav-link dropdown-toggle arrow" data-toggle="dropdown">About</a>
                            <ul class="dropdown-menu">
                                <li><a href="#" onclick="consumer()">Consumer</a></li>
                                <li><a href="#" onclick="policy()">Policy</a></li>
                            </ul>
                        </li>
                        <li class="dropdown">
                            <a href="#" class="nav-link dropdown-toggle arrow" data-toggle="dropdown">Community</a>
                            <ul class="dropdown-menu">
                                <li><a href="#" onclick="Notice()">Notice</a></li>
                                <li><a href="#" onclick="contact_us()">Contact Us</a></li>
                                <li><a href="#" onclick="iyonghugi()">Iyonghugi</a></li>
                            </ul>
                        </li>
                        <li class="nav-item"><a class="nav-link" href="#" onclick="gallery()">Gallery</a></li>
                    </ul>
                </div>
                <!-- /.navbar-collapse -->

                <!-- Start Atribute Navigation -->
                <div class="attr-nav">
                    <ul>
                        <li class="search"><a href="#" onclick="store()"><i class="fa fa-search"></i></a></li>
                        <li class="side-menu">
							<a href="#"  onclick="checkout()">
								로그인
							</a>
						</li>
                    </ul>
                </div>
                <!-- End Atribute Navigation -->
            </div>
        </nav>
        <!-- End Navigation -->
    </header>
    <!-- End Main Top -->

    <!-- Start All Title Box -->
    <div class="all-title-box">
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <h2>Account</h2>
                    <ul class="breadcrumb">
                        <li class="breadcrumb-item"><a href="#">Account</a></li>
                        <li class="breadcrumb-item active">Checkout</li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
    <!-- End All Title Box -->

    <!-- Start Cart  -->
    <div class="cart-box-main">
        <div class="container">
            <div class="row new-account-login">
                <div class="col-sm-6 col-lg-6 mb-3">
                    <div class="title-left">
                        <h3>Account Login</h3>
                    </div>
                    <h5><a data-toggle="collapse" href="#formLogin" role="button" aria-expanded="false">Click here to Login</a></h5>
                    <form class="mt-3 collapse review-form-box" id="formLogin" name="login" action="Member/login" method="post">
                        <div class="form-row">
                            <div class="form-group col-md-6">
                                <label for="InputEmail" class="mb-0">ID</label>
                                <input type="text" class="form-control" id="InputID" placeholder="Enter ID" name="id">
                            </div>
                            <div class="form-group col-md-6">
                                <label for="InputPassword" class="mb-0">Password</label>
                                <input type="password" class="form-control" id="InputPassword" placeholder="Password" name="pw">
                            </div>
                        </div>
                        <button type="button" class="btn hvr-hover" onclick="loginCheck()">Login</button>
                    </form>
                </div>
                <div class="col-sm-6 col-lg-6 mb-3">
                    <div class="title-left">
                        <h3>Create New Account</h3>
                    </div>
                    <h5><a data-toggle="collapse" href="#formRegister" role="button" aria-expanded="false">Click here to Register</a></h5>
                    <form class="mt-3 collapse review-form-box" id="formRegister" name="signUp" action="Member/insert" method="post">
                        <div class="form-row">
                            <div class="form-group col-md-6">
                                <label for="InputName" class="mb-0">*Name</label>
                                <input type="text" class="form-control" id="InputName" placeholder="Name" name="name">
                            </div>
                            <div class="form-group col-md-6">
                                <label for="InputLastname" class="mb-0">*ID</label>
                                <input type="text" class="form-control" id="InputLastname" placeholder="Enter ID" name="id">
                            </div>
                            
                            <div class="form-group col-md-6">
                                <label for="InputPassword1" class="mb-0">*Password</label>
                                <input type="password" class="form-control" id="InputPassword1" placeholder="Password" name="newPw">
                            </div>
                            <div class="form-group col-md-6">
                                <label for="InputPassword2" class="mb-0">*Password</label>
                                <input type="password" class="form-control" id="InputPassword2" placeholder="Password Check" name="pwCheck">
                            </div>
                            <div class="form-group col-md-6">
                                <label for="InputPassword2" class="mb-0">Address</label>
                                <input type="text" class="form-control" id="InputAddress" placeholder="Enter Address" name="address">
                            </div>
                            <div class="form-group col-md-6">
                                <label for="InputEmail1" class="mb-0">Email Address</label>
                                <input type="email" class="form-control" id="InputEmail1" placeholder="Enter Email" name="email">
                            </div>
                            <button type="button" class="btn hvr-hover" onclick="infoConfirm()">Register</button>
                    	</div>
                    </form>
                </div>
            </div>
        </div>
    </div>
    <!-- End Cart -->

    <!-- Start Footer  -->
    <footer>
        <div class="footer-main">
            <div class="container">
                <div class="row">
                    <div class="col-lg-4 col-md-12 col-sm-12">
                        <div class="footer-widget">
                            <h4>About 착한가격업소</h4>
                            <p>착한 가격, 청결한 가게운영, 기분좋은 서비스 제공으로 소비자에게 만족을 드리기 위해 정부와 지방자치단체가 선정한 우수업소가 바로 ‘착한가격업소’ 입니다.
                            </p>
                            <p>우리 동네에 있는 착한가격업소를 찾아보시고 안심하고 즐겁게 이용해 주세요.</p>
                        </div>
                    </div>
                    <div class="col-lg-4 col-md-12 col-sm-12">
                        <div class="footer-link">
                            <h4>Information</h4>
                            <ul>
                                <li><a href="#">개발자 소개</a></li>
                                <li><a href="#">고객 서비스</a></li>
                                <li><a href="#">이용약관</a></li>
                                <li><a href="#">개인 정보 정책</a></li>
                            </ul>
                        </div>
                    </div>
                    <div class="col-lg-4 col-md-12 col-sm-12">
                        <div class="footer-link-contact">
                            <h4>Contact Us</h4>
                            <ul>
                                <li>
                                    <p><i class="fas fa-map-marker-alt"></i>Address:서울 마포구 신촌로 176(대흥동 12-20)
                                        <br>중앙정보처리학원<br> (04104)
                                    </p>
                                </li>
                                <li>
                                    <p><i class="fas fa-phone-square"></i>Phone: <a href="tel:+82-01033953788">+82-010
                                            3395 3788</a></p>
                                </li>
                                <li>
                                    <p><i class="fas fa-envelope"></i>Email: <a
                                            href="mailto:cjavasw@naver.com">javasw@naver.com</a></p>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </footer>
    <!-- End Footer  -->

    <a href="#" id="back-to-top" title="Back to top" style="display: none;">&uarr;</a>

    <!-- ALL JS FILES -->
    <script src="js/jquery-3.2.1.min.js"></script>
    <script src="js/popper.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <!-- ALL PLUGINS -->
    <script src="js/jquery.superslides.min.js"></script>
    <script src="js/bootstrap-select.js"></script>
    <script src="js/inewsticker.js"></script>
    <script src="js/bootsnav.js"></script>
    <script src="js/images-loded.min.js"></script>
    <script src="js/isotope.min.js"></script>
    <script src="js/owl.carousel.min.js"></script>
    <script src="js/baguetteBox.min.js"></script>
    <script src="js/form-validator.min.js"></script>
    <script src="js/contact-form-script.js"></script>
    <script src="js/custom.js"></script>
</body>

</html>