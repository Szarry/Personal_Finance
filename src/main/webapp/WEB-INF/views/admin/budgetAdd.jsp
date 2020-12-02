<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/views/admin/header.jsp" %>

<!-- Begin Page Content -->
<div class="container-fluid">

    <!-- Page Heading -->
    <h1 class="h3 mb-4 text-gray-800">Przychody</h1>

    <%--                <form class="form-horizontal">--%>
    <form:form modelAttribute="budget" method="post">
    <!-- Text input-->
    <fieldset>

        <!-- Form Name -->
        <legend>Dodaj budżet</legend>

        <!-- Budżet-->
        <div class="form-group">
            <label class="col-md-4 control-label" for="budget">Budżet</label>
            <div class="col-md-4">
                <form:input path="amount" name="budget" placeholder="0,00" type="number" required=""/>
                <span class="help-block">Wprowadź jaki masz budżet na obecny miesiąc</span>
            </div>
        </div>


                    <button name="Save" type="submit">zapisz</button>
                    </form:form>

</div>
<!-- /.container-fluid -->

<%@ include file="/WEB-INF/views/admin/footer.jsp" %>