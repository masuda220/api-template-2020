package morecon.application.repository.order;

import morecon.domain.model.order.Shipping;

public interface ShippingRepository {
    void register(Shipping shipping);
    Shipping findBy(String id);
}
