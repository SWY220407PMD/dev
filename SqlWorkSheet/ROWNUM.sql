-- ROWNUM

-- ���̺��.�÷��� (���̺�� ���� ����)
-- ���̺�� �ڿ� �ش� ���̺��� ��Ī ���� ����
SELECT ZZZ.EMPNO, ZZZ.ENAME, ZZZ.MGR
FROM EMP ZZZ
;

-- ROWNUM : ��(==ROW ==RECORD) ��ȣ�� �ٿ���
SELECT ROWNUM AS RNUM, E.*
FROM EMP E
WHERE ROWNUM >= 1
;
