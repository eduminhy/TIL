# state

### 상태선택자

> html 코드

```html
<body>
<div id="memFrm" method="post" action="aaa.jsp">
	<form>
		<ul>
			<li>아이디</li>
			<li><input type="text" name="userid" value="gkdtkdmina" id="userid" readonly/></li>
			<li>이름</li>
			<li><input type="text" name="username" id="username" disabled/></li>
			<li>취미</li>
			<li>
				<input type="checkbox" name="hobby" value="등산"/>등산
				<input type="checkbox" name="hobby" value="걷기"/>걷기
				<input type="checkbox" name="hobby" value="달리기"/>달리기
				<input type="checkbox" name="hobby" value="놀기"/>놀기		
			</li>	
		</ul>
	</form>
</div>
</body>
```



> **focus : 커서가 컴퍼넌트에 들어가면**

```css
#userid:focus{background-color:pink;}
input:focus{color:green; font-size:1.2em;}
```

> **checked : 체크박스가 선택된 경우**

```css
input[type=checkbox]:checked{width:50px; height:50px;}
```

* 체크박스가 선택되면 가로세로 50px의 크기가 된다.

> **readonly : 클릭O, 입력X**
>
> **disabled : 클릭X, 입력X(비활성화)**

```html
<li><input type="text" name="userid" value="gkdtkdmina" id="userid" readonly/></li>
```

```css
input:disabled{background-image:../img/cat05.jpg;}
```

* <u>표현방식의 차이가 존재</u>하므로 주의해야 한다.

> **enabled : 활성화된 컴퍼넌트에 적용**

```css
input:enabled{font-size:1.5em;}
```

