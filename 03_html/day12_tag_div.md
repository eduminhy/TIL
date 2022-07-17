# div Tag

* Division을 의미하며 레이아웃을 나누는데 주로 사용된다.
* div 태그를 이용하여 가상의 공간을 블록화하고, css와 활용하여 스타일을 적용한다.

> **div 속성**

 <table border="1" width="100%">
    <tr>
    	<td>태그</td>
        <td>속성</td>
        <td>비교</td>
    </tr>
    <tr>
        <td rowspan="7">div 태그</td>
    	<td>style</td>
    	<td>스타일</td>
    </tr>
    <tr>
    	<td>width</td>
        <td>가로 폭</td>
    </tr>
    <tr>
    	<td>height</td>
        <td>세로 높이</td>
    </tr>
    <tr>
    	<td>border</td>
        <td>테두리 굵기</td>
    </tr>
    <tr>
    	<td>float</td>
        <td>정렬</td>
    </tr>
    <tr>
    	<td>margin</td>
        <td>여백/td>
    </tr>
</table>  

> **margin속성**

* document와 border 사이의 간격을 의미한다.  이 영역은 background-color의 영향을 받지 않는다.

* CSS를 사용하면 margin 영역의 크기를 방향별로 따로 설정할 수 있다.

  * margin-top, margin-left, margin-right, margin-bottom

  

> **전체 코드**

```html
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	#d1{
		width:500px; height:500px; background:green;
		margin:200px;
		position:relative;
	}
	#d2{
		width:300px; height:300px; background:yellow;
		position:absolute;
		left:100px; top:100px;
	}
</style>
</head>
<body>
<div id="d1">
	<div id="d2">
	</div>
</div>
</body>
</html>
```

* id가 d1인 div안에 id가 d2인 div를 만들어서 **style태그를 이용하여 각 영역을 설정**해주었다. div 영역을 그냥 두는 것이 아닌 지속적으로 수정해가면서 확인해야 하므로 각각의 <u>id 또는 class를 잘 설정해서 적용해주는 것이 중요</u>하다.
* d1의 경우, 폭과 높이를 모두 500px, 배경생을 초록색으로 지정
* d2의 경우, 폭과 높이를 모두 300px, 배경색을 노란색으로 지정하였다. 
* 이 외의 css관련 태그에 대해서는 css 정리에서 확인하도록 한다.



 