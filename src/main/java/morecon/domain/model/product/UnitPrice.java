package morecon.domain.model.product;

public class UnitPrice {
    int value;

    public UnitPrice(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "UnitPrice{" +
                "value=" + value +
                '}';
    }
}
