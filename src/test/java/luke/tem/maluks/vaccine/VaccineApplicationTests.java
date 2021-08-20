package luke.tem.maluks.vaccine;

import jdk.nashorn.internal.ir.annotations.Ignore;
import luke.tem.maluks.vaccine.common.Gender;
import luke.tem.maluks.vaccine.common.MaritalStatus;
import luke.tem.maluks.vaccine.domain.Address;
import luke.tem.maluks.vaccine.domain.Citizen;
import luke.tem.maluks.vaccine.domain.CitizenRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Ignore
@SpringBootTest
class VaccineApplicationTests {
  @Autowired
  CitizenRepository citizenRepository;
	//@Test
	void contextLoads() {
	}

        public  void persistentCitizen(){
            citizenRepository.save(new Citizen("Temuso", "Maluleke", "9510255605088", Gender.MALE, MaritalStatus.MARRIED, 
                  new Address("Matswi Village", "street Tem", "Tzaneen", "0834"), 
                  new Address("Matswi Village", "street Tem", "Tzaneen", "0834")));
        }
}
