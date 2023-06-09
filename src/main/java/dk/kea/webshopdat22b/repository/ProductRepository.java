package dk.kea.webshopdat22b.repository;

import dk.kea.webshopdat22b.model.Product;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {

    //database-properties
    private final  String DB_URL ="jdbc:mysql://jaco170wmysql.mysql.database.azure.com:3306/webshopdat22b";
    private final  String UID ="jaco170w";
    private final  String PWD ="K16b6tw#12345";

    public List<Product> getAll() {
        List<Product> productList = new ArrayList<>();
        try {
            Connection connection = DriverManager.getConnection(DB_URL, UID, PWD);
            Statement statement = connection.createStatement();
            final String SQL_QUERY = "SELECT * FROM products";
            ResultSet resultSet = statement.executeQuery(SQL_QUERY);
            while(resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                double price = resultSet.getDouble(3);
                Product product = new Product(id, name, price);
                productList.add(product);
                System.out.println(product);
            }

        }
        catch(SQLException e) {
            System.out.println("Cannot connect to database.");
            e.printStackTrace();
        }
        return productList;
    }
}
