-- 함수 (타입 변환) (TO_DATE, TO_NUMBER , TO_CHAR)

-- TO_DATE
SELECT TO_DATE('22.5.19')
FROM DUAL;

-- TO_CHAR
--SELECT TO_CHAR(SYSDATE)   --날짜 -> 문자열 변환 가능
SELECT TO_CHAR(12345)       --숫자 -> 문자열 변환 가능
FROM DUAL;

-- TO_CHAR (숫자 포맷 지정)
SELECT TO_CHAR(12345, '999,999,999,999,999,999,999') || '원'
FROM DUAL;

SELECT TO_CHAR(SYSDATE, 'YYYY"년"MM"월"DD"일"')
FROM DUAL;

-- TO_NUMBER
SELECT TO_NUMBER('123')
FROM DUAL;



