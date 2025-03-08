package Interface;

import ConcreteClasses.ShippingCost;

public interface ShippingCostInterface {
    public Integer calculation(String type, Integer size);
}
