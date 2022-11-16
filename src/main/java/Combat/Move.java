package Combat;

public class Move {
    // moves for the player and enemies
    private int moveDamage;
    private int moveMultiplier;
    private String moveName;
    private String moveTarget; //either self or opponent

    public Move(String moveName, int moveDamage, int moveMultiplier, String moveTarget) {
        this.moveName = moveName;
        this.moveDamage = moveDamage;
        this.moveMultiplier = moveMultiplier;
        this.moveTarget = moveTarget;
    }

    public String getMoveName() {
        return moveName;
    }

    public int getMoveDamage() {
        return moveDamage;
    }

    public int getMoveMultiplier() {
        return moveMultiplier;
    }

    public String getMoveTarget() {
        return moveTarget;
    }

    @Override
    public String toString() {
        return moveName + " : " + moveDamage + " / x " + moveMultiplier + " to " + moveTarget;
    }

    public void setMoveName(String moveName) {
        this.moveName = moveName;
    }

    public void setMoveDamage(int moveDamage) {
        this.moveDamage = moveDamage;
    }

    public void setMoveMultiplier(int moveMultiplier) {
        this.moveMultiplier = moveMultiplier;
    }

    public void setMoveTarget(String moveTarget) {
        this.moveTarget = moveTarget;
    }
}

