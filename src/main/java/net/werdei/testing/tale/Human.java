package net.werdei.testing.tale;

public class Human extends Character
{
    private String name;

    public Human(String name)
    {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void pull(Character c)
    {
        ensureNotDead();
        if (c.isBusy() || c.isHypnotised()) return;
        if (isBusy() || isHypnotised()) return;

        c.setMoving(true);
    }

    @Override
    protected void move() {
        System.out.println(name + " is moving");
    }

    public void operate(TaleObject o)
    {
        ensureNotDead();
        if (isHypnotised() || isBusy()) return;
        setBusy(true);
        o.beOperated();
    }
}
