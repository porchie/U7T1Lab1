import java.util.ArrayList;

public class CarRunner
{
  public static void main(String[] args)
  {
    UsedCarLot lot = new UsedCarLot();
    lot.addCar(new Car("Mustang", 12500));
    lot.addCar(new Car("Camry", 8400));
    lot.addCar(new Car("Ram", 17200));
    lot.addCar(new Car("Accent", 1980));
    lot.addCar(new Car("Cruiser", 10500));
    System.out.println(lot.getInventory());
    lot.swap(2, 4);
    System.out.println(lot.getInventory());
    lot.swap(1, 2);
    System.out.println(lot.getInventory());
    
    // no swap occurs because one of the index
    // values (5) is out of bounds
    lot.swap(3, 5);
    System.out.println(lot.getInventory());
  }
}