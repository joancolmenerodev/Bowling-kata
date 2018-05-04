package com.joancolmenerodev.bownlingkata;

import junit.framework.TestCase;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

public class BowlingGameTest extends TestCase {
    public void testGutterGame() throws Exception {
        var g = new Game();
        for (var i=0; i<20; i++)
            g.roll(0);
        assertThat(g.score(),is(0));


    }

}

