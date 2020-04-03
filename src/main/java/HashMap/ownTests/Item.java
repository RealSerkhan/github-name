package HashMap.ownTests;

public class Item {
    private String name;
    private int prise;

    public Item(String name, int prise) {
        this.name = name;
        this.prise = prise;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrise() {
        return prise;
    }

    public void setPrise(int prise) {
        this.prise = prise;
    }

    @Override
    public String toString() {
        return String.format("name: %s prise: %d",this.name,this.prise);
    }
}
