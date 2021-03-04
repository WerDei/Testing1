package net.werdei.testing.tale;

public class Door extends TaleObject
{
    private boolean open;


    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }


    @Override
    public void beOperated() {
        if (isBroken()) return;
        setOpen(!open);
    }
}
