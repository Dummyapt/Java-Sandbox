package de.dummyapt.java_sandbox.mariadbconnector;

import java.sql.DriverManager;

final class MariaDBConnector {
    private static final String URL = "jdbc:mariadb://[::1]:3306/ebkherne?user=root";

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
            e.printStackTrace();
        }
    }

    private static void printTable(StringBuilder table) {
        System.out.printf("""
                -------------------------------
                        Table structure
                -------------------------------
                %s%n""", table);
    }
}
