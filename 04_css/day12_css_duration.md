# duration

> html 코드

```html
<body>
<input type="checkbox" id="chk"/>클릭
<div><img src="../img/cat04.jpg"/></div>
</body>
```



### checkbox를 체크하면 div 컨텐츠를 안보이게 설정하기

> 기본 설정

```css
div{
	border:1px solid gray;
	width:500px; height:500px;
    overflow:hidden;
} 
div>img{width:100%; height:400px;}
```



> checkbox를 체크하면 ==> input[type=checkbox]:checked ==> #chk:**checked** 
>
> **추가로 div에 설정**을 적용하고자 한다면 "**+div**"를 추가한다.

```css
#chk:checked +div{height:0px; width:0px; opacity:0;}
```

* 체크되면 div의 <u>폭, 높이, 투명도 모두 0</u>이 되도록 한다. => **안보인다.**

> **transition-duration** : 객체의 **움직임 속도** 설정

```css
div{transition-duration:2s; opacity:1;}
```

* 체크박스로 체크 및 해제시, 2초동안 없어지고 나타나고를 실행한다.