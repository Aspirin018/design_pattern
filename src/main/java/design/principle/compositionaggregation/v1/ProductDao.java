package design.principle.compositionaggregation.v1;

import design.principle.compositionaggregation.v1.DBConnection;

public class ProductDao extends DBConnection {
    public void addProduct() {
        String conn = super.getConnection();
        System.out.println("使用" + conn + "增加产品。");
    }
}
