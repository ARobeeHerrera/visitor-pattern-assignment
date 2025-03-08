package ConcreteClasses;

import Interface.FurnitureTypeInterface;

import java.util.*;


public class FurnitureType implements FurnitureTypeInterface {

    private static Map<String, String> furnitureTypes = new HashMap<>();

    static {
        furnitureTypes.put("Chair", "Lightweight");
        furnitureTypes.put("Glass", "Lightweight");
        furnitureTypes.put("Bed", "Heavyweight");
        furnitureTypes.put("Cabinet", "Heavyweight");
    }

    @Override
    public String getType(String type) {
        return furnitureTypes.get(type);
    }
}
