<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Annonce</title>
</head>
<body>
    <h1>Add Annonce</h1>
    <form method="post" action="">
        <label for="title">Title:</label><br>
        <input type="text" id="title" name="title"><br>
        <label for="description">Description:</label><br>
        <textarea id="description" name="description"></textarea><br>
        <label for="adress">Adress:</label><br>
        <input type="text" id="adress" name="adress"><br>
        <label for="mail">Email:</label><br>
        <input type="email" id="mail" name="mail"><br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>