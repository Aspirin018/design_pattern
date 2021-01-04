package design.principle.compositionaggregation.v2;

public class ProductDao {
    private DBConnection dbConnection;

    public void setDbConnection(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public void addProduct() {
        System.out.println("使用" + dbConnection.getConnection() + "增加产品。");
    }
}
