# meta Tag

> **meta 태그란?**

* 해당 문서에 대한 정보인 메타데이터(metadata) 정의할 때 사용
* 항상 < head > 내부에 위치해야 한다.
* name과 http-equiv 속성을 사용할 때 **content 속성도 함께 명시**되어야 한다(content 단독 사용X).

> **meta 태그 속성의 종류**

1. **name** 속성

```html
<head>
<meta charset="UTF-8">
<meta name="description" content="이 페이지에 대한 설명을 기술한다."/>
<meta name="keywords" content="computer, it, ai, java"/>
<meta name="author" content="homg gildong"/>
<title>meta 태그</title>
</head>
```

* description : 이 페이지에 대한 설명을 기술한다.

* keywords: 검색엔진에 검색되는 단어들을 기술한다.
* author : 작성자

2. **http-equiv** 속성

```html
<head>
<meta http-equiv="refresh" content="10"/>
<meta http-equiv="Refresh" content="5;http://www.naver.com"/>
</head>
```

* refresh : '새로고침'으로 단위는 second(초)이다.
  * 위의 코드는 10초마다 새로고침을 한다는 의미이다.
* Refresh : 일정시간이 되면 페이지를 content에 기입한 페이지로 자동으로 이동한다.
  * 위의 코드는 페이지가 열리고 5초 후 네이버페이지로 이동한다.