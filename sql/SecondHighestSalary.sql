SELECT IFNULL((SELECT DISTINCT salary FROM Employee ORDER BY salary DESC LIMIT 1, 1), null) as SecondHighestSalary;

SELECT (SELECT DISTINCT salary FROM Employee ORDER BY salary DESC LIMIT 1 OFFSET 1) as SecondHighestSalary;

-- IFNULL(expression1, expression2)
-- expression1 不为null， 返回expression1
-- ~ 为null， 返回expression2