# 9. form Tag > Select

### 입력양식 : 사용자에게 정보를 입력받는 요소



> **입력 양식(type) 종류**

12. select : 선택양식 생성

13. outpgroup : 옵션그룹화
14. option : 옵션생성 

> **응용코드**

```html
<form method="post" action="write.jsp">
    <ul>
       <li>관심분야 : <select name="interest" size="4" multiple>
						<option>독서</option>
						<option>영화감상</option>
						<option>달리기</option>
						<option>음악감상</option>
						<option>스케이트보드</option>
						<option>레진아트</option>
					</select>
		</li>
		<li>
			optgroup태그 : <select>
							<optgroup label="Front-end">
							<option>HTML</option>
							<option>CSS3</option>
							<option>JAVASCRIPT</option>
							<option>JQUERY</option>
							</optgroup>
							<optgroup label="Back-end">
							<option>JSP</option>
							<option>SPRING</option>
						    </optgroup>
						  </select>
		
		</li> 
    </ul>
```

* interest라는 이름으로 select태그를 만들어서 **multiple로 설정하여 중복선택**을 허용하였다. 
* select 태그를 만들어서 option으로 항목을 만들고, 각 option의 공통점으로 묶이는 부분을 optgroup으로 그룹화 할 수 있다.
