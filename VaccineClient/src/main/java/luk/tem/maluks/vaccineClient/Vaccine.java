
package luk.tem.maluks.vaccineClient;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;



@Entity
@Table(name = "vaccine")
@Getter
@Setter
public class Vaccine implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "id_number")
    private String idNumber;

    @Column(name = "gender")
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(name = "marital_status")
    @Enumerated(EnumType.STRING)
    private MaritalStatus maritalStatus;

    @OneToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "physical_add")
    private Address physicalAddress;

    @OneToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "postal_add")
    private Address postalAddress;

    public Vaccine() {
    }

    public Vaccine(String firstName, String lastName, String idNumber, Gender gender,
            MaritalStatus maritalStatus, Address physicalAddress, Address postalAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
        this.physicalAddress = physicalAddress;
        this.postalAddress = postalAddress;
    }
}
