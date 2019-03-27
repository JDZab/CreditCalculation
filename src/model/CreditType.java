package model;

public enum CreditType {

    ANNUITY(0, "Аннуитетная"),
    DIFFERENTIATED(1, "Дифференцированная");

    private int id;
    private String type;

    CreditType(int id, String type) {
        this.id = id;
        this.type = type;
    }



    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }
}
