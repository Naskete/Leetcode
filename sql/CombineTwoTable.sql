SELECT Person.firstName, Person.lastname, Address.city, Address.state FROM Person LEFT JOIN Address USING(personId);
-- USING()
-- using()用于两张表的join查询，而且在using()中指定的列在两个表中均存在，并且作为join的条件