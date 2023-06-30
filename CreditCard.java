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
public class CreditCard {
    private int creditCardNumber;
    private String creditCardUser;
    private String securityCode ;
    private String expirationDate;

    public CreditCard(int creditCardNumber, String creditCardUser, String securityCode, String expirationDate) {
        this.creditCardNumber = creditCardNumber;
        this.creditCardUser = creditCardUser;
        this.securityCode = securityCode;
        this.expirationDate = expirationDate;
    }
    public void writeAttributes(){
        System.out.println("credit Card Number: "+ this.creditCardNumber);
        System.out.println("credit Card User: "+ this.creditCardUser);
        System.out.println("security Code: "+ this.securityCode);
        System.out.println("expiration Date: "+ this.expirationDate);
    }

    public int getCreditCardNumber() {
        return creditCardNumber;
    }

    public String getCreditCardUser() {
        return creditCardUser;
    }

    public String getSecurityCode() {
        return securityCode;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setCreditCardNumber(int creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public void setCreditCardUser(String creditCardUser) {
        this.creditCardUser = creditCardUser;
    }

    public void setSecurityCode(String securityCode) {
        this.securityCode = securityCode;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }


}