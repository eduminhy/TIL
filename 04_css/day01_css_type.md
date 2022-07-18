# CSS 적용하는 방법

## 1. inline CSS

* 태그에 직접 스타일 적용
* < strong > 예시

```html
<body>
인앱결제강제금지법은 구글, 애플 등 거대 앱마켓 사업자들이 앱개발사 등을 대상으로 높은 수수료율이 적용되는 인앱결제를 의무화하려는 움직임을 보이자 <strong>'특정결제 방식을 강제하는 행위'</strong>를 금지하는 것을 골자로 한다.
</body>
```



## 2. internal CSS

* < style >태그를 이용하여 스타일시트를 모아놓는다.

> **태그 선택자 : tag_name{}**

```html
<style>
	/*태그선택자*/
	span, strong{
		color:#00f; /* #0000ff*/
		font-weight: 700; /*100,200,300,400,500,600,700*/
		font-size : 30px;
	}
</style>
```

* < body >태그에 존재하는 span, strong 태그에 적용
  * 글자색 #00f(blue)
  * 글자 굵기 700	
  * 글자 크기 30px

> **아이디 선택자 : #id_name{}**

```html
<style>
	/*아이디선택자*/
	#txt{
		background:#ddd;/* #dddddd*/
 	}
</style>
```

* 특정 태그에 id를 지정하여 그 id의 스타일을 적용하고자 할 때, 넘버사인(#)을 포함하여 id를 지정한다.
  * id가 txt인 태그에 배경색  #ddd(lightgray)

> **클래스 선택자 : .class_name{}**

```html
<style>
	/*클래스선택자*/
 	.a{
 		background:#8a3; color:#fff; font-size:50px; /* #88aa33*/
 	}
</style>
```

* 특정 태그에 class를 지정하여 그 class의 스타일을 적용하고자 할 때,  (.)을 포함하여 class를 지정한다.
  * class가 a인 태그에 지정
  * 배경색 #8a3
  * 글자색 #fff(하얀색)
  * 글자 크기 50px



## 3. external CSS

* html 파일 외부에 .css파일을 작성하고 link를 적용하는 방식

* ```html
  <link rel="stylesheet" href="style.css" type="text/css"/>
  ```

* 외부스타일시트, 스타일시트코드만 있는 파일이 존재한다.

> **외부 .css파일 : style.css**

```css
@charset "UTF-8";
body{
	color:#0f0;
	font-size:20px;
	background:#ddd;
	margin:0px;	
}
h1{
	color:orange;
}
/* a태그의 상태에 따른 스타일시트 적용하기
	text-decoration : linethrough:취소선, underline:밑줄, overline:윗줄, none:선없음 
*/
a:link, a:visited{ color:green; text-decoration:none; font-weight:bold; font-size:30px; }/* 링크상태일 때, 방문했을 때 */
a:hover{ color:red; text-decoration:underline; font-weight:normal; font-size:20px; }/* 마우스 오버시 */
a:active{ color:blue; }/* 마우스를 누른 상태일 때 */
```

* body 태그에 (color:#0f0; font-size:20px; background:#ddd; margin:0px;)적용
* h1 태그에 color:orange; 적용
* <u>a태그는 상태</u>에 따라서 다르게 적용
  *  **a:link, a:visited{} --> 링크, 방문상태일 때** 
  * **a:hover{} --> 마우스오버일 때**
  * **a:active{} --> 마우스를 누른 상태일 때** 

<table style="text-align:center">
    <tr>
    	<td colspan="2">a태그 text-decoration</td>
    </tr>
    <tr>
    	<td>linethrough</td>
        <td>취소선</td>
    </tr>
    <tr>
    	<td>underline</td>
        <td>밑줄</td>
    </tr> 
     <tr>
    	<td>overline</td>
        <td>윗줄</td>
    </tr> 
     <tr>
    	<td>none</td>
        <td>선없음</td>
    </tr>       
</table>



> **적용한 html파일**

```html
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="style.css" type="text/css"/>
</head>
<body>
<img src="../img/cat01.jpg"/>
<h1>외부파일로 스타일시트 적용하기</h1>
<p>
삼성전자가 올해 2분기에 역대 두 번째로 많은 77조원의 매출을 올렸다.러시아-우크라이나 사태 장기화와 인플레이션(물가상승), 경기둔화에 따른 수요 위축 등 갖은 대내외 악재 속에서도 비교적 선방한 것이다. 삼성전자는 7일 2분기 연결기준 잠정실적을 집계한 결과 매출 77조원, 영업이익 14조원을 기록했다고 발표했다. 지난해 2분기 대비 매출은 20.94%, 영업이익은 11.38% 각각 증가했다.
매출의 경우 역대 최고치였던 1분기(77조7천800억원)보다는 1% 감소했으나, 2분기 기준으로는 가장 많다. 영업이익은 1분기(14조1천200억원)보다 0.85% 감소했고, 2분기 기준으로는 역대 세번째로 많다.
</p>
<ul>
	<li><a href="https://www.nate.com">네이트</a></li>
	<li><a href="https://www.naver.com">네이버</a></li>
	<li><a href="https://www.daum.net">다음</a></li>
</ul>
</body>
</html>
```



#### CSS 적용순서 : Inline CSS > External CSS = Internal CSS

<table>
    <tr>
    	<td>Internal적용</td>
        <td>External적용</td>
    </tr>
    <tr>
    	<td>
            head => link => style 순
        </td>
        <td>
			head => style => link 순
        </td>
    </tr>
</table>