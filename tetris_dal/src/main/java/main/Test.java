package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import configSpring.AppConfig;
import dao.ITetriminoDAO;
import metier.Tetrimino;

public class Test {

	public static void main(String[] args) {

		//testSpringHibernate();
		//testMatrice();
		
	}
	
	static void testMatrice() {
		Tetrimino t = new Tetrimino();
		int[][] matrice =t.getMatriceTetrimino("(0,0);(0,1);(0,2);(1,2)");
		for(int i=0;i<matrice.length;i++) {
			for(int j=0;j<matrice.length;j++) {
				System.out.print(matrice[i][j]+" ");
			}
			System.out.println();
		}
		
		matrice=t.rotation45deg(matrice);
		System.out.println();
		for(int i=0;i<matrice.length;i++) {
			for(int j=0;j<matrice.length;j++) {
				System.out.print(matrice[i][j]+" ");
			}
			System.out.println();
		}
	}

	
	static void old() {
		AnnotationConfigApplicationContext myContext = new AnnotationConfigApplicationContext(AppConfig.class);	
		Tetrimino tetrimino1 = new Tetrimino();
		//DaoTetrimino dao = myContext.getBean(DaoTetrimino.class);
		
		try {
			tetrimino1.setNom("N");
			tetrimino1.setCouleur("gris");
			//dao.add(tetrimino1);
			//dao.insertTetrimino(123, "N", "rouge");
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	

	static void testSpringHibernate() {
			AnnotationConfigApplicationContext myContext = new AnnotationConfigApplicationContext(AppConfig.class);
			
			ITetriminoDAO daoTetrimino = myContext.getBean(ITetriminoDAO.class);
			Tetrimino myTetrimino = new Tetrimino();
			myTetrimino.setCouleur("rouge");
			myTetrimino.setNom("N");
			daoTetrimino.save(myTetrimino);
			System.out.println(myTetrimino);
			myContext.close();
		
		}
	
}
