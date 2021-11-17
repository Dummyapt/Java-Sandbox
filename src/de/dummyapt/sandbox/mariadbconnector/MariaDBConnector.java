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
            var columnCount = resultSet.getMetaData().getColumnCount();
            var table = new StringBuilder();

            while (resultSet.next()) {
                for (var i = 1; i <= columnCount; i++) {
                    table.append(resultSet.getString(i));
                    if (i == columnCount)
                        table.append("\n");
                    else
                        table.append(" ");
                }
            }

            printTable(table);
        } catch (Exception e) {
            LOGGER.severe(e.getMessage());
        }
    }

    private static void printTable(StringBuilder table) {
        System.out.printf("""
                -------------------------------
                        Table structure
                -------------------------------
                %s""", table);
    }
}