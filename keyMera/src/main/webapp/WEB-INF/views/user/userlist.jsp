<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page session="false" %>

<%@include file="../includes/header.jsp" %>


<!-- /.panel-heading -->			    	
        <div class="panel-heading">
                  회원 리스트 
        </div>      
      
        <div class="panel-body">
            <table width="100%" class="table table-striped table-bordered table-hover" id="dataTables-example">
               <thead>
                  <tr align="center">
                      <th>번호</th>
                      <th>아이디</th>
                      <th>비밀번호</th>
                      <th>회원명</th>
                      <th>성별</th>
                      <th>이메일</th>
                  </tr>
               </thead>
               <tbody>
				<c:forEach items="${userlist}" var="event">                                
                  <tr class="odd gradeX">
                      <td><c:out value="${user.no}"/></td>
                      <td><a href='/user/get?bno=<c:out value="${user.id}"/>'><c:out value="${user.id}"/></a></td>
                      <td class="center"><fmt:formatDate pattern="********" value="${user.pw}"/></td>
                      <td><c:out value="${user.name}"/></td>
                      <td><c:out value="${user.gender}"/></td>
                      <td><c:out value="${user.email}"/></td>
                  </tr>
				</c:forEach>
               </tbody>
            </table>
           <div class="well" align="center">
	<c:if test="${pageMaker.prev}">
	<a href="/user/userlist?pageNum=${pageMaker.startPage-1}">prev</a>
	</c:if>
	<c:forEach var="num" begin="${pageMaker.startPage }" end="${pageMaker.endPage}">
	<a href="/user/userlist?pageNum=${num}">[${num}]</a>&nbsp;&nbsp;					
	</c:forEach>
	<c:if test="${pageMaker.next}">
	<a href="/user/userlist?pageNum=${pageMaker.endPage+1}">next</a>
	</c:if>					
            </div>
            <!-- /.table-responsive -->
           <div class="well">
			  <a href="/user/register" ><button id="regBtn" type="button" class="btn btn-info" >회원등록</button></a>
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
