-- �����ϱ� (ORDER BY)
SELECT *
FROM EMP
ORDER BY SAL ASC --�������� ����
-- ORDER BY SAL DESC --�������� ����
;

SELECT *
FROM EMP
WHERE SAL >= 1000
ORDER BY SAL ASC , ENAME DESC -- ���� Į���� �̿��Ͽ� ���� ����
;