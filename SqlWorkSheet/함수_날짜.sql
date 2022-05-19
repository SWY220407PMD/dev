-- 함수 (날짜)

/*
    SYSDATE
    SYSTIMESTAMP
    CURRENT_TIMESTAMP
    CURRENT_DATE
*/

SELECT CURRENT_DATE
FROM DUAL;

-- EXTRACT : 추출
-- YEAR, MONTH, DAY, HOUR, MINUTE, SECOND
SELECT 
      EXTRACT(YEAR FROM SYSTIMESTAMP) AS 년도
    , EXTRACT(MONTH FROM SYSTIMESTAMP) AS 월
FROM DUAL;

-- NEXT_DAY : 가장 가까운 다음 날짜 (요일 지정)
SELECT NEXT_DAY(SYSDATE, '일')
FROM DUAL;

-- TO_DATE : 날짜로 변환
SELECT TO_DATE('2000/1/3')
FROM DUAL;

-- BETWEEN
SELECT MONTHS_BETWEEN(SYSDATE, TO_DATE('2021/05/19'))
FROM DUAL;

-- LAST_DAY
SELECT LAST_DAY('2022/2/3')
FROM DUAL;

-- ROUND
SELECT ROUND(SYSDATE, 'MONTH')
FROM DUAL;

-- TRUNC
SELECT TRUNC(TO_DATE('22/12/31'), 'MONTH')
FROM DUAL;



