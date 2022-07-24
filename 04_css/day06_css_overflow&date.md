# overflow

* 요소 내의 <u>컨텐츠가 너무 커서</u> 요소 내에 다 보여주기 어려울 때 **어떻게 보여줄지 결정**

<table>
    <tr style="text-align:center">
    	<td><b>속성값</b></td>
        <td><b>내용</b></td>
    </tr>
    <tr>
    	<td style="text-align:center">visible</td>
        <td>기본값, 내용이 넘치면 border 밖으로 보여진다.</td>
    </tr>
    <tr>
    	<td style="text-align:center">hidden</td>
        <td>넘치는 부분은 border에 잘려서 보이지 않는다.</td>
    </tr>
    <tr>
    	<td style="text-align:center">scroll</td>
        <td>스크롤바가 생겨서 모든 내용을 확인할 수 있다.</td>
    </tr>
    <tr>
    	<td style="text-align:center">auto</td>
        <td>필요에따라 스크롤바가 추가될지 말지 자동으로 결정</td>
    </tr>
</table>


# attr - input - date

### 날짜 선택

> **0000년-00월-00일**

```html
<input type="date" name="date1"/>
```

<ul>
    <li><input type="date" name="date1"/></li>
</ul>

> **0000년-00월-00일 오전/오후 00:00**

```html
<input type="datetime-local" name="date2"/>
```

<ul>
    <li><input type="datetime-local" name="date2"/></li>
</ul>

> **0000년-00월**

```html
<input type="month" name="date3"/>
```

<ul>
    <li><input type="month" name="date3"/></li>
</ul>

> **00주, 0000(년도)**

```html
<input type"week" name="date4"/>
```

<ul>
    <li><input type="week" name="date4"/></li>
</ul>



### 색상 선택 

```html
<input type="color" name="color"/>
```

<ul>
    <li><input type="color" name="color"/></li>
</ul>



### 일정 간격의 수 선택

> **숫자로 표현**

```html
<input type="number" name="num" min="0" max="100" step="5" value="10"/>
```

<ul>
    <li><input type="number" name="num" min="0" max="100" step="5" value="10"/></li>
</ul>

* 최솟값=0, 최댓값=100, 간격=5, 처음 설정한 값(value)=10 으로 설정

> **bar 형태로 표현**

```html
<input type="range" name="num2" min="1" max="20" step="2" value="5"/>
```

<ul>
    <li><input type="range" name="num2" min="1" max="20" step="2" value="5"/></li>
</ul>

* 최솟값=1, 최댓값=20, 간격=2, 처음 설정한 값(value)=5로 설정
