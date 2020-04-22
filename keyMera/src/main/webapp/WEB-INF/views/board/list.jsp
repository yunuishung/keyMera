<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page session="false" %>

<%@include file="../includes/header.jsp" %>


<!-- /.panel-heading -->			    	
        <div class="panel-heading">
            2020.03.31 게시판 Advanced Tables
        </div>      
      
        <div class="panel-body">
            <table width="100%" class="table table-striped table-bordered table-hover" id="dataTables-example">
               <thead>
                  <tr>
                      <th>번호</th>
                      <th>제목</th>
                      <th>작성자</th>
                      <th>작성일</th>
                      <th>수정일</th>
                  </tr>
               </thead>
               <tbody>
				<c:forEach items="${list}" var="board">                                
                  <tr class="odd gradeX">
                      <td><c:out value="${board.bno}"/></td>
                      <td>
                      <a href='/board/get?bno=<c:out value="${board.bno}"/>'><c:out value="${board.title}"/></a></td>
                      <td><c:out value="${board.writer}"/></td>
                      <td class="center"><fmt:formatDate pattern="yyyy-MM-dd hh:MM:ss" value="${board.regdate}"/></td>
                      <td class="center"><fmt:formatDate pattern="yyyy-MM-dd hh:MM:ss" value="${board.updateDate}"/></td>
                  </tr>
	</c:forEach>
               </tbody>
            </table>
           <div class="well" align="center">
	<c:if test="${pageMaker.prev}">
	<a href="/board/list?pageNum=${pageMaker.startPage-1}">prev</a>
	</c:if>
	<c:forEach var="num" begin="${pageMaker.startPage }" end="${pageMaker.endPage}">
	<a href="/board/list?pageNum=${num}">[${num}]</a>&nbsp;&nbsp;					
	</c:forEach>
	<c:if test="${pageMaker.next}">
	<a href="/board/list?pageNum=${pageMaker.endPage+1}">next</a>
	</c:if>					
            </div>
            <!-- /.table-responsive 
           <div class="well">
               <h4>DataTables Usage Information</h4>
               <p>DataTables is a very flexible, advanced tables plugin for jQuery. In SB Admin, we are using a specialized version of DataTables built for Bootstrap 3. We have also customized the table headings to use Font Awesome icons in place of images. For complete documentation on DataTables, visit their website at <a target="_blank" href="https://datatables.net/">https://datatables.net/</a>.</p>
               <a class="btn btn-default btn-lg btn-block" target="_blank" href="https://datatables.net/">View DataTables Documentation</a>
           </div>-->
        </div>
			       
<%@include file="../includes/footer.jsp" %>
