package com.joancolmenerodev.bownlingkata;

import junit.framework.TestCase;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

public class BowlingGameTest extends TestCase {

    private Game g;

    protected void setUp() throws Exception {
        g = new Game();
    }

    public void testGutterGame() throws Exception {
        rollMany(20, 0);
        assertThat(g.score(),is(0));
    }

    private void rollMany(int n, int pins) {
        for(var i = 0; i < n; i++){
            g.roll(pins);
        }
    }

    public void testAllOnes() throws Exception {
        rollMany(20,1);
        assertThat(g.score(),is(20));
    }


}

