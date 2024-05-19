package nhom9.gym.dao;

import nhom9.gym.entity.PackRegistration;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "pack-registration")
public interface PackRegistrationRepository extends JpaRepository<PackRegistration, Long> {
}
