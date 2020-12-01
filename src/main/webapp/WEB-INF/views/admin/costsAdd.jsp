<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/views/admin/header.jsp" %>

<!-- Begin Page Content -->
<div class="container-fluid">

    <!-- Page Heading -->
    <h1 class="h3 mb-4 text-gray-800">Przychody</h1>

    <%--                <form class="form-horizontal">--%>
    <form:form modelAttribute="income" method="post">
    <!-- Text input-->
    <fieldset>

        <!-- Form Name -->
        <legend>Form Name</legend>

        <!-- Kwota dochodu-->
        <div class="form-group">
            <label class="col-md-4 control-label" for="income">Kwota przychodu</label>
            <div class="col-md-4">
                <form:input path="income" name="income" placeholder="0,00" type="number" required=""/>
                <span class="help-block">Wprowadź ile kasy zarobiłeś! tylko PLN</span>
            </div>
        </div>

        <label>
            <label class="col-md-4 control-label" for="income">Wybierz typ przychodu</label>
                <form:select path="type_Of_Income" items="${incomeCategories}" multiple="false"/>


            <!-- Opis-->
            <tr class="d-flex">
                <th scope="row" class="col-2">Przygotowanie </th>
                <td class="col-2">
                        <form:textarea path="description" class="w-100 p-1"  min="0" rows="10"></form:textarea>


                    <button name="Save" type="submit">zapisz</button>
                    </form:form>

</div>
<!-- /.container-fluid -->

<%@ include file="/WEB-INF/views/admin/footer.jsp" %>