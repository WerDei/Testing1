package net.werdei.testing.tale;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class HumanTest extends TaleTestBase
{
    @Test
    public void naming()
    {
        assertEquals(arthur.getName(), "Arthur");
        arthur.setName("No longer Arthur");
        assertNotEquals(arthur.getName(), "Arthur");
    }

    @Test
    public void operating()
    {
        arthur.operate(door);
        assertTrue(arthur.isBusy());
    }

    @Test
    public void pulling()
    {
        arthur.setBusy(true);
        trillian.pull(arthur);
        assertFalse(arthur.isMoving());
        arthur.setBusy(false);
        trillian.pull(arthur);
        assertTrue(arthur.isMoving());
    }

    @Test
    public void death()
    {
        arthur.setDead(true);
        assertTrue(arthur.isDead());
        assertThrows(DeadException.class, () -> arthur.operate(door));
    }
}
