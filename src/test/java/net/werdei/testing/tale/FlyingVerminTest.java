package net.werdei.testing.tale;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FlyingVerminTest extends TaleTestBase
{

    @Test
    public void moving()
    {
        vermin.setMoving(true);
        assertTrue(vermin.isMoving());

    }

    @Test
    public void hypnotising()
    {
        vermin.hypnotise(arthur);
        assertTrue(arthur.isHypnotised());
    }

    @Test
    public void death()
    {
        vermin.setDead(true);
        assertThrows(DeadException.class, () -> vermin.hypnotise(arthur));
    }
}
