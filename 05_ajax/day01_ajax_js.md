# ajax란?

> ajax : Asynchronous JavaScript and XML

* 자바스크립트를 이용해서 **비동기식**을 **XML을 이용**하여 **웹서버와 통신**하는 방식
  * 비동기식이란 ? <u>서버와 통신하는 동안 다른 작업을 할 수 있다</u>는 의미
  * 웹 페이지의 <u>일부만 갱신</u>가능
  * 서버와 <u>다양한 형태의 Data</u>를 주고받을 수 있다. (사용 빈도 JSON >> XML)

> **ajax 동작원리**

1. 사용자에 의한 Data 요청 **이벤트** 발생
2.  자바스크립트 호출
3. 자바스크립트가 **XMLHttpRequest라는 객체를 구현**하여 서버로 요청
4. **서버가** XMLHttpRequest라는 객체를 받고 **ajax 처리**



#### **[예제1 : javascript에서 ajax처리하기]**

> **abcd.txt 코드**

```html
<img src="/webApp/img/cat07.jpg" width='200'/><br/>
<h2>AJAX란</h2> JavaScript의 라이브러리중 하나이며 <i>Asynchronous Javascript And Xml
(비동기식 자바스크립트와 xml)</i>의 약자이다. 브라우저가 가지고있는 <b>XMLHttpRequest</b> 객체를 
이용해서 전체 페이지를 새로 고치지 않고도 페이지의 일부만을 위한 데이터를 로드하는 기법 이며 
JavaScript를 사용한 비동기 통신, 클라이언트와 서버간에 XML 데이터를 주고받는 기술이다.
즉, 쉽게 말하자면 자바스크립트를 통해서 서버에 데이터를 요청하는 것이다.
```

> **html 코드**

```html
<body onload="loadDom()">
<h1>자바스크립트를 이용한 ajax 테스트</h1>
<button onclick="loadDom()">클릭하면 서버에서 데이터를 비동기식으로 가져옴</button>
<div id="ajaxResult" style="border:1px solid gray; height:200px;"></div>
</body>
```

> **javascript 코드**

```css
<script>
		function loadDom(){
		// 1. 객체생성
		var xHttp = new XMLHttpRequest();
		// 2. 서버에서 데이터가 넘어오면 전송받을 기능 구현
		xHttp.onreadystatechange = function(){
			console.log(this.responseText);
			if(this.readyState==4 && this.status==200){//정상처리됨
				document.getElementById("ajaxResult").innerHTML = this.responseText;
			}else{//전송실패
				document.getElementById("ajaxResult").innerHTML = "서버에서 정보를 가져오지 못하였습니다.";
			}
		}
		// 3. 객체열기
		xHttp.open('GET','abcd.txt',true);
		// 4. 객체를 보냄
		xHttp.send();
	}
</script>
```



> **코드분석**

* **비동기식**으로 서버에 접속하여 abcd.txt 파일의 정보를 전송받아 ajaxResult에 내용을 변경한다.

* 객체생성>기능구현>객체열기>객체전송 순으로 이루어진다.

  1. **객체 생성** : 웹서버와 통신하는 객체를 생성한다.

  ```css
  var xHttp = new XMLHttpRequest();
  ```

  * XMLHttpRequest : ajax 처리를 하는 자바스크립트 내장 객체

  2. **기능 구현**

  ```css
  xHttp.onreadystatechange = function(){
      console.log(this.responseText);
  	if(this.readyState==4 && this.status==200){//정상처리됨
  		document.getElementById("ajaxResult").innerHTML = this.responseText;
  	}else{//전송실패
  		document.getElementById("ajaxResult").innerHTML = "서버에서 정보를 가져오지 못하였습니다.";
  	}
  }
  ```

  * 서버에서 정보가 오면 이벤트에 의해서 실행되는 함수를 **xHttp.onreadystatechange**로 정의한다.
  * 처리결과(readyState)가 요청이완료(4)되고, 정상처리(status==200)된다면 실행결과를 responseText에 넣어라.
  * 이외에는 전송이 실패한 것이므로 "서버에서 정보를 가져오지 못하였습니다"를 출력한다.

  <hr/>

  * **[전송결과를 확인하는 변수 종류]**
    *  **readyState** : XMLHttpRequest의 처리결과를 가지고 있다.
      * **0 :** 초기화실패, **1 :** 서버연결, **2 :** 요청접수됨, **3 :** 처리요청, **4 :** 요청이완료됨
    * **status** : 요청처리상태 번호를 반환한다.
      * **200 :** 정상처리, **403 :** 금지된 것 접속, **404 :** 찾을 수 없음
    * **statusText** : 'OK', 'Not Found'
    * **reponseText** :  실행결과 값을 서버에서 전송받은 내용이 있는 변수에 넣는다.

  <hr/>

  3. **객체열기**

  ```css
  xHttp.open('GET','abcd.txt',true);
  ```

  * xHttp.open(<u>전송방식</u>,가져올 데이터 <u>파일명</u>,<u>동기방식</u>선택)
  * 동기식은 false, 비동기식은 true 를 입력한다.

  4. **객체전송** : 실제서버에 접속하여 서버에 정보를 요청한다.

  ```css
  xHttp.send();
  ```

  