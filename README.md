LTW TEST 

Spring 비관리 객체에 Spring 주입을 활용 할 수 있나 ? LTW AOP 방식을 사용하면 가능하다 
LTW란
java 파일을 컴파일한 결과물 자바 클래스가 JVM에 로드될 때 바이트 코드 조작을 통해 위빙되는 방식

다만 LTW 사용시 Junit이 문제가 생겨서 테스트만 진행

JVWM에 Spring instrument 경로 설정필요
ex) -javaagent:C:\develops\.gradle\caches\modules-2\files-2.1\org.springframework\spring-instrument\6.0.11\8837047ded595b1561a1c8b763f9d42b84faad99\spring-instrument-6.0.11.jar
