/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc.Entity;

import java.sql.Timestamp;
import java.time.LocalDate;
import javax.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

/**
 *
 * @author bharat
 */
@Entity
public class punchOut {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pid;
    
    private int id;
    
    @CreationTimestamp
    private Timestamp loginTime;
    @Column(name="logoutDate")
    private LocalDate date;

    public punchOut(LocalDate date) {
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public punchOut() {
    }

    public punchOut(int pid, int id, Timestamp loginTime) {
        this.pid = pid;
        this.id = id;
        this.loginTime = loginTime;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
