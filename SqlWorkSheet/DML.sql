-- DML

-----------------------------------------------------------------
--SELECT : READ : ������ �б�
-----------------------------------------------------------------

SELECT * FROM EMP; -- EMP ���̺��� ��� Į�� ��ȸ

SELECT EMPNO, ENAME FROM EMP; -- EMP ���̺��� Ư�� Į�� ��ȸ

--��Ī ����ϱ�
SELECT EMPNO AS �����ȣ, ENAME AS ����̸� FROM EMP;
SELECT EMPNO �����ȣ, ENAME ����̸� FROM EMP;
SELECT EMPNO "��� ��ȣ", ENAME "��� �̸�" FROM EMP;



-----------------------------------------------------------------
-- INSERT : CREATE : ������ ����(����)
-----------------------------------------------------------------
/*
    [����]
    INSERT INTO 
    ���̺��(Į��1, Į��2, Į��3 ...) 
    VALEUS (��1, ��2, ��3...)
    ;
    
    - Į�� ������ ������� �ص� ��
    - ��� Į���� �� �ʿ�� ���� (NULL ������ ��)
    - ��� Į���� �� ���� ��쿡��, Į���� ���� ����
*/

INSERT INTO 
EMP(ENAME, EMPNO, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)
VALUES('SWY', 7777, 'SALESMAN', 7902, SYSDATE, 777, 100, 30);

INSERT INTO 
EMP(ENAME, EMPNO, JOB, HIREDATE, SAL, COMM, DEPTNO)
VALUES('SWY', 8888, 'SALESMAN', SYSDATE, 777, 100, 30);

INSERT INTO 
EMP
VALUES(5555, 'SWY', 'SALESMAN', 7902, SYSDATE, 777, 100, 30);


-----------------------------------------------------------------
-- UPDATE : UPDATE : ������ ����
-----------------------------------------------------------------

/*
    [����]
    UPDATE ���̺�� SET Į���� = ��
    WHERE Į��1 ������ �񱳰�1
    AND Į��2 ������ �񱳰�2
    OR Į��3 ������ �񱳰�3
    ;
*/

INSERT INTO BONUS(ENAME, JOB, SAL, COMM)
VALUES ('SWY', 'SALESMAN', 777, 100);

INSERT INTO BONUS(ENAME, JOB, SAL, COMM)
VALUES ('SWY2', 'SALESMAN2', 777, 100);

SELECT * FROM BONUS;

UPDATE BONUS SET SAL = 111 WHERE ENAME = 'SWY';



-----------------------------------------------------------------
-- DELETE : DELETE : ������ ����
-----------------------------------------------------------------
SELECT * FROM BONUS;
SELECT * FROM EMP;

DELETE FROM BONUS -- BONUS ���̺��� ��� ROW ����
WHERE ENAME = 'SWY2';

DELETE FROM EMP
WHERE EMPNO = 7777
OR EMPNO = 5555
OR EMPNO = 8888
OR EMPNO = 9999
;















