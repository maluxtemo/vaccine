
package luke.tem.maluks.vaccine.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CitizenRepository extends JpaRepository<Citizen, Long> {
    Citizen findByIdNumber(String idNumber);    
}
