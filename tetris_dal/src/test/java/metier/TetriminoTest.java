package metier;

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
@ContextConfiguration(classes = { AppConfig.class })
public class TetriminoTest {

	@Autowired(required = false)
	private ITetriminoDAO daoT;

	@Test
	public void daoTest() {
		assertNotNull(daoT);
	}

	private static Tetrimino tetrimino;

	@BeforeClass
	public static void preparation() {
		tetrimino = new Tetrimino();
		System.out.println("Initialisation des tests");
	}

	@Test
	// @Transactional
	@Rollback(true)
	public void getMatriceTetriminoTest() {
		Tetrimino t = new Tetrimino();
		try {
		
		int[][] matrice = t.getMatriceTetrimino("(0,0);(0,1);(0,2);(1,2);(3,2);(2,1)");
		assertNotNull(matrice);
		} catch(Exception e){
			e.printStackTrace();
		}
	}

	@Test
	@Rollback(true)
	public void resizeMatriceTest() {
		Tetrimino t = new Tetrimino();
		try {
			int[][] matrice = t.getMatriceTetrimino("(0,0);(0,1);(0,2);(1,2);(3,2);(2,1)");
			matrice=t.rotation45deg(matrice);
			assertNotNull(matrice);
		} catch(Exception e){
			e.printStackTrace();
		}
	}
	
}
