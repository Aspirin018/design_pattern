package design.principle.compositionaggregation.v2;

public class PostgreSQLConnection extends DBConnection{
    @Override
    public String getConnection() {
        return "PostgreSQL连接";
    }
}
