package net.werdei.testing.tale;

public class JammedDoor extends Door
{
    private int triesToOpen;
    private int triesMade;

    public JammedDoor(int triesToOpen)
    {
        this.triesToOpen = triesToOpen;
    }

    @Override
    public void beOperated() {
        triesMade++;
        if (triesMade >= triesToOpen)
        {
            triesMade = 0;
            super.beOperated();
        }
    }
}
