/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luke.tem.maluks.vaccine.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import luke.tem.maluks.vaccine.common.AddressDTO;
import luke.tem.maluks.vaccine.common.CitizenDTO;
import luke.tem.maluks.vaccine.domain.Citizen;
import luke.tem.maluks.vaccine.repository.CitizenRepository;


@RestController
public class CitizenServiceController {

    @Autowired
    private CitizenRepository citizenRepository;

    @RequestMapping(value = "/citizens/{idNumber}", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    public ResponseEntity<CitizenDTO> getCitizenRecordByIdNumber(@PathVariable("idNumber") String idNumber) {
        Citizen citizen = citizenRepository.findByIdNumber(idNumber);
        CitizenDTO citizenDTO = new CitizenDTO();
        citizenDTO.setId(citizen.getId());
        citizenDTO.setFirstName(citizen.getFirstName());
        citizenDTO.setLastName(citizen.getLastName());
        citizenDTO.setGender(citizen.getGender());
        citizenDTO.setMaritalStatus(citizen.getMaritalStatus());
        citizenDTO.setIdNumber(citizen.getIdNumber());

        AddressDTO physicalAddressDTO = new AddressDTO();
        physicalAddressDTO.setId(citizen.getPhysicalAddress().getId());
        physicalAddressDTO.setLine1(citizen.getPhysicalAddress().getLine1());
        physicalAddressDTO.setLine2(citizen.getPhysicalAddress().getLine2());
        physicalAddressDTO.setSuburb(citizen.getPhysicalAddress().getSuburb());
        physicalAddressDTO.setPostalCode(citizen.getPhysicalAddress().getPostalCode());
        citizenDTO.setPhysicalAddress(physicalAddressDTO);

        AddressDTO postalAddressDTO = new AddressDTO();
        postalAddressDTO.setId(citizen.getPhysicalAddress().getId());
        postalAddressDTO.setLine1(citizen.getPhysicalAddress().getLine1());
        postalAddressDTO.setLine2(citizen.getPhysicalAddress().getLine2());
        postalAddressDTO.setSuburb(citizen.getPhysicalAddress().getSuburb());
        postalAddressDTO.setPostalCode(citizen.getPhysicalAddress().getPostalCode());
        citizenDTO.setPostalAddress(postalAddressDTO);
        
        return new ResponseEntity<>(citizenDTO, HttpStatus.OK);
    }
}
