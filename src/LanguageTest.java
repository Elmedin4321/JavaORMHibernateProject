
import java.util.List;
import one.model.Language;
import one.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;


public class LanguageTest {
    
    public static void main(String[] args) {
        
        Session session = null;
        
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            
            Query query = session.createQuery("from Language");
            
            List<Language> languages = query.list();
            
            for(Language language:languages){
                
                System.out.println(language.getLanguageId()+" "+ language.getName());
            }
            
        }catch(HibernateException ex){
            
            
        }finally{
            
            if(session!=null){
               
                session.close();
            }
        }
    }
}
