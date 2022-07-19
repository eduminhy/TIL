# background

### 1. 배경에 **색상 설정**

```css
<style>
	body{background-color:rgb(100,250,120);}
</style>
```

* 컬러명을  **RGB코드**로 설정(그림판으로 색상 확인 후 넣는 것이 좋다.)



### 2. 배경에 **이미지 설정**

> **한 화면에 이미지 넣기 : background-image**

```css
<style>
	body{background-image:url(../img/chick.jpg);}
</style>
```

* 입력 형태 : background-image:url(이미지 경로);
* 해당하는 이미지의 크기를 적용하여 한 화면에 여러개가 들어간 형태로 출력된다.

> **이미지 반복 : background-repeat**

```css
<style>
	body{
		background-image:url(../img/chick.jpg);
		background-repeat:no-repeat;
	}
</style>
```

* 이미지 **하나만 출력**하기 위해서는 **background-repeat을 no-repea**t으로 설정하면 된다.
* **가로반복 : repeat-x** 
* **세로반복 : repeat-y**

> **이미지 위치 지정 : backgroumd-position**

```css
<style>
	body{
		background-image:url(../img/chick.jpg);
		background-repeat:no-repeat;
		background-position:100px 200px;
	}
</style>
```

* 이미지를 가로(왼) 100px, 세로(위) 200px의 위치에 놓는다. 만약 반복을 한다면 지정 위치를 시작위치로 두고 반복으로 이미지가 출력된다.
* **left, center, right, top, middle, bottom, 백분율**으로 위치를 지정할 수 있다.

> **이미지의 스크롤여부 : background-attachment**

```css
<style>
	body{
		background-image:url(../img/chick.jpg);
		background-repeat:no-repeat;
		background-position:100px 200px;
		background-attachment:fixed;
	}
</style>
```

* background-attachment를 fixed로 고정하여 스크롤하여도 이미지가 움직이지 않는다.

* background-attachment 종류

  * scroll : 내용을 스크롤하면 배경이미지는 스크롤X
  * fixed : 움직이지X
  * local : 내용을 스트롤하면 배경이미지도 스트롤O

  

#### < 스타일시트 속성의 그룹화 >

```css
background:url(../img/chick.jpg) no-repeat fixed 100px 200px;
```

* 위에서 한 모든 내용을 **<u>하나로 그룹화</u>**하여 코드 내용을 줄일 수 있다. 

* 그러나 size조절은 따로 지정해주어야 한다.

  > **이미지 크기 조절 : background-size**
  >
  > **이미지 투명도 조절 : opacity**

  ```css
  <style>
  	body{
  		background:url(../img/chick.jpg) no-repeat fixed 100px 200px;
  		background-size:300px 300px;
          opacity:0.5;
  	}
  </style>
  ```

  * background-size를 통해 이미지 크기를 조정할 수 있다.
  * opacity의 경우 0~1 사이의 값을 입력해야 한다.
