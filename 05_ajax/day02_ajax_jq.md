# ajax란?

#### **[예제1 : jquery에서 ajax처리하기-text]**

> **abcd.txt 코드**

```html
<img src="/webApp/img/cat07.jpg" width='200'/><br/>
<h2>AJAX란</h2> JavaScript의 라이브러리중 하나이며 <i>Asynchronous Javascript And Xml
(비동기식 자바스크립트와 xml)</i>의 약자이다. 브라우저가 가지고있는 <b>XMLHttpRequest</b> 객체를 
이용해서 전체 페이지를 새로 고치지 않고도 페이지의 일부만을 위한 데이터를 로드하는 기법 이며 
JavaScript를 사용한 비동기 통신, 클라이언트와 서버간에 XML 데이터를 주고받는 기술이다.
즉, 쉽게 말하자면 자바스크립트를 통해서 서버에 데이터를 요청하는 것이다.
```

> **jquery 코드**

```css
<script>
	$(function(){
		$("#result>button").click(function(){
			$("#result").load('abcd.txt');
		});
	});
</script>
```

```html
<body>
<h1>jquery에서 ajax 처리(text)</h1>
<div id="result" style="background:#ddd;">
	<button>클릭하시면 비동기식으로 text파일의 내용을 가져옴.</button>
</div>
</body>
```

* $("#id_name").**load**('file_name');을 통해 서버에서 파일의 내용을 가져온다.
* 결과적으로 파일에 지정한 css 특성을 가지고 내용을 가져온다.



#### **[예제2 : jquery에서 ajax처리하기-json]**

> **ajax_data.json 코드**

```json
{
	"rank":[
			{"name":"손흥민","local":"영국"},
			{"name":"김연아","local":"서울"},
			{"name":"박항서","local":"베트남"},
			{"name":"추신수","local":"미국"},
			{"name":"현정화","local":"부산"},
			{"name":"박태환","local":"인천"}
			]
}
```

> **jquery 코드**

```html
<body>
<button id="ajaxBtn">클릭하면 비동기식으로 서버에서 json데이터 가져옴</button>
<div id="result"></div>
</body>
```

```css
<script>
	$(function(){
		$("#ajaxBtn").on('click',function(){
			$.ajax({
				url:'ajax_data.json',
				dataType:'json',
				success:function(result){
					console.log(result);
					$("#result").append("<ol>");
					$.each(result.rank,function(idx, data){
						// <li>손흥민 : 영국</li> 형태
						$("#result>ol").append("<li>"+data.name+":"+data.local+"</li>");
					});
					$("#result").append("</ol>");
				},
				error:function(request, status, error){
					console.log("전송실패...");
					console.log("request.code=",request.code);
					console.log("error Message=",request.responseText);
					console.log("error=",error);
				}
			});
		});
	});
</script>
```



> **코드 분석**

```css
$.ajax({
		url:'ajax_data.json',
		dataType:'json',
		success:function(result){},
		error:function(request, status, error){}
});
```

* 서버에서 ajax_data.json 파일의 데이터 가져오기 

* **success =>서버에서 정상전송을 받았을 때** 

  * function(result) 실행=>괄호 안 변수는 마음대로 정해도 된다.

  ```css
  success:function(result){
  	$("#result").append("<ol>");
  	$.each(result.rank,function(idx, data){	
  		$("#result>ol").append("<li>"+data.name+":"+data.local+"</li>");
  	});
  	$("#result").append("</ol>");
  }
  ```

  * each () : 파일의 내용을 배열로 반복문 돌리기 => **< li>손흥민 : 영국< /li>** 형태
  * result.rank => json파일의 rank부분을 result로 가져온다.
  * function(idx, data) => data는 json파일의 rank의 내용을 배열의 index로 가져온다.

* **error=>서버에서 전송을 받지 못했을 때**

  * function(request, status, error) 실행=>괄호 안의 변수는 생략해도 된다.

  ```css
  error:function(){
  	console.log("전송실패...");
  	console.log("request.code=",request.code);
  	console.log("error Message=",request.responseText);
  	console.log("error=",error);
  }
  ```

  * 실패한 경우 콘솔에 내용을 출력한다.



#### **[예제3 : jquery에서 ajax처리하기-xml]**

> **ajax_data.xml 코드**

```xml
<?xml version="1.0" encoding="UTF-8"?>
<jusorok>
	<row>
		<username>홍길동</username>
		<tel>010-1234-5678</tel>
		<addr>서울시 강남구</addr>
	</row>
	<row>
		<username>황길동</username>
		<tel>010-7894-5612</tel>
		<addr>서울시 영등포구</addr>
	</row>
	<row>
		<username>김길동</username>
		<tel>010-9124-1502</tel>
		<addr>서울시 강서구</addr>
	</row>
	<row>
		<username>이길동</username>
		<tel>010-5032-4069</tel>
		<addr>서울시 마포구</addr>
	</row>
	<row>
		<username>박길동</username>
		<tel>010-7034-6464</tel>
		<addr>서울시 송파구</addr>
	</row>
</jusorok>
```

> **jquery 코드**

```html
<body>
<div class="container">
	<button id="ajaxXml">ajax 실행(xml정보 가져오기)</button>
	<table id="memList" width='700' border="1"></table>
	<hr/>
</div>
</body>
```

```css
<script>
	$(function(){
		$("#ajaxXml").click(function(){
			$.ajax({
				url : 'ajax_data.xml',
				dataType : 'xml',
				success:function(result){
					if($(result).find('row').length>0){
						$(result).find('row').each(function(idx, row){
							var name = $(this).find('username').text();
							var tel = $(this).find('tel').text();
							var addr = $(this).find('addr').text();
							
							var tag="<tr><td>"+name+"</td><td>"+tel+"</td><td>"+addr+"</td></tr>";
							$("#memList").append(tag);
						});
					}
				},error:function(){
					console.log("가져오기 실패...");
				}
			});
		});
	});
</script>
```



> **코드분석**

```css
$.ajax({
	url : 'ajax_data.xml',
	dataType : 'xml',
	success:function(result){
        if($(result).find('row').length>0){}
    },error:function(){
		console.log("가져오기 실패...");
	}
});
```

* xml 파일의 내용을 가져오는 것은 json 파일 때와 동일 : url엔 파일명을, dataType엔 파일형을 입력한다.

* error인 경우에는 콘솔에 "가져오기 실패..."가 출력한다.

* success인 경우에는 ajax_data.xml 파일의 < row >의 길이가 0보다 클 때, 즉 < row >의 레코드가 있으면 다음이 실행된다.

  ```css
  if($(result).find('row').length>0){
  	$(result).find('row').each(function(idx, row){
  		var name = $(this).find('username').text();
  		var tel = $(this).find('tel').text();
  		var addr = $(this).find('addr').text();
  					
  		var tag="<tr><td>"+name+"</td><td>"+tel+"</td><td>"+addr+"</td></tr>";
  		$("#memList").append(tag);
  	});
  }
  ```

  * 마찬가지로 row의 내용을 each()를 이용하여 배열형태로 반복실행을 한다. 
  * 출력에대한 tag를 편하게 하기 위해 변수선언을 먼저 해주었다. 
    * var name = $(**this**).find('**username**').text();
    * **this => row** 를 의미
    * <u>xml파일의 row의 username을 가져오는 것</u>으로 **find('변수')에 반드시 동일한 변수** <u>username을 선언</u>해야 한다.
  * tag 변수를 만들어서 id=memList인 table 형태로 출력한다.



> **응용 : bootstrap**
>
> bootstrap v.4.6 으로 테이블 다양한 형태로 만들기
>
> https://getbootstrap.com/docs/4.6/getting-started/introduction/

```css
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">

<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.min.js" integrity="sha384-VHvPCCyXqtD5DqJeNxl2dtTyhF78xXNXdkwX1CZeRusQfRKp+tA7hAShOK/B/fQ2" crossorigin="anonymous"></script>
```

```html
<table id="memList"class="table table-dark"></table>
```

* 위의 태그를 추가하고 body의 table에 class를 "class="table table-dark"로 선언해주면 저장되어 있는 다른 형태의 테이블로 출력된다.