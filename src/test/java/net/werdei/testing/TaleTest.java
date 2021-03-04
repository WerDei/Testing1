package net.werdei.testing;

import net.werdei.testing.tale.DeadException;
import net.werdei.testing.tale.FlyingVermin;
import net.werdei.testing.tale.Human;
import net.werdei.testing.tale.JammedDoor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaleTest {


    private Human trillian;
    private Human arthur;
    private Human ford;
    private Human zafod;
    private JammedDoor door;
    private FlyingVermin vermin;

    @BeforeEach
    public void setUp() {
        System.out.println(1);
        trillian = new Human("Trillian");
        arthur = new Human("Arthur");
        ford = new Human("Ford");
        zafod = new Human("Zafod");
        door = new JammedDoor(3);
        vermin = new FlyingVermin();
    }

    @Test
    public void humanTest()
    {
        assertEquals(arthur.getName(), "Arthur");
        arthur.setName("No longer Arthur");
        assertNotEquals(arthur.getName(), "Arthur");

        arthur.operate(door);
        assertTrue(arthur.isBusy());

        trillian.pull(arthur);
        assertFalse(arthur.isMoving());
        arthur.setBusy(false);
        trillian.pull(arthur);
        assertTrue(arthur.isMoving());

        arthur.setDead(true);
        assertTrue(arthur.isDead());
        assertThrows(DeadException.class, () -> arthur.operate(door));
    }

    @Test
    public void verminTest()
    {
        vermin.setMoving(true);
        assertTrue(vermin.isMoving());
        vermin.hypnotise(arthur);
        assertTrue(arthur.isHypnotised());

        vermin.setDead(true);
        assertThrows(DeadException.class, () -> vermin.hypnotise(arthur));
    }

    @Test
    public void doorTest()
    {
        assertFalse(door.isOpen());
        ford.operate(door);
        assertFalse(door.isOpen());
        zafod.operate(door);
        assertFalse(door.isOpen());
        trillian.operate(door);
        assertTrue(door.isOpen());

        door = new JammedDoor(1);
        door.setBroken(true);
        arthur.operate(door);
        assertFalse(door.isOpen());
    }
}
