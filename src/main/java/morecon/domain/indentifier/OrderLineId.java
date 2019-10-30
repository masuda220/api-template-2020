package morecon.domain.indentifier;

public class OrderLineId {
    int value;

    public OrderLineId() {
    }

    public OrderLineId(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "OrderLineId{" +
                "value=" + value +
                '}';
    }
}
