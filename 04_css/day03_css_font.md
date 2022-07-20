# font

> font-size : 글자크기

* **기본 : 16px**
* font-size의 종류 : px, pt, cm, mm, in(inch), em
  * <u>em은 현재 글자크기를 기준</u>으로 사이즈가 결정된다.
  * ex) 현재 20px이면 0.5em->10px, 현재 6px이면 5em->30px

> font-family : 글꼴

* 돋움체, 굴림체, 고딕체, 궁서체..... 등등을 지정할 수 있다.
  * font-family : 궁서체 돋움체 ; 로 입력하면 궁서체로 우선으로 나오고 만약 해당 디바이스에 궁서체가 없다면 돋움체로 출력한다. 즉 <u>입력순서가 출력의 우선순위</u>인 것



> **코드 예시**

```html
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	li{
		font-size:2em;
		font-family:궁서체 돋움체 sans-serif;
	}
</style>
</head>
<body>
폰트스타일
	<ul>
		<li>font style</li>
		<li>글자 크기</li>
		<li>글자 글꼴</li>
		<li>글자 색상</li>		
		
	</ul>
</body>
</html>
```

* body 태그에 존재하는 li 태그에 스타일을 적용하였다.
* font-size가 2em인데 아무런 지정을 하지 않았으므로 현재 기본 폰트사이즈는 16px이다. 따라서 32px로 출력된다.
* 글꼴의 우선순위 궁서>돋움>sans-serif



