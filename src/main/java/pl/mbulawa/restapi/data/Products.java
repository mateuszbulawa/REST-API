package pl.mbulawa.restapi.data;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@RequiredArgsConstructor
@Data
public class Products {
    @Id
    private long id;
    private String name;
    private String price;

}
