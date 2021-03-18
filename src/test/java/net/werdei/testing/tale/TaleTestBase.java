package net.werdei.testing.tale;

import org.junit.jupiter.api.BeforeEach;

public class TaleTestBase
{
    protected Human trillian;
    protected Human arthur;
    protected Human ford;
    protected Human zafod;
    protected JammedDoor door;
    protected FlyingVermin vermin;

    @BeforeEach
    public void setUp() {
        trillian = new Human("Trillian");
        arthur = new Human("Arthur");
        ford = new Human("Ford");
        zafod = new Human("Zafod");
        door = new JammedDoor(3);
        vermin = new FlyingVermin();
    }
}
