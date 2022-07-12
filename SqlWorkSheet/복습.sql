-- SELECT

/*
    �������
    Į�� ��Ī ���� 
    ���̺� ��Ī ����
    �ߺ����� DISTINCT
    || �����ڷ� ���ڿ� ��ġ�� ����
*/

/*
    WHERE
        �� �����ڷ� ��
        BETWEEN A AND B
        IS [NOT] NULL
        AND , OR
        ��ȣ �̿��ؼ� �켱���� ���� ����
        LIKE % , _
        IN
*/

SELECT *
FROM EMPLOYEE
WHERE DEPT_CODE IN ('D9','D1')
;


/*
    ORDER BY
        ASC , DESC
*/

SELECT *
FROM EMPLOYEE
ORDER BY BONUS DESC NULLS FIRST
;

/*
    -- ������ �Լ�
        LENGTH
        LENGTHB
        INSTR : ������ ��ġ���� ������ ���� �������� ��Ÿ���� ������ ���� ��ġ
        LPAD / RPAD : ������ ���ڸ� ���� �Ǵ� �����ʿ� ���ٿ���
        LTRIM / RTRIM / TRIM : ��������
        SUBSTR : ������ ��ġ����, ������ ������ŭ ���ڿ� ����
        LOWER / UPPER / INITCAP
        CONCAT : ���ڿ� ��ġ��
        REPLACE : �����Ϸ��� ���� ����
        
        ABS
        MOD
        ROUND
        FLOOR
        CEIL
        TRUNC
        
        MONTHS_BETWEEN
        ADD_MONTHS
        
        EXTRACT(YEAR|MONTH|DAY FROM DATE) : 
        
*/

SELECT INSTR('HELLO WORLD' , 'L' , 2) FROM DUAL;

SELECT EXTRACT(DAY FROM SYSDATE) FROM DUAL;


/*
    ���ڿ�  : TO_CHAR
    ����   : TO_NUMBER
    ��¥   : TO_DATE
*/

SELECT TO_CHAR(SYSDATE, 'YYYY-MM-DD') FROM DUAL;
SELECT TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS') FROM DUAL;

SELECT TO_DATE('20021231') FROM DUAL;
SELECT TO_DATE('021231') FROM DUAL;



/*
    NULL ó�� �Լ�
        NVL
        NVL2
        DECODE
        CASE ~ WHEN ~ THEN ~ ELSE ~ END
        
*/

-- EMPLOYEE ���̺��� �����, �޿�, ���ʽ�, ���ʽ����Կ��� ��ȸ
SELECT 
    EMP_NAME �����
    , SALARY �޿�
    , SALARY*NVL(BONUS , 0) ���ʽ�
    , SALARY + SALARY*NVL(BONUS , 0) �ѱ޿�
FROM EMPLOYEE
;

-- ���ʽ� ���� // ���� ���ʽ� �޴� ����� 0.1 , �������� 0
-- NVL2
SELECT
    EMP_NAME �����
    ,   NVL(BONUS, 0) �������ʽ���
    ,   NVL2(BONUS, 0.1, 0)  ����Ⱥ��ʽ���
    ,   (SALARY + SALARY*NVL2(BONUS, 0.1, 0)) * 12  ���� -- (�޿�+���ʽ�) *12
FROM EMPLOYEE
;

-- DECODE
-- EMPLOYEE ���̺��� ���, �����, �ֹι�ȣ, ���� ��ȸ
SELECT
    EMP_ID
    , EMP_NAME
    , EMP_NO
    , SUBSTR(EMP_NO,8,1) ���ڸ�ù��°����
    , DECODE(SUBSTR(EMP_NO,8,1) , 1, '����', 2, '����') ����
FROM EMPLOYEE
;

-- CASE
SELECT
    EMP_ID
    , EMP_NAME
    , EMP_NO
    , SUBSTR(EMP_NO,8,1) ���ڸ�ù��°����
    , CASE
        WHEN SUBSTR(EMP_NO,8,1) = 1 THEN '����'
        WHEN SUBSTR(EMP_NO,8,1) = 2 THEN '����'
        ELSE '���ڵ����ڵ��ƴ�'
      END ����
FROM EMPLOYEE
;



/*
    �׷��Լ�
        SUM
        AVG
        MIN
        MAX
        COUNT
*/

SELECT MAX(SALARY)
FROM EMPLOYEE
;


/*
    GROUP BY
    HAVING
*/

SELECT DEPT_CODE, AVG(SALARY)
FROM EMPLOYEE
GROUP BY DEPT_CODE
HAVING AVG(SALARY) > 3000000
;

-- �� �μ��� �׷����� ��� �μ��� �޿� �� �� ��ȸ
SELECT DEPT_CODE �μ���, SUM(SALARY) �μ��޿�����
FROM EMPLOYEE
GROUP BY DEPT_CODE
;
-- ��ü ��� �� ��ȸ
SELECT COUNT(*)
FROM EMPLOYEE;

-- �� �μ��� ��� �� ��ȸ
SELECT DEPT_CODE, COUNT(*)
FROM EMPLOYEE
GROUP BY DEPT_CODE
;

-- �� �μ���, ���ʽ� �޴� ��� ��
SELECT DEPT_CODE, COUNT(BONUS)
FROM EMPLOYEE
GROUP BY DEPT_CODE
;

/*
    �����Լ�
        CUBE
        ROLLUP
        GROUPING SETS
        
        GROUPING
*/

/*
    ���� ������
        UNION
        UNION ALL
        INTERSECT
        MINUS
*/

/*
    JOIN
        INNER JOIN
        OUTER JOIN
            - LEFT , RIGHT , FULL
        CROSS JOIN
        
        NON EQUAL JOIN
        
        SELF JOIN
*/

-- ��� ���̺� �� �μ��ڵ� �� �̿��ؼ�, �μ��̸��� �Բ� ���
-- EMPLOYEE , DEPARTMENT JOIN�ؼ� ��� Į�� ��ȸ
SELECT A.EMP_NAME, A.DEPT_CODE, B.DEPT_TITLE
FROM EMPLOYEE A
CROSS JOIN DEPARTMENT B --ON A.DEPT_CODE = B.DEPT_ID
;


-- NON EQUAL JOIN (�� ����)
SELECT E.EMP_NAME, E.SALARY, S.SAL_LEVEL, S.MIN_SAL , S.MAX_SAL
FROM EMPLOYEE E
--JOIN SAL_GRADE S ON (E.SALARY BETWEEN S.MIN_SAL AND S.MAX_SAL)
JOIN SAL_GRADE S ON (E.SALARY > S.MIN_SAL)
ORDER BY EMP_NAME
;


























