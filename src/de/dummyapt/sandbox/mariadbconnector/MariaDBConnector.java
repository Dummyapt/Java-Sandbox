package de.dummyapt.sandbox.mariadbconnector;

import java.sql.DriverManager;
import java.util.logging.Logger;

class MariaDBConnector {
    private static final String URL = "jdbc:mariadb://[::1]:3306/ebkherne?user=ebkherne";
    private static final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public static void main(String[] args) {
        try (var connection = DriverManager.getConnection(URL);
             var statement = connection.createStatement()) {
            var resultSet = statement.executeQuery("SELECT * FROM ebkherne.mitarbeiter;");

            var sb = new StringBuilder();
            while (resultSet.next()) {
                sb.append(resultSet.getString(1)).append(" ")
                        .append(resultSet.getString(2)).append(" ")
                        .append(resultSet.getString(3)).append(" ")
                        .append(resultSet.getString(4)).append("\n");
            }
            System.out.println(sb);
        } catch (Exception e) {
            LOGGER.severe(e.getMessage());
        }
    }
}