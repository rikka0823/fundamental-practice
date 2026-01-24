-- https://hackmd.io/@_7vFEnkKTve5g-aFhT8EvQ/Sy-H0QeWr

-- 1.查詢學生表的前10條資料
SELECT * FROM student LIMIT 10;

-- 2.查詢成績表所有成績的最低分,平均分,總分
SELECT MIN(sc.score) AS min_score, AVG(sc.score) AS avg_score, SUM(sc.score) as sum_score
FROM score AS sc;

-- 3.查詢老師 “諶燕” 所帶的課程設數量
SELECT t.tname, COUNT(c.cno) AS courses
FROM teacher AS t
LEFT JOIN course AS c ON t.tno = c.tno
WHERE t.tname = '諶燕'
GROUP BY t.tname;

-- 4.查詢所有老師所帶的課程數量
SELECT t.tname, COUNT(c.cno) AS courses
FROM teacher AS t
LEFT JOIN course AS c ON t.tno = c.tno
GROUP BY t.tname;

-- 5.查詢姓”張”的學生名單
SELECT * FROM student WHERE sname LIKE '張%';

-- 6.查詢課程名稱為'Oracle'且分數低於60的學號和分數
SELECT sc.sno AS no, c.cname as course_name, sc.score as score
FROM course AS c
JOIN score AS sc ON c.cno = sc.cno
WHERE c.cname = 'Oracle' AND sc.score < 60;

-- 7.查詢所有學生的選課課程名稱
SELECT s.sno AS no, c.cname AS course_name
FROM student AS s
LEFT JOIN score AS sc ON s.sno = sc.sno
LEFT JOIN course AS c ON sc.cno = c.cno;

-- 8.查詢任何一門課程成績在70分以上的學生姓名、課程名稱和分數
SELECT s.sname AS name, c.cname AS course_name, sc.score AS score
FROM score AS sc
JOIN student AS s ON sc.sno = s.sno
JOIN course AS c ON sc.cno = c.cno
WHERE sc.score > 70;

-- 9.查詢不及格的課程,並按課程號從大到小排列，學號,課程號,課程名,分數
SELECT s.sno AS no, c.cno AS course_no, c.cname AS course_name, sc.score AS score
FROM score AS sc
JOIN student AS s ON sc.sno = s.sno
JOIN course AS c ON sc.cno = c.cno
WHERE sc.score < 60
ORDER BY course_no DESC;

-- 10.查詢沒學過”諶燕”老師講授的任一門課程的學號,學生姓名
SELECT sno AS no, sname AS name
FROM student
WHERE sno NOT IN (
	SELECT sc.sno
	FROM score AS sc
	JOIN course AS c ON sc.cno = c.cno
	JOIN teacher AS t ON c.tno = t.tno
    WHERE t.tname = '諶燕'
);

-- 11.查詢兩門以上不及格課程的同學的學號及其平均成績
SELECT sno AS no, AVG(score) AS avg_score
FROM score
WHERE sno IN (
	SELECT sno
	FROM score
	WHERE score < 60
	GROUP BY sno
	HAVING COUNT(*) >= 2
)
GROUP BY sno;

SELECT sno AS no, AVG(score) AS avg_score
FROM score
GROUP BY sno
HAVING SUM(CASE WHEN score < 60 THEN 1 ELSE 0 END) >= 2;

-- 12.檢索'c004'課程分數小於60,按分數降序排列的同學學號
SELECT sno, score
FROM score
WHERE cno = 'c004' AND score < 60
ORDER BY score DESC;

-- 13.查詢'c001'課程比'c002'課程成績高的所有學生的學號
SELECT a.sno AS no
FROM score AS a
JOIN score AS b ON a.sno = b.sno
WHERE a.cno = 'c001' AND b.cno = 'c002' AND a.score > b.score;

-- 14.查詢平均成績大於60分的同學的學號和平均成績
SELECT sno AS no, AVG(score) AS avg_score
FROM score
GROUP BY sno
HAVING AVG(score) > 60;

-- 15.查詢所有同學的學號.姓名.選課數.總成績
SELECT s.sno AS no, s.sname AS name, COUNT(cno) AS course_quantity, SUM(score) AS sum_score
FROM student AS s
LEFT JOIN score AS sc ON s.sno = sc.sno
GROUP BY s.sno;

-- 16.查詢姓”劉”的老師的個數
SELECT COUNT(*) AS teacher_count
FROM teacher
WHERE tname LIKE '劉%';

-- 17.查詢只學”諶燕”老師所教的課的同學的學號、姓名
SELECT  s.sno AS no, s.sname AS name
FROM student AS s
JOIN score AS sc ON s.sno = sc.sno
JOIN course AS c ON sc.cno = c.cno
JOIN teacher AS t ON c.tno = t.tno
GROUP BY s.sno, s.sname
HAVING COUNT(DISTINCT t.tno) = 1 AND MAX(t.tname) = '諶燕';

-- 18.查詢學過”c001″並且也學過編號”c002″課程的同學的學號、姓名
 SELECT s.sno AS no, s.sname AS name
 FROM student AS s
 JOIN score AS a ON s.sno = a.sno
 JOIN score AS b ON s.sno = b.sno
 WHERE a.cno = 'c001' AND b.cno = 'c002';

 SELECT s.sno AS no, s.sname AS name
 FROM student AS s
 JOIN score AS sc1 ON s.sno = sc1.sno AND sc1.cno = 'c001'
 JOIN score AS sc2 ON s.sno = sc2.sno AND sc2.cno = 'c002';

SELECT s.sno AS no, s.sname AS name
FROM student AS s
JOIN score AS sc ON s.sno = sc.sno
WHERE sc.cno IN ('c001', 'c002')
GROUP BY s.sno, s.sname
HAVING COUNT(DISTINCT sc.cno) = 2;

SELECT s.sno AS no, s.sname AS name
FROM student AS s
WHERE EXISTS (
	SELECT 1 FROM score AS sc WHERE sc.sno = s.sno AND cno = 'c001'
)
AND EXISTS (
	SELECT 1 FROM score AS sc WHERE sc.sno = s.sno AND cno = 'c002'
);

-- 19.查詢學過”諶燕”老師所教的所有課的同學的學號、姓名
SELECT s.sno AS no, s.sname AS name
FROM student AS s
JOIN score AS sc ON s.sno = sc.sno
JOIN course AS c ON sc.cno = c.cno
JOIN teacher AS t ON c.tno = t.tno
WHERE t.tname = '諶燕'
GROUP BY s.sno, s.sname;

--20.查詢課程編號”c004″的成績比課程編號”c001″和”c002″課程低的所有同學的學號、姓名
 SELECT s.sno AS no, s.sname AS name
 FROM student AS s
 JOIN score AS sc4 ON s.sno = sc1.sno AND sc1.cno = 'c004'
 JOIN score AS sc1 ON s.sno = sc2.sno AND sc2.cno = 'c001'
 JOIN score AS sc2 ON s.sno = sc3.sno AND sc3.cno = 'c002'
 WHERE sc4.score < sc1.score AND sc4.score < sc2.score;


create database sql50;

create table student(
 sno varchar(10) primary key,
 sname varchar(20),
 sage int,
 ssex varchar(5)
);

create table teacher(
 tno varchar(10) primary key,
 tname varchar(20)
);

create table course(
 cno varchar(10),
 cname varchar(20),
 tno varchar(20),
 constraint pk_course primary key (cno, tno)
);

create table score(
 sno varchar(10),
 cno varchar(10),
 score decimal(4,2),
 constraint pk_sc primary key (sno, cno)
);

insert into student values ('s001','張三',23,'男');
insert into student values ('s002','李四',23,'男');
insert into student values ('s003','吳鵬',25,'男');
insert into student values ('s004','琴沁',20,'女');
insert into student values ('s005','王麗',20,'女');
insert into student values ('s006','李波',21,'男');
insert into student values ('s007','劉玉',21,'男');
insert into student values ('s008','蕭蓉',21,'女');
insert into student values ('s009','陳蕭曉',23,'女');
insert into student values ('s010','陳美',22,'女');
insert into student values ('s011','王麗',24,'女');
insert into student values ('s012','蕭蓉',20,'女');

insert into teacher values ('t001', '劉陽');
insert into teacher values ('t002', '諶燕');
insert into teacher values ('t003', '胡明星');

insert into course values ('c001','J2SE','t002');
insert into course values ('c002','Java Web','t002');
insert into course values ('c003','SSH','t001');
insert into course values ('c004','Oracle','t001');
insert into course values ('c005','SQL SERVER 2005','t003');
insert into course values ('c006','C#','t003');
insert into course values ('c007','JavaScript','t002');
insert into course values ('c008','DIV+CSS','t001');
insert into course values ('c009','PHP','t003');
insert into course values ('c010','EJB3.0','t002');

insert into score values ('s001','c001',78.9);
insert into score values ('s002','c001',80.9);
insert into score values ('s003','c001',81.9);
insert into score values ('s004','c001',50.9);
insert into score values ('s005','c001',59.9);
insert into score values ('s001','c002',82.9);
insert into score values ('s002','c002',72.9);
insert into score values ('s003','c002',82.9);
insert into score values ('s001','c003',59);
insert into score values ('s006','c003',99.8);
insert into score values ('s002','c004',52.9);
insert into score values ('s003','c004',20.9);
insert into score values ('s004','c004',59.8);
insert into score values ('s005','c004',50.8);
insert into score values ('s002','c005',92.9);
insert into score values ('s001','c007',78.9);
insert into score values ('s001','c010',78.9);