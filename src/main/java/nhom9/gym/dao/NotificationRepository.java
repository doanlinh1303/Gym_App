package nhom9.gym.dao;

import nhom9.gym.entity.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "notification")
public interface NotificationRepository extends JpaRepository<Notification, Long> {
}
