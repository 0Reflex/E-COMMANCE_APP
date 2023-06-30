/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

/**
 *
 * @author eMiNe
 */

public class Product {
    private String  productName;
    private String productColor;
    private String productCategory;
    private String productStockInformation;
    private int stockNumber;
    private double productWeight;
    private String productDescriptionInformation;

    public Product(String productName, String productColor, String productCategory, String productStockInformation,int stockNumber, double productWeight, String productDescriptionInformation) {
        this.productName = productName;
        this.productColor = productColor;
        this.productCategory = productCategory;
        this.productStockInformation = productStockInformation;
        this.stockNumber = stockNumber;
        this.productWeight = productWeight;
        this.productDescriptionInformation = productDescriptionInformation;
    }
    public void writeAttributes(){
        System.out.println("product Name: "+ this.productName);
        System.out.println("product Color: "+ this.productColor);
        System.out.println("product Category: "+ this.productCategory);
        System.out.println("product Stock Information: "+ this.productStockInformation);
        System.out.println("stock Number: "+ this.stockNumber);
        System.out.println("product Weight: "+ this.productWeight);
        System.out.println("product Description Information: "+ this.productDescriptionInformation);
    }

    public void decreaseStock(int numberOfOrdering) {
        this.stockNumber -= numberOfOrdering;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductColor() {
        return productColor;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public String getProductStockInformation() {
        return productStockInformation;
    }

    public int getStockNumber() {
        return stockNumber;
    }


    public double getProductWeight() {
        return productWeight;
    }

    public String getProductDescriptionInformation() {
        return productDescriptionInformation;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductColor(String productColor) {
        this.productColor = productColor;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public void setProductStockInformation(String productStockInformation) {
        this.productStockInformation = productStockInformation;
    }

    public void setStockNumber(int stockNumber) {
        this.stockNumber = stockNumber;
    }


    public void setProductWeight(double productWeight) {
        this.productWeight = productWeight;
    }

    public void setProductDescriptionInformation(String productDescriptionInformation) {
        this.productDescriptionInformation = productDescriptionInformation;
    }
}




