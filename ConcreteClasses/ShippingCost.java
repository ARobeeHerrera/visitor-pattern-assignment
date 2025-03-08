package ConcreteClasses;

import Interface.*;

import java.util.*;

public class ShippingCost implements ShippingCostInterface {
    FurnitureType furnitureType;

    private  Map<String, Integer> furnitureCost = new HashMap<>();
     {
        furnitureCost.put("Chair", 20);
        furnitureCost.put("Glass", 10);
        furnitureCost.put("Bed", 75);
        furnitureCost.put("Cabinet", 50);
    }

    @Override
    public Integer calculation(String type, Integer size) {
        Integer baseRatePerKG = 50;
        return (baseRatePerKG * size) +  furnitureCost.get(type);
    }
}
