
package luk.tem.maluks.vaccineClient;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "address")
@Getter
@Setter
public class Address implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "line1")
    private String line1;

    @Column(name = "line2")
    private String line2;

    @Column(name = "suburb")
    private String suburb;

    @Column(name = "postal_code")
    private String postalCode;

    public Address(String line1, String line2, String suburb, String postalCode) {
        this.line1 = line1;
        this.line2 = line2;
        this.suburb = suburb;
        this.postalCode = postalCode;
    }
    public Address() {
    }        
}
