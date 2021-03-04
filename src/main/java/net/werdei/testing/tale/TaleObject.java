package net.werdei.testing.tale;

public abstract class TaleObject
{
    private boolean broken;

    public boolean isBroken() {
        return broken;
    }

    public void setBroken(boolean broken) {
        this.broken = broken;
    }

    public abstract void beOperated();


}
