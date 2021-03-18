package net.werdei.testing.tale;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class JammedDoorTest extends TaleTestBase
{
    @Test
    public void jamming()
    {
        assertFalse(door.isOpen());
        ford.operate(door);
        assertFalse(door.isOpen());
        zafod.operate(door);
        assertFalse(door.isOpen());
        trillian.operate(door);
        assertTrue(door.isOpen());
    }

    @Test
    public void breaking()
    {
        door = new JammedDoor(1);
        door.setBroken(true);
        arthur.operate(door);
        assertFalse(door.isOpen());
    }
}
