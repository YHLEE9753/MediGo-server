# 💊 Medigo-server
마이데이터(데이터 허브)를 활용한 약물 관리 및 중복약물 체크 웹 어플리케이션

- 구글 OAuth, JWT 를 통해 회원가입 로그인 로그아웃 기능
- 입력한 개인 정보를 바탕으로 마이데이터 허브와 연동을 통해 개인 약물 데이터 저장
- 완료된 기능 : 현재 복용중인 약물을 보여주며 남은 약물 횟수, 약물 상세 정보(성분, KPIC, DUR, 제조회사 등), 처방전 정보(처방날짜, 처방병원), 현재 복용중인 약물중에 중복약물이 존재하는지 체크, 캘린더를 통해 날짜별 복용 현황 및 진료 현황

## 👬 팀 소개

<table align=center >
  <tr>
      <td>
        <a href="https://github.com/Jin1won">
            <img src="https://avatars.githubusercontent.com/u/76507701?v=4" width="150px" />
        </a>
    </td>
    <td>
        <a href="https://github.com/YHLEE9753">
            <img src="https://avatars.githubusercontent.com/u/71916223?v=4" width="150px" />
        </a>
    </td>
  </tr>
  <tr>
    <td><b> <a href="https://github.com/Jin1won">정진원</b></td>
    <td><b><a href="https://github.com/YHLEE9753">이용훈</b></td>
  </tr>
  <tr>
    <td><b>Frontend Developer</b></td>
    <td><b>Backend Developer</b></td>
  </tr>
</table>

## 🔗 링크
프론트엔드 배포 링크 : <br>
프론트엔드 깃허브 레포 : https://github.com/Medi-Go/MediGo-Frontend <br>
마이데이터 연동 사이트 : https://dataapi.co.kr/ <br>
Spring Rest Docs : http://www.medigo.p-e.kr/ <br>
회고 및 정리 : https://yhlee9753.notion.site/MEDIGO-195c7a92d5cd4ec2a58cd9bb05a73bbb

## 🌐 사용 기술

![JAVA_11](https://img.shields.io/badge/JAVA_17-blue?style=flat&logo=OpenJDK&logoColor=000000)
![Gradle](https://img.shields.io/badge/Gradle_7.5-02303A.svg?style=Plastic&logo=Gradle&logoColor=white)
![JWT](https://img.shields.io/badge/JWT-black?style=Plastic&logo=JSON%20web%20tokens)
![Flyway](https://img.shields.io/badge/flyway-white.svg?style=Plastic&logo=Flyway&logoColor=red)
![querydsl](https://img.shields.io/badge/querydsl-black.svg?style=Plastic&logo=Elastic&logoColor=white)
![JUnit5](https://img.shields.io/badge/JUnit5-white?style=Plastic&logo=JUnit5)

![Spring_Boot_2](https://img.shields.io/badge/Spring_Boot_2.7.3-%236DB33F.svg?style=Plastic&logo=SpringBoot&logoColor=white)
![Spring_Web](https://img.shields.io/badge/Spring_Web-%236DB33F.svg?style=Plastic&logo=spring&logoColor=white)
![Spring_Data_Jpa](https://img.shields.io/badge/Spring_Data_Jpa-%236DB33F.svg?style=Plastic&logo=spring&logoColor=white)
![Spring_Data_Redis](https://img.shields.io/badge/Spring_Data_Redis-%236DB33F.svg?style=Plastic&logo=springsecurity&logoColor=white)
![Spring_Security](https://img.shields.io/badge/Spring_Security-%236DB33F.svg?style=Plastic&logo=springsecurity&logoColor=white)
![Spring_Security](https://img.shields.io/badge/Spring_OAuth2_Client-%236DB33F.svg?style=Plastic&logo=springsecurity&logoColor=white)
![Spring_Rest_Docs](https://img.shields.io/badge/Spring_Rest--Docs-%236DB33F.svg?style=Plastic&logo=Asciidoctor&logoColor=white)

![MySQL](https://img.shields.io/badge/mysql-%23121011.svg?style=Plastic&logo=mysql&logoColor=white)
![Redis](https://img.shields.io/badge/redis-%23DD0031.svg?style=Plastic&logo=redis&logoColor=white)
![h2](https://img.shields.io/badge/H2-darkblue.svg?style=Plastic&logo=h2&logoColor=red)

## 🔍 인프라
![AWS](https://img.shields.io/badge/EC2-%23FF9900.svg?style=Plastic&logo=amazon-aws&logoColor=white)
![Docker](https://img.shields.io/badge/Docker-4A154B?style=flat&logo=Docker&logoColor=#4A154B)
![GitHub_Actions](https://img.shields.io/badge/GitHub_Actions-%23121011.svg?style=Plastic&logo=GitHubActions&logoColor=white)

## 🧤 협업

![git](https://img.shields.io/badge/git-F05032?style=flat&logo=Git&logoColor=white)
![GitHub](https://img.shields.io/badge/github-%23121011.svg?style=Plastic&logo=github&logoColor=white)
![Slack](https://img.shields.io/badge/Slack-4A154B?style=Plastic&logo=slack&logoColor=white)
![Notion](https://img.shields.io/badge/Notion-000000?style=Plastic&logo=Notion&logoColor=white)


## 📜 스프린트
**[dev1] 220817 - 220831** : 프로젝트 세팅, security 설정, JWT 인가, Docker CICD 배포, 구글 OAuth, MyData 연동 및 데이터 로딩, 인증 및 MyData 관련 API 작성<br>
**[dev2] 220831 - 220907** : MyData 데이터 연동 및 저장 완료, MyData 투약 일수 Update API 작성, 메인페이지 화면 API 구현, 중복 약물 체크 로직 및 API 구현, 약물 상세 정보 API 구현<br>
**[dev3] 220908 - 220914** : 캘린더 투약 정보 API 작성, 캘린더 진료 정보 API 작성, 멤버 수정페이지(정보수정, 약물 데이터 업데이트, 투약 횟수 업데이트)<br>
**[dev4] 220915 - 220921** : ~그래프 정보 전달~, 리팩토링, 버그 잡기<br>
**[dev5] 220922 - 221004** : 약물의 가격 데이터를 1달치로 잡고 그 안에 종류별로 가격표시(엔티티 추가), 디테일 페이지에서 약물 가격 정보 슬라이싱, https 붙이기, 1달동안 복용한 약물 종류 바테이터 + 전 달 데이터와 비교하여 어떤종류의 약물이 줄었는지 늘었는지 비교 + (올해 평균 전해 평균 비교도)

## 📝 전략
에러 핸들링 전략 : 에러 코드를 통한 예외처리<br>
git 전략 : gitlab flow

![img.png](image/gitstrategy.png)

## 🛠 구성도

![img_1.png](image/archi.png)

## ⚙ ERD

![img.png](image/erd_v1.png)