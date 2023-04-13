package Factory;

import java.sql.Connection;
import java.sql.SQLException;


public class TestaConexao {
    public static void main(String[] args) throws SQLException {
        
        
        Connection connection = new ConnectionFactory().getConnection();
        System.out.println("Conexão aberta!");
        connection.close();

    }
}

/*try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            System.out.println("Conexão Aberta!");
        } catch (Exception ex) {
            // handle the error
        }*/