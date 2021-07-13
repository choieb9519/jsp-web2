CREATE TABLE Board
(
	id INT PRIMARY KEY AUTO_INCREMENT,
	title VARCHAR(255) NOT NULL,
    body VARCHAR(2047) NOT NULL,
    memberId VARCHAR(255) NOT NULL,
    inserted TIMESTAMP DEFAULT NOW()
);

DESC Board;


SELECT * FROM tbl_board;
SELECT * FROM tbl_reply;
SELECT * FROM tbl_file;

CREATE TABLE tbl_board_file (
	id INT PRIMARY KEY AUTO_INCREMENT,
	bno INT REFERENCES tbl_board(bno),
	fileName VARCHAR(200) not null
);

DELETE FROM tbl_board_file;

ALTER TABLE tbl_board_file
ADD FOREIGN KEY (bno) REFERENCES tbl_board(bno);


CREATE TABLE tbl_member (
	userid VARCHAR(50) PRIMARY KEY,
    userpw VARCHAR(100) NOT NULL,
    username VARCHAR(100) NOT NULL,
    regdate TIMESTAMP DEFAULT NOW(),
    updateDate TIMESTAMP DEFAULT NOW(),
    enabled TINYINT(1) DEFAULT 1
);

CREATE TABLE tbl_member_auth (
	id INT PRIMARY KEY AUTO_INCREMENT,
	userid VARCHAR(50) NOT NULL,
    auth VARCHAR(50) NOT NULL,
    FOREIGN KEY (userid) REFERENCES tbl_member(userid)
);

SELECT * FROM tbl_member;
SELECT * FROM tbl_member_auth;

  SELECT 
	m.userid userid,
	m.userpw userpw,
	m.username username,
	m.enabled enabled,
	m.regdate regdate,
	m.updateDate updateDate,
	a.auth auth
  FROM 
    tbl_member m LEFT JOIN tbl_member_auth a ON m.userid = a.userid
  WHERE
    m.userid = 'admin';
    
create table persistent_logins (
    username varchar(64) not null,
    series varchar(64) primary key,
    token varchar(64) not null,
    last_used timestamp not null
);

UPDATE tbl_board
SET writer = 'member';

UPDATE tbl_reply
SET replyer = 'member';


ALTER TABLE tbl_board
ADD FOREIGN KEY (writer) REFERENCES tbl_member(userid);

SELECT * FROM tbl_board

ALTER TABLE tbl_reply
ADD FOREIGN KEY (replyer) REFERENCES tbl_member(userid);

