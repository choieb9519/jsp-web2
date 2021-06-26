USE practice;
SELECT * from Member;
SELECT * FROM Board
ORDER BY id DESC;

SELECT * FROM Board b LEFT JOIN Comment c ON c.boardId = b.id
ORDER BY b.id DESC;

SELECT b.*, count(c.id) FROM Board b LEFT JOIN Comment c ON c.boardId = b.id
GROUP BY b.id
ORDER BY b.id DESC;


SELECT b.id boardId,
		b.title title,
		m.name name,
		count(c.id) numberOfComment,
		b.inserted 
FROM Board b 
JOIN Member m 
ON b.memberId = m.id 
LEFT JOIN Comment c
ON b.id = c.boardId
GROUP BY b.id
ORDER BY boardId DESC
;

SELECT m.*, count(b.id), count(c.id)
FROM Member m LEFT JOIN Board b ON m.id = b.memberId
LEFT JOIN Comment c ON m.id = c.memberId
WHERE m.id = 'aaa';

SELECT * FROM Board
WHERE memberId = 'aaa';