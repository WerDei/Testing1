package net.werdei.testing.tale;

public class FlyingVermin extends Character
{

    @Override
    protected void move() {
        System.out.println("Flying vermin is flying");
    }

    public void hypnotise(Character c)
    {
        ensureNotDead();
        if (c.isDead()) return;
        if (isHypnotised()) return;

        c.setHypnotised(true);
    }
}
