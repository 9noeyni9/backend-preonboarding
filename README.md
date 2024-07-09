![spartacodingclub](https://noticon-static.tammolo.com/dgggcrkxq/image/upload/v1719643111/noticon/yeqwdeuiybor5m4hh7zj.png)
# Hanghae99 Preonboarding Backend Course

**취업시장에 침투하기 전에, 실전과 같은 훈련으로 코딩의 감(떫음)을 찾아서 세상에 스파르타st를 보여주자.<br />
어렵다고 느끼는 제군들도 있겠지만, 힌트를 보면서 잘 따라 와주기를 바란다.**



### 🎖️ 훈련 메뉴

---
- [ ]  Junit를 이용한 테스트 코드 작성법 이해
- [ ]  Spring Security를 이용한 Filter에 대한 이해
- [ ]  JWT와 구체적인 알고리즘의 이해
- [ ]  PR 날려보기
- [ ]  리뷰 바탕으로 개선하기
- [ ]  EC2에 배포해보기

### Day 1 - 시나리오 설계 및 코딩 시작!

---
**Spring Security 기본 이해**

- [ ]  Filter란 무엇인가?(with Interceptor, AOP)

### Filter, Interceptor, AOP
: 공통으로 처리되는 업무와 관련된 코드를 따로 관리해 중복 코드를 줄여 메인 코드는 주요 비즈니스 로직만 집중하도록 활용

#### 흐름
Filter -> Interceptor -> AOP -> Interceptor -> Filter
![](https://velog.velcdn.com/images/soyeon207/post/ad97e02f-4023-4b9c-87b2-7b73474094da/image.png)
[사진 출처](https://velog.io/@soyeon207/Spring-Filter-Interceptor-AOP)

### Filter
- Spring 컨테이너 외부 웹 컨테이너가 관리
- Servlet 컨테이너가 요청과 응답을 처리하기 전 특정 작업을 수행
- 해당 Servlet 필터는 웹 애플리케이션 모든 요청에 대해 전역적으로 적용 가능
- DispatcherServlet 전에 필터 동작하고 이후 처리가 끝난 후 응답에 대해 변경 처리가 있을 수 있음 
- 로깅, 인코딩, 보안(CORS 설정) 등에 사용

#### 실행 메서드
- init(): 필터 인스턴스 초기화
- doFilter(): 전/후 처리
- destroy(): 필터 인스턴스 종료

### Interceptor
- 스프링 프레임워크에서 제공하는 기능
- DispatcherServlet이 controller 호출 전 후로 동작하기 때문에 스프링 컨텍스트 내부에서 controller에 대한 요청, 응답 처리
- Spring 모든 빈 객체 접근 가능
- 로깅, 인증, 권한 부여, 데이터 검증 등

#### 실행 메서드
- preHandler(): 컨트롤러 메서드가 실행되기 전
- postHandler(): 컨트롤러 메서드 실행된 직후 뷰 렌더링되기 전
- afterCompletion(): 뷰가 컨트롤러에 응답된 후 실행

### AOP
- 소프트웨어 개발 시 반복되는 기능의 분리를 통해 코드 모듈성을 높임
- 주소, 파라미터, 어노테이션 등 대상 지정 가능
- 로깅, 트랜잭션, 에러처리 등

#### 주요 요소
- Aspect: 횡단 관심사 모듈화 클래스
- JoinPoint: 프로그램 실행 중 Aspect가 적용될 수 있는 특정 지점
	- 메서드 호출, 필드 접근과 같은 시점
- Advice: 특정 JoinPoint에 Aspect의 코드 적용(before, after, after-returning, after-throwing, around)
- Pointcut: JoinPoints의 집합 정의 
- Target: Advice 적용되는 대상 객체
- Proxy: Target을 감싸는 객체, Aspect 실행 관리
```
👀출처
https://medium.com/@yukeon97/spring-filter-interceptor-aop-%EC%A0%95%EB%A6%AC-247125b4acac
https://baek-kim-dev.site/61
https://velog.io/@kai6666/Spring-Spring-AOP-%EA%B0%9C%EB%85%90
```

---

- [ ]  Spring Security란?

**JWT 기본 이해**

- [ ]  JWT란 무엇인가요?

**토큰 발행과 유효성 확인**

- [ ]  Access / Refresh Token 발행과 검증에 관한 **테스트 시나리오** 작성하기

**유닛 테스트 작성**

- [ ]  JUnit를 이용한 JWT Unit 테스트 코드 작성해보기

  - https://preasim.github.io/39

  - [https://velog.io/@da_na/Spring-Security-JWT-Spring-Security-Controller-Unit-Test하기](https://velog.io/@da_na/Spring-Security-JWT-Spring-Security-Controller-Unit-Test%ED%95%98%EA%B8%B0)


### Day 2 - 백엔드 배포하기

---
**테스트 완성**

- [ ]  백엔드 유닛 테스트 완성하기

**로직 작성**

- [ ]  백엔드 로직을 Spring Boot로
    - [ ]  회원가입 - /signup
        - [ ]  Request Message

           ```json
           {
               "username": "JIN HO",
               "password": "12341234",
               "nickname": "Mentos"
           }
           ```

        - [ ]  Response Message

           ```json
           {
               "username": "JIN HO",
               "nickname": "Mentos",
               "authorities": [
                       {
                               "authorityName": "ROLE_USER"
                       }
               ]		
           }
           ```

    - [ ]  로그인 - /sign
        - [ ]  Request Message

           ```json
           {
               "username": "JIN HO",
               "password": "12341234"
           }
           ```

        - [ ]  Response Message

           ```json
           {
               "token": "eKDIkdfjoakIdkfjpekdkcjdkoIOdjOKJDFOlLDKFJKL",
           }
           ```


**배포해보기**

- [ ]  AWS EC2 에 배포하기

**API 접근과 검증**

- [ ]  Swagger UI 로 접속 가능하게 하기

### Day 3 - 백엔드 개선하기

---
[Git 커밋 메시지 잘 쓰는 법 | GeekNews](https://news.hada.io/topic?id=9178&utm_source=slack&utm_medium=bot&utm_campaign=TQ595477U)

**AI-assisted programming**

- [ ]  AI 에게 코드리뷰 받아보기

**Refactoring**

- [ ]  피드백 받아서 코드 개선하기

**마무리**

- [ ]  AWS EC2 재배포하기
