package dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import datos.Medicion;

public class MedicionDao {
	
	private static Session session;
	private Transaction tx;

	private void iniciaOperacion() throws HibernateException {
			session = HibernateUtil.getSessionFactory().openSession();
			tx = session.beginTransaction();
		}
		
		private void manejaExcepcion(HibernateException he) throws HibernateException {
			
			tx.rollback();
			throw new HibernateException("ERROR en la capa de acceso a datos", he);
			}
		
		
		public Medicion traerMedicion(int idMedicion) throws HibernateException {
			Medicion objeto = null;
			try {
				iniciaOperacion();
				objeto = (Medicion) session.get(Medicion.class, idMedicion);
				} finally {
					session.close();
					}
			return objeto;
			}


}
