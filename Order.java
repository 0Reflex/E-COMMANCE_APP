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


public class Order {
    private User orderingUser;
    private Product orderedProduct;
    private CreditCard creditCard;
    private final int numberOfOrdering;
    private final boolean status;

    public Order(User orderingUser, Product orderedProduct, CreditCard creditCard, int numberOfOrdering) {

        this.orderingUser = orderingUser;
        this.orderedProduct = orderedProduct;
        this.creditCard = creditCard;
        this.numberOfOrdering = numberOfOrdering;

        if (stockStatus(orderedProduct, numberOfOrdering)){
            this.status = true;
        }else{
            this.status = false;
        }
    }

    private boolean stockStatus (Product orderedProduct, int numberOfOrdering){
        if(orderedProduct.getStockNumber() >= numberOfOrdering){
            return true;
        }
        else{
            return false;
        }
    }

    public void writeAttributes(){
        System.out.println("ordering User: "+ this.orderingUser);
        this.orderingUser.writeAttributes();
        System.out.println("ordered Product: "+ this.orderedProduct);
        System.out.println("credit Card: "+ this.creditCard);
        System.out.println(this.numberOfOrdering + " has ordered");
        if(this.status){
            System.out.println("Order has succeed...");
        }else{
            System.out.println("Order has failed because of Stock Problem");
        }
    }
    public User getOrderingUser() {
        return orderingUser;
    }

    public Product getOrderedProduct() {
        return orderedProduct;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setOrderingUser(User orderingUser) {
        this.orderingUser = orderingUser;
    }

    public void setOrderedProduct(Product orderedProduct) {
        this.orderedProduct = orderedProduct;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public boolean getStatus() {
        return status;
    }

   
}




