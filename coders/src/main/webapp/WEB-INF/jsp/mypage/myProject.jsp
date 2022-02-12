<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<!-- saved from url=(0128)file:///C:/Users/garde/OneDrive/%EB%B0%94%ED%83%95%20%ED%99%94%EB%A9%B4/%EC%93%B8%EB%A7%8C%ED%95%9C%EA%B1%B0/checkout/index.html -->
<html lang="ko">
<head>
<title>내프로젝트</title>
<%@ include file="/WEB-INF/include/include-header2.jspf"%>
</head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author"
	content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
<meta name="generator" content="Hugo 0.88.1">
<link rel="canonical"
	href="https://getbootstrap.com/docs/5.1/examples/checkout/">
<!-- Bootstrap core CSS -->
<link href="../assets/dist/css/bootstrap.min.css"
	rel="stylesheet" />
<body class="bg-light">
	<div class="d-flex" id="wrapper">
		<!-- Sidebar-->
		<div class="border-end bg-white" id="sidebar-wrapper">
			<div class="sidebar-heading border-bottom bg-light">Start
				Bootstrap</div>
			<div class="list-group list-group-flush">
				<a
					class="list-group-item list-group-item-action list-group-item-light p-3"
					href="#!">Dashboard</a> <a
					class="list-group-item list-group-item-action list-group-item-light p-3"
					href="#!">Shortcuts</a> <a
					class="list-group-item list-group-item-action list-group-item-light p-3"
					href="#!">Overview</a> <a
					class="list-group-item list-group-item-action list-group-item-light p-3"
					href="#!">Events</a> <a
					class="list-group-item list-group-item-action list-group-item-light p-3"
					href="#!">Profile</a> <a
					class="list-group-item list-group-item-action list-group-item-light p-3"
					href="#!">Status</a>
			</div>
		</div>
		<!-- Page content wrapper-->
		<div id="page-content-wrapper">
			<!-- Top navigation-->
			<nav
				class="navbar navbar-expand-lg navbar-light bg-light border-bottom">
				<div class="container-fluid">
					<button class="btn btn-primary" id="sidebarToggle">Toggle
						Menu</button>
					<button class="navbar-toggler" type="button"
						data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
						aria-controls="navbarSupportedContent" aria-expanded="false"
						aria-label="Toggle navigation">
						<span class="navbar-toggler-icon"></span>
					</button>
					<div class="collapse navbar-collapse" id="navbarSupportedContent">
						<ul class="navbar-nav ms-auto mt-2 mt-lg-0">
							<li class="nav-item active"><a class="nav-link" href="#!">Home</a></li>
							<li class="nav-item"><a class="nav-link" href="#!">Link</a></li>
							<li class="nav-item dropdown"><a
								class="nav-link dropdown-toggle" id="navbarDropdown" href="#"
								role="button" data-bs-toggle="dropdown" aria-haspopup="true"
								aria-expanded="false">Dropdown</a>
								<div class="dropdown-menu dropdown-menu-end"
									aria-labelledby="navbarDropdown">
									<a class="dropdown-item" href="#!">Action</a> <a
										class="dropdown-item" href="#!">Another action</a>
									<div class="dropdown-divider"></div>
									<a class="dropdown-item" href="#!">Something else here</a>
								</div></li>
						</ul>
					</div>
				</div>
			</nav>
			<div class="db-example">
				<h4 class="mb-3">내프로젝트</h4>
				<hr class="my-4">
				<table class="table table-striped">
					<thead>
						<tr>
							<th scope="col">번호</th>
							<th scope="col">프로젝트이름</th>
							<th scope="col">시작일</th>
							<th scope="col">종료일</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="rows" items="${list}">
							<tr>
								<th scope="row">${rows.PROJECT_NO}</th>
								<td><a href="#">${rows.PROJECT_NAME}</a></td>
								<td>${rows.PROJECT_START}</td>
								<td>${rows.PROJECT_END}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>

	</div>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js"></script>
<!-- Core theme JS-->
<script src="../js/scripts.js"></script>
</body>
</html>