import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Alex on 08.02.2017.
 */
public class AutoSDB {
    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.OracleDriver");

            Connection conn = null;
            try {
                conn = DriverManager.getConnection(
                        "jdbc:oracle:thin://@Alyoshkin-Pc:1521:orcl",
                        "JUSER", "JUSER");
            } catch (SQLException e) {
                e.printStackTrace();
            }

            if (conn == null) {
                System.out.println("Нет соединения с БД!");
                System.exit(0);
            }
            //class="listing-item__name"
            //String htmlSt = htmlFile.html().toString().replace("&", "").replace("]", "");
            //  System.out.println(htmlSt);

            //Statement stmt = conn.createStatement();
            //stmt.execute(//"declare htmlt clob; " +
            //     "  begin " +
            //    "htmlt := to_clob(q'[ " + htmlSt +" ]');"+
            //   //"html_ins_proc(htmlt); " +
            //  "end;");//"insert into t_html values('" +
            //                       htmlSt +
            //                     "', sysdate)");


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
