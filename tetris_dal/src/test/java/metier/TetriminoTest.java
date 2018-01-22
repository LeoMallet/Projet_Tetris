package metier;

import static org.junit.Assert.assertEquals;
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
@ContextConfiguration(classes = {AppConfig.class})
public class TetriminoTest {

	@Autowired(required=false)
	private ITetriminoDAO daoT;
	
	@Autowired(required=false)
	private static Tetrimino tetrimino;

	@Test
	public void daoTest() {
		assertNotNull(daoT);
	}

	

	@BeforeClass
	public static void preparation() {
		tetrimino = new Tetrimino();
		System.out.println("Initialisation des tests");
	}

	@Test
	// @Transactional
	@Rollback(true)
	public void getMatriceTetriminoTest() {
		tetrimino = new Tetrimino();
		try {
		
		int[][] matrice = tetrimino.getMatriceTetrimino("(0,0);(0,1);(0,2);(1,2);(3,2);(2,1)");
		assertNotNull(matrice);
		} catch(Exception e){
			e.printStackTrace();
		}
	}

	@Test
	@Rollback(true)
	public void resizeMatriceTest() {
		tetrimino = new Tetrimino();
		try {
			int[][] matrice = tetrimino.getMatriceTetrimino("(0,0);(0,1);(0,2);(1,2);(3,2);(2,1)");
			matrice=tetrimino.resizeMatrice(3, matrice);
			assertNotNull(matrice);
		} catch(Exception e){
			e.printStackTrace();
		}
	}
	
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