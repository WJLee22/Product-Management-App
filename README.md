# 📦 Product-Management-App

Spring Boot 기반 Product 관리 시스템 with Spring Security
> Spring Boot project for managing products with Spring Security-based authentication and authorization.

<br>

## 📌 프로젝트 개요
이 프로젝트는 Spring Security 기반의 사용자 인증 및 권한(Role) 기반 인가 기능을 통합한 상품 관리 웹 애플리케이션이다.  
Spring Boot & Spring Security 기반으로, 사용자 권한별로 기능 접근을 제한하고 보안을 강화하였다.  

<br>

## 🔧 기술 스택
- **Backend:** `Spring Boot 3`, `Spring Data JPA`, `Spring Security`
- **Frontend:** `Thymeleaf`
- **Database:** `MySQL`

<br>


## ✅ 주요 기능
###  ① 사용자 인증  
- 이메일 기반 회원가입 및 로그인 기능    
- 패스워드는 BCryptPasswordEncoder로 암호화하여 보안up  
- 로그인 성공/실패 시 맞춤 메시지 제공  

###  ② 권한(Role) 기반 인가
- **`ROLE_USER`:** 상품 조회 기능만 접근 가능 
- **`ROLE_ADMIN`:** 상품 등록, 수정, 삭제 및 관리자 페이지 접근 가능
- Thymeleaf에서 Spring Security 기반 인증 및 권한 상태에 따라 UI 요소 제어

###  ③ 추가 기능 
- 상품 등록/수정 시 유효성 검사 (예: 가격은 0 이상)      
- **`관리자 전용 대시보드(/admin/dashboard)`:** 총 사용자 수, 총 상품 수, 최근 사용자 및 상품 목록 표시  
- 사용자 조회 페이지: 시스템에 등록된 모든 사용자 정보를 한눈에 확인  

<br>


  
## ✅ Dependencies Setting
![image](https://github.com/user-attachments/assets/7d34c63d-42d4-47bb-bfba-4c968f3d1a79)
