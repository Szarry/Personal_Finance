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

                    <tr>
                        <td>ID</td>
                        <td>Kwota</td>
                        <td>Data dodania</td>
                        <td>Opis</td>
                        <td>Akcja</td>

                        <c:forEach items="${budgetList}" var="budget">
                    <tr>

                        <td>${budget.id}</td>
                        <td>${budget.amount}</td>
                        <td>${budget.date_Time}</td>
                        <td>${budget.description}</td>

                        <td>
                            <div class="my-2"></div>
                            <a href="<c:url value="/admin/budgetEdit/${budget.id}"/> " class="btn btn-warning btn-icon-split">
                                    <span class="icon text-white-50">
                                    <i class="fas fa-exclamation-triangle"></i>
                                    </span>
                                <span class="text">Edytuj</span>
                            </a>
                            <a href="<c:url value="/admin/budgetDelete/${budget.id}"/>" onClick="if(confirm('Czy na pewno chcesz usunąć drink?')==false) return false;" class="btn btn-danger btn-icon-split">
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