-- �޿��� ���� ���� 3�� ��ȸ
SELECT *
FROM
( --�ζ��� ��
    SELECT *
    FROM EMP
    ORDER BY SAL DESC
)
WHERE ROWNUM <= 3
;

SELECT *
FROM EMP
ORDER BY SAL DESC
;


-- �������� (���� ��)
SELECT EMPNO, ENAME, SAL, DEPTNO
FROM EMP
WHERE (DEPTNO, SAL) IN (SELECT DEPTNO, SAL
                        FROM EMP
                        WHERE DEPTNO = 30);


SELECT *
FROM EMP;



-- ��Į�� �������� (���� ��)
SELECT 
    ENAME
    , DEPTNO
    , SAL
    ,
    (
    SELECT TRUNC(AVG(SAL))
    FROM EMP
    WHERE DEPTNO = E.DEPTNO
    ) AS �μ���ձ޿�
    FROM EMP E
    ;


SELECT * FROM EMP;
-- ��(ȣ��)�� (����)����
SELECT 
    ENAME
    , JOB
    , DEPTNO
    ,
    (
    SELECT DNAME
    FROM DEPT
    WHERE DEPTNO = E.DEPTNO
    ) DNAME
FROM EMP E
;


-- ORDER BY �� ��������
SELECT EMPNO, ENAME, DEPTNO, HIREDATE
FROM EMP E
ORDER BY 
(
    SELECT DNAME
    FROM DEPT
    WHERE DEPTNO = E.DEPTNO
) 
DESC
;

-- TRUNCATE (==DELETE)
SELECT * FROM EMP;
TRUNCATE TABLE EMP;
DELETE FROM EMP;
ROLLBACK;






