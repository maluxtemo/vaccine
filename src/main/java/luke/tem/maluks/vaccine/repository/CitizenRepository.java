
package luke.tem.maluks.vaccine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import luke.tem.maluks.vaccine.domain.Citizen;


@Repository
public interface CitizenRepository extends JpaRepository<Citizen, Long> {
    Citizen findByIdNumber(String idNumber);    
}
