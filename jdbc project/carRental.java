import java.sql.*;
import java.util.Scanner;

public class carRental {
    private static final String URL = "jdbc:mysql://LocalHost:3306/carRental";
    private static final String USER = "root";
    private static final String PASSWORD = "Rohan@2005";

    public static void main(String[] args) throws SQLException, Exception {
        try {
            Scanner sc = new Scanner(System.in);
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);

            int option;
            while (true) {
                System.out.println("CAR RENTAL SYSTEM");
                System.out.println("1. Insert car");
                System.out.println("2. Read all cars");
                System.out.println("3. Read car by ID");
                System.out.println("4. Update car by ID");
                System.out.println("5. Delete car by ID");
                System.out.println("6. Exit");
                System.out.println("");
                System.out.print("Enter your option: ");
                System.out.println("");
                option = sc.nextInt();

                switch (option) {
                    case 1 -> insertCar(connection, sc);
                    case 2 -> readAllCars(connection);
                    case 3 -> readCarById(connection, sc);
                    case 4 -> updateCarById(connection, sc);
                    case 5 -> deleteCarById(connection, sc);
                    case 6 -> {
                        System.out.println("Exiting...");
                        System.out.println("");
                        connection.close();
                        return;
                    }
                    default -> System.out.println("Invalid option. Please try again.");
                }
            }
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
            System.out.println("");
        }
    }

    static void insertCar(Connection conn, Scanner sc) throws SQLException {
        sc.nextLine(); 
        System.out.print("Model: ");
        String model = sc.nextLine();
        System.out.print("Brand: ");
        String brand = sc.nextLine();
        System.out.print("Year: ");
        int year = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Fuel Type: ");
        String fuel = sc.nextLine();
        System.out.print("Price per day: ");
        double price = sc.nextDouble();
        System.out.print("Available (true/false): ");
        boolean available = sc.nextBoolean();

        String sql = "INSERT INTO cars (model, brand, year, fuel_type, price_per_day, available) VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, model);
        stmt.setString(2, brand);
        stmt.setInt(3, year);
        stmt.setString(4, fuel);
        stmt.setDouble(5, price);
        stmt.setBoolean(6, available);

        int rows = stmt.executeUpdate();
        System.out.println(rows + " car(s) inserted.");
        System.out.println("-----------------------------");
        System.out.println("");
    }

    static void readCarById(Connection conn, Scanner sc) throws SQLException {
        System.out.print("Enter Car ID: ");
        int id = sc.nextInt();

        String sql = "SELECT * FROM cars WHERE carID = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, id);

        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            System.out.println("Model: " + rs.getString("model"));
            System.out.println("Brand: " + rs.getString("brand"));
            System.out.println("Year: " + rs.getInt("year"));
            System.out.println("Fuel Type: " + rs.getString("fuel_type"));
            System.out.println("Price/Day: " + rs.getDouble("price_per_day"));
            System.out.println("Available: " + rs.getBoolean("available"));
        } else {
            System.out.println("Car not found.");
        }
        System.out.println("-----------------------------");
        System.out.println("");
    }

    static void readAllCars(Connection conn) throws SQLException {
        String sql = "SELECT * FROM cars";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {
            System.out.println("Car ID: " + rs.getInt("carID"));
            System.out.println("Model: " + rs.getString("model"));
            System.out.println("Brand: " + rs.getString("brand"));
            System.out.println("Year: " + rs.getInt("year"));
            System.out.println("Fuel Type: " + rs.getString("fuel_type"));
            System.out.println("Price/Day: " + rs.getDouble("price_per_day"));
            System.out.println("Available: " + rs.getBoolean("available"));
            System.out.println("-----------------------------");
            System.out.println("");
        }
    }

    static void updateCarById(Connection conn, Scanner sc) throws SQLException {
        System.out.print("Enter Car ID to update: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("New Model: ");
        String model = sc.nextLine();
        System.out.print("New Brand: ");
        String brand = sc.nextLine();
        System.out.print("New Year: ");
        int year = sc.nextInt();
        sc.nextLine();
        System.out.print("New Fuel Type: ");
        String fuel = sc.nextLine();
        System.out.print("New Price per day: ");
        double price = sc.nextDouble();
        System.out.print("Available (true/false): ");
        boolean available = sc.nextBoolean();

        String sql = "UPDATE cars SET model = ?, brand = ?, year = ?, fuel_type = ?, price_per_day = ?, available = ? WHERE carID = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, model);
        stmt.setString(2, brand);
        stmt.setInt(3, year);
        stmt.setString(4, fuel);
        stmt.setDouble(5, price);
        stmt.setBoolean(6, available);
        stmt.setInt(7, id);

        int rows = stmt.executeUpdate();
        if (rows > 0) {
            System.out.println("Car updated successfully.");
        } else {
            System.out.println("Car not found.");
        }
        System.out.println("-----------------------------");
        System.out.println("");
    }

    static void deleteCarById(Connection conn, Scanner sc) throws SQLException {
        System.out.print("Enter Car ID to delete: ");
        int id = sc.nextInt();

        String sql = "DELETE FROM cars WHERE carID = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, id);

        int rows = stmt.executeUpdate();
        if (rows > 0) {
            System.out.println("Car deleted successfully.");
        } else {
            System.out.println("Car not found.");
        }
        System.out.println("-----------------------------");
        System.out.println("");
    }
}
