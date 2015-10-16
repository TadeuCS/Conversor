package Util.Classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conexao {

    PropertiesManager prop;
    Connection con;
    Statement st;

    public Conexao() {
        prop = new PropertiesManager();
    }


    public Statement getConexao(String ip, String diretorio,String usuario, String senha) {
        try {
            Class.forName("org.firebirdsql.jdbc.FBDriver");
            con = DriverManager.getConnection(
                    "jdbc:firebirdsql://" + ip + ":3050/" + diretorio,
                    usuario,
                    senha.toLowerCase());
            st = con.createStatement();
            return st;
        } catch (Exception e) {
            return null;
        }
    }

}
