package nhom9.gym.dao;

import nhom9.gym.entity.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "trainer")
public interface TrainerRepository extends JpaRepository<Trainer, Long> {
    Trainer findByEmail(String email);
}
