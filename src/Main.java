import java.util.*;

public class Main {
    public static void main(String[] args){
        Product product1=new Product(0,"Apple",2.99);
        Product product2=new Product(1,"Banana",1.19);
        Product product3=new Product(2,"Coconut",4.99);

        Shop shop=new Shop();
        shop.AddProduct(product1,3);
        shop.AddProduct(product2,5);
        shop.AddProduct(product3,7);

        shop.AddProduct(product1,7);

        shop.PrintStock();
    }
}