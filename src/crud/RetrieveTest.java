
package crud;

import one.model.Language;
import one.util.HibernateUtil;
import org.hibernate.Session;


public class RetrieveTest {
   
    public static void main(String[] args) {
        
        Session session = null;
        
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            
            Language language = (Language)session.load(Language.class,5);
            
            System.out.println(language.getLanguageId()+" "+language.getName());
            
        }catch(RuntimeException ex){
            
            throw new RuntimeException(ex.getMessage());
            
        } finally{
            
            if(session!=null){
                
                session.close();
            }
        }
    }
}
