<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>       
    
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>SB Admin 2 - Dashboard</title>
	<jsp:include page="/WEB-INF/view/template/prescript.jsp"></jsp:include>

</head>

<body id="page-top">

    <!-- Page Wrapper -->
    <div id="wrapper">

        <!-- Sidebar -->
  		<jsp:include page="/WEB-INF/view/template/sidebar.jsp"></jsp:include>
        <!-- End of Sidebar -->

        <!-- Content Wrapper -->
        <div id="content-wrapper" class="d-flex flex-column">
            <!-- Main Content -->
            <div id="content">
                <!-- Topbar -->
      			<jsp:include page="/WEB-INF/view/template/top.jsp"></jsp:include>
                <!-- End of Topbar -->
                <!-- Begin Page Content -->
			<div class="container-fluid">
	<!-- Page Heading -->
	<div class="d-sm-flex align-items-center justify-content-between mb-4">
		<h1 class="h3 mb-0 text-gray-800">${codeName }</h1>
		<a href="#"
			class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm"><i
			class="fas fa-download fa-sm text-white-50"></i> Generate Report</a>
	</div>


	<!-- Content Row -->

	<div class="row">
		<!-- Area Chart -->
		<div class="col-xl-12 col-lg-7">
			<div class="card">
				<div class="card-header">
					<h6 class="m-0 font-weight-bold">게시판 리스트</h6>
				</div>
				<div class="card-body">
					<table class="table table-striped table-bordered">
						<thead>
							<tr>
								<th>제목</th>
								<th>내용</th>
								<th>작성자</th>
								<th>등록일</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="board" items="${boardList}">
								<tr>
									<td>
									<a href="boardView?boardNo=${board.boardNo }&codeNo=${board.codeNo }">${board.title }</a>
									</td>
									<td>${board.content }</td>
									<td>${board.memName }</td>
									<td>${board.regDate }</td>
								</tr>
							</c:forEach>
						</tbody>
					
					</table>
				</div>
			</div>
		</div>
	</div>		
</div>	

                 <!-- /.container-fluid -->
            </div>
            <!-- End of Main Content -->
            <!-- Footer -->
          	<jsp:include page="/WEB-INF/view/template/footer.jsp"></jsp:include>
            <!-- End of Footer -->
        </div>
        <!-- End of Content Wrapper -->
    </div>
    <!-- End of Page Wrapper -->
    <!-- Scroll to Top Button-->
    <a class="scroll-to-top rounded" href="#page-top">
        <i class="fas fa-angle-up"></i>
    </a>
    <!-- Logout Modal-->
    <div class="modal fade" id="logoutModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
        aria-hidden="true">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
                    <button class="close" type="button" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">×</span>
                    </button>
                </div>
                <div class="modal-body">Select "Logout" below if you are ready to end your current session.</div>
                <div class="modal-footer">
                    <button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>
                    <a class="btn btn-primary" href="login.html">Logout</a>
                </div>
            </div>
        </div>
    </div>

    <!-- Bootstrap core JavaScript-->
    <script src="resource/bootstrap/vendor/jquery/jquery.min.js"></script>
    <script src="resource/bootstrap/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

    <!-- Core plugin JavaScript-->
    <script src="resource/bootstrap/vendor/jquery-easing/jquery.easing.min.js"></script>

    <!-- Custom scripts for all pages-->
    <script src="resource/bootstrap/s/sb-admin-2.min.js"></script>

    <!-- Page level plugins -->
    <script src="resource/bootstrap/vendor/chart.js/Chart.min.js"></script>

    <!-- Page level custom scripts -->
    <script src="resource/bootstrap/js/demo/chart-area-demo.js"></script>
    <script src="resource/bootstrap/js/demo/chart-pie-demo.js"></script>

</body>

</html>