# 도서관 웹 애플리케이션, 규장각 (Gyujanggak)
### **다올**  
#### **송윤수(팀장), 강소연, 윤석인, 장재웅, 정아람**  
---
### 수행 기간
- 2021년 10월 12일 (화) ~ 2021년 11월 23일 (화)  
---
### 목차  
1. [기획 의도](#기획-의도)
2. [개발 목표](#개발-목표)
3. [설계의 주안점](#설계의-주안점)
4. [개발 환경](#개발-환경)
5. [기능 구현](#기능-구현)
6. [주요 기능](#주요-기능)
7. [ERD 다이어그램](#erd-다이어그램)
---
### 기획 의도
- 도서관을 운영하기 위한 가장 기본적인 인프라로써, 이용자 중심의 도서관 웹 사이트를 구축하여 도서관 이용 활성화에 기여하기 위함
---
### 개발 목표
 - 최신 IT 기술을 반영하는 이용자 중심의 맞춤형 서비스 제공  
 - 방대한 컨텐츠 구축과 검색 제공으로 정보 제공자로서의 역할을 강화하며, 도서관 이용자의 지식 경쟁력 강화  
 - 도서관 서비스 수준을 높여 이용자의 접근성 제고  
---
### 설계의 주안점
 - ‘규장각’에서는 도서관에 대해 질문할 수 있는 '도서관 봇'을 두어, 이용자가 쉽고 간편하게 도서관 정보를 확인할 수 있게 함
 - 다독자 랭킹을 통해 조금이나마 이용자의 흥미를 끌어 독서에 대한 참여를 유도
 - 전공별 추천 도서를 통하여 다올대학교 학생들을 전공 관련 도서에 쉽게 접근 가능하게 함으로써 도서관의 학생 서비스 제고
 - 열람실과 스터디룸이라는 공간을 예약 / 조회할 수 있는 서비스를 제공하고, 도서 대출 외의 목적으로도 도서관을 이용할 수 있게 함으로써 도서관 이용자 범위를 확대
 - 취향 분석을 통해 이용자에게 적합한 도서를 추천
 - 도서 예약 뿐만 아니라 대출 시, '방문 수령'과 '택배 수령'을 선택하여 도서 수령 가능
---
### 개발 환경
![다올_최종보고서(이미지) 015](https://user-images.githubusercontent.com/86512230/143158394-b527d08b-a15c-438c-b793-6706f28aac85.jpeg)
---
### 기능 구현
| 강소연 | 송윤수 | 윤석인 | 장재웅 | 정아람 |
|---|---|---|---|---|
|- 열람실 현황 조회<br>- 열람실 예약<br>- 스터디룸 현황 조회<br>- 스터디룸 예약<br>- 관리자 회워 전체 조회<br>- 관리자 회원 상세 조회<br>- 관리자 회원 검색<br>- 연회비 결제 회원 승인 대기 목록 조회<br>- 연회비 결제 회원 승인 처리<br>- 승인 처리 결과 이메일 발송|- 이용자 취향 설문 및 분석<br>- 취향별 도서 추천<br>- 전공별 도서 추천<br>- 회원 정보 조회 및 수정<br>- 회원 탈퇴<br>- 연회비 결제<br>- 대출 내역 조회 및 대출 연장<br>- 희망도서 신청 이메일 발송<br>- 희망도서 내역 조회<br>- 관심도서 내역 조회<br>- 별점 및 서평 조회 / 작성 / 수정 / 삭제<br>-열람실, 스터디룸 내역 조회 및 예약 취소<br>- 헤더, 푸터 (프론트)|- 회원 로그인 / 로그아웃<br>- 소셜 로그인 / 회원가입 (카카오)<br>- 회원가입<br>- 아이디 찾기 / 비밀번호 찾기<br>- 도서관 정보 조회<br>- 공지사항 목록 조회 및 상세 조회<br>- 공지사항 작성 / 수정 / 삭제<br>- 관리자 소장 도서 목록 조회 및 상세 조회<br>- 관리자 소장도서 검색 조회<br>- 관리자 도서 추가 / 수정 / 삭제<br>- 관리자 희망도서 처리 목록 조회<br>- 관리자 희망도서 처리 결과 이메일 발송<br>- 관리자 대출 택배 신청 목록 조회<br>- 관리자 전체 대출 현황 목록 조회<br>- 관리자 대출 통계|- 도서관 봇<br>- 문의 전체 목록 조회 및 상세 조회<br>- 문의 작성 / 수정 / 삭제<br>- 관리자 문의 전체 조회 및 상세 조회<br>- 관리자 문의 답변 작성 / 수정<br>- 자유게시판 목록 조회 및 상세 조회<br>- 자유게시판 게시글 등록 / 수정 / 삭제<br>- 게시글 신고 / 댓글 신고<br>- 인기 키워드<br>- 다독자 랭킹<br>- 메인페이지 (프론트)|- 도서 일반 대출<br>- 도서 택배 대출<br>- 도서 전체 목록 조회<br>- 도서 간략 검색 및 조회<br>- 도서 상세 검색 및 조회<br>- 도서 주제별 검색 및 조회<br>- 도서 정보 조회 및 서평 조회<br>- 신착 도서<br>- 인기 도서<br>- 도서 예약 신청<br>- 도서 예약 내역 조회 및 삭제<br>- 관심도서 추가 및 삭제<br>- 관리자 예약 도서 이메일 알림|
---
### 주요 기능
- **도서관 봇**

![다올_최종보고서(이미지) 021](https://user-images.githubusercontent.com/90733942/143151294-f1a42323-fc19-440c-9dda-cfeae9e94e5b.jpeg)



  - **취향 설문**

![다올_최종보고서(이미지) 023](https://user-images.githubusercontent.com/90733942/143151316-587b0c23-992a-4d4e-ac87-0854ab160b62.jpeg)

  - **취향별 도서 추천**

![다올_최종보고서(이미지) 024](https://user-images.githubusercontent.com/90733942/143151332-e8095537-36a0-42d0-870a-c1013c96428b.jpeg)

  - **전공별 도서 추천**

![다올_최종보고서(이미지) 025](https://user-images.githubusercontent.com/90733942/143151346-2a92a6e9-fa1c-4a33-be07-f5325a372958.jpeg)




  - **간략 검색**

![다올_최종보고서(이미지) 027](https://user-images.githubusercontent.com/90733942/143151476-b7ea9c72-3e03-4e59-808c-f540e2423eaa.jpeg)

  - **상세 검색**
  
![다올_최종보고서(이미지) 028](https://user-images.githubusercontent.com/90733942/143151481-7afc9efc-717b-4864-b30f-59bc7b922c17.jpeg)

  - **주제별 검색**
  
![다올_최종보고서(이미지) 029](https://user-images.githubusercontent.com/90733942/143151484-803db4a3-4106-4cb5-a6a2-ae7ce5b7e585.jpeg)

  - **도서 정보 조회**

![다올_최종보고서(이미지) 030](https://user-images.githubusercontent.com/90733942/143151487-80f142c6-c148-436f-93d7-4fb82479c382.jpeg)




  - **대출**

![다올_최종보고서(이미지) 032](https://user-images.githubusercontent.com/90733942/143151514-b86b6e50-e4d6-4171-8f2d-90b443b088b1.jpeg)

  - **대출 내역 조회**
  
![다올_최종보고서(이미지) 033](https://user-images.githubusercontent.com/90733942/143151519-d5e19a45-b0b6-4181-b4cf-490faa0b25a5.jpeg)

  - **관리자 대출 내역 조회**

![다올_최종보고서(이미지) 034](https://user-images.githubusercontent.com/90733942/143151522-0ab79048-98c6-4a21-84a6-97ca85ed3ded.jpeg)

  - **대출 도서 택배 신청 목록**
  
![다올_최종보고서(이미지) 035](https://user-images.githubusercontent.com/90733942/143151524-96680a9b-a0e9-414b-9f48-062222997952.jpeg)

  - **연장하기**
  
![다올_최종보고서(이미지) 036](https://user-images.githubusercontent.com/90733942/143151527-d9d9f236-68db-4132-8f4c-c17ef3cd6b5a.jpeg)

  - **예약하기**
  
![다올 - 규장각 최종 보고서_예약](https://user-images.githubusercontent.com/86512230/143256333-a6b28b60-93af-4268-beb1-877bdd20acb7.png)

  - **예약 내역 조회**
  
![다올_최종보고서(이미지) 038](https://user-images.githubusercontent.com/90733942/143151530-edfd3a73-45ce-431f-804d-ad6ce63518e9.jpeg)

- **도서 관리**

![다올_최종보고서(이미지) 040](https://user-images.githubusercontent.com/90733976/143151746-04b18e64-64bd-44ca-9214-ce317102c23c.jpeg)
![다올_최종보고서(이미지) 041](https://user-images.githubusercontent.com/90733976/143151917-f11551b0-722b-4bb6-b88f-619d483de6cd.jpeg)

- **관심 도서 / 희망 도서**

![다올_최종보고서(이미지) 043](https://user-images.githubusercontent.com/90733976/143152056-3d217998-4d22-4c67-af3e-cfe40fcb055c.jpeg)
![다올_최종보고서(이미지) 044](https://user-images.githubusercontent.com/90733976/143152067-31e47c32-7d65-4b78-92b5-aad30fd3616e.jpeg)
![다올_최종보고서(이미지) 045](https://user-images.githubusercontent.com/90733976/143152081-72a7a9cc-4b39-4e8a-b28a-26a739a6c87f.jpeg)
![다올_최종보고서(이미지) 046](https://user-images.githubusercontent.com/90733976/143152121-89aff142-7f36-485a-8b71-01f854978187.jpeg)
![다올_최종보고서(이미지) 047](https://user-images.githubusercontent.com/90733976/143152162-9efd2ae7-e893-4562-9631-66c1dfec9555.jpeg)

- **별점 및 서평**

![다올_최종보고서(이미지) 049](https://user-images.githubusercontent.com/90733976/143152266-5273fa15-dbf1-44d5-9a90-ea7c16b98048.jpeg)
![다올_최종보고서(이미지) 050](https://user-images.githubusercontent.com/90733976/143152279-8a0f518e-7610-43eb-af4c-07f56844da12.jpeg)

- **인기 도서 / 신착 도서**

![다올_최종보고서(이미지) 052](https://user-images.githubusercontent.com/90733976/143152385-231ef189-0c63-4182-8521-0212c3cfdf0f.jpeg)
![다올_최종보고서(이미지) 053](https://user-images.githubusercontent.com/90733976/143152399-f0c7b56d-8a48-4b84-943d-e80a2b845c0c.jpeg)

- **인기검색어 / 다독자**

![다올_최종보고서(이미지) 055](https://user-images.githubusercontent.com/87715929/143151563-6a0e7588-ce2d-40fc-a699-2747bbc0791d.jpeg)

- **열람실 / 스터디룸**

![다올_최종보고서(이미지) 057](https://user-images.githubusercontent.com/87715929/143151579-329275ec-f704-494f-b63d-bd9e5117ae4c.jpeg)
![다올_최종보고서(이미지) 058](https://user-images.githubusercontent.com/87715929/143151598-fabf0174-3e46-4210-b6a5-a970bc5368c2.jpeg)
![다올_최종보고서(이미지) 059](https://user-images.githubusercontent.com/87715929/143151605-2c57d8e6-7c32-4cd6-b56f-76982da26ea2.jpeg)
![다올_최종보고서(이미지) 060](https://user-images.githubusercontent.com/87715929/143151608-9c128a95-b12d-4717-a27c-283b86dccc2b.jpeg)

- **회원 계정**

![다올_최종보고서(이미지) 062](https://user-images.githubusercontent.com/87715929/143151634-386338bb-576a-4900-b2ad-6d1d090d50a1.jpeg)
![다올_최종보고서(이미지) 063](https://user-images.githubusercontent.com/87715929/143151639-c829bd92-5560-4dbf-afa4-7c1de6ba8f8e.jpeg)
![다올_최종보고서(이미지) 064](https://user-images.githubusercontent.com/87715929/143151642-ec87f3bb-110a-4d36-ab5f-a36552273dda.jpeg)
![다올_최종보고서(이미지) 065](https://user-images.githubusercontent.com/87715929/143151648-ca474103-5441-4b1f-b1fe-1016543a931a.jpeg)
![다올_최종보고서(이미지) 066](https://user-images.githubusercontent.com/87715929/143151651-363acf09-60a8-400e-b5c8-18c8f9d403e0.jpeg)
![다올_최종보고서(이미지) 067](https://user-images.githubusercontent.com/87715929/143151652-36154e06-72fe-437f-9cf7-c85ce4009f61.jpeg)
![다올_최종보고서(이미지) 068](https://user-images.githubusercontent.com/87715929/143151655-5bfb47a5-53ea-463f-92a7-d20acdb052eb.jpeg)
![다올_최종보고서(이미지) 069](https://user-images.githubusercontent.com/87715929/143151657-d1fbf37b-d204-4073-8b25-309c951c8b2e.jpeg)
![다올_최종보고서(이미지) 070](https://user-images.githubusercontent.com/87715929/143151659-8e4fa187-fcd8-48b1-889e-fa4ce6acceb5.jpeg)

- **공지사항**

![다올_최종보고서(이미지) 072](https://user-images.githubusercontent.com/90733948/143153321-0732d7f5-c803-4f8e-9944-96f3c30ef40f.jpeg)

- **공지사항 등록 / 수정 / 삭제**

![다올_최종보고서(이미지) 073](https://user-images.githubusercontent.com/90733948/143153387-93d6ba5d-1c9d-45e5-b5a9-bae1d6d34f15.jpeg)

- **자유게시판**

![다올_최종보고서(이미지) 075](https://user-images.githubusercontent.com/90733948/143153470-5fa629f2-486f-4937-b2ac-35f4b9fb9279.jpeg)

- **자유게시판 게시글 등록**

![다올_최종보고서(이미지) 076](https://user-images.githubusercontent.com/90733948/143153472-4f2d4402-7050-42e5-90dd-81e47b846d06.jpeg)

- **자유게시판 신고**

![다올_최종보고서(이미지) 077](https://user-images.githubusercontent.com/90733948/143153474-87ffd23a-e251-41b8-a5fa-f4aa43ec6959.jpeg)

- **자유게시판 신고 관리 (관리자 페이지)**

![다올_최종보고서(이미지) 078](https://user-images.githubusercontent.com/90733948/143153476-1064e305-0b2b-4fb3-a12b-cfb8926423dd.jpeg)

- **문의 조회 / 등록**

![다올_최종보고서(이미지) 080](https://user-images.githubusercontent.com/90733948/143153559-3e276655-ed7f-4b71-a146-16769fb363eb.jpeg)

- **문의 상세 조회 / 수정 / 삭제**

![다올_최종보고서(이미지) 081](https://user-images.githubusercontent.com/90733948/143153561-2c70aa86-19f0-44e0-bdda-4e3e47ca29bc.jpeg)

- **문의 관리 (관리자 페이지)**

![다올_최종보고서(이미지) 082](https://user-images.githubusercontent.com/90733948/143153564-f3465149-d1fb-467b-84df-7e34e0350da1.jpeg)

---
### ERD 다이어그램

![다올 - 규장각 프로젝트 ERD](https://user-images.githubusercontent.com/86512230/143279610-c7386bf6-1198-4753-a222-af84f44bf821.png)
