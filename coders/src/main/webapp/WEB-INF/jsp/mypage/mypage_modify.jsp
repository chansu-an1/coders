<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>  
<!DOCTYPE html>
<!-- saved from url=(0128)file:///C:/Users/garde/OneDrive/%EB%B0%94%ED%83%95%20%ED%99%94%EB%A9%B4/%EC%93%B8%EB%A7%8C%ED%95%9C%EA%B1%B0/checkout/index.html -->
<html lang="kso"><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
   
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
    <meta name="generator" content="Hugo 0.88.1">
    <title>Coders 회원가입</title>
    <link rel="canonical" href="https://getbootstrap.com/docs/5.1/examples/checkout/">
    <!-- Bootstrap core CSS -->
<link href="../assets/dist/css/bootstrap.min.css" rel="stylesheet"/>

    <style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        user-select: none;
      }

      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }
    </style>   
    <!-- Custom styles for this template -->
    <link href="<c:url value='/resources/css/form-validation.css'/>" rel="stylesheet"/>
  </head>
  <body class="bg-light">
<div class="container">
  <main>
    <div class="row g-5">  
      <div class="col-md-7 col-lg-8">
        <h4 class="mb-3">회원가입</h4>
        <form method="post" class="needs-validation" novalidate>
          <div class="row g-3">
            <div class="col-12">
              <label for="username" class="form-label">이름</label>
              <div class="input-group has-validation">
                <input type="text" class="form-control"  id="username" placeholder="이름" required>
              <div class="invalid-feedback">이름을 입력해주세요</div>
              </div>
            </div>
            <div class="col-12">
              <label for="email" class="form-label">이메일</label>
              <input type="email" class="form-control"  id="email" placeholder="you@example.com" required>
              <div class="invalid-feedback">이메일을 작성해주세요</div>
            </div>
           <div class="col-md-6">
              <label for="address2" class="form-label">주소</label>
              <input type="text" class="form-control" id="address2" placeholder="주소" required>
            <div class="invalid-feedback">주소는 필수 입력사항입니다</div>
           </div>
            <div class="col-md-6">
              <label for="zip" class="form-label">상세주소<span class="text-muted">(선택)</span></label>
              <input type="text" class="form-control" id="zip" placeholder="상세주소">            
            </div>
          <div class="col-md-6">
              <label for="zip" class="form-label">우편 번호</label>
              <input type="text" class="form-control" id="zip" placeholder="우편번호" required>
              <div class="invalid-feedback">우편 번호는 필수 입력사항입니다</div>
            </div></div>
          <hr class="my-4">
          <div class="form-check">
            <input type="checkbox" class="form-check-input" id="same-address">
            <label class="form-check-label" for="same-address">Shipping address is the same as my billing address</label>
          </div>
          <div class="form-check">
            <input type="checkbox" class="form-check-input" id="save-info">
            <label class="form-check-label" for="save-info">Save this information for next time</label>
          </div>
          <hr class="my-4">
          <button class="w-100 btn btn-primary btn-lg" type="submit">회원가입 완료</button>
        </form>
      </div>
    </div>
  
  </main> 
</div>

</body>
</html>