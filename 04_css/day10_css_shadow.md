# shadow

> html 코드

```html
<body>
<div>
	태조가 수창궁(壽昌宮)에서 왕위에 올랐다. 이보다 먼저 이달 12일에 공양왕(恭讓王)이 장차 태조의 사제(私第)로 거둥하여 술자리를 베풀고 태조와 더불어 동맹(同盟)하려고 하여 의장(儀仗)이 이미 늘어섰는데, 시중(侍中) 배극렴(裵克廉) 등이 왕대비(王大妃)에게 아뢰었다.
	"지금 왕이 혼암(昏暗)하여 임금의 도리를 이미 잃고 인심도 이미 떠나갔으므로, 사직(社稷)과 백성의 주재자(主宰者)가 될 수 없으니 이를 폐하기를 청합니다."
</div>
<div id="d1">
	<div id="txt">글자 그림자</div>
	<div id="box">박스 그림자</div>
</div>
</body>
```



### 1. 글자에 그림자 설정

> text-shadow : (왼,오른쪽)  (위,아래)  (투명)  (색상) ; 

```css
#txt{text-shadow:-5px	-5px	5px		red;}
```



### 2. 박스에 그림자 설정

> box-shadow : (왼,오른쪽)  (위,아래)  (투명)  (색상) ; 

```css
#box{box-shadow:10px 10px 10px #ccc;}
```



### 3. 그라데이션 설정

> http://colorzilla.com/gradient-editor 에서 css복사하여 이용

```css
div:first-child{
	/* Permalink - use to edit and share this gradient:
    https://colorzilla.com/gradient-editor/#fefcea+0,f1da36+100;Gold+3D */
	background: #fefcea; /* Old browsers */
	background: -moz-linear-gradient(top,  #fefcea 0%, #f1da36 100%); 
    /* FF3.6-15 */
	background: -webkit-linear-gradient(top,  #fefcea 0%,#f1da36 100%); 
    /* Chrome10-25,Safari5.1-6 */
	background: linear-gradient(to bottom,  #fefcea 0%,#f1da36 100%); 
    /* W3C, IE10+, FF16+, Chrome26+, Opera12+, Safari7+ */
	filter: progid:DXImageTransform.Microsoft.gradient(
    startColorstr='#fefcea', endColorstr='#f1da36',GradientType=0 ); 
    /* IE6-9 */	
	}
```

* div 첫번째에 위와 같은 설정이 적용된다.