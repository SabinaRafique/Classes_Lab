package org.example.classes;

public class Invoice {
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    public Invoice(String id, String desc, int qty, double unitPrice){
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public String getDesc(){
        return desc;
    }
    public String getId(){
        return id;
    }

    public double getTotal(){
        return unitPrice * qty;
    }

    public int getQty(){
        return qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }
}
