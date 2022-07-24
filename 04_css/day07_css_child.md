# child

> **html 코드**

```html
<body>
	<div id=mainDiv>
		<ul>
			<li>자손선택자, 후손선택자 1</li>
			<li>자손선택자, 후손선택자 2</li>
			<li>자손선택자, 후손선택자 3</li>
			<li>자손선택자, 후손선택자 4
				<h2>반응선택자....</h2>
				</li>
			<li>자손선택자, 후손선택자 5</li>
		</ul>
    </div>
</body>
```



### 1. 자손선택자('>')

```css
<style>
#mainDiv>ul{border:5px solid green;}
</style>
```

* id가 mainDiv인 div태그에서 **바로 아래의** ul태그에 border를 만든다.

### 2. 후손선택자(' ')

```css
<style>
#mainDiv h2{
    border:5px double yellow;
    color:red;
}
</style>
```

* id가 mainDiv인 div태그 안의 모든 h2태그에 border와 글자색을 red로 만든다.

```css
<style>
#mainDiv>ul>li>h2{
    border:5px double yellow;
    color:red;
}
</style>
```

* 후손 선택자는 자손선택자로도 표현이 가능하다. 그러나 코드가 길어진다는 단점이 있다.



### 마우스 상태표시(' : ')

> **응용 코드**

```css
<style>
	#mainDiv ul>li:hover{background-color:pink;}
	#mainDiv li:active{color:blue; font-size:1.2em;}
</style>
```

* **hover ==> 마우스가 올라가면**
  * #mainDiv ul>li에 마우스가 올라가면 그 구간의 배경색이 pink가 된다.
* **active ==> 마우스가 눌리면**
  * #mainDiv의 li에 마우스를 누르면 그 구간의 글자색이 blue가 되고 글자크기가 1.2em이 된다.



### 3. 동위선택자

>  **선택자A + 선택자B**

* 선택자A의 **바로 다음**에 있는 선택자 B를 선택한다.

> **선택자A~선택자B**

* 선택자A <u>다음의 **모든**</u> 선택자B를 선택한다.

> html 코드

```html
<body>
	<div id=testDiv>
		<h1>동위선택자 테스트 1111</h1>
		<h2>동위선택자 테스트 2222</h2>
		<h2>동위선택자 테스트 3333</h2>
		<h2>동위선택자 테스트 4444</h2>
		<h2>동위선택자 테스트 5555</h2>
		<h2>동위선택자 테스트 6666</h2>
		<h3>~~~~~~~~~~~~~~~~~</h3>
		
		<h1>동위선택자 테스트 1111</h1>
		<h2>동위선택자 테스트 2222</h2>
		<h2>동위선택자 테스트 3333</h2>
		<h2>동위선택자 테스트 4444</h2>
		<h2>동위선택자 테스트 5555</h2>
		<h2>동위선택자 테스트 6666</h2>
		<h3>~~~~~~~~~~~~~~~~~</h3>
	</div>
</body>
```

> css 코드

```css
<style>
h1+h2{background-color:lightblue;}
h1~h2{background-color:#ddd;}
</style>
```

* h1+h2
  * h1 바로 다음의 h2이므로 <u>'동위선택자 테스트 2222'만</u> lightblue의 배경색이 생긴다.
* h1~h2
  * h1 다음의 모든 h2이므로 <u>'동위선택자 테스트 2222~6666'까지 모두</u> #ddd로 배경색이 생긴다.

