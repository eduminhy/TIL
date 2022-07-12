# 6. iframe Tag

### 웹 페이지에 다른 웹페이지 넣기

```html
<body>
<h1>iframe tag</h1>
<iframe src="https://www.nate.com/" width="1300" height="300" frameborder="0"></iframe>
<img src="../img/cat03.jpg" height="300">
<iframe src="tag03_a_map.html" width="750" height="700" frameborder="0" scrolling="no"></iframe>
</body>
```

* iframe의 **src 속성**에 넣고자 하는 다른 웹페이지 **url을 입력**하고 width와 height속성을 통해 크기를 결정할 수 있다. 
* **frameborder는 구분선**을 의미하며 1이면 구분선이 있고 0이면 구분선이 없어진다.
* **scrolling은 스크롤바**를 의미하며 보일 땐 yes, 안보일 땐 no을 속성값으로 입력하면 된다.

```html
<iframe scr="URL">대체내용</iframe>
```

* iframe 태그를 지원하지 않는 브라우저를 위해 '대체내용'을 넣어주는 것이 좋다.

