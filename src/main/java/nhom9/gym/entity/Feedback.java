package nhom9.gym.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "feedback")
public class Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long feedbackId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "type")
    private int feedbackType; // 1: về nhân viên, 2: về dịch vụ

    @Column(name = "target_id")
    private Long targetId; // ID của nhân viên hoặc gói dịch vụ

    @Column(name = "rating")
    private int rating;

    @Column(name = "content")
    private String content;

    @Column(name = "time")
    private LocalDateTime time;
}
