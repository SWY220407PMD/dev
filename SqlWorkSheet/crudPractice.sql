-- 계정 설정 변경
ALTER USER C##KH DEFAULT TABLESPACE USERS QUOTA UNLIMITED ON USERS;

-- 계정 생성
-- CREATE USER 아이디 IDENTIFIED BY 패스워드;
CREATE USER "C##KH" IDENTIFIED BY "KH";
-- 계정에 권한 부여
-- GRANT 권한1, 권한2, ..... TO 계정명;
GRANT CONNECT, RESOURCE TO C##KH;

--한줄 주석
/*
    여러줄
    주석도
    가능 
    ㅎㅎㅎㅎ
*/
--SQL 은 대문자로 작성

--테이블 생성
CREATE TABLE MEMBER(
    ID VARCHAR2(30),
    PWD VARCHAR2(100)
);

--테이블 조회 (READ)
SELECT * FROM MEMBER;

--데이터 넣기 (CREATE)
INSERT INTO MEMBER(ID, PWD) VALUES('SWY','1234');

--데이터 수정 (UPDATE)
UPDATE MEMBER SET PWD = '4321';

--데이터 삭제 (DELETE)
DELETE MEMBER;

--테이블 삭제
DROP TABLE MEMBER;

