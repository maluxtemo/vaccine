/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luke.tem.maluks.vaccine.common;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author S2024726
 */
@Getter
@Setter
public class AddressDTO {
    private Long id;
    private String line1;
    private String line2;
    private String suburb;
    private String postalCode;
}
