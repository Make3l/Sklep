import java.util.*;

public class Main {
    public static void main(String[] args){
        Product product1=new Product(0,"Apple",2.99);
        System.out.println(product1.toString());

        List<Product> products=new ArrayList<>(Arrays.asList(product1,new Product(1,"Banana",1.99),new Product(2,"Ketchup",6)));
        Map<Product,Integer>numberOfProducts=new HashMap<>();
        Random random=new Random();
        for(Product product:products)
        {
            int amount= random.nextInt(20)+1;
            System.out.println(product.GetName()+": "+amount);
            numberOfProducts.put(product,amount);
        }
        Shop shop1=new Shop(products,numberOfProducts);
        shop1.PrintStock();
    }
}