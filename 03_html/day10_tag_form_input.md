# 9. form Tag > Input

#### 입력양식 : 사용자에게 정보를 입력받는 요소



> **입력 양식 개요**

```html
<form action="전송위치" method="전송방식">
    form 태그는  method 속겅의 방식으로 action 속성 장소에 데이터를 전달한다.
</form>
```

* **action**  : 전달방식

* **method** : 데이터를 전달하는 목적지

  * **get** : 주소에 데이터를 **직접 입력**하여 전달

  ```html
  <!-- get 전송방식 -->
  <body>
      <form method="get">
          <input type="text" name="search"/>
          <input type="submit"/>
      </form>
  </body>
  ```

  * **post** : **별도**의 방법을 사용해 데이터를 해당 주소로 전달

  ```html
  <!-- post 전송방식 -->
  <body>
      <form method="post">
          <input type="text" name="search"/>
          <input type="submit"/>
      </form>
  </body>
  ```

  * <u>형성된 결과물은 동일</u>, 주소를 들어내는데에만 차이가 존재함.



> **입력 양식(type) 종류**

##### 	<사용자가 입력하는 type>

1. **text** : 글자입력양식 생성

```html
<input type="text" name="userid" value="eduminhy"/>
```

2. **password** : 비밀번호 입력양식 생성

```html
<input type="password" name="userpwd" value="password"/>
```

3. **checkbox** : 체크박스 생성

```html
<input type="checkbox" name="checkbox"/>
```

4. **file** : 파일첨부

```html
<input type="file" name="filename"/>
```

5. **radio** : 라디오버튼 생성

```html
<input type="radio" name="maintopic"/>
```



##### <보이지 않는 입력양식>

6. **hidden** : 해당 내용을 표시하지 않는다.

```html
<input type="hidden" name="hidden"/>
```



##### < Button> 

##### ===>'등록'이라는 버튼 생성하는 방법

7. **button** : 버튼 생성 (특정경로 연결 시, <u>이벤트 입력필요</u>)

```html
<input type="button" value="등록"/>
```

8. **submit** : 버튼 생성(경로 연결시, <u>이벤트 입력할 필요X</u>)

```html
<input type="submit" value="등록"/>
```

##### ===>'Image'로 버튼 생성하는 방법

9. **image** : 이미지 형태의 버튼 생성

```html
<input type="image" src = "../img/cat01.jpg"/>
```

##### ===> 초기화 버튼 생성하는 방법

10. **reset** : 초기화 버튼 생성

```html
<input type="reset" value="다시쓰기"/>
```



11. cols/rows : 여러줄의 문장

```html
<textarea rows="number" cols="number">들어갈 내용</textarea>
```

* rows는 높이, cols는 너비를 지정한다.



> **응용코드 1) 로그인 형태**

```html
<form method="post" action="write.jsp">
	<input type="hidden" name="reNo" value="456789"/>
	<ul>
		<li>아이디 : <input type="text" name="userid" size="50" value="goguma" maxlength="10" 
                           placeholder="아이디를 입력하세요" required/></li>
		<li>비밀번호 : <input type="password" name="userpwd" placeholder="비밀번호를 입력하세요"/></li>
		<li>파일첨부 : <input type ="file" name="filename"/></li>
		<li>취미선택<br/>
            <input type="checkbox", name="hobby" value="등산"/> 등산
			<input type="checkbox", name="hobby" value="쇼핑"/checked> 쇼핑
			<input type="checkbox", name="hobby" value="게임"/> 게임
			<input type="checkbox", name="hobby" value="싸이클"/ checked> 싸이클
		</li>
		<li>라디오버튼<br/>
            <input type="radio" name="gender" value="M"/> 남 
			<input type="radio" name="gender" value="F"/> 여 
		</li>
		<li>
			세부사항입력<br/>
            <textarea name="intro" cols="50" rows="5">ddddddd</textarea>
		</li>
    </ul>
</form>
```

* post방법으로 write.jsp에 정보를 전달하도록 form되어있다.

* 456789의 내용을 담고 있지만 hidden으로 보이지 않도록 설정했다.

* ul태그를 이용하여 순서없는 목록을 만들었다. 또한 각 타이틀에 맞추어 li 태그로 나누었다.

  1. **아이디**를 입력하는 곳

  * type이 text형식으로 size를 이용하여 글자가 50개 들어가는 크기로 지정하고 maxlength로 최대 10글자가 들어가도록 했다.  
  * value의 값을 goguma로 설정하여 직접 입력하지 않아도 값을 저장해놓은 상태이다.
  * placeholder는 form에 입력되어있지 않을 때 무엇을 넣는지 이해할 수 있도록 설명해주는 속성으로 "아이디를 입력하세요"를 보이도록 설정해놓았다.

  2. **비밀번호**를 입력하는 곳 

  * 비밀번호의 경우, 기본적으로 내용이 보이지 않도록 설정되어있다. 

  3. **체크박스**

  * 취미를 선택할 수 있도록 체크박스 설정. 
  * 각각의 취미를 value값에 넣은 것은 이해를 위해서일 뿐 실제로 출력되는 부분은 < input />**<u>출력</u>**이다.

  4. **라디오버튼**

  * 성을 선택할 수 있도록 라디오 버튼 설정