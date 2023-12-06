package Products;

public class Product implements IProduct{
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

    @Override
    public int getProductId() {
        return productId;
    }

    @Override
    public String getProductName() {
        return productName;
    }

    @Override
    public double getProductPrice() {
        return productPrice;
    }

    @Override
    public String getProductType() {
        return productType;
    }
}
