package metier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import configSpring.AppConfig;
import dao.IScoreDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={AppConfig.class })
public class ScoreTest {
	
	
	private Score score;
	@Autowired(required=false)
	IScoreDAO daoS;
	
	
	@Test
	public void existanceTest() {
		this.score = new Score();
		assertNotNull(this.score);
	}
	
	@Test
	@Rollback(true)
	public void scoreTest() {
		this.score = new Score();
		this.score.setScore(10);
		this.daoS.save(score);
		assertEquals(10, daoS.findById(1).get().getScore());
	}
	
	@Test
	@Rollback(true)
	public void gameTest() {
		this.score = new Score();
		Game game = new Game();
		this.score.setGame(game);
		assertEquals(game, daoS.findById(1).get().getGame());
	}


}
