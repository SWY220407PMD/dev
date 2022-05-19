-- �Լ� (���ڿ�)

-- SUBSTR(���ڿ�, ������ġ, ����)
SELECT SUBSTR('ABCDEFGHIJK', 3, 50)
FROM DUAL;

SELECT *
FROM EMP
WHERE ENAME LIKE '%' || SUBSTR('ABCDEFGHIJK', 5, 1) || '%'
;

-- CONCAT : ���ڿ� ��ġ�� ���
SELECT CONCAT('ABC', '�ɿ���')
FROM DUAL
;

-- TRIM : ���� ���� ����
-- LTROM : ���� ���� ����
-- RTRIM : ������ ���� ����
SELECT '   ABC   '
FROM DUAL;

SELECT TRIM('   AB   C   ')
FROM DUAL;

-- LOWER : �ҹ��ڷ� ����
-- UPPER : �빮�ڷ� ����
SELECT LOWER('ABC')
FROM DUAL;

-- REPLACE : ��ü�ϴ�
SELECT REPLACE('ABC', 'B', 'X')
FROM DUAL;

-- PAD : ���ϴ� ������ ��ŭ ��ĭ�� ä���� (���� ���ϴ� ���ڷ�)
-- LPAD
-- RPAD
SELECT LPAD('123', 5, '0') AS TEST
FROM DUAL;

-- INITCAP : ù���ڸ� �빮�ڷ� �ٲ���
SELECT INITCAP('abc')
FROM DUAL;

-- INSTR : Ư�� ���ڿ��� ���°�� �����ϴ��� Ȯ��
SELECT INSTR('ABCDEFGKH12345KH12345', 'KH', 5, 2)
FROM DUAL;

-- LENGTH : ���ڿ� ����
SELECT LENGTH('ABC123ZZZ�ȳ�')
FROM DUAL;




