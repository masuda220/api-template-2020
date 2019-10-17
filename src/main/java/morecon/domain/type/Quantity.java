package morecon.domain.type;

public class Quantity {
    int value;

    public Quantity() {
    }

    public Quantity(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Quantity{" +
                "value=" + value +
                '}';
    }
}
