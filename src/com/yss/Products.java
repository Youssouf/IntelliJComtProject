package com.yss;

import java.math.BigDecimal;


/**
 * Created by yss on 29-04-2016.
 */
public class Products {
    private String productName;
    private int productID;
    private BigDecimal productPrice;

    public  Products(String productName)
    {
        this.productName = productName;
    }
    public Products(String productName, String productPrice)
    {
        this.productName = productName;
        this.productPrice =  new BigDecimal(productPrice);
    }

    public Products(String productName, int productID, String productPrice) {
        this(productName, productPrice);
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String price) {
        productPrice = new BigDecimal(price);
    }
    @Override
    public String toString()
    {
        return "Product Name: " + this.getProductName() + "\nProduct Id :" + this.getProductID() + "\nProduct Price " + this.getProductPrice();
    }
}
