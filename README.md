# Prog


![image.png](./image.png)

# 목차
***

1. 개요
2. 개발 환경
3. 서비스 화면
5. 기술 소개
6. 설계 문서
7. 팀원 소개

# 1. 개요
***
## 프로젝트를 생성해 팀원을 모집하고 프로젝트를 진행하며 협업을 위한 서비스를 제공한다.
- 프로젝트 생성
![image-1.png](./image-1.png)

- 프로젝트 신청
![image-2.png](./image-2.png)

- 프로젝트 관리
![image-3.png](./image-3.png)

  - 근태
  ![image-4.png](./image-4.png)

  - 업무
  ![image-5.png](./image-5.png)

  - 피드
    - 업무
    ![image-7.png](./image-7.png)
    - 자유
    ![image-6.png](./image-6.png)

  - 회고
  ![image-8.png](./image-8.png)

# 2. 개발 환경
***

### ⚙ Management Tool
![Jira](https://img.shields.io/badge/jira-%230A0FFF.svg?style=for-the-badge&logo=jira&logoColor=white) ![Notion](https://img.shields.io/badge/Notion-%23000000.svg?style=for-the-badge&logo=notion&logoColor=white) ![GitLab](https://img.shields.io/badge/gitlab-%23181717.svg?style=for-the-badge&logo=gitlab&logoColor=white) ![Figma](https://img.shields.io/badge/figma-%23F24E1E.svg?style=for-the-badge&logo=figma&logoColor=white) ![Google Cloud](https://img.shields.io/badge/GoogleCloud-%234285F4.svg?style=for-the-badge&logo=google-cloud&logoColor=white) 

### 🛠 IDE
![Visual Studio Code](https://img.shields.io/badge/Visual%20Studio%20Code-0078d7.svg?style=for-the-badge&logo=visual-studio-code&logoColor=white) ![WebStorm](https://img.shields.io/badge/webstorm-143?style=for-the-badge&logo=webstorm&logoColor=white&color=black) ![IntelliJ IDEA](https://img.shields.io/badge/IntelliJIDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white) ![Windows Terminal](https://img.shields.io/badge/Windows%20Terminal-%234D4D4D.svg?style=for-the-badge&logo=windows-terminal&logoColor=white)

### 🧲 Infra
![AWS](https://img.shields.io/badge/AWS-%23FF9900.svg?style=for-the-badge&logo=amazon-aws&logoColor=white) ![Nginx](https://img.shields.io/badge/nginx-%23009639.svg?style=for-the-badge&logo=nginx&logoColor=white) ![Docker](https://img.shields.io/badge/docker-%230db7ed.svg?style=for-the-badge&logo=docker&logoColor=white) ![GitLab CI](https://img.shields.io/badge/gitlab%20ci-%23181717.svg?style=for-the-badge&logo=gitlab&logoColor=white) ![Ubuntu](https://img.shields.io/badge/Ubuntu-E95420?style=for-the-badge&logo=ubuntu&logoColor=white)

### 🎨 FrontEnd
![React](https://img.shields.io/badge/react-%2320232a.svg?style=for-the-badge&logo=react&logoColor=%2361DAFB) ![Yarn](https://img.shields.io/badge/yarn-%232C8EBB.svg?style=for-the-badge&logo=yarn&logoColor=white) ![TailwindCSS](https://img.shields.io/badge/tailwindcss-%2338B2AC.svg?style=for-the-badge&logo=tailwind-css&logoColor=white) ![TypeScript](https://img.shields.io/badge/typescript-%23007ACC.svg?style=for-the-badge&logo=typescript&logoColor=white) 

### 💻 BackEnd
![Gradle](https://img.shields.io/badge/Gradle-02303A.svg?style=for-the-badge&logo=Gradle&logoColor=white) ![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white) ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white) 

# 3. 서비스 화면
***

# 4. 기술소개
***

## BackEnd
- Member
  - Security Filter와 JWT Token을 사용하여 API 요청 시 요청자의 권한을 검사한다.
  - OAuth2 인증을 이용해 깃허브 회원가입, 로그인, 계정 연동을 통해 불필요한 개인정보 최소화
  - Redis에 Acces Token과 Refresh Token을 관리해 유저가 로그아웃 요청 시 Refresh Token을 지우고 BlackList에 Acces Token을 저장해 Acces Token 탈취에 대한 대비
  - 자체 회원가입시 이메일 인증을 통해 무분별한 가입을 방지

- Code, CodeDetail
  - 공통으로 사용되는 값들을 정의해 DB에 부하를 줄였다.

- Attendance, Attendance_Log
  - 서버 시간을 기준으로 출/퇴근 시간을 기록
  - 퇴근 요청시 출근 시간과 비교해 업무 시간을 기록/합산 한다.

- Feed
  - 특정 이벤트에 Kafka Topic을 등록해 이벤트가 발생하면 피드를 저장하는 함수가 실행된다.

# 5. 설계 문서
***

# 6. 팀원 소개
***

# 깃 컨벤션
## 브렌치 생성 컨벤션
- 브랜치 이름 생성 
  - 구분/commit type/기능명_지라 이슈 넘버 
    - be/feature/login_#72
    - fe/feature/login_#99
- 형상 관리
  - main : 기준이 되는 브랜치 (재품 배포)
  - dev : 개발 브랜치, 배포전 최종 확인
  - hotfix : 버그 수정
  - feature : 기능단위 개발
- 커밋 컨벤션
  - commit type
    - Feat : 기능 추가, 수정
    - Fix : 버그 수정
    - Docs : 문서 수정
    - Refactor : 기능 고도화
    - Style : 코드 포멧팅
    - Chore : 빌드 업무 수정
    - Design : UI 관련 코드
  ````
    제목 : [BE] Feat : Add security
    본문 : 시큐리티 설정 추가
    ````
