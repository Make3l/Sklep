import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Order {
    private static int id=0;
    private final double price;
    private Map<Product,Integer> products=new HashMap<>();
    private final String date;

    public Order(double price,Map<Product,Integer>products){
        id++;
        this.price=price;
        this.products=products;
        LocalDate date=LocalDate.now();
        this.date= date.toString();
    }
    public boolean ConfirmOrder(Shop shop){
        for(Map.Entry<Product,Integer>it:products.entrySet())
            if(!shop.ReduceProductAmount(it.getKey(),it.getValue()))
                return false;

        return true;
    }

    public void PrintOrder(){
        System.out.println("Order number: "+id);
        System.out.println("Date: "+date);
        for(Map.Entry<Product,Integer>it:products.entrySet())
            System.out.println("    "+it.getValue()+"x "+it.getKey().GetName()+": "+price+"$");
    }

}
