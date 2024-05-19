package nhom9.gym.dao;

import nhom9.gym.entity.TrainerRegistration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "trainer-registration")
public interface TrainerRegistrationRepository extends JpaRepository<TrainerRegistration, Long> {
}
