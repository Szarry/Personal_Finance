<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>SB Admin 2 - Register</title>

    <!-- Custom fonts for this template-->
    <link href="<c:url value="/resources/vendor/fontawesome-free/css/all.min.css" />" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

    <!-- Custom styles for this template-->
    <link href="<c:url value="/resources/css/sb-admin-2.css"/>" rel="stylesheet">

</head>

<body class="bg-gradient-primary">

<div class="container">

    <div class="card o-hidden border-0 shadow-lg my-5">
        <div class="card-body p-0">
            <!-- Nested Row within Card Body -->
            <div class="row">
                <div class="col-lg-5 d-none d-lg-block bg-register-image"></div>
                <div class="col-lg-7">
                    <div class="p-5">
                        <div class="text-center">
                            <h1 class="h4 text-gray-900 mb-4">Załóż konto!</h1>
                        </div>
<%--                        <form class="user">--%>
                        <form:form modelAttribute="AppUser" method="post" class="user">

                            <div class="form-group row">
                                <div class="col-sm-6 mb-3 mb-sm-0">
                                     <form:input path="firstname" name="firstname" placeholder="Imię" type="text"
                                                 class="form-control form-control-user" required=""/>
                                    <form:errors path="firstname" />

                                </div>
                                <div class="col-sm-6">
                                    <form:input path="lastname" type="text" class="form-control form-control-user"
                                                id="exampleLastName" placeholder="Nazwisko" required=""/>
                                    <form:errors path="lastname" />
                                </div>
                            </div>
                            <div class="form-group">
                                <form:input path="email" type="email" class="form-control form-control-user"
                                            id="exampleInputEmail" placeholder="Adres e-mail" required=""/>
                                <form:errors path="email" />
                                <p>${message}</p>


                            </div>
                            <div class="form-group row">
                                <div class="col-sm-6 mb-3 mb-sm-0">
                                    <form:password path="password" class="form-control form-control-user"
                                                   id="exampleInputPassword" placeholder="Hasło" required=""/>
                                    <form:errors path="password" />
                                </div>
                                <div class="col-sm-6 mb-3 mb-sm-0">
                                    <form:input path="username" name="username" placeholder="Nazwa użytkownika" type="text"
                                                class="form-control form-control-user" required=""/>
                                    <form:errors path="username" />

                                </div>
                            </div>
                            <button class="btn btn-primary btn-user btn-block" type="submit">
                                Chcę dostęp!
                            </button>
                        </form:form>
                        <hr>
                        <div class="text-center">
                            <a class="small" href="<c:url value="/login"/>">Masz konto? Zaloguj się!</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

</div>

<!-- Bootstrap core JavaScript-->
<script src="<c:url value="/resources/vendor/jquery/jquery.min.js" />"></script>
<script src="<c:url value="/resources/vendor/bootstrap/js/bootstrap.bundle.min.js" />"></script>

<!-- Core plugin JavaScript-->
<script src="<c:url value="/resources/vendor/jquery-easing/jquery.easing.min.js" />"></script>

<!-- Custom scripts for all pages-->
<script src="<c:url value="/resources/js/sb-admin-2.min.js" />"></script>

</body>

</html>

