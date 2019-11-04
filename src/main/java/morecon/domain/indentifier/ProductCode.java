package morecon.domain.indentifier;

public class ProductCode {
    String value;

    public ProductCode() {
    }

    public ProductCode(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
