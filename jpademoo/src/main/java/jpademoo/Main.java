package jpademoo;

import java.util.List;

import jakarta.persistence.EntityManager;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 EntityManager em = JPAUtil.getEntityManager();
		 
		 em.getTransaction().begin();
		 
		 em.persist(new User("Bindu","bindu@gmail.com","Active"));
		 
		 em.persist(new User("Ravi","ravi@gmail.com","Inactive"));
		 
		 em.getTransaction().commit();
		 
		 List<User> users1=em.createQuery("Select u from User u where name =: username",User.class).setParameter("username","Bindu").getResultList();
		 
		 for(User u:users1)
		 {
			 System.out.println(u.getName());
		 }
		 
		 List<User> users2 = em.createNamedQuery("User.FindByEmail",User.class).setParameter("emailID","ravi@gmail.com").getResultList();
		 
		 for(User u:users2)
		 {
			 System.out.println(u.getEmail());
		 }
		 
		 List<User> users3 = em.createNamedQuery("User.findByStatus",User.class).setParameter(1,"Active").getResultList();
		 
		 for(User u : users3)
		 {
			 System.out.println(u.getStatus());
		 }
		 
		 em.close();
		 JPAUtil.close();
//		 Employee emp1=new Employee("Bindu","Developer",30000);
//		 
//		 //Inserting a row
//		 
//		 em.persist(emp1);
//		 
//		 em.getTransaction().commit();
//		 
//		 em.getTransaction().begin();
//		 
//		 //Fetching a row (means Select query in sql)
//		 
//		 Employee emp2=em.find(Employee.class,2);
//		 
//		 System.out.println(emp2.getName());
//		 
//		 System.out.println(emp2.getId());
//		 
//		 //Updating the row details using merge()
//		 
//		 emp2.setSalary(35000);
//		 
//		 em.merge(emp2);
//		 
//		 em.getTransaction().commit();
//		 
//		 //Removing the row using remove() 
//		 
//		 em.getTransaction().begin();
//		 
//		 em.remove(emp2);
		 
//		 em.getTransaction().commit();
//		 
//		 em.close();
//		 
//		 JPAUtil.close();
		 

	}

}
