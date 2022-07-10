# 4. 목록태그

### 1. ol : 순서가 있는 목록 태그

```html
<body>
    <h1>내가 좋아하는 꽃 이름은?</h1>
    <ol type="1">
        <li><b>해바라기</b></li>
        <li>맨드라미</li>
        <li>코스모스</li>
        <li>히야신스</li>
            <ol> <!-- 목록 안에 목록을 또 만들 수 있다. -->
            <li>수국</li>
            <li>스트롱 아나벨리</li>
            </ol>
        <li>안개꽃</li>
    </ol>
</body>
```

* < ol >의 순서를 나타내는 방법은 type 속성을 통해 결정할  수 있다 . 
* **type의 속성값 : 1(숫자),  a(소문자),  A(대문자),  i(소문자 로마자),  I(대문자 로마자)**
* 목록의 요소는 < li > 태그를 이용하여 표현하며 목록 안에 목록을 또 만들 수 있다.

> **실행 결과**

<img src="../../img/ol.JPG" align="left" height="200px">

### 2. ul : 순서가 없는 목록 태그

```html
<boody>
    <ul type="circle">
        <li>HTML</li>
        <li>CSS</li>
            <ul type="square">
                <li>ajax</li>
                <li>ajax</li>
            </ul>
        <li>자바스크립트</li>
        <li>Spring</li>
        <li><img src="../img/cat01.jpg" width="200"></li>
    </ul>
</boody>
```

* < ul >도 목록의 요소를 나타내는 태그는 < li >로 동일하다. 목록을 나타내는 속성값을 나타내지 않았을 때 자동으로 disk(안이 채워진 원) type으로 출력된다. 
* **type 속성값 : disk(안이 채워진 원),  circle(안이 비어있는 원),  square(안이 채워진 사각형)**
* 목록 안에 목록을 만들 수 있다. 

> **실행 결과**

<img src="../../img/ul.JPG" align="left" height="100"/>

### 3. dl : 순서가 없고 표시도 없는 목록 태그

```html
<body>
    <dl>
        <dt>html</dt>
        <dd>hyper text markup language</dd>
        <dt>html</dt>
        <dd>hyper text markup language</dd>
        <dt>html</dt>
        <dd>hyper text markup language</dd>
    </dl>
</body>
```

* 목록 안에 목록을 만들 수 있다. 그러나 < li >가 아니라 < dt >(정의목록)와 < dd >(정의글자)를 이용하여 가능하다. 
* 간단하게 **dl>dt>dd 순**이라고 생각하면 된다.
