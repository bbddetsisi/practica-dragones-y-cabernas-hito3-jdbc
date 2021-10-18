import java.sql.Connection;
import java.sql.DriverManager;

public class Main {

    // @TODO: Sustituya xxxx por los parámetros de su conexión
    private static final String DB_SERVER = "xxxx";
    private static final int DB_PORT = xxxx;
    private static final String DB_NAME = "xxxx";
    private static final String DB_USER = "xxxx";
    private static final String DB_PASS = "xxxx";

    private static Connection conn;

    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver").newInstance();

        String url = "jdbc:mysql://" + DB_SERVER + ":" + DB_PORT + "/" + DB_NAME;
        conn = DriverManager.getConnection(url, DB_USER, DB_PASS);

        // @TODO pruebe sus funciones

        conn.close();
    }

    // @TODO resuelva las siguientes funciones...
    public static ....
}
