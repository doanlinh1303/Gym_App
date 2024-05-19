package nhom9.gym.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
@Entity
@Data
@Table(name = "pack_registration")
public class PackRegistration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long registrationId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "pack_id")
    private Pack pack;

    @Column(name = "registration_date")
    private LocalDate registrationDate;

    @Column(name = "expiry_date")
    private LocalDate expiryDate;

    @Column(name = "status")
    private String status;

    @Column(name = "renewal_count")
    private int renewalCount = 0;
}




//package nhom9.gym.entity;

//import jakarta.persistence.*;
//import lombok.Data;
//
//import java.time.LocalDate;
//
//@Entity
//@Data
//@Table(name = "registration")
//public class Registration {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long registrationId;
//
//    @ManyToOne
//    @JoinColumn(name = "user_id", nullable = false)
//    private User user;
//
//    @ManyToOne
//    @JoinColumn(name = "pack_id", nullable = false)
//    private Pack pack;
//
//    @Column(name = "registration_date", nullable = false)
//    private LocalDate registrationDate;
//
//    @Column(name = "expiry_date")
//    private LocalDate expiryDate;
//
//    @Column(name = "status", nullable = false)
//    private String status; // Trạng thái (đã thanh toán, chưa thanh toán)
//
//    @Column(name = "renewal_count", nullable = false)
//    private int renewalCount;
//}
