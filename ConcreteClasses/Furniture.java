package ConcreteClasses;


import Interface.FurnitureInterface;

public class Furniture implements FurnitureInterface {
    private String type;
    private Integer size;

    public Furniture(String type, Integer size) {
        this.type = type;
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    @Override
    public String accept(FurnitureType furnitureDetail, String type) {
        this.type = type;
        return furnitureDetail.getType(type);
    }

    @Override
    public String accept(ShippingCost shippingCost, String type,Integer size) {
        return shippingCost.calculation(type ,size).toString();
    }
}

