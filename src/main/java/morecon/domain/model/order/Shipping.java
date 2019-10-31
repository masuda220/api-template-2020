package morecon.domain.model.order;

public class Shipping {

    String name;
    String tel;
    String zipcode;
    String address;

    public Shipping() {
    }

    public Shipping(String name, String tel, String zipcode, String address) {
        this.name = name;
        this.tel = tel;
        this.zipcode = zipcode;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Shipping{" +
                "name='" + name + '\'' +
                ", tel='" + tel + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
