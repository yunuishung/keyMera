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
                  <tr align="center">
                      <th>번호</th>
                      <th>제목</th>
                      <th>작성자</th>
                      <th>작성일</th>
                      <th>조회수</th>
                      <th>첨부</th>
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
                      <td class="center"><c:out value=""/></td>
                      <td class="center"><c:out value=""/></td>
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
            <!-- /.table-responsive -->
           <div class="well">
			  <a href="/board/register" ><button id="regBtn" type="button" class="btn btn-info" >글쓰기</button></a>
           </div>
        </div>
	

<script type="text/javascript">
$(document)
.ready(
	function() {
	
		var result = '<c:out value="${result}"/>';
		checkModal(result);
		history.replaceState({}, null, null);

		function checkModal(result) {
			if (result === '' || history.state) {
				return;
			}
			if (parseInt(result) > 0) {
				$(".modal-body").html(
						"게시글 " + parseInt(result)
								+ " 번이 등록되었습니다.");
			}
			$("#myModal").modal("show");
		}
	
		$("button[data-oper='register']").on("click", function(e){
		    operForm.attr("action","/board/register").submit();
			    
		});
			  
		var actionForm = $("#actionForm");
		$(".paginate_button a").on("click",
			function(e) {
				e.preventDefault();
				console.log('click');

				actionForm.find("input[name='pageNum']").val($(this).attr("href"));
				actionForm.submit();
			});
	
		$(".move").on("click",
			function(e) {
				e.preventDefault();
				actionForm.append("<input type='hidden' name='bno' value='" + $(this).attr( "href") + "'>");
				actionForm.attr("action", "/board/get");
				actionForm.submit();
				});
	
		var searchForm = $("#searchForm");
		$("#searchForm button").on("click",

			function(e) {
				if (!searchForm.find("option:selected").val()) {
					alert("검색종류를 선택하세요");
					return false;
				}
				if (!searchForm.find("input[name='keyword']").val()) {
					alert("키워드를 입력하세요");
					return false;
				}
				searchForm.find("input[name='pageNum']").val("1");
				e.preventDefault();
				searchForm.submit();

			});

	});
</script>

			       
<%@include file="../includes/footer.jsp" %>
