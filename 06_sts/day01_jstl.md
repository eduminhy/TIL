# JSTL

> JSTL(JSP Standard Tag Library) : jsp표준라이브러리

* 자주 사용될 수 있는 커스텀 태그들을 모아서 표준으로 모아놓은 태그 라이브러리

* jstl 사용하기 위해서는 taglib를 디렉티브로 등록해야 한다.

* ```html
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  ```



> JSTL core tag 종류

* < c:if > : 조건문

  * ```html
    <c:if  test="조건판별식">
    	조건이 true일 때 실행한 내용
    </c:if>	
    ```

* < c:forEach > : 반복문

  * ```html
    <c:forEach var="변수명" items="반복데이터가 있는 Collection명" begin="시작값(기본값=0)" end="종료값" step="증가폭(기본값=1)">
    	반복할 내용
    </c:forEach>
    ```

* < c:redirect > : url 이동

  * ```html
    <c:redirect url="이동할 url"/>
    ```

  * sendRedirect()와 동일하다.

  

  ===================================================================

* 이외의 추가예정

  ====================================================================



# Login홈페이지 만들기

### 1. home.jsp

```html
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
<link rel="stylesheet" href="css/style.css" type="text/css"/>	
</head>
<body>
<h1>Hello world!</h1>
<P>  The time on the server is ${serverTime}. </P>
<p>스프링 홈페이지</p>
<h2>아이디 : ${userid}</h2>
<h2>이름 : ${username}</h2>
<img src="img/cat04.jpg"/>
</body>
</html>
```



### 2. HomeController.java

