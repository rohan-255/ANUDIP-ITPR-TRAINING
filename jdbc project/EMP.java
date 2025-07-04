import java.sql.*;
import java.util.Scanner;

public class EMP {
    // Database credentials
    private static final String URL = "jdbc:mysql://localhost:3306/emp";
    private static final String USER = "root";
    private static final String PASSWORD = "Rohan@2005";

    public static void main(String[] args) throws SQLException, Exception {
        try {
            Scanner scanner = new Scanner(System.in);
            // Step 1: Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Establish connection
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);

            int choice;
            do {
                displayMenu();
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter Employee ID: ");
                        int id = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        System.out.print("Enter Employee Name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter Employee Email: ");
                        String email = scanner.nextLine();
                        System.out.print("Enter Age: ");
                        int age = scanner.nextInt();
                        System.out.print("Enter Salary: ");
                        double salary = scanner.nextDouble();
                        insertData(connection, id, name, email, age, salary);
                        break;

                    case 2:
                        retrieveData(connection);
                        break;

                    case 3:
                        System.out.print("Enter Employee ID to search: ");
                        int searchId = scanner.nextInt();
                        search(connection, searchId);
                        break;

                    case 4:
                        System.out.print("Enter Employee ID to update: ");
                        int updateId = scanner.nextInt();
                        System.out.print("Enter new Email: ");
                        String newEmail = scanner.next();
                        updateData(connection, updateId, newEmail);
                        break;

                    case 5:
                        System.out.print("Enter Employee ID to delete: ");
                        int deleteId = scanner.nextInt();
                        deleteData(connection, deleteId);
                        break;

                    case 6:
                        System.out.println("Exiting...");
                        break;

                    default:
                        System.out.println("Invalid choice. Please try again.");
                }

            } while (choice != 6);

            connection.close();
            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void displayMenu() {
        System.out.println("1. Add Employee");
        System.out.println("2. View Employees");
        System.out.println("3. Search Employee");
        System.out.println("4. Update Employee");
        System.out.println("5. Delete Employee");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
    }

    // Insert Data Method
    private static void insertData(Connection connection, int id, String name, String email, int age, Double salary) throws SQLException {
        String insertSQL = "INSERT INTO employees (id, name, email, age, salary) VALUES (?, ?, ?, ?, ?)";

        try (PreparedStatement pstmt = connection.prepareStatement(insertSQL)) {
            pstmt.setInt(1, id);
            pstmt.setString(2, name);
            pstmt.setString(3, email);
            pstmt.setInt(4, age);
            pstmt.setDouble(5, salary);
            pstmt.executeUpdate();
            System.out.println("Inserted: " + name);
            System.out.println();
            System.out.println();
        }
    }

    // Retrieve Data Method
    private static void retrieveData(Connection connection) throws SQLException {
        String selectSQL = "SELECT * FROM employees";

        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(selectSQL)) {
            System.out.println("User Data:");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name") + ", Email: " + rs.getString("email") +
                                   ", Age: " + rs.getInt("age") + ", Salary: " + rs.getDouble("salary"));
            }
            System.out.println();
            System.out.println();
        }
    }

    // Update Data Method
    private static void updateData(Connection connection, int id, String newEmail) throws SQLException {
        String updateSQL = "UPDATE employees SET email = ? WHERE id = ?";

        try (PreparedStatement pstmt = connection.prepareStatement(updateSQL)) {
            pstmt.setString(1, newEmail);
            pstmt.setInt(2, id);
            pstmt.executeUpdate();
            System.out.println("Updated email for ID: " + id);
            System.out.println();
            System.out.println();
        }
    }

    // Search Method
    private static void search(Connection connection, int searchId) throws SQLException {
        String searchSQL = "SELECT * FROM employees WHERE id = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(searchSQL)) {
            pstmt.setInt(1, searchId);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    System.out.println("ID: " + rs.getInt("id") +
                                       ", Name: " + rs.getString("name") +
                                       ", Email: " + rs.getString("email") +
                                       ", Age: " + rs.getInt("age") +
                                       ", Salary: " + rs.getDouble("salary"));
                } else {
                    System.out.println("No employee found with ID: " + searchId);
                }
                System.out.println();
                System.out.println();
            }
        }
    }

    // Delete Data Method
    private static void deleteData(Connection connection, int id) throws SQLException {
        String deleteSQL = "DELETE FROM employees WHERE id = ?";

        try (PreparedStatement pstmt = connection.prepareStatement(deleteSQL)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
            System.out.println("Deleted user with ID: " + id);
            System.out.println();
            System.out.println();
        }
    }
}

