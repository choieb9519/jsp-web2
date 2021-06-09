USE practice;
DROP TABLE IF EXISTS Comment;
-- IF EXISTS 있으면 드롭, 없으면 드롭 안함
CREATE TABLE Comment
(
	id INT PRIMARY KEY AUTO_INCREMENT,
	comment VARCHAR(2047) NOT NULL,
	memberId VARCHAR(255) NOT NULL,
    boardId INT NOT NULL,
    insertes TIMESTAMP DEFAULT NOW(),
    FOREIGN KEY (memberId) REFERENCES Member(id),
    FOREIGN KEY (boardId) REFERENCES Board(id)
);