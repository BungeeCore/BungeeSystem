package me.bungeecore.bungee.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CoinsSQL {

    private static Connection connection;

    private static boolean isConnect() {
        return connection != null;
    }

    public static void connect() {
        if (!isConnect()) {
            try {
                connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Coins?autoReconnect=true", "root", "");
            } catch (SQLException ex) {
                ex.printStackTrace();
                System.out.print("Did you specify correct data?");
            }
        }
    }
}
