import org.hibernate.Session;

public class Principal {

	public static void main(String[] args) {
		
		Session session=HibernateUtilities.getSessionFactory().openSession();
		
		session.beginTransaction();
		
		Empresa e = new Empresa("B43343443","Desarroll S.L.",4,"C/rei en Jaume");
		Pedido p = new Pedido();
		p.setFecha("20/10");
		Item i = new Item();
		i.setCantidad(2);
		i.setNombre("ordenador");
		p.getItems().add(i);
		
		Item i2 = new Item();
		i2.setCantidad(3);
		i2.setNombre("raton");
		p.getItems().add(i2);
		
		Item i3 = new Item();
		i3.setCantidad(2);
		i3.setNombre("teclado");
		p.getItems().add(i3);
		
		Pedido p2 = new Pedido();
		p2.setFecha("05/01");
		Item i4 = new Item();
		i4.setCantidad(2);
		i4.setNombre("mesa");
		p2.getItems().add(i4);
		
		session.save(e);
		session.save(p);
		session.save(p2);
		
		
		
		session.getTransaction().commit();
		
		
		/*session.beginTransaction();
		Pedido u = session.get(Pedido.class, 1);
		System.out.println("Hemos recuperado "+u.getFecha());
		session.getTransaction().commit();*/
		
		
		
		
		session.close();
		
		HibernateUtilities.getSessionFactory().close();
		
		
		
	}

}
