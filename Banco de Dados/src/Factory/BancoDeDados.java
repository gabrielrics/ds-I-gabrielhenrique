package factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BancoDeDados {

    public Connection getConnection() {

        try {
            return DriverManager.getConnection("jdbc:mysql//localhost/projetojava", "seu-nome-de-usuario", "sua-senha");

        } catch (SQLException excecao) {
            throw new RuntimeException(excecao);

        }
    }

}
