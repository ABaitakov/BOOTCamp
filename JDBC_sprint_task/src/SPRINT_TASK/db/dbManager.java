package SPRINT_TASK.db;

import org.postgresql.Driver;

import java.sql.*;
import java.util.ArrayList;

public class dbManager {
    private static Connection connection;
    static {
        try {

            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/javaee_2e", "postgres",
                    "postgres");

        }catch (Exception e){
            e.getStackTrace();
        }
    }
    public static ArrayList<Items> getItems () {
        ArrayList<Items> items = new ArrayList<>();
        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM t_items");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Items item = new Items();
                item.setId(resultSet.getLong("id"));
                item.setName(resultSet.getString("name"));
                item.setPrice(resultSet.getDouble("price"));
                item.setDescription(resultSet.getString("description"));
                items.add(item);
            }
            statement.close();
        }catch (Exception e){
            e.getStackTrace();
        }
        return items;
    }
    public static ArrayList<Users> getUsers () {
        ArrayList<Users> users = new ArrayList<>();
        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM t_users");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Users user = new Users();
                user.setId(resultSet.getLong("id"));
                user.setEmail(resultSet.getString("email"));
                user.setPassword(resultSet.getString("password"));
                user.setFullName(resultSet.getString("fullName"));
                users.add(user);
            }
            statement.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
        return users;
    }
    public static Users getUser(int id) {
        Users user = null;
        try {
            PreparedStatement statement = connection.prepareStatement(" "+
                    "SELECT * FROM t_users WHERE id=?");
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()){
                user = new Users();
                user.setId(resultSet.getLong("id"));
                user.setEmail(resultSet.getString("email"));
                user.setPassword(resultSet.getString("password"));
                user.setFullName(resultSet.getString("fullName"));
            }
            statement.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return user;
    }
}
