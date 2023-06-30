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


import java.util.ArrayList;


public class User {
    private String userName;
    private String name;
    private String surname;
    private String password;
    private String birthDay;
    private String emailAddresses;
    private String homeAddress;
    private String workAddress;
    private ArrayList<Product> productsOrdered;
    private ArrayList<Product> favoriteProducts;
    private CreditCard creditCard;

    public User(String userName, String name, String surname, String password, String birthDay, String emailAddresses, String homeAddress, String workAddress, CreditCard creditCard) {
        this.userName = userName;
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.birthDay = birthDay;
        this.emailAddresses = emailAddresses;
        this.homeAddress = homeAddress;
        this.workAddress = workAddress;
        this.productsOrdered = new ArrayList();
        this.favoriteProducts = new ArrayList();
        this.creditCard = creditCard;
    }
    public void writeAttributes(){
        System.out.println("Name: " + this.name);
        System.out.println("Surname: "+ this.surname);
        System.out.println("User Name: " + this.userName);
        System.out.println("Password: " + this.password);
        System.out.println("Birtday: " + this.birthDay);
        System.out.println("Email Addresses: " +  this.emailAddresses);
        System.out.println("home AAddresses: "+ this.homeAddress);
        System.out.println("Work Addresess: "+ this.workAddress);
        System.out.println("Credit Card: "+ this.creditCard.getCreditCardNumber());
        this.creditCard.writeAttributes();

    }

    // The first desired method
    // This method allows ordering products from a user created on the User class.
    public void orderProduct(Product product, int numberOfOrdering) {

        Order order = new Order(this, product, this.creditCard, numberOfOrdering );

        if(order.getStatus()){
            System.out.println("ORDER SUCCEED: ");
            System.out.println("Number of product before ordering : " + product.getStockNumber());
            product.decreaseStock(numberOfOrdering);
            System.out.println("Number of product after ordering : " + product.getStockNumber());
        }else {
            System.out.println("ORDER FAILED !!!!!");
        }

    }

    // The second desired method
    // With this method, a new product can be added to the list of favorite products defined in the User class.
    public void addFavoriteProduct(Product product) {
        favoriteProducts.add(product);
        System.out.println("favorite Product: "+product.getProductName());
    }

    public String getUserName() {
        return userName;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPassword() {
        return password;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public String getEmailAddresses() {
        return emailAddresses;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public String getWorkAddress() {
        return workAddress;
    }

    public ArrayList<Product> getProductsOrdered() {
        return productsOrdered;
    }

    public ArrayList<Product> getFavoriteProducts() {
        return favoriteProducts;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public void setEmailAddresses(String emailAddresses) {
        this.emailAddresses = emailAddresses;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public void setWorkAddress(String workAddress) {
        this.workAddress = workAddress;
    }

    public void setProductsOrdered(ArrayList<Product> productsOrdered) {
        this.productsOrdered = productsOrdered;
    }

    public void setFavoriteProducts(ArrayList<Product> favoriteProducts) {
        this.favoriteProducts = favoriteProducts;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }
}