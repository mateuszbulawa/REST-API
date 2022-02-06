package pl.mbulawa.restapi.data;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@RequiredArgsConstructor
@Data
public class Order {
    @Id
    private long id;
    private int customer_id;
    private String status;
    private String payment_type;
    private String total_price;

}
