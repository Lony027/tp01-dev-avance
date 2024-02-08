<%--
  Created by IntelliJ IDEA.
  User: layne
  Date: 2/8/24
  Time: 11:32 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="com.example.tp01.Annonce" %>
<%@ page import="java.util.ArrayList" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Liste Annonces</title>
</head>
<body>
<div class="container">
    <h1>Liste Annonces</h1>
    <table>
        <thead>
        <tr>
            <th scope="col">Titre</th>
            <th scope="col">Description</th>
            <th scope="col">Adresse</th>
            <th scope="col">Mail</th>
        </tr>
        </thead>
        <tbody>
        <% for (Annonce annonce : (ArrayList<Annonce>)request.getAttribute("annonces")) { %>
        <tr>
            <td><%= annonce.getTitle() %></td>
            <td><%= annonce.getDescription() %></td>
            <td><%= annonce.getAdress() %></td>
            <td><%= annonce.getMail() %></td>
        </tr>
        <% } %>
        </tbody>
    </table>
</div>
</body>
</html>
