import ConcreteClasses.Furniture;
import ConcreteClasses.FurnitureType;
import ConcreteClasses.ShippingCost;

public class ShippingApp {
    public static void main(String[] args) {
        Furniture chair = new Furniture("Chair", 10);
        FurnitureType furnitureDetail = new FurnitureType();
        ShippingCost shippingCost = new ShippingCost();

        System.out.println(chair.getType() + " is a "+ chair.accept(furnitureDetail, chair.getType()) +" type");
        System.out.println("Furniture "+ chair.getType() +" Shipping is worth: PHP" + chair.accept(shippingCost, chair.getType(),chair.getSize()));

        Furniture glass = new Furniture("Glass", 5);
        System.out.println("\n" + glass.getType() + " is a "+ glass.accept(furnitureDetail, glass.getType()) +" type");
        System.out.println("Furniture "+ glass.getType() +  " Shipping is worth: " + glass.accept(shippingCost, glass.getType(), glass.getSize()));

        Furniture bed = new Furniture("Bed", 15);
        System.out.println("\n" + bed.getType() + " is a "+ bed.accept(furnitureDetail, bed.getType()) +" type");
        System.out.println("Furniture "+ bed.getType() +  " Shipping is worth: " + bed.accept(shippingCost, bed.getType(), bed.getSize()));

        Furniture cabinet = new Furniture("Cabinet", 12);
        System.out.println("\n" + cabinet.getType() + " is a "+ cabinet.accept(furnitureDetail, cabinet.getType()) +" type");
        System.out.println("Furniture "+ cabinet.getType() +  " Shipping is worth: " + cabinet.accept(shippingCost, cabinet.getType(), cabinet.getSize()));
    }
}
