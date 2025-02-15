<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%> 

<c:set var="nav" value="restaurantDetail" scope="request"/>
<c:set var="titleName" value="식당 상세보기" scope="request"/>

<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	
	<title>관리자 ${titleName }</title>
	<jsp:include page="/WEB-INF/view/admin/layout/prestyle.jsp" />
</head>

<body>
     <!-- Sidebar -->
	 <jsp:include page="/WEB-INF/view/admin/layout/header.jsp" />
     <!-- End of Sidebar -->

     <!-- Begin Page Content -->
     <div class="container-fluid">
		 	<div class="bg-white rounded p-3 m-2">
				<div class="mt-3">
					<div class="form-group mb-3 row">
						<label class="col-sm-3 col-md-2 col-lg-2 col-xl-1 col-form-label" for="fullName">식당이름</label>
							<div class="col-sm-3 col-form-label">
		            <div class="contents">${restaurant.restaurantName}</div>
		          </div>
					</div>

		        <div class="form-group mb-3 row">
		          <label class="col-sm-3 col-md-2 col-lg-2 col-xl-1 col-form-label" for="fullName">식당 설명</label>
		          <div class="col-sm-3 col-form-label">
		            <div class="contents">${restaurant.restaurantDes}</div>
		          </div>
		        </div>

		        <div class="form-group mb-3 row">
		          <label class="col-sm-3 col-md-2 col-lg-2 col-xl-1 col-form-label" for="fullName">주소</label>
		          <div class="col-sm-3 col-form-label">
		            <div class="contents">${restaurant.restaurantAdd1} ${restaurant.restaurantAdd2}</div>
		          </div>
		        </div>

		        <div class="form-group mb-3 row">
		          <label class="col-sm-3 col-md-2 col-lg-2 col-xl-1 col-form-label" for="fullName">전화번호</label>
		          <div class="col-sm-3 col-form-label">
		            <div class="contents">${restaurant.restaurantTel}</div>
		          </div>
		        </div>

		        <div class="form-group mb-3 row">
		          <label class="col-sm-3 col-md-2 col-lg-2 col-xl-1 col-form-label" for="fullName">생성일</label>
		          <div class="col-sm-3 col-form-label">
		            <div class="contents">${restaurant.createDate}</div>
		          </div>
		        </div>

		        <div class="form-group mb-3 row">
		          <label class="col-sm-3 col-md-2 col-lg-2 col-xl-1 col-form-label" for="fullName">사장님</label>
		          <div class="col-sm-3 col-form-label">
		            <div class="contents">${empty restaurant.memName ? "사장님 미지정" : restaurant.memName }</div>
		          </div>
		        </div>
						<%-- 관리자에서 메뉴 설정 불가능 - 0104 by heo --%>
						<%-- <div class="form-group mb-3 row">
		          <label class="col-sm-3 col-md-2 col-lg-2 col-xl-1 col-form-label" for="fullName">메뉴</label>
		          <div class="col-sm-9 col-form-label">
							<button class="btn btn-outline-primary mb-4" data-toggle="modal" data-target="#menuAddModal">메뉴 추가</button>
							<c:if test="${not empty menuList}">
								<div class="row">
									<div class="col-2">메뉴명</div>
									<div class="col-2 text-right">가격</div>
									<div class="col-3">설명</div>
									<div class="col-3">이미지</div>
									<div class="col-2"></div>
								</div>
									<c:forEach items="${menuList}" var="menu">
										<div class="row mt-2">
											<div class="col-2">${menu.menuName}</div>
											<div class="col-2 text-right">
												<fmt:formatNumber value="${menu.menuPrice}" pattern="#,###"/>원
											</div>
											<div class="col-3">${menu.menuDes == '' || menu.menuDes == null ? '없음' : menu.menuDes}</div>
											<div class="col-3">
												<c:choose>
														<c:when test="${menu.fileSaveName != null && !menu.fileSaveName.isEmpty()}">
																<img class="rounded img-thumbnail" 
																		src="/upload/menu/${menu.fileSaveName}" 
																		onerror="this.src='${pageContext.request.contextPath}/assets/img/image-error.png'" />
														</c:when>
														<c:otherwise>
																이미지 없음
														</c:otherwise>
												</c:choose>
											</div>

												<div class="col-2 d-flex">
													<button
														class="btn btn-outline-primary mb-4 menuUpdateModal mr-2 text-nowrap content-fit-h"
														data-menu-no="${menu.menuNo}"
														data-menu-name="${menu.menuName}"
														data-menu-price="${menu.menuPrice}"
														data-menu-des="${menu.menuDes}"
														data-file-no="${menu.fileNo}"
														data-file-save-name="${menu.fileSaveName}">
														수정</button>
													<button
														class="btn btn-outline-danger mb-4 text-nowrap menu-remove-modal content-fit-h"
														data-menu-no="${menu.menuNo}">
														삭제</button>
												</div>
										</div>
									</c:forEach>
								</c:if>
		          </div>
		        </div> --%>

						<c:if test="${not empty fileList}">
								<div class="row mb-3">
								<c:forEach items="${fileList}" var="file">
									<img class="col-3 rounded img-thumbnail mb-2" src="/upload/restaurant/${file.fileSaveName}" onerror="this.src='${pageContext.request.contextPath  }/assets/img/image-error.png'"/>
								</c:forEach>
								</div>
						</c:if>
				</div>
				<div class="form-actions">
					<a href="restaurantList.do" class="btn btn-outline-dark">목록</a>
					<a href="restaurantUpdate.do?restaurantNo=${restaurant.restaurantNo }" class="btn btn-outline-primary">수정</a>
					<button class="btn btn-outline-danger" data-toggle="modal" data-target="#logoutModal">삭제</button>
				</div>
		</div>
	<!-- /.container-fluid -->

	<!-- 식당 삭제 모달 -->
  <div class="modal fade" id="logoutModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
      <div class="modal-dialog" role="document">
					<form action="restaurantDelete.do" method="post">
						<div class="modal-content">
								<div class="modal-header">
										<h5 class="modal-title" id="exampleModalLabel">삭제</h5>
								</div>
								<div class="modal-body">삭제 하시겠습니까?</div>
								<div class="modal-footer">
									<input type="hidden" name="restaurantNo" value="${restaurant.restaurantNo}">
										<button class="btn btn-secondary" type="button" data-dismiss="modal">닫기</button>
										<button type="submit" class="btn btn-primary">삭제</button>
								</div>
						</div>
					</form>
      </div>
  </div>

	<!-- menuAdd Modal-->
  <div class="modal fade" id="menuAddModal" tabindex="-1" role="dialog" aria-labelledby="menuAddModal" aria-hidden="true">
      <div class="modal-dialog" role="document">
					<form action="menuInsert.do" class="needs-validation"  method="post" enctype="multipart/form-data" novalidate>
						<div class="modal-content">
								<div class="modal-header">
										<h5 class="modal-title" id="menuAddModal">메뉴 추가</h5>
								</div>
								<div class="modal-body">
									<input type="hidden" name="restaurantNo" value="${restaurant.restaurantNo}">
									<div class="mb-4">
										<label for="menuName" class="form-label">메뉴 이름</label>
										<input id="menuName" name="menuName" type="text" class="form-control" required="required" value="">
										<div class="invalid-feedback">메뉴 이름을 입력해주세요</div>
									</div>

									<div class="mb-4">
										<label for="menuDes" class="form-label">메뉴 설명</label>
										<input id="menuDes" name="menuDes" type="text" class="form-control" required="required" value="" >
										<div class="invalid-feedback">메뉴 설명을 입력해주세요</div>
									</div>

									<div class="mb-4">
										<label for="menuPrice" class="form-label">메뉴 가격</label>
										<input id="menuPrice" name="menuPrice" type="number" class="form-control" required="required" value="">
										<div class="invalid-feedback">메뉴 가격을 입력해주세요</div>
									</div>
									
									<!-- 단일 파일 -->
			  					<file-upload name="filename" label="메뉴 이미지" max-files="1" contextPath="${pageContext.request.contextPath  }"></file-upload>
								</div>
								<div class="modal-footer">
										<button class="btn btn-secondary" type="button" data-dismiss="modal">닫기</button>
										<button type="submit" class="btn btn-primary">추가</button>
								</div>
						</div>
					</form>
      </div>
  </div>

	<%-- 메뉴 수정 모달 --%>
  <div class="modal fade" id="menuUpdateModal" tabindex="-1" role="dialog" aria-labelledby="menuUpdateModal" aria-hidden="true">
      <div class="modal-dialog" role="document">
					<form action="menuUpdate.do" class="needs-validation"  method="post" enctype="multipart/form-data" novalidate>
						<div class="modal-content">
								<div class="modal-header">
										<h5 class="modal-title" id="menuUpdateModal">메뉴 수정</h5>
								</div>
								<div class="modal-body">
									<input type="hidden" name="restaurantNo" value="${restaurant.restaurantNo}">
									<input id="menuNo" name="menuNo" type="hidden">
									<div class="mb-4">
										<label for="menuName" class="form-label">메뉴 이름</label>
										<input id="menuName" name="menuName" type="text" class="form-control" required="required" value="">
										<div class="invalid-feedback">메뉴 이름을 입력해주세요</div>
									</div>

									<div class="mb-4">
										<label for="menuDes" class="form-label">메뉴 설명</label>
										<input id="menuDes" name="menuDes" type="text" class="form-control" required="required" value="" >
										<div class="invalid-feedback">메뉴 설명을 입력해주세요</div>
									</div>

									<div class="mb-4">
										<label for="menuPrice" class="form-label">메뉴 가격</label>
										<input id="menuPrice" name="menuPrice" type="number" class="form-control" required="required" value="">
										<div class="invalid-feedback">메뉴 가격을 입력해주세요</div>
									</div>
									
									<!-- 단일 파일 -->
			  					<file-upload name="filename" label="메뉴 이미지" max-files="1" contextPath="${pageContext.request.contextPath  }"></file-upload>
								</div>
								<div class="modal-footer">
										<button class="btn btn-secondary" type="button" data-dismiss="modal">닫기</button>
										<button type="submit" class="btn btn-primary">수정</button>
								</div>
						</div>
					</form>
      </div>
  </div>


	<!-- 메뉴 삭제 모달 -->
  <div class="modal fade" id="menuDeleteModal" tabindex="-1" role="dialog" aria-labelledby="menuDeleteModal" aria-hidden="true">
      <div class="modal-dialog" role="document">
					<form action="menuDelete.do" method="post">
						<div class="modal-content">
								<div class="modal-header">
										<h5 class="modal-title" id="exampleModalLabel">삭제</h5>
								</div>
								<div class="modal-body">
									<input type="hidden" name="restaurantNo" value="${restaurant.restaurantNo}">
									<input type="hidden" name="menuNo" value="">
									삭제 하시겠습니까?
								</div>
								<div class="modal-footer">
										<button class="btn btn-secondary" type="button" data-dismiss="modal">닫기</button>
										<button type="submit" class="btn btn-primary">삭제</button>
								</div>
						</div>
					</form>
      </div>
  </div>

	<script>
	  // 수정 모달
		document.querySelectorAll(".menuUpdateModal").forEach((item) => {
			item.addEventListener("click", (e) => {
				const {menuNo, menuName, menuDes, menuPrice, fileSaveName, fileNo} = e.target.dataset;
				$('#menuUpdateModal').modal("show");

				// 모달에 데이터 넣기
				const menuUpdateModal = document.querySelector("#menuUpdateModal");
				menuUpdateModal.querySelector("#menuNo").value = menuNo;
				menuUpdateModal.querySelector("#menuName").value = menuName;
				menuUpdateModal.querySelector("#menuName").value = menuName;
				menuUpdateModal.querySelector("#menuDes").value = menuDes;
				menuUpdateModal.querySelector("#menuPrice").value = menuPrice;

				// 모달에 이미지 보여주기
				menuUpdateModal.querySelector(".preview").src = "/upload/menu/" + fileSaveName;
				menuUpdateModal.querySelector(".removeFileBtn").dataset.id = fileNo;
			})
		});

		// 삭제 모달
		document.querySelectorAll(".menu-remove-modal").forEach((item) => {
			item.addEventListener("click", (e) => {
				const { menuNo } = e.target.dataset;
				$('#menuDeleteModal').modal("show");
				const menuDeleteModal = document.querySelector("#menuDeleteModal");
				menuDeleteModal.querySelector("input[name=menuNo]").value = menuNo;
				
			})
		})

	</script>

  <!-- Footer -->
	<jsp:include page="/WEB-INF/view/admin/layout/footer.jsp" />
  <!-- End of Footer -->
	<jsp:include page="/WEB-INF/view/admin/layout/prescript.jsp" />
</body>


</html>