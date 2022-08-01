# Ajax_RSS

### RSS란?

* 웹사이트에 신규로 등록되는 <u>최신 콘텐츠에 대한 요약된 정보</u>를 빠르게 제공하기 위한 포맷
* 직접 사이트를 방문하지 않아도 자동으로 자료가 업데이트가 되어서 쉽게 콘텐츠 확인가능 
* 블로그, 뉴스, 칼럼 등 업데이트가 잦은 콘텐츠에 사용



### [예제 : 신문사 rss를 이용하기]

> **조선일보 RSS**

* [조선일보 rss](https://www.chosun.com/arc/outboundfeeds/rss/?outputType=xml)에서 xml 복사 => newsRss.xml파일을 만들어서 사용

```
<item>
	<title>
	<![CDATA[]]>
	</title>	
	<link></link>
	<dc:creator>
		<![CDATA[홍길동 기자]]>
	</dc:creator>
	<description/>
	<pubDate>Tue, 19 Jul 2022 00:57:29 +0000</pubDate>
	<content:encoded>
	<![CDATA[ ]]>
	</content:encoded>
</item>
```

> **jquery 코드**

```html
<body>
<div class="container">
	<button id="newsRss">뉴스 가져오기</button>
	<div id="news">
		<ol></ol>
	</div>
</div>
</body>
```

> **News 가져오는 코드**

```html
<script>
	$("#newsRss").click(function(){
     	$.ajax({
        	url:'newsRss.xml',
            dataType:'xml',
            success:function(result){
        	},error:function(){
                console.log("오류발생!")
            }
    	});                   
 	});
</script>
```

> **success(서버에서 정상적으로 전송을 받은 경우) 코드**

* newsRss.xml에서 < item >으로 반복적인 형태의 기사가 나누어지므로 item으로 each()를 한다.

```css
success:function(result){
	$(result).find("item").each(function(){});
}
```

#### 1. 변수선언

* < item >안에 < title >,< link >,< description >,< pubDate >가 있으므로 변수를 선언해준다.

```css
$(result).find("item").each(function(){
    var title = $(this).find("title").text();
    var link = $(this).find("link").text(); 
    var desc = $(this).find("description").text();
    var pubDate = $(this).find("pubDate").text();
});
```

* 기자는 < description > 안에 존재
* 있는 곳이 있고 없는 곳이 있으므로 if문으로 나눠준다.
* 형태 : [ 홍길동 기자 ] ===> []을 기준으로 substring 해준다.

```css
$(result).find("item").each(function(){
	var author = "";
	if(desc!=""){
        author=desc.substring(desc.indexOf('[')+1,desc.indexOf(']'));
	}
});
```

* 기사 날짜는 pubDate에 존재
* 0000-00-00 0:0 형태로 "년-월-일 시:분" 으로 하기 위해 각각의 요소를 변수를 선언한다.
* 마지막으로 원하는 형태로 pubDate를 다시 선언한다.

```css
$(result).find("item")each(function(){
	var date = new Date(pubDate); //날짜 객체선언
    var y = date.getFullYear(); //년
    var m = date.getMonth()+1; //월
    var d = date.getDate();//일
    var h = date.getHours(); //시
    var mm = date.getMinutes(); //분
    
    pubDate = y+"-"+m+"-"+d+" "+h+":"+mm;
});
```

#### 2. 출력 형태의 tag만들기

* id=news에 있는 ol에 li로 출력하도록 한다.
* 제목(기자,날짜) 다음줄로 넘어가서 설명+ 제목에 링크걸기

```css
$(result).find("item")each(function(){
	var tag="<li><a href='"+link+"'>"+title+"</a>(";
    if(author!=""){
        tag += author+",";
    }
    tag += pubDate+")<br/>";
    if(desc==""){//기사설명X
        tag += "</li>";
    }else{//기사설명O
        tag += desc+"</li>";
    }
    
    $("#news>ol").append(tag);
});
```

#### [최종정리]

```css
<script>
	$("#newsRss").click(function(){
     	$.ajax({
        	url:'newsRss.xml',
            dataType:'xml',
            success:function(result){
                $(result).find("item").each(function(){
   					 var title = $(this).find("title").text();
   					 var link = $(this).find("link").text(); 
   					 var desc = $(this).find("description").text();
 					 var pubDate = $(this).find("pubDate").text();
                    var author = "";
					if(desc!=""){
        			author=desc.substring(desc.indexOf('[')+1,desc.indexOf(']'));
					}
                    var date = new Date(pubDate); //날짜 객체선언
   					var y = date.getFullYear(); //년
    				var m = date.getMonth()+1; //월
    				var d = date.getDate();//일
    				var h = date.getHours(); //시
   					var mm = date.getMinutes(); //분
    
    				pubDate = y+"-"+m+"-"+d+" "+h+":"+mm;
                    var tag="<li><a href='"+link+"'>"+title+"</a>(";
    				if(author!=""){
       				 	tag += author+",";
    				}
    				tag += pubDate+")<br/>";
    				if(desc==""){//기사설명X
        				tag += "</li>";
    				}else{//기사설명O
        				tag += desc+"</li>";
    				}
    
   				 	$("#news>ol").append(tag);
				});
        	},error:function(){
                console.log("오류발생!")
            }
    	});                   
 	});
</script>
```



> **출력결과**

1. **['전설끼리 홀인원' 소유 "골프 너무 힘들어...촬영 끝나고 살 빠졌다" ](https://www.chosun.com/entertainments/entertain_photo/2022/07/19/QINGZQZZ2NKPRVJOZPVLE4CY2Y/)**(OSEN=연휘선 기자,2022-7-19 11:56)
   [OSEN=연휘선 기자] 걸그룹 씨스타 멤버 겸 가수 소유가 '전설끼리 홀인원'을 참여하며 힘든 점을 밝혔다. 19일 오후 서울시 마포구 상암동 스탠포드 호텔에서 MBC에브리원 새 예능 프로그램 '전설끼리 홀인원'의 제작발표회가 진행됐다. 이 자리에는 신주석 PD와 전 축구선수 안정환, 이동국, 조원희와 전 농구선수 문경은, 걸그룹 씨스타 출신 소유, 프로





