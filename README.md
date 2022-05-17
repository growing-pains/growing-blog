# growing-blog

### [ 블로그 란 ]

웹(web) + 로그(log) 를 합친 낱말

스스로가 가진 느낌이나 품어오던 생각, 알리고 싶은 견해나 주장 같은 것을 일기처럼 적어 올리는 형식, 보통 사람들이 자신의 관심사에 따라 자유롭게 글을 올릴 수 있는 웹 사이트.

### [ growing-blog 의 1차 목적 ]

가장 기본적인 기능을 구현한 블로그

우선 기본적인 기능을 기준으로 프로젝트를 시작하여 설계를 중심으로 프로젝트를 진행하는 공부 블로그

기능이 간단한 만큼 설계에 집중

#### [ 우선 필요 기능 ]

1. 게시글
    1. 등록
    2. 수정
    3. 삭제

#### [ 도메인 ]

1. 게시글 ( 우선 구현 )
2. 글쓰는 유저 ( 현재 : 나 )


#### [ 도메인 설계 ]

![img1 daumcdn](https://user-images.githubusercontent.com/41177346/168591547-e490a09d-52cb-4cd0-afb6-432c0b4ee77d.png)

1. Application Layer: 주로 도메인과 Repository를 바탕으로 실제 서비스(API)를 제공하는 계층
2. Domain Layer: Entity, VO(Value Object)를 활용하여 도메인 로직이 진행되는 계층
3. Infrastructure Layer: 쉽게 말하면 외부와의 통신(ORM, DB, NoSql)을 담당하는 계층

3Layer 설계 참고(https://sabarada.tistory.com/159)

#### [ Aggregate ]

게시글

유저

#### [ 구현 방식 ]

- DDD, TDD 방식을 사용해본다.
- 프레임 워크 : Spring
- 언어 : Java

