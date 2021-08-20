/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luk.tem.maluks.vaccineClient;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class CitizenDTO {
    private Long id;
    private String firstName;
    private String lastName; 
    private String idNumber;
    private Gender gender;  
    private MaritalStatus maritalStatus;  
    private AddressDTO physicalAddress; 
    private AddressDTO postalAddress; 
}
