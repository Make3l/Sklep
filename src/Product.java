import java.util.Objects;

public class Product {
    private final int id;
    private final String name;
    private double price;

    Product(int id, String name, double price) {
        this.id=id;
        this.name=name;
        this.price=price;
    }

    public void SetPrice(double price) {
        this.price=price;
    }

    public double GetPrice() {
        return price;
    }

    public String GetName(){
        return name;
    }

    @Override
    public boolean equals(Object o){
        if(this == o)
            return true;
        if(o==null || getClass()!=o.getClass())
            return false;
        Product product=(Product) o;
        return id==product.id;
    }

    @Override
    public int hashCode(){
        return Objects.hash(id);
    }

    @Override
    public String toString(){
        return "id: "+id+", name: "+name+", price: "+price+"$\n";
    }
}
