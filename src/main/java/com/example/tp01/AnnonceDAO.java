package com.example.tp01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AnnonceDAO {

    private final Connection connection;

    public AnnonceDAO(Connection connection) {
        this.connection = connection;
    }

    public ArrayList<Annonce> getAll() throws SQLException {
        ArrayList<Annonce> annonces = new ArrayList<Annonce>();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            preparedStatement = connection.prepareStatement("SELECT * FROM annonce");
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String id = resultSet.getString("id");
                String title = resultSet.getString("title");
                String description = resultSet.getString("description");
                String adress = resultSet.getString("adress");
                String mail = resultSet.getString("mail");
                System.out.println("LALALALALALALAL0" + title);
                Annonce annonce = new Annonce(id, title, description, adress, mail);
                annonces.add(annonce);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (resultSet != null) resultSet.close();
            if (preparedStatement != null) preparedStatement.close();
        }
        return annonces;
    }

    public Annonce getById(String id)  throws SQLException {
        Annonce annonce = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            preparedStatement = connection.prepareStatement("SELECT * FROM annonce WHERE id = " + id);
            resultSet = preparedStatement.executeQuery();

            String title = resultSet.getString("title");
            String description = resultSet.getString("description");
            String adress = resultSet.getString("adress");
            String mail = resultSet.getString("mail");
            System.out.println("LALALALALALALAL0" + title);
            annonce = new Annonce(id, title, description, adress, mail);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (resultSet != null) resultSet.close();
            if (preparedStatement != null) preparedStatement.close();
        }
        return annonce;
    }

    public void removeById(String id) throws SQLException{
        Annonce annonce = null;
        PreparedStatement preparedStatement = null;
        try {
            String sql = "DELETE FROM annonce WHERE id = " + id;
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (preparedStatement != null) preparedStatement.close();
        }
    }

}