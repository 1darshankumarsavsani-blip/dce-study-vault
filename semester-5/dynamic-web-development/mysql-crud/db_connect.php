<?php
// Database Connection Config
$host = "localhost";
$user = "root";
$pass = "";
$db   = "dce_db";

$conn = new mysqli($host,$user, $pass,$db);
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}
echo "Connected successfully to MySQL!";
?>
