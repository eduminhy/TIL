# TAG

## 제목 & 본문 문자 태그

```
<!DOCTYPE html>
<html>
<head>
	<title>HTML5+CSS3 Text</title>
</head>
<body>
	<h1>제목태그1</h1>
	<h2>제목태그2</h2>
	<h3>제목태그3</h3>
	<h4>제목태그4</h4>
	<h5>제목태그5</h5>
	<h6>제목태그6</h6>
	
	<p>첫번째 문단</p>
	<p>두번째 문단</p>
</body>
</html>
```

* h1이 가장 큰 제목태그고 h6이 가장 작은 제목태그
* < p > : 문단표현



## 특수문자표기

* &nbsp ; : 공백
* &lt : <
* &gt : >
* &amp : & 

```
<body>
	<h6>공백이 있는 &amp글자</h6>
	<h6>&lt공백이&nbsp;&nbsp;&nbsp있는&nbsp;&nbsp;&nbsp;글자&gt</h6>
</body>
```

<h6>공백이 있는 &amp글자</h6>

<h6>&lt공백이&nbsp;&nbsp;&nbsp;있는&nbsp;&nbsp;&nbsp;글자&gt</h6>



# 앵커태그

* 다른 웹 페이지나 웹 페이지 내부의 특정 위치로 이동할 때 사용
* href 속성 : 이동할 웹페이지 설정

```
<!DOCTYPE html>
<html>
<head>
	<title>HTML5</title>
</head>
<body>
	<a href="http://nate.com">네이트</a>
	<a href="http://naver.com">네이버</a>
</body>
</html>
```

* 웹 페이지 내부의 특정 태그로 이동시, id 속성을 추가로 사용