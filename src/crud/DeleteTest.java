
package crud;

import one.model.Language;
import one.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;


public class DeleteTest {
    
    public static void main(String[] args) {
        
        Session session = null;
  try{
                    
          session = HibernateUtil.getSessionFactory().openSession();
         
          session.getTransaction().begin();
          
          Language language = (Language)session.get(Language.class,3);
          
          session.delete(language);
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
