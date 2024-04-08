/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc.Entity;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.Date;
import javax.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.format.annotation.DateTimeFormat;
/**
 *
 * @author bharat
 */
@Entity
public class attendance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int aid;
    
    private int id;
    
    private LocalDate date;

    @CreationTimestamp
    private Timestamp loginTime;

    public attendance() {
    }

    public attendance(int aid, int id, LocalDate date, Timestamp loginTime) {
        this.aid = aid;
        this.id = id;
        this.date = date;
        this.loginTime = loginTime;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Timestamp getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Timestamp loginTime) {
        this.loginTime = loginTime;
    }
    
    

    @PrePersist
    public void prePersist() {
        // Set the login date to the current local date before persisting
        this.date = LocalDate.now();
    }
   

   

    
    

}
