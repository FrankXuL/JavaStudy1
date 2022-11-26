package JDBC;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @title: DBUtil
 * @Author Xu
 * @Date: 20/11/2022 下午 8:51
 * @Version 1.0
 */
public class DBUtil {
    private static final String URL = "jdbc:mysql://127.0.0.1?ebook&charSetEncoding=utf8&useSSL=false";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "123456";

    private static volatile DataSource dataSource = null;

    public static DataSource getDataSource() {
        if (dataSource == null) {
            synchronized (DBUtil.class) {
                dataSource = new MysqlDataSource();
                ((MysqlDataSource) dataSource).setURL(URL);
                ((MysqlDataSource) dataSource).setUser(USERNAME);
                ((MysqlDataSource) dataSource).setPassword(PASSWORD);
            }
        }
        return dataSource;
    }

    public static Connection getConnection() throws SQLException {
        return getDataSource().getConnection();
    }

    public static void close(Connection connection, PreparedStatement statement, ResultSet resultSet) {
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) throws SQLException {
        Connection connection = DBUtil.getConnection();
    }
}