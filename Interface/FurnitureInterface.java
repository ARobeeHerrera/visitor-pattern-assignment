package Interface;

import ConcreteClasses.FurnitureType;
import ConcreteClasses.ShippingCost;

public interface FurnitureInterface {
    public String accept(FurnitureType furnitureDetail, String type);
    public String accept(ShippingCost shippingCost, String type,Integer size);
}
