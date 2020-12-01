<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/WEB-INF/views/admin/header.jsp" %>

<!-- Begin Page Content -->
<div class="container-fluid">

    <!-- Page Heading -->
    <h1 class="h3 mb-2 text-gray-800">Tables</h1>

    <!-- DataTales Example -->
    <div class="card shadow mb-4">
        <div class="card-header py-3">
            <h6 class="m-0 font-weight-bold text-primary">Lista przychodów wysztkich użytkowników</h6>
        </div>


        <div class="card-body">
            <div class="table-responsive">
                <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                    <c:forEach items="${incomeList}" var="income">
                        <tr>

                            <td>${income.id}</td>
                            <td>${income.type_Of_Income}</td>
                            <td>${income.description}</td>
                            <td>${income.income}</td>
                            <td>${income.user.firstname}</td>
                            <td>${income.updatedBy}</td>
                            <td>
                                <div class="my-2"></div>
                                <a href="<c:url value="/admin/incomeEdit/${income.id}"/> " class="btn btn-warning btn-icon-split">
                                    <span class="icon text-white-50">
                                    <i class="fas fa-exclamation-triangle"></i>
                                    </span>
                                    <span class="text">Edytuj</span>
                                </a>
                                <a href="<c:url value="/admin/incomeDelete/${income.id}"/>" class="btn btn-danger btn-icon-split">
                                    <span class="icon text-white-50">
                                    <i class="fas fa-trash"></i>
                                    </span>
                                    <span class="text">Usuń</span>
                                </a>
                            </td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
        </div>
    </div>

</div>
<!-- /.container-fluid -->

</div>
<!-- End of Main Content -->

<%@ include file="/WEB-INF/views/admin/footer.jsp" %>