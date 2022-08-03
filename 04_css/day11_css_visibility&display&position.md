# visibility&display

### 선택된 객체를 보여주거나 숨길 수 있다.

> html 코드&기본 css 설정

```html
<body>
<div id="d1"></div>
<div id="d2"></div>
<div id="d3"></div>
<div id="d4"></div>
<img src="../img/cat05.jpg"/>
</body>
```

```css
<style>
	div{width:300px; height:300px;}
	#d1{background:pink;}
	#d2{background:orange;}
	#d3{background:lightblue;}
	#d4{background:lightgreen;}
</style>
```

* 가로 세로 300px의 정사각형 공간 설정 
* d1부터 d4까지 순서대로 pink, orange, lightblue, lightgreen으로 위에서 아래로 div 존재 

### 1. visibility 속성

* 속성값 : **visible, hidden**(숨기더라도 <u>공간을 유지</u>하고 있다.)

```css
#d2{visibility:visible;}
```

* visible로 설정하는 경우, 그대로 존재하지만 hidden으로 변경하는 경우, d2는 비어있지만 공간을 유지하고 있다.

### 2. display 속성

* 속성값 : **block, none**(숨기면 <u>공간을 유지X,</u> 공간을 반납한다.)

```css
#d3{display:none;}
```

* block으로 설정하는 경우, lightblue의 공간을 차지하고 있지만 none으로 설정하면 d3는 아예 존재하지 않는 것처럼 없어진다. 



# position

### 객체의 위치를 설정한다.

* 속성값 : static, relative, absolute, fixed

### 1. static(기본값)

* 일반적으로 정확한 위치를 설정하기 위해서는 position을 left, right, top, bottom을 사용한다.
* 그러나 position을 **static으로 설정**한 경우, 위와 같은 설정을 하더라도 **무시된다.**

### 2. fixed

* **스크롤하더라도** 브라우저 화면의 **특정 부분에 고정**되어 움직이지 않는 객체 설정시 사용
* 배치기준이 viewport(브라우저 전체화면)이기 때문이다. 

### 3. relative

* 요소를 **원래 위치를 기준**으로 상대적(relative)으로 배치해준다.
* 요소를 원래 위치에서 **벗어나게 배치**할 수 있다.

### 4. absolute

* 배치기준이 자신이 아닌 상위요소이다. 
* 부모요소를 기준으로  left, right, top, bottom이 적용되기 때문에 **특정 요소의 display를 absolute로 지정할 경우, 부모 요소의 display는 relative로 설정**한다.
*  앞뒤에 나온 다른 요소와 상호작용을 하지 않는다.



> 예시 css 코드

```css
#d2{position:absolute; left:250px; bottom:100px;}
img{position:fixed; right:100px; top:100px;}
```

* d2의 상위요소는 body이므로 전체화면의 왼쪽에서 250px, 아래에서 100px 떨어진 위치에 위치한다. 이는 다른 d1,d3,d4의 위치와는 관계없다.
* img는 스크롤과 상관없이 항상 화면의 위, 오른쪽에서 100px 떨어진 곳에 위치한다.