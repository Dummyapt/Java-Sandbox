package de.dummyapt.sandbox.mariadbconnector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Logger;

class MariaDBConnector {
    private static final String URL = "jdbc:mariadb://[::1]:3306/ebkherne?user=ebkherne";
    private static final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    MariaDBConnector() {
        try (Connection connection = DriverManager.getConnection(URL);
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery("SELECT * FROM abteilungen;");
            while (resultSet.next()) {
                System.out.println(resultSet.getString(1) + " " + resultSet.getString(2));
            }
        } catch (Exception e) {
            LOGGER.severe(e.getMessage());
        }
    }

    public static void main(String[] args) {
        new MariaDBConnector();
    }
}