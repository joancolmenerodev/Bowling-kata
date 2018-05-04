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
        var n = 20;
        var pins = 0;
        rollMany(n, pins);
        assertThat(g.score(),is(0));
    }

    private void rollMany(int n, int pins) {
        for(var i = 0; i < n; i++){
            g.roll(pins);
        }
    }

    public void testAllOnes() throws Exception {
        for (var i = 0; i < 20; i++)
            g.roll(1);
        assertThat(g.score(),is(20));
    }


}

