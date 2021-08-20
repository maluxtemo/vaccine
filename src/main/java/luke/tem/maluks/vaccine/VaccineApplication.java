package luke.tem.maluks.vaccine;

import luke.tem.maluks.vaccine.common.CitizenDTO;
import luke.tem.maluks.vaccine.common.Gender;
import luke.tem.maluks.vaccine.common.MaritalStatus;
import luke.tem.maluks.vaccine.domain.Address;
import luke.tem.maluks.vaccine.domain.Citizen;
import luke.tem.maluks.vaccine.repository.CitizenRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VaccineApplication {

	public static void main(String[] args) {
		SpringApplication.run(VaccineApplication.class, args);
	}
    @Bean
    public CommandLineRunner run(CitizenRepository citizenRepository) throws Exception {
        return (String[] args) -> {   
            
          citizenRepository.save(new Citizen("Temuso", "Maluleke", "9510255605088", Gender.MALE, MaritalStatus.MARRIED, 
                  new Address("Matswi Village", "street Tem", "Tzaneen", "0834"), 
                  new Address("Matswi Village", "street Tem", "Tzaneen", "0834")));
            
                  
            
        };
    }
}
