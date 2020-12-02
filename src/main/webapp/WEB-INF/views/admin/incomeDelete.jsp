<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/views/admin/header.jsp" %>

<!-- Begin Page Content -->
<div class="container-fluid">

    <!-- Page Heading -->
    <h1 class="h3 mb-4 text-gray-800">Witam</h1>

    <h1>Jesteś pewien?/pewna?</h1>
       <tr>
           <td>
               <form>
                   <input value="${id}"/>
               <button class="btn-primary" type="submit">zapisz</button>
               </form>
           </td>
           <td>
               <h3>Uciekam stont! Click</h3>
    <div class="my-2"></div>
    <a href="<c:url value="/admin/incomeList"/> " class="btn btn-success btn-icon-split">
                    <span class="icon text-white-50">
                      <i class="fas fa-check"></i>
                    </span>
        <span class="text">Ja się nie znam i uciekam</span>
    </a>
           </td>
       </tr>


</div>
<!-- /.container-fluid -->

<%@ include file="/WEB-INF/views/admin/footer.jsp" %>