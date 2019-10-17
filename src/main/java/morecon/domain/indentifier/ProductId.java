package morecon.domain.indentifier;

public class ProductId {
    int value;

    public ProductId() {
    }

    public ProductId(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "ProductId{" +
                "value=" + value +
                '}';
    }
}
