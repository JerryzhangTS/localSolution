import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;


public class Main {
    public static void main(String[] args) throws Exception {
        HikariConfig config = new HikariConfig();
        config.setMinimumIdle(1);
        config.setMaximumPoolSize(2);
        config.setConnectionTestQuery("SELECT 1");
        config.setJdbcUrl("jdbc:mysql://localhost:4306/invoice");
        config.setUsername("porta");
        config.setPassword("porta");
        config.setDriverClassName("com.mysql.jdbc.Driver");
        config.addDataSourceProperty("cachePrepStmts", "true");
        config.addDataSourceProperty("prepStmtCacheSize", "250");
        config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");
        HikariDataSource ds = new HikariDataSource(config);
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            conn = ds.getConnection();
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select * from invoice.invoice_input");
            int i=1;
            while (rs.next()) {
                System.out.println(rs.getRowId(i++).toString());
            }
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            close(rs);
            close(stmt);
            close(conn);
        }

    }

    static void close(AutoCloseable rs) throws Exception {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    static DSLContext getDSLContext() {
        try {
            Connection connection =
                    DriverManager.getConnection("jdbc:mysql://localhost:4306/invoice", "porta","porta");
            return DSL.using(connection, SQLDialect.MYSQL);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
