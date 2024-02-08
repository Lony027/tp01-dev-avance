package com.example.tp01;

import com.example.tp01.ConnectionDB;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import com.example.tp01.Annonce;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "AnnonceList", value = "/annonce-list")
public class AnnonceList extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Connection connection = null;

        try {
            connection = ConnectionDB.getInstance();
            AnnonceDAO annonceDAO = new AnnonceDAO((connection));
            ArrayList<Annonce> annonces = annonceDAO.getAll();
            if (annonces == null) {
                return;
            }
            request.setAttribute("annonces", annonces);
            RequestDispatcher dispatcher = request.getRequestDispatcher("/AnnonceList.jsp");
            dispatcher.forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}