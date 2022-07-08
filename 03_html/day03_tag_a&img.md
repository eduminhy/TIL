# 1. a Tag

### 1. 텍스트에 링크걸기

* < a >  태그 : 하이퍼링크(하나의 페이지에서 다른 페이지를 연결한다.)  이때, href 속성은 링크의 목적지를 가르킨다.

```html
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>앵커태그</title>
</head>
<body>
	<a href="../index.html">홈</a> <br/> 
    <!-- 새로운 창에 네이버라는 이름으로 링크를 만들어라-->
	<a href="https://naver.com/" target="_blank" title ="네이버"></a> 
</body>
</html>
```

* < a href="링크주소" >링크를 나타낼 이름< /a > 
* target 속성은 _balnk(기존의 창을 그대로 두고 새로운 창으로 링크를 연다.), _self(현재창에서 링크를 연다.), _parent, _top이 있다.

### 2. 이미지에 링크걸기

```html
<a href="tag02_img.html"><img src="../img/cat01.jpg"/></a> <br/>
```

* cat01.jpg 사진을 링크를 나타내는 이름으로 사용한 것. 즉, 사진을 누르면 tag02_img.html로 이동한다.

### 3. 다운로드하기

```html
<a href="../img/cat01.jpg" download>고양이사진 다운로드</a> <br/>
<a href = "../dounFile/mysql_demo.sql">demo.sql 다운로드하기</a>
```

* 다운로드 받을 파일의 경로를 href 속성값에 넣고 download를 입력한다(다운로드 받을 파일을 미리 넣어놓을 것).

### 4. 웹페이지 내부 다른 위치로 이동하기

```html
 1. <a href="#a1">html이란?</a><br/>
 2. <a href="#a2">javascript란?</a><br/>
 3. <a href="#a3">jquery란?</a><br/>
 4. <a href="#a4">ajax란?</a><br/>
 <hr/> <!-- 구분선 -->
 1. <a id="a1">html이란?</a><br/>
	<p>Hyper Text Markerup Language.</p>
	<p>Hyper Text Markerup Language.</p><br/>
 2. <a id="a2">javascript란?</a><br/>
	<p>동적인 웹프로그래밍 가능</p>
	<p>동적인 웹프로그래밍 가능</p><br/>
 3. <a id="a3">jquery란?</a><br/>
 	<p>javascript라이브러리</p>
	<p>javascript라이브러리</p><br/>
 4. <a id="a4">ajax란?</a><br/>
	<p>비동기식 전송가능</p>
	<p>비동기식 전송가능</p>
	<p>비동기식 전송가능</p><br/>
```

* #a1이란 이동하려는 태그, 즉 id=a1인 id속성을 herf 속성에 #id속성 형태로 입력한다. 위치표현이라고 생각하면 쉽다.  
* 따라서 웹 페이지에서 <u>html이란?</u>을 누르면 Hyper Text Markerup Language.가 2개 출력되는 a1위치로 이동한다.

### 5. 빈 링크

```html
<a id="news_press_menu" href="#">언론사전체보기</a>
<ul id="press_dropdown">
    <li><a href="#">언론사 전체보기</a></li>
    <li><a href="#">방송/통신</a></li>
    <li><a href="#">경제</a></li>
    <li><a href="#">IT</a></li>
    <li><a href="#">스포츠</a></li>
</ul>
```

* a 태그의 하이퍼링크 기능을 제거하여 사용할 때 속성의 입력방식은 유지해야만 한다. 이땐 href속성에 '#'을 입력하면 된다.



# 2. img Tag

### 웹 페이지에 이미지 표현하기

```html
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <img src="../img/cat02.jpg" width="200px" height="400px" title="이미지"/>
 <img src="../img/cat03.jpg" width="100%" height="300px"/>글자
 <img src="../img/cat001.jpg" alt="leaf"/>
</body>
</html>
```

* src 속성은 사용할 이미지의 파일명을 말한다. 이때 경로도 함께 표현해주어야 한다. 
* width 속성과 height 속성은 폭과 높이를 의미하며 일반적으로 px단위로 표현한다. 만약 둘 중 하나만 설정하는 경우 다른 하나는 원본 이미지 비율에 맞추어 알아서 바뀐다.
* 해당하는 이미지가 렌더링되지 못할 때 alt속성을 통해  문자열을 표시한다. 