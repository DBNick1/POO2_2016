package dao;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import datos.Medicion;
import datos.Provincia;
import funciones.Funciones;

public class MedicionDao {

	private static Session session;
	private Transaction tx;

	private void iniciaOperacion() throws HibernateException {
		session = HibernateUtil.getSessionFactory().openSession();
		tx = session.beginTransaction();
	}

	private void manejaExcepcion(HibernateException he)
			throws HibernateException {

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

	@SuppressWarnings("unchecked")
	public List<Medicion> traerMedicion(Provincia provincia,
			GregorianCalendar fechaInicial, GregorianCalendar fechaFinal)
			throws HibernateException {
		List<Medicion> lista = null;
		try {
			iniciaOperacion();
			String hql = "from medicion m inner join fetch p.provincia where provincia=provincia and m.fecha=ffecha";
			lista = session.createQuery(hql)
					.setCalendar("ffecha", (Calendar) fechaInicial).list();
		} catch (HibernateException he) {
			manejaExcepcion(he);
			throw he;
		} finally {
			session.close();

		}
		return lista;
	}

	@SuppressWarnings("unchecked")
	public List<Medicion> traerMedicion(Provincia provincia, Calendar fecha)
			throws HibernateException {
		List<Medicion> lista = null;
		try {
			iniciaOperacion();
			String hql = "from medicion m where m.idProvincia =:idProvincia and m.fecha =:ffecha";
			lista = session.createQuery(hql).setCalendar("ffecha", fecha)
					.setParameter("idProvincia", provincia.getIdProvincia())
					.list();

		} catch (HibernateException he) {
			manejaExcepcion(he);
			throw he;
		} finally {
			session.close();

		}
		return lista;
	}

	@SuppressWarnings("unchecked")
	public List<Medicion> traerMedicion(Calendar fecha)
			throws HibernateException {
		List<Medicion> lista = null;
		try {
			iniciaOperacion();
			String hql = "from Medicion where fecha =:ffecha";
			lista = session.createQuery(hql).setCalendar("ffecha",fecha)
					.list();

		} catch (HibernateException he) {
			manejaExcepcion(he);
			throw he;
		} finally {
			session.close();
		}
		return lista;
	}

}
