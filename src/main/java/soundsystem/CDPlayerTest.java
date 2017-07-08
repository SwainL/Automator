package soundsystem;

import static org.junit.Assert.*;

import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.Rule;
import org.junit.runner.RunWith;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by lsw on 07/07/2017.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)

public class CDPlayerTest {
    @Rule
    public final SystemOutRule log = new SystemOutRule().enableLog();
    @Autowired
    private MediaPlayer player;

    @Autowired
    private CompactDisc cd;

    @Test
    public void cdShoudNotBeNull() {
        assertNotNull(cd);
    }

    @Test
    public void play() {
        player.play();
        assertEquals("Playing Sgt. Pepper's Lonely Hearts Club Band" +
                     " by The Beatles\n",
                    log.getLog());

    }
}
