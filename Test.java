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
public class Test {
    public static void main(String[] args) {

        CreditCard creditCard1 = new CreditCard(970513542 , "Emine Aydın" , "123" , "07/24");
        Product product1 = new Product("telephone" , "black" , "technology" , "yes" , 25 , 0.90 , "5.5 inch");
       // Product product2 = new Product("laptop" , "black" , "technology" , "no" , 0 , 2.5, "15.6 inch");
        User user1 = new User("Emine123", "Emine" , "Aydın" ,"123456", "30/01/2000" , "emineaydn72@gmail.com" ,
                "Yılanlı Mahallesi Çamlıdere/ANKARA" ,"Celal Bayar University Yunusemre/MANİSA", creditCard1 );
  
       
       // user1.addFavoriteProduct(product1);
        
        //user1.orderProduct(product1, 5);
        System.out.println("...............................");
        //user1.addFavoriteProduct(product2);
        
       //user1.orderProduct(product2, 5);
        //System.out.println("-----------------------------");
        //user1.orderProduct(product1, 30);
        Order order1 = new Order( user1 , product1 , creditCard1, 5);
        
        System.out.println("---------------------------");
       //user1.writeAttributes();
        System.out.println("---------------------------");
       // creditCard1.writeAttributes();
       System.out.println("---------------------------");
       //product1.writeAttributes();
       //System.out.println("---------------------------");
       // product2.writeAttributes();
        //System.out.println("---------------------------");
        order1.writeAttributes();


    }
}

