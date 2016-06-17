package test;

import dao.MedicionDao;
import dao.ProvinciaDao;

public class OO2Test1Tema3 {
	
	public static void main(String[] args) {
		
		ProvinciaDao dao = new ProvinciaDao();
		MedicionDao daoM = new MedicionDao();
		
		int id = 7;
		int idM = 10;
		
		System.out.println(""+dao.traerProvincia(id));
		
		System.out.println(""+daoM.traerMedicion(idM));
	}

}
