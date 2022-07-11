# 5. table Tag

### 1. 행렬의 수가 같은 테이블 만들기

> **전체 코드**

```html
<body>
<table border="1" width="100%" style="background : yellow">
	<caption><h1 style='color: red'>timetable</h1></caption>
	<colgroup>
		<col style="background:red">
		<col span="2" style="background:orange">
	</colgroup>
	<tr height="50" style="background : #ddd">
		<th width="100">M<br/>O<br/>N</th>
		<th>TUE</th>
		<th>WED</th>
	</tr>
	<tr>
		<td>자바<span style="color:#fff">스크립트</span></td>
		<td><img src="../img/cat02.jpg" width="200"></td>
		<td>자바</td>
	</tr>
	<tr>
		<td>Spring</td>
		<td>Mybatic</td>
		<td  style="background : orange">Mysql</td>
	</tr>	
</table>
</body>
```

> **코드 분석**

```html
<table border="1" width="100%" style="background : yellow">
```

* **border="1" 은 테이블 경계선**(이중선)을 의미한다. 
* width="100%"는 열어놓은 웹 페이지 크기에 맞추어 비율이 조정되는 것을 의미한다.

```html
<caption><h1 style='color: red'>timetable</h1></caption>
```

* **caption은 테이블 제목**을 의미하며 테이블 상단 중앙에 위치한다.

```html
<colgroup>
	<col style="background:red">
	<col span="2" style="background:orange">
</colgroup>
```

* **colgroup은 열그룹**으로 세로줄
* 빨간색 바탕의 세로줄 한 줄 + 주황색 바탕의 세로줄 <u>두 줄(sapn="2")</u>로 총 **세 줄** 생성 

```html
<tr height="50" style="background : #ddd">
	<th width="100">M<br/>O<br/>N</th>
	<th>TUE</th>
	<th>WED</th>
</tr>	
```

* **tr은 행그룹**으로 가로줄이고 **th는 가로칸**을 의미한다. MON과 TUE와 WED 총 **세 칸** 생성
* 세 줄, 세 칸에 맞추어 < tr >을 세 문단 만들어야 한다.

```html
<td>자바<span style="color:#fff">스크립트</span></td>
```

* 자바스크립트 중 스트립트 글자만 #fff 색으로 출력된다. 



### 2. 행렬의 수가 다른 테이블 만들기

> **전체 코드**

```html
<body>
	<table border="1">
		<tr>
			<td>AAAAAAA</td>
			<td>BBBBBBB</td>
			<td colspan="2">CCCCCCC</td>
		</tr>
		<tr>
			<td colspan="2">DDDDDDD</td>
			<td>EEEEEEE</td>
			<td>FFFFFFF</td>
		</tr>	
		<tr>
			<td>GGGGGGG</td>
			<td rowspan="2">HHHHHHH</td>
			<td rowspan="2">IIIIIII</td>
			<td>JJJJJJJ</td>
		</tr>
		<tr>
			<td>KKKKKKK</td>
			<td>LLLLLLL</td>
		</tr>	
	</table>
</body>
```

> **코드 분석**

```html
<td colspan="2">CCCCCCC</td>
<td rowspan="2">HHHHHHH</td>
```

* 2칸을 합쳐서 CCCCCCC를 넣는다. 
* 2줄을 합쳐서 HHHHHHH를 넣는다.
* **colspan : 칸을 합친다.**
* **rowspan : 줄을 합친다.**

> **실행결과**

<table border="1">
		<tr>
			<td>AAAAAAA</td>
			<td>BBBBBBB</td>
			<td colspan="2">CCCCCCC</td>
		</tr>
		<tr>
			<td colspan="2">DDDDDDD</td>
			<td>EEEEEEE</td>
			<td>FFFFFFF</td>
		</tr>	
		<tr>
			<td>GGGGGGG</td>
			<td rowspan="2">HHHHHHH</td>
			<td rowspan="2">IIIIIII</td>
			<td>JJJJJJJ</td>
		</tr>
		<tr>
			<td>KKKKKKK</td>
			<td>LLLLLLL</td>
		</tr>	
	</table>
