package morecon.domain.model.order;

import morecon.domain.model.customer.Purchaser;

public class Attempt {
    Purchaser purchaser;
    public Lines lines;
    Shipping shipping;

    public Attempt() {
    }
}
