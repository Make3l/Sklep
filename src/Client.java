import java.util.ArrayList;
import java.util.List;

public class Client {
    String name;
    String email;
    List<Order> orderHistory = new ArrayList<>();

    public Client(String name,String email,Order firstOrder){
        this.name=name;
        this.email=email;
        orderHistory.add(firstOrder);
    }

    public void AddOrder(Order order){
        orderHistory.add(order);
    }

    public String GetName(){
        return name;
    }

    public String GetEmail(){
        return email;
    }

    public void PrintOrderHistory(){
        System.out.println(name+" history:");
        for(Order order: orderHistory)
        {
            order.PrintOrder();
        }
    }
}
