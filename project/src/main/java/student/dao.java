package student;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class dao {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();

	public String create(dto dto) {
		et.begin();
		em.persist(dto);
		et.commit();
		return "<h1>Data Inserted Successfully</h1>";
	}

	public String delete(long regno) {
		dto ss=em.find(dto.class, regno);
		if(ss!=null)
		{
			et.begin();
			em.remove(ss);
			et.commit();
			return "<h1>Data Deleted Successfully</h1>";
		}
		else
		return "<h1>No Data Found</h1>";
	}

	public List<dto> fetchall() {
		Query q=em.createQuery("select data from dto data");
		List<dto> list=q.getResultList();
		return list;
	}

	public dto login(long regno) {
		dto dto=em.find(dto.class, regno);
		return dto;
	}

	public dto fetch(long regno) {
		// TODO Auto-generated method stub
		dto ss=em.find(dto.class, regno);
		return ss;
	}

	public void update(dto dd) {
		// TODO Auto-generated method stub
		et.begin();
		em.merge(dd);
		et.commit();
	}

}
