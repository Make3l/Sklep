import java.util.HashMap;
import java.util.Map;

public class Shop {
    private Map<Product,Integer> products=new HashMap<>();

    Shop(){}
    Shop(Map<Product,Integer> products){
        this.products=products;
    }

    public void AddProduct(Product product,int amount){
        if(products.containsKey(product))
            products.put(product,products.get(product)+amount);
        else
            products.put(product,amount);
    }

    public boolean ReduceProductAmount(Product product,int amount){
        Integer amountInStock=products.get(product);
        if(amountInStock==null){
            System.out.println("Product not found in stock");
            return false;
        }

        if(amountInStock<amount){
            System.out.println("Not enough products in stock");
            return false;
        }

        int newAmount=amountInStock-amount;
        if(newAmount==0)
            products.remove(product);
        else
            products.put(product,newAmount);
        return true;
    }

    public int GetProductAmount(Product product){
        return products.get(product);
    }

    public void PrintStock(){
        System.out.println("In stock: ");
        for(Map.Entry<Product,Integer> it: products.entrySet())
            System.out.println("    "+it.getKey().GetName()+": "+it.getValue());
    }

}
