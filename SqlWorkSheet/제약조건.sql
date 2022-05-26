-- 제약조건

-- NOT NULL : NULL 값 허용하지 않음
CREATE TABLE ZZZ(
    ID VARCHAR2(100) NOT NULL
);
-- 테이블 생성 이후에도 제약조건 수정 가능
ALTER TABLE ZZZ MODIFY ID VARCHAR2(100) NOT NULL;

-- DEFAULT : 기본으로 들어갈 값
CREATE TABLE ZZZ(
    ID VARCHAR2(100) DEFAULT 'ADMIN'
);
-- 테이블 생성 이후에도 제약조건 수정 가능
ALTER TABLE ZZZ MODIFY ID VARCHAR2(100) DEFAULT 'HONGGILDONG';

-- CHECK : 체크 조건 검사를 통과해야만 데이터 저장 가능
CREATE TABLE ZZZ(
    ID VARCHAR2(100) CHECK(ID.LENGTH < 10)
);
-- 테이블 생성 이후에도 제약조건 수정 가능
ALTER TABLE ZZZ ADD CONSTRAINT ZZZIDCHECK
CHECK(REGEXP_LIKE(PHONE, '^010-\d{3,4}-\d{4}$'));

-- PRIMARY KEY : 기본키(식별자) (NOT NULL, UNIQUE)
CREATE TABLE ZZZ(
    ID VARCHAR2(100) PRIMARY KEY
);

CREATE TABLE ZZZ(
    ID VARCHAR2(100),
    CONSTRAINT ZZZTBPK PRIMARY KEY(ID)
);

ALTER TABLE ZZZ
ADD CONSTRAINT ZZZTBPK PRIMARY KEY(ID);

-- UNIQUE : 중복방지
CREATE TABLE ZZZ(
    ID VARCHAR2(100) UNIQUE
);

ALTER TABLE ZZZ
ADD CONSTRAINT ZZZTBIDUQ UNIQUE(ID);

-- FOREIGN KEY : 외래키(..)
DROP TABLE STUDENT;
CREATE TABLE STUDENT(
      NO NUMBER PRIMARY KEY
    , NAME VARCHAR2(100)
);

DROP TABLE SCORE;
CREATE TABLE SCORE(
      STD_NO NUMBER
    , GRADE CHAR(2),
    CONSTRAINT STDFK FOREIGN KEY(STD_NO) REFERENCES STUDENT(NO) ON DELETE SET NULL --ON DELETE CASCADE
);

-- 외래키 : 부모테이블의 기본키를 참조함

INSERT INTO STUDENT(NO, NAME)
VALUES(1, 'JAVA');
--COMMIT;

INSERT INTO SCORE(STD_NO, GRADE)
VALUES(5, 'A');
--COMMIT;
--ROLLBACK;





DROP TABLE ZZZ;