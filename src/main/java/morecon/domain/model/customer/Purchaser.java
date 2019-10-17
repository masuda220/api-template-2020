package morecon.domain.model.customer;

public class Purchaser {
    String name;
    String email;

    public Purchaser() {
    }

    public Purchaser(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Purchaser{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
