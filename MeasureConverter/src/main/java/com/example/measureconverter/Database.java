package com.example.measureconverter;

import java.sql.*;

public class Database {

    // Az adatbáziskapcsolathoz szükséges változók, attól függően ki tesztel, kommentezze ki a saját localhost elérhetőségét!
    // Szilveszter:
    /*
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/progkorny_java?useUnicode=true&characterEncoding=UTF-8";
    private static final String DATABASE_USERNAME = "progkorny_java";
    private static final String DATABASE_PASSWORD = "NNAY3-cBd!SAnDwN";
    */

    // Laci:
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/rft?useUnicode=true&characterEncoding=UTF-8";
    private static final String DATABASE_USERNAME = "root";
    private static final String DATABASE_PASSWORD = "";

    public static void AddNewUser(String username, String password) {
        String query = "INSERT INTO users (user_name, password) VALUES (?, ?)";
        // Kapcsolat létrehozása fent deklarált változókkal
        try (Connection connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USERNAME, DATABASE_PASSWORD)) {
            // Utasítás
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setString(1, username);
                preparedStatement.setString(2, password);
                // Végrehajtása
                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean QueryUsers(String username, String password) {
        String query = "SELECT * FROM users WHERE user_name=? AND password=?";
        // 1.   Adatbáziskapcsolat létrehozása
        try (Connection connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USERNAME, DATABASE_PASSWORD)) {
            // 2.  Az utasítás létrehozása
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setString(1, username);
                preparedStatement.setString(2, password);
                // 3.  Az utasítás végrehajtása
                ResultSet result = preparedStatement.executeQuery();
                return result.next();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}
