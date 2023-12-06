package Products;

public class Product {
    private int productId;
    private String productName;
    private double productPrice;
    private String productType;

    public Product(int productId, String productName, double productPrice, String productType) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productType = productType;
    }

    public Product(int productId, String productName, double productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        productType = "Non Eatable";
    }

    @Override
    public String toString() {
        return productId+" "+productName+" "+productPrice+" "+productType;
    }
}
