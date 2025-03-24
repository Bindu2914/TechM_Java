package jpademo;
 
import jakarta.persistence.EntityManager;
 
 
public class Main {
 
	public static void main(String[] args) {
		
		EntityManager em=JPAUtil.getEntityManager();
		
		em.getTransaction().begin();
		
		Employee emp1=new Employee("prem_vishnu","Training",500);
		
		em.persist(emp1);
		
		em.getTransaction().commit();
		
		em.close();
		
		JPAUtil.close();
		
		
		
		
	}
 
}