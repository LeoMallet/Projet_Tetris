package metier;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import configSpring.AppConfig;
import dao.IGameDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={AppConfig.class })
public class GameTest {
	
	@Autowired(required=false)
	private IGameDAO daoG;
	
	private Game game;

	@Test
	public void existanceTest() {
		this.game=new Game();
		assertNotNull(game);
	}

}
