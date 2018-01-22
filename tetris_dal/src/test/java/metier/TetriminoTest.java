package metier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

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
	public void rotation45degTest() {
		tetrimino = new Tetrimino();
		try {
			int[][] matrice = tetrimino.getMatriceTetrimino("(0,0);(0,1);(0,2);(1,2)");
			matrice=tetrimino.rotation45deg(matrice);
						
			int[][] matrice2 = tetrimino.getMatriceTetrimino("(0,0);(0,1);(0,2);(1,0)");
			matrice2=tetrimino.resizeMatrice(2, matrice2);
			
			for(int i=0;i<matrice.length;i++) {
				for(int j=0;j<matrice.length;j++) {
					assertEquals(matrice2[i][j],matrice[i][j]);
				}
			}
			
		} catch(Exception e){
			fail("echec");
		}
	}
	
}
