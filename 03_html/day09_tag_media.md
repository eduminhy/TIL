# 8.  media Tag

### 1. audio Tag

> 음악 삽입하기

```html
<body>
    <audio src="../audio_video/Kalimba.mp3" controls autoplay loop="2"></audio>
</body>
```

* Kalimba.mp3파일을 무한반복한다.

> 웹 브라우저 제약이 없도록 음악 삽입하기

```html
<audio>
	<source src="../audio_video/Kalimba.mp3" type="audio/mp3"/>
	<source src="../audio_video/Kalimba.ogg" type="audio/ogg"/>
</audio>
```

* 웹 브라우저마다 지원하는 확장자 형식이 달라 실행되지 않을 수 있기 때문에 source 태그를 사용하여 해결한다.
* < source >는 < audio >나 < video> 내부에 입력한다.
* HTML 페이지와 같은 폴더에 확장자가 OGG인 파일을 넣어주어야 한다.
* type 속성을 입력하지 않으면 웹 브라우저가 음악 파일을 다운로드한 후 재생 가능한 파일인지 확인하는 작업이 필요하므로 반드시 지정해야 한다.



### 2. video Tag

> 동영상 삽입하기

```html
<video>
	<source src="../audio_video/Wildlife.mp4" type="video/mp4"/>	
</video>
```

* type으로 확장자명을 설명할 수 있다.

>동영상을 불러오는 동안 다른 이미지 보여주기

```html
<video controls width="500" autoplay poster="../img/cat01.jpg">
	<source src="../audio_video/Wildlife.mp4"/>	
</video>
```

* **poster 속성**을 이용하여 동영상을 불러오는 동안 사용자에게 보여 줄 이미지를 지정할 수 있다(like **썸네일**).
* video 태그는 width, height로 영상 너비와 높이 지정 가능
  * cat01.jpg를 너비 500px로 poster한다.



### 3. 속성 정리

* src : 재생할 미디어 파일 경로지정
* controls : 미디어 파일 컨트롤 바 표시
* autoplay : 자동재생
* loop : 무한반복 지정 (없으면  1번만 재생한다.)
* preload : 전송완료 후 재생

