import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCexample {
    private static final String URL = "jdbc:postgresql://localhost/postgres?user=postgres&password=qwerty";
    private static String conok="Соединение с бд установлено";
    private static String conerr="Произошла ошибка подключения к бд";
    static String SQL = "SELECT * from tests";


    public static void main(String[] args) {
        List<Test> list = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(URL);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(SQL)) {
            System.out.println(String.format("%s", conok));
            statement.execute("INSERT INTO tests (name) VALUES ('bob'), ('max')");
            while (resultSet.next()) {
                Test test = new Test(
                        resultSet.getLong("ID"),
                        resultSet.getString("name")
                        );
                list.add(test);
            }
        } catch (SQLException e) {
            System.out.println(String.format("%s", conerr));
            e.printStackTrace();
        }
        System.out.println(list.size());
        System.out.println(list.toString());
    }

    public static class Test {

        private String name;
        private Long id;

        public Test(Long id, String name) {
            this.id = id;
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Test{" +
                    "name='" + name + '\'' +
                    ", id=" + id +
                    '}';
        }
    }
}
