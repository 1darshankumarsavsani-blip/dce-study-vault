-- ============================================================
-- DCE SEMESTER 4: DATABASE MANAGEMENT SYSTEMS (PRACTICALS)
-- Subject: DBMS / Relational Database Design
-- ============================================================

CREATE DATABASE IF NOT EXISTS dce_database;
USE dce_database;

-- 1. Create Student Table
CREATE TABLE IF NOT EXISTS students (
    student_id INT AUTO_INCREMENT PRIMARY KEY,
    roll_no INT NOT NULL UNIQUE,
    full_name VARCHAR(100) NOT NULL,
    branch VARCHAR(50) DEFAULT 'Computer Engineering',
    semester INT DEFAULT 4,
    enrollment_year INT DEFAULT 2024
);

-- 2. Insert Sample Records
INSERT INTO students (roll_no, full_name, branch, semester, enrollment_year) VALUES
(101, 'Darshankumar Savsani', 'Computer Engineering', 4, 2024),
(102, 'Meet Parmar', 'Computer Engineering', 4, 2024),
(103, 'Jit Patel', 'Computer Engineering', 4, 2024);

-- 3. Practical Queries
SELECT * FROM students WHERE semester = 4;
SELECT branch, COUNT(*) AS total_students FROM students GROUP BY branch;
