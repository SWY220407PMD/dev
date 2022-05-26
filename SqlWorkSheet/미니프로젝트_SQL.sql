-------------
-- �̴����� ���� DDL + DML
-------------


-------------
-- MEMBER TABBLE
-------------
DROP TABLE MEMBER;
CREATE TABLE MEMBER(
      NO NUMBER PRIMARY KEY
    , ID VARCHAR2(30) NOT NULL UNIQUE
    , PWD VARCHAR(100) NOT NULL
    , NICK VARCHAR2(30) NOT NULL UNIQUE
    , ENROLL_DATE TIMESTAMP DEFAULT SYSDATE
    , QUIT_YN CHAR(1) DEFAULT 'N' CHECK(QUIT_YN IN ('Y','N'))
);

SELECT * FROM MEMBER;

INSERT INTO MEMBER(NO, ID, PWD, NICK) VALUES(1, 'USER01', '1234', 'USER01N');
INSERT INTO MEMBER(NO, ID, PWD, NICK) VALUES(2, 'USER02', '1234', 'USER02N');
INSERT INTO MEMBER(NO, ID, PWD, NICK) VALUES(3, 'USER03', '1234', 'USER03N');
COMMIT;

