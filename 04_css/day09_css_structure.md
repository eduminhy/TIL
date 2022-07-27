# structure

> html 코드

```html
<div id="menu">
	<ul>
		<li>뉴스</li>
		<li>자동차</li>
		<li>경제</li>
		<li>시사</li>
		<li>웹툰</li>
		<li>푸드</li>
		<li>지도</li>
	</ul> 
</div>
```

### 1. n번째 객체 선택(child)

> **first-child : 첫번째 객체**
>
> **last-child : 마지막 객체**

```css
#menu li:first-child{color:red;}
#menu li:last-child{color:lime;}
```

* 첫번째 li인 뉴스의 글이 red로, 마지막 li인 지도의 글이 lime색으로 설정된다.

> **nth-child(2n) : 짝수번째**
>
> **nth-child(2n+1) : 홀수번째**

```css
#menu li:nth-child(2n){background-color:pink;}
#menu li:nth-child(2n+1){background-color:yellow;}
```

* 짝수번째 자동차, 시사, 푸드는 pink의 배경색으로, 홀수번째 뉴스, 경제, 웹툰. 지도는 yellow 배경색으로 설정된다.

> **nth-child(3n) : 3의 배수번째** 

```css
#menu li:nth-child{background-color:lightblue;}
```

* 3의 배수번째인 경제, 푸드는 lightblue 배경색으로 설정된다.



### 2. n번째 객체 선택(type)

> **first-of-type : 첫번째 객체 선택**
>
> **last-of-type : 마지막 객체 선택**
>
> **nth-of-type(2n) : 짝수번째**
>
> **nth-of-type(2n+1) : 홀수번째**
>
> **nth-of-type(3n) : 3의 배수번째**

```css
#menu li:first-of-type{background-color:green;}
#menu li:last-of-type{background-color:red;}
#menu li:nth-of-type(2n){background:yellow;}
```

* 첫번째 li의 배경색 green, 마지막 li의 배경색 red, 짝수번째 배경색 yellow로 설정된다.



### [번외]nth-child와nth-of-type의 차이점은?

<table style="text-align:center">
    <tr style="font-weight:bold">
        <td>nth-child</td>
        <td>nth-of-type</td>
    </tr>
    <tr>
    	<td>지정 태그 <b>외에도 포함</b>하여 순서를 count</td>
    	<td>지정 태그<b>만 포함</b>하여 순서를 count</td>
    </tr>
</table>

> **코드**

```html
<style>
    #menu p:nth-child(3){background-color:orange;}
    #menu p:nth-of-type(3){background-color:lavender;}
</style>

<div id=menu3>
<p>111111</p>
<span>2222222</span>
<p>333333</p>
<span>444444</span>
<p>55555</p>
</div>
```

> **결과**

<table style="text-align:center">
    <tr style="font-weight:bold">
        <td>nth-child(3)</td>
        <td>nth-of-type(3)</td>
    </tr>
    <tr>
    	<td>sapn포함하여 3번째 계산 =>333333</td>
    	<td>sapn포함X 3번째 p 계산 =>55555</td>
    </tr>
</table>

#### 

### 3. n번째 텍스트 스타일

> html 코드

```html
<div id="txt">
n번째 텍스트 스타일을 확인하기 위한 예시용 글입니다.n번째 텍스트 스타일을 확인하기 위한 예시용 글입니다.n번째 텍스트 스타일을 확인하기 위한 예시용 글입니다.n번째 텍스트 스타일을 확인하기 위한 예시용 글입니다.n번째 텍스트 스타일을 확인하기 위한 예시용 글입니다.n번째 텍스트 스타일을 확인하기 위한 예시용 글입니다.n번째 텍스트 스타일을 확인하기 위한 예시용 글입니다.n번째 텍스트 스타일을 확인하기 위한 예시용 글입니다.n번째 텍스트 스타일을 확인하기 위한 예시용 글입니다.n번째 텍스트 스타일을 확인하기 위한 예시용 글입니다.n번째 텍스트 스타일을 확인하기 위한 예시용 글입니다.n번째 텍스트 스타일을 확인하기 위한 예시용 글입니다.
</div>
```

> **first-letter : 첫번재 문자에 대한 스타일**
>
> **first-line : 첫번째 줄에 대한 스타일**

```css
#txt:fist-letter{
    font-size:1.5em; font-weight:bold;
    background:yellow; color:red;
}
```

* 맨 처음의' n'의 스타일이 <span style="font-size:1.5em; font-weight:bold; background:yellow; color:red;">n</span> 로 설정된다.

```css
#txt:first-line{background:#ddd; text-decoration:underline;}
```

* 맨 처음 줄 'n번째 텍스트 스타일을 확인하기 위한 예시용 글입니다.n번째 텍스트 스타일을 확인하기 위한 예시용 글입' 이 다음과 같이 설정된다.

<p style="background:#ddd; text-decoration:underline;">n번째 텍스트 스타일을 확인하기 위한 예시용 글입니다.n번째 텍스트 스타일을 확인하기 위한 예시용 글입</p>

> **selection : 드레그 영역 문자에 대한 스타일**

```css
#txt:selection{color:red; background:#000;}
```

* 'n번째 텍스트 스타일을 확인하기 위한 예시용 글입니다'영역을 드레그하면 다음과 같이 보이게 된다.
* <span style="color:red; background:#000;">n번째 텍스트 스타일을 확인하기 위한 예시용 글입니다</span>