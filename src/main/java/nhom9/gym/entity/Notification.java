package nhom9.gym.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@Table(name = "notification")
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "notification_id")
    private Long notificationId;

    @ManyToMany(mappedBy = "notifications")
    List<User> users;

    @Column(name = "sender")
    private String sender;

    @Column(name = "title")
    private String title;

    @Column(name = "message")
    private String message;

    @Column(name = "time")
    private LocalDateTime time ;
}
