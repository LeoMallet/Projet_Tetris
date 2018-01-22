package metier;

<<<<<<< HEAD
=======
import static org.junit.Assert.assertEquals;
>>>>>>> master
import static org.junit.Assert.assertNotNull;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import configSpring.AppConfig;
import dao.ITetriminoDAO;

@RunWith(SpringJUnit4ClassRunner.class)
<<<<<<< HEAD
@ContextConfiguration(classes = { AppConfig.class })
public class TetriminoTest {

	@Autowired(required = false)
	private ITetriminoDAO daoT;
=======
@ContextConfiguration(classes = {AppConfig.class})
public class TetriminoTest {

	@Autowired(required=false)
	private ITetriminoDAO daoT;
	
	@Autowired(required=false)
	private static Tetrimino tetrimino;
>>>>>>> master

	@Test
	public void daoTest() {
		assertNotNull(daoT);
	}

<<<<<<< HEAD
	private static Tetrimino tetrimino;
=======
	
>>>>>>> master

	@BeforeClass
	public static void preparation() {
		tetrimino = new Tetrimino();
		System.out.println("Initialisation des tests");
	}

	@Test
	// @Transactional
	@Rollback(true)
	public void getMatriceTetriminoTest() {
<<<<<<< HEAD
		Tetrimino t = new Tetrimino();
		try {
		
		int[][] matrice = t.getMatriceTetrimino("(0,0);(0,1);(0,2);(1,2);(3,2);(2,1)");
=======
		tetrimino = new Tetrimino();
		try {
		
		int[][] matrice = tetrimino.getMatriceTetrimino("(0,0);(0,1);(0,2);(1,2);(3,2);(2,1)");
>>>>>>> master
		assertNotNull(matrice);
		} catch(Exception e){
			e.printStackTrace();
		}
	}

	@Test
	@Rollback(true)
	public void resizeMatriceTest() {
<<<<<<< HEAD
		Tetrimino t = new Tetrimino();
		try {
			int[][] matrice = t.getMatriceTetrimino("(0,0);(0,1);(0,2);(1,2);(3,2);(2,1)");
			matrice=t.rotation45deg(matrice);
=======
		tetrimino = new Tetrimino();
		try {
			int[][] matrice = tetrimino.getMatriceTetrimino("(0,0);(0,1);(0,2);(1,2);(3,2);(2,1)");
			matrice=tetrimino.resizeMatrice(3, matrice);
>>>>>>> master
			assertNotNull(matrice);
		} catch(Exception e){
			e.printStackTrace();
		}
	}
	
<<<<<<< HEAD
}
=======
	@SuppressWarnings("deprecation")
	@Test
	@Rollback(true)
	public void rotation45degTest() {
		tetrimino = new Tetrimino();
		try {
			int[][] matrice = tetrimino.getMatriceTetrimino("(0,0);(0,1);(0,2);(1,2)");
			matrice=tetrimino.rotation45deg(matrice);
			int[][] matrice2 = tetrimino.getMatriceTetrimino("(0,0);(0,1);(0,2);(1,0)");
			assertEquals(matrice2, matrice);
			
		} catch(Exception e){
			e.printStackTrace();
		}
	}
	
}
>>>>>>> master
