# list

### 1. ul, ol의 가운데 정렬

> 내용만 가운데 정렬

```css
ul{text-align : center;}
```

* 목록 안의 내용만 가운데 정렬을 해준다.

> 목록자체를 가운데 정렬

```css
ul{
    width:200px;
    margin-left:auto;
    margin-rignt:auto;
}
```

* 목록의 마커를 포함하여 가운데 정렬을 해준다.



### 2. 이미지를 마커로 사용하기

> list-style-image : 속성값

```css
li{list-style-image : url(../img/cat05.jpg);}
```

* 속성값 종류 : none(없음), url(이미지 경로)



### 3. 목록 마커 없애기(list header 설정)

> **list-style-type : none;**

```css
li{list-style-type:none;}
```

* list-style-type은 li 태그에 적용해야 한다. 



> **응용 코드 --> 태그 만들기**

```html
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	body, ul, li{
		margin:0px; padding:0px;
	}
	ul{
		border:3px red solid;
		overflow:auto;
	}
	li{
		list-style-type:none;
		float:left;
		background:orange;
		width:20%;
		height:40px;
		text-align:center;
		line-height:40px;
	}
</style>
</head>
<body>
<ul>
	<li><a href="#">메일</a></li>
	<li><a href="#">뉴스</a></li>
	<li><a href="#">자동차</a></li>
	<li><a href="#">지도</a></li>
	<li><a href="#">쇼핑</a></li>
</ul>
<img src="../img/cat05.jpg"/>
</body>
</html>
```

* ul과 li의 margin과 padding을 0으로 지정하여 document에 여백이 없게 왼,위로 완전히 붙은 상태로 설정하였다.
* float의 경우, li의 내용이 아니라 li 들을 모두 왼쪽으로 정렬시킨 것으로 text-align과 혼동X
  * padding을 0으로 설정했기 때문에 img와 붙은 상태로 출력된다.
* 목록 마커를 list-style-type을 none으로 설정하여 없애고 text-align을 center로 설정하여 내용을 가운데 정렬을 하였다.
* a태그에서 href의 속성값으로 #을 설정한 이유는 연결 링크를 아직 만들지 않아서이다. 