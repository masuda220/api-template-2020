package morecon.domain.indentifier;

import java.util.Objects;

public class ProductId {
    int value;

    public ProductId() {
    }

    public ProductId(int value) {
        this.value = value;
    }

    public ProductId(String text) {
        this.value = Integer.valueOf(text);
    }

    @Override
    public boolean equals(Object other) {
        return value == ((ProductId)other).value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
