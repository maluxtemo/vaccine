package luk.tem.maluks.vaccineClient;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VaccineClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(VaccineClientApplication.class, args);
	}
    public CommandLineRunner run(VaccineRepository homeLoanRepository) throws Exception {
        return (String[] args) -> {
           VaccineClientRESTfulClient vaccineClientRESTfulClient = null;
            CitizenDTO citizenDTO =  vaccineClientRESTfulClient.getCitizenWithResponseHandling("9510255605088");
            homeLoanRepository.save(new Vaccine(citizenDTO.getFirstName(), citizenDTO.getLastName(), citizenDTO.getIdNumber(), citizenDTO.getGender(), citizenDTO.getMaritalStatus(),
                     new Address(citizenDTO.getPhysicalAddress().getLine1(), citizenDTO.getPhysicalAddress().getLine2(), citizenDTO.getPhysicalAddress().getSuburb(), citizenDTO.getPhysicalAddress().getPostalCode()),
                    new Address(citizenDTO.getPhysicalAddress().getLine1(), citizenDTO.getPhysicalAddress().getLine2(), citizenDTO.getPhysicalAddress().getSuburb(), citizenDTO.getPhysicalAddress().getPostalCode())));
        };
    }
}
