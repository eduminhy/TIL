# HTML

> **HTML5 기본용어** 

1. 태그와 요소(Tag and Element)

* 요소 : HTML 페이지를 구성하는 각 부품  
  * ex) 제목, 본문, 이미지 등
  * javascript에서는 객체(object)라고도 함
* 태그 : 요소를 만들 때 사용하는 작성방법
  * 내용을 가질 수 **있는** 요소  생성방법: **<요소이름>내용</요소이름>**
  * 내용을 가질 수 **없는** 요소  생성방법 : **<요소이름>**

2. 속성(Attribute)

* 속성 : 태그에 추가 정보를 부여할 때 사용

  ```
  <h1 title = "header">HelloHTML5</h1>
  <img src = "image.png">
  ```

  * title, src : 속성이름
  * " " : 속성블록
  * header, image.png : 속성값
  * HelloHTML5 : 내부문자

3. 주석

* 주석 : 프로그램 실행에 영향을 미치지 않고 설명용으로 사용하는 코드

  ```
   <!-- 주석 -->
  ```



> **HTML5 페이지 구조**

```
<!DOCTYPE html> 
<html> 
<head>  
	<title>HelloHTML5</title>
</head>  
<body>
</body>
</html>
```

```
<!DOCTYPE html> : HTML5문서라는 것을 알려주는 것, 반드시 첫행에 표시
<html></html> : 모든 HTML 페이지의 기본요소로 모든 태그는 html태그 내부에 작성
<head></head> : body 태그에 필요한 스타일시트, 자바스크립트 제공
<title>HelloHTML5</title> : 웹브라우저에 표시하는 제목
<body></body> : 사용자에게 실제로 보이는 부분
```

```
<태그 내부에 넣을 수 있는 태그>

* meta : 추가 정보 전달 
* title : 페이지 제목 지정
* script : 스크립트 추가
* link : 다른 파일 추가
* style : 스타일시트 추가
* base : 기본 경로지정
```

