-- �׷� ������
SELECT AVG(SAL) , DEPTNO
FROM EMP
WHERE COMM IS NOT NULL
GROUP BY DEPTNO
HAVING AVG(SAL) > 2000 -- �׷��� ����� ���� ���� ����
ORDER BY DEPTNO DESC
;

-- SQL �������
/*
    1. FROM
    2. WHERE
    3. GROUP BY
    4. HAVING
    5. SELECT
    6. ORDER BY
*/

