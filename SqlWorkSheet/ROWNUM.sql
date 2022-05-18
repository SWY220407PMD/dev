-- ROWNUM

-- 테이블명.컬럼명 (테이블명 생략 가능)
-- 테이블명 뒤에 해당 테이블의 별칭 지정 가능
SELECT ZZZ.EMPNO, ZZZ.ENAME, ZZZ.MGR
FROM EMP ZZZ
;

-- ROWNUM : 행(==ROW ==RECORD) 번호를 붙여줌
SELECT ROWNUM AS RNUM, E.*
FROM EMP E
WHERE ROWNUM >= 1
;
