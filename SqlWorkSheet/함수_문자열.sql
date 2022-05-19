-- 함수 (문자열)

-- SUBSTR(문자열, 시작위치, 갯수)
SELECT SUBSTR('ABCDEFGHIJK', 3, 50)
FROM DUAL;

SELECT *
FROM EMP
WHERE ENAME LIKE '%' || SUBSTR('ABCDEFGHIJK', 5, 1) || '%'
;

-- CONCAT : 문자열 합치는 기능
SELECT CONCAT('ABC', '심원용')
FROM DUAL
;

-- TRIM : 양쪽 공백 제거
-- LTROM : 왼쪽 공백 제거
-- RTRIM : 오른쪽 공백 제거
SELECT '   ABC   '
FROM DUAL;

SELECT TRIM('   AB   C   ')
FROM DUAL;

-- LOWER : 소문자로 변경
-- UPPER : 대문자로 변경
SELECT LOWER('ABC')
FROM DUAL;

-- REPLACE : 대체하다
SELECT REPLACE('ABC', 'B', 'X')
FROM DUAL;

-- PAD : 원하는 사이즈 만큼 빈칸을 채워줌 (내가 원하는 문자로)
-- LPAD
-- RPAD
SELECT LPAD('123', 5, '0') AS TEST
FROM DUAL;

-- INITCAP : 첫글자를 대문자로 바꿔줌
SELECT INITCAP('abc')
FROM DUAL;

-- INSTR : 특정 문자열이 몇번째에 존재하는지 확인
SELECT INSTR('ABCDEFGKH12345KH12345', 'KH', 5, 2)
FROM DUAL;

-- LENGTH : 문자열 길이
SELECT LENGTH('ABC123ZZZ안녕')
FROM DUAL;




