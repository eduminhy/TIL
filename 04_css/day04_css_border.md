# border

> border-style : 선의 모양

* **solid:실선**
* dotted:점선
* dashed, double:이중선
* **none:선없음** 
* groove:홈이 파인것
* inset:블록
* border-left-style, border-right-style, border-top-style, border-bottom-style 처럼 특정 위치의 선의 모양만 다르게 설정이 가능하다.

> border-color : 선 색

* rgb 코드, 컬러명으로 지정

> border-width : 선의 두께(px)

* border-left-width, border-right-width, border-top-width, border-bottom-width 처럼 특정 위치의 선의 두께만 다르게 설정이 가능하다.

### border의 그룹화

```html
<style>
	li{
		border-style:solid;
		border-width:5px;
		border-color:green;
	}
</style>
```

* 위의 나열한 border 스타일들을 다음과 같이 한 줄로 그룹화를 할 수 있다.

```html
<style>
	li{border: solid 5px green;}
</style>
```

