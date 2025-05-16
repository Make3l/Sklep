import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Shop {
    private List<Product>products=new ArrayList<>();
    private Map<Product,Integer> numberOfProducts=new HashMap<>();
    Shop( List<Product>products,Map<Product,Integer> numberOfProducts){
        this.products=products;
        this.numberOfProducts=numberOfProducts;
    }
    void IncrementProductNumber(Product product, int amount){
        numberOfProducts.put(product,numberOfProducts.get(product)+amount);
    }
    void NewProduct(Product product,int amount){
        products.add(product);
        numberOfProducts.put(product,amount);
    }

    void PrintStock(){
        System.out.println("In stock: ");
        for(Map.Entry<Product,Integer> it: numberOfProducts.entrySet())
            System.out.println(" "+it.getKey().GetName()+": "+it.getValue());
    }

}
