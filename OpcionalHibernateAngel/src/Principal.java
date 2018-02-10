import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

public class Principal {

	public static void main(String[] args) {
		
		Session session=HibernateUtilities.getSessionFactory().openSession();
		
		session.beginTransaction();
		
		List<Pedido> misPedidos = new ArrayList<Pedido>();
		
		Empresa e = new Empresa("B43343443","Aplicaciones S.L",4,misPedidos);
		Pedido p = new Pedido();
		p.setFecha("20/10");
		e.addPedidos(p);
		
	
		
		Pedido p2 = new Pedido();
		p2.setFecha("05/01");
		e.addPedidos(p2);
		
		Direccion d = new Direccion();
		d.setCalle("C/La mas larga");
		d.setPoblacion("Transilvania");
		d.setCP(48934);
		e.setDireccionObjeto(d);
		
		
		session.save(e);
		//session.save(p);
		//session.save(p2);
		session.save(d);
		
		
		session.getTransaction().commit();
		
		
		/*session.beginTransaction();
		Pedido u = session.get(Pedido.class, 1);
		System.out.println("Hemos recuperado "+u.getFecha());
		session.getTransaction().commit();*/
		
		
		
		
		session.close();
		
		HibernateUtilities.getSessionFactory().close();
		
		
		
	}

}
