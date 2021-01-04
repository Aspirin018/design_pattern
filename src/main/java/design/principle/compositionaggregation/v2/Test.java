package design.principle.compositionaggregation.v2;

public class Test {
    public static void main(String[] args) {
        ProductDao productDao = new ProductDao();
        productDao.setDbConnection(new MySQLConnection());
        productDao.addProduct();
        productDao.setDbConnection(new PostgreSQLConnection());
        productDao.addProduct();
    }
}
