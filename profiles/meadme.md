## Profile 사용을 통해 적용될 properties를 제어할 수 있다
* application.properties는 default profile이다
* application-[prod|dev].properties > application.properties -> property key가 중복되는 경우 override한다.
* spring.profile.active=prod로 실행 profile을 선택할 수 있다.
* spring.profile.active를 설정하는 위치는
	* application.properties
	* java -jar -Dspring.profile.active=prod
	* Intellij > 실행App선택(drop-down) > Edit Configuration > Application > Program argument
		* --spring.profiles.active=prod
* spring.profile.include를 통해 다른 properties파일을 inlude할 수 있다