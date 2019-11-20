
/* Drop Tables */

DROP TABLE Course_application_details CASCADE CONSTRAINTS;
DROP TABLE Opening_subject CASCADE CONSTRAINTS;
DROP TABLE Subject CASCADE CONSTRAINTS;
DROP TABLE Professor CASCADE CONSTRAINTS;
DROP TABLE Student CASCADE CONSTRAINTS;




/* Create Tables */

CREATE TABLE Course_application_details
(
	Student_id varchar2(15) NOT NULL,
	Opening_subject_id number NOT NULL,
	Subject_id varchar2(15) NOT NULL,
	Subject_name varchar2(15) NOT NULL,
	Professor_name varchar2(15) NOT NULL,
	Lecture_time varchar2(15) NOT NULL,
	Lecture_room varchar2(15) NOT NULL,
	Score number NOT NULL
);


CREATE TABLE Opening_subject
(
	Opening_subject_id number NOT NULL,
	Professor_id varchar2(15) NOT NULL,
	Professor_name varchar2(15) NOT NULL,
	Subject_id varchar2(15) NOT NULL,
	Subject_name varchar2(15) NOT NULL,
	Lecture_time varchar2(15) NOT NULL,
	Lecture_room varchar2(15) NOT NULL,
	Score number NOT NULL,
	Applicant_personnel number NOT NULL,
	Allowed_personnel number NOT NULL,
	PRIMARY KEY (Opening_subject_id)
);


CREATE TABLE Professor
(
	Professor_id varchar2(15) NOT NULL,
	Professor_pw varchar2(15) NOT NULL,
	Professor_name varchar2(15) NOT NULL,
	Professor_date date,
	PRIMARY KEY (Professor_id)
);


CREATE TABLE Student
(
	Student_id varchar2(15) NOT NULL,
	Student_pw varchar2(15) NOT NULL,
	Student_residence_num varchar2(15) NOT NULL UNIQUE,
	Student_name varchar2(15) NOT NULL,
	Student_grade number NOT NULL,
	Student_dept varchar2(15) NOT NULL,
	PRIMARY KEY (Student_id)
);


CREATE TABLE Subject
(
	Subject_id varchar2(15) NOT NULL,
	Subject_name varchar2(15) NOT NULL,
	Professor_id varchar2(15) NOT NULL,
	Professor_name varchar2(15),
	PRIMARY KEY (Subject_id)
);



/* Create Foreign Keys */

ALTER TABLE Course_application_details
	ADD FOREIGN KEY (Opening_subject_id)
	REFERENCES Opening_subject (Opening_subject_id)
;


ALTER TABLE Opening_subject
	ADD FOREIGN KEY (Professor_id)
	REFERENCES Professor (Professor_id)
;


ALTER TABLE Subject
	ADD FOREIGN KEY (Professor_id)
	REFERENCES Professor (Professor_id)
;


ALTER TABLE Course_application_details
	ADD FOREIGN KEY (Student_id)
	REFERENCES Student (Student_id)
;


ALTER TABLE Opening_subject
	ADD FOREIGN KEY (Subject_id)
	REFERENCES Subject (Subject_id)
;



