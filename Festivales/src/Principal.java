import org.hibernate.Session;

public class Principal {

	public static void main(String[] args) {
		
		Session session=HibernateUtilities.getSessionFactory().openSession();
		
		session.beginTransaction();
		
		Festival f = new Festival("LowFestival","Londres","22/08/2018");
		Festival f2 = new Festival("Rottotom", "Benidorm","14/07/2018");
		Actuacion e = new Actuacion("14:00","Wembley");
		Actuacion e2 = new Actuacion("21:00","Parking");		
		
		
		Grupo p = new Grupo();
		p.setNombre("Queen");		
		p.setEstilo("Rock");
		Miembro m = new Miembro();
		m.setInstrumento("Guitarra");
		m.setNombrep("Bryan May");
		p.getMiembros().add(m);
		
		Miembro m2 = new Miembro();
		m2.setInstrumento("Voz");
		m2.setNombrep("Freddie Mercury");
		p.getMiembros().add(m2);
		
		
		Grupo p2 = new Grupo();
		p2.setNombre("Bob And Company");
		p2.setEstilo("Reggae");
		Miembro m3 = new Miembro();
		m3.setInstrumento("Batería");
		m3.setNombrep("Jhon Deacon");
		p2.getMiembros().add(m3);
		
		Miembro m4 = new Miembro();
		m4.setInstrumento("Voz");
		m4.setNombrep("Bob Marley");
		p2.getMiembros().add(m4);
		
		session.save(f);//guardamos los festivales
		session.save(f2);
		session.save(e);//guardamos las actuacion
		session.save(e2);
		session.save(p);//guardamos los grupos
		session.save(p2);
		
		
		
		session.getTransaction().commit();		
		
		session.close();
		
		HibernateUtilities.getSessionFactory().close();
		
		
		
	}

}
