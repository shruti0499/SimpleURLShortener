import java.sql.*;

public class UrlRepository {
    private final String jdbcUrl = "jdbc:mysql://localhost:3306/urlshortener";
    private final String jdbcUser = "root";
    private final String jdbcPassword = "password";

    public void save(String key, String originalUrl) throws SQLException {
        try (Connection conn = DriverManager.getConnection(jdbcUrl, jdbcUser, jdbcPassword)) {
            String query = "INSERT INTO urls (short_key, original_url) VALUES (?, ?)";
            try (PreparedStatement stmt = conn.prepareStatement(query)) {
                stmt.setString(1, key);
                stmt.setString(2, originalUrl);
                stmt.executeUpdate();
            }
        }
    }

    public String findOriginalUrl(String key) throws SQLException {
        try (Connection conn = DriverManager.getConnection(jdbcUrl, jdbcUser, jdbcPassword)) {
            String query = "SELECT original_url FROM urls WHERE short_key =?";
            try (PreparedStatement stmt = conn.prepareStatement(query)) {
                stmt.setString(1, key);
                try (ResultSet rs = stmt.executeQuery()) {
                    if (rs.next()) {
                        return rs.getString("original_url");
                    }
                }
            }
        }
        return null;
    }
}
