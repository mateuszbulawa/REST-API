package pl.mbulawa.restapi.data;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@RequiredArgsConstructor
@Data
public class Orders {
    @Id
    private long id;
    private String status;
    private String payment_type;
    private String total_price;

    @OneToOne
    @JoinColumn(name = "customers_id")
    private Customers customers;

    @OneToMany
    @JoinColumn(name = "orders_id")
    private List<Products> products;
}
