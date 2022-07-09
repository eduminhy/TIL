# 3. map/area Tag

### 1개의 이미지를 여러 곳으로 링크 걸기

> **전체 코드**

```html
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Jeju Map</title>
</head>
<body>
<img src="../img/jeju_map.jpg" usemap="#jejuMap"/>
<map name="jejuMap">
	<area shape="rect" coords="170,115,300,160" 
	href="http://www.airport.co.kr/jeju/index.do" target="_blank" title="제주국제공항"/>
							  <!-- 원 x,y,r -->
	<area shape="circle" coords="330,260,50"
	href="http://www.jeju.go.kr/hallasan/index.htm" target="_blank" title="한라산국립공원"/>
		<!-- 다각형 각각의 꼭짓점 좌표 x1,y1,x2,y2,x3,y3,...
								시작점은 아무곳이나 상관없지만 '시계방향'으로 해야한다.-->
	<area shape="poly" coords="70,210,160,240,100,270,10,265"
	href="https://www.visitjeju.net/kr/detail/view?contentsid=CONT_000000000500697" 
          target="_blank" title="협재해수욕장"/>
	
</map>
</body>
</html>
```

* area의 shape 속성은 링크의 모양을 의미하며 rect(사각형), circle(원), poly(다각형)이 있다. 
* 각각의 위치좌표 속성 coords를 나타내는 방법은 다르다.

> < area shape = "rect"/>

```html
<area shape="rect" coords="170,115,300,160" <!-- 사각형 x1,y1,x2,y2 -->
href="http://www.airport.co.kr/jeju/index.do" target="_blank" title="제주국제공항"/>
```

* 사각형 모양으로 area 태그를 이용하여 제주국제공항 홈페이지 링크로 연결
* title 속성을 이용하여 마우스 커서를 해당 위치에 올릴 때 '제주국제공항'이라고 뜬다.
* **coords="x1,y1,x2,y2" **형식으로 좌표를 넣는다.

> < area shape = "circle"/>

```html
<area shape="circle" coords="330,260,50"<!-- 원 x,y,r -->
href="http://www.jeju.go.kr/hallasan/index.htm" target="_blank" title="한라산국립공원"/>
```

* 원 모양으로 area 태그를 이용하여 한라산 국립공원 홈페이지 링크로 연결
* title 속성을 이용하여 마우스 커서를 해당 위치에 올릴 때 '제주국제공항'이라고 뜬다.
* **coords="x, y, r"** 형식으로 좌표를 넣는다.

> < area shape = "poly"/>

```html
<area shape="poly" coords="70,210,160,240,100,270,10,265" <!-- 다각형 각각의 꼭짓점 좌표 x1,y1,x2,y2,x3,y3,. -->
href="https://www.visitjeju.net/kr/detail/view?contentsid=CONT_000000000500697" 
      target="_blank" title="협재해수욕장"/>
```

* 다각형 모양으로 area 태그를 이용하여 협제해수욕장 홈페이지 링크로 연결
* title 속성을 이용하여 마우스 커서를 해당 위치에 올릴 때 '협재해수욕장'이라고 뜬다.
* **coords="x1,y1,x2,y2,,,," **형식으로 꼭짓점 좌표를 넣는다. 이때 **시작점은 아무곳**이나 상관없으나 **시계방향**으로 입력해야 한다.