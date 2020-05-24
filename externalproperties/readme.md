## 외부설정 (properties 파일)
	application.properties 설정방법과 적용순서를 확인한다 (main, test에 모두 적용된다)<br>
* 주의사항
	* test application properties가 있으면 test에서는 main applicaition.properties대신 test application properties 를 사용한다.
* application.properties의 위치(순위 높은게 낮은걸 덮어 씁니다)
	1. classpath:/config/
	2. classpath:/
* 기타
	* ${random.xxx} 사용법
	* Environment 사용법
	* property 내부 변수 사용 방법
	* test에서 @TestPropertySource(locations = "classpath:/test.properties") 사용법
		* 파라미터가 동일한 경우  test.properties의 값을 사용한다

## 외부설정2 (@ConfigurationProperties)
* 특정 파라미터 그룹을 Bean으로 등록할 수 있다.
* @Validate 할 수 있다
