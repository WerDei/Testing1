package net.werdei.testing.tale;

public abstract class Character
{
    private boolean moving;
    private boolean hypnotised;
    private boolean busy;
    private boolean dead;


    public boolean isMoving() {
        return moving;
    }

    public void setMoving(boolean moving) {
        this.moving = moving;
        if (moving) move();
    }

    public boolean isHypnotised() {
        return hypnotised;
    }

    public void setHypnotised(boolean hypnotised) {
        this.hypnotised = hypnotised;
    }

    public boolean isBusy() {
        return busy;
    }

    public void setBusy(boolean busy) {
        this.busy = busy;
    }

    public boolean isDead() {
        return dead;
    }

    public void setDead(boolean dead) {
        this.dead = dead;
    }


    protected abstract void move();

    protected void ensureNotDead() throws DeadException
    {
        if (isDead()) throw new DeadException("This character is dead and cannot perform the action");
    }
}
