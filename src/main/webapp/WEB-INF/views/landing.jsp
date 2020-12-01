<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/views/admin/header.jsp" %>

<!-- Begin Page Content -->
<div class="container-fluid">

    <!-- Page Heading -->
    <h1 class="h3 mb-4 text-gray-800">Witam</h1>

    <tr>
    <td><a href="<c:url value="/login"/> " class="btn btn-success btn-icon-split">
                    <span class="icon text-white-50">
                      <i class="fas fa-check"></i>
                    </span>
        <span class="text">Zaloguj się!</span>
    </a></td>
        <td><div class="my-2"></div>
            <a href="<c:url value="/register"/>"class="btn btn-info btn-icon-split">
                    <span class="icon text-white-50">
                      <i class="fas fa-info-circle"></i>
                    </span>
                <span class="text">Zarejestruj się!</span>
            </a></td>


</div>
<!-- /.container-fluid -->

<%@ include file="/WEB-INF/views/admin/footer.jsp" %>