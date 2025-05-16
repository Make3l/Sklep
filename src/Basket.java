import java.util.HashMap;
import java.util.Map;

public class Basket {
    private Map<Product,Integer> basket=new HashMap<>();

    public Basket(){}

    public void AddToBasket(Product product,Shop shop,int amount){
        if(shop.GetProductAmount(product)<amount)
            System.out.println("Unfortunately we do not have requested amount of "+product.GetName());
        else
            basket.put(product,amount);
    }

    public void RemoveFromBasket(Product product){
        basket.remove(product);
    }

    public void PrintBasket(){
        System.out.println("Your basket:");
        for(Map.Entry<Product,Integer>it: basket.entrySet())
            System.out.println("    "+it.getKey().GetName()+": "+it.getValue());
    }
}
