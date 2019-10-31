package morecon.domain.indentifier;

public class OrderId {
    int value;

    public OrderId() {
    }

    public OrderId(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "OrderId{" +
                "value=" + value +
                '}';
    }
}
