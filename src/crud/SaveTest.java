
package crud;

import java.util.Date;
import one.model.Language;
import one.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;

public class SaveTest {
    
    public static void main(String[] args) {
        
        Session session = null;
        
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            
             Language language = new Language("Arabic", new Date());
             
            session.getTransaction().begin();
            
            session.save(language);
            session.getTransaction().commit();
            
        }catch(HibernateException ex){
            
            throw new RuntimeException(ex.getMessage());
            
        }finally{
            
            if(session!=null){
                
                session.close();
            }
        }
    }
}
