
package mvc.hibernate;




import java.util.List;
import mvc.Entity.User;
import mvc.Entity.attendance;
import mvc.Entity.punchOut;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;



public class dao {
    
     @Autowired
    private SessionFactory sessionFactory;

   @Autowired
    private HibernateTemplate ht;
@Transactional
    public int save(User user){
      
           int id=(int)this.ht.save(user);
        return id;
    }
   
   @Transactional
    public int save(attendance at){
      
           int id=(int)this.ht.save(at);
        return id;
    }
    
    
    @Transactional
    public int save(punchOut po){
      
           int id=(int)this.ht.save(po);
        return id;
    }
   
    
    @Transactional
    public void  delete(User user){
       this.ht.delete(user);
        
    }
    
    @Transactional
    public void update(User user){
        this.ht.update(user);
        
    }
    
   @Transactional
   public boolean login(User user){
        User u=(User)getuserById(user.getId());
        if((u.getId()==(user.getId())&&u.getPassword().equals(user.getPassword()))){
            return true;
        }else{
            return false;
        }
      // this.ht.equals(user.getPassword());
   }
  
   
   
   
    public User getuserById(int id){
        return this.ht.get(User.class,id);
        
        
    }
    
    public HibernateTemplate getHt() {
        return ht;
    }

    public void setHt(HibernateTemplate ht) {
        this.ht = ht;
    }
   
    
  
   
    
}
