package morecon.domain.indentifier;

public class CustomerId {
    int value;

    public CustomerId() {
    }

    public CustomerId(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "CustomerId{" +
                "value=" + value +
                '}';
    }
}
