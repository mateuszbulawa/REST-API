package pl.mbulawa.restapi.data;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@RequiredArgsConstructor
@Data
public class Customers {
    @Id
    private long id;
    private String first_name;
    private String last_name;
    private String email;
    private String username;

}
