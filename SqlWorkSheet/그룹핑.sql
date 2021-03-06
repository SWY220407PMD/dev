-- 그룹 나누기
SELECT AVG(SAL) , DEPTNO
FROM EMP
WHERE COMM IS NOT NULL
GROUP BY DEPTNO
HAVING AVG(SAL) > 2000 -- 그룹핑 결과에 대한 조건 설정
ORDER BY DEPTNO DESC
;

-- SQL 실행순서
/*
    1. FROM
    2. WHERE
    3. GROUP BY
    4. HAVING
    5. SELECT
    6. ORDER BY
*/

