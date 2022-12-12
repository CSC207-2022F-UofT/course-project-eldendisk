package entities.combat;

public class Move {
    // This class represent move of the player and enemies.
    // Each move has moveDamage, moveMultiplier, moveName and moveTarget(either "self" or "opponent")
    private int moveDamage;
    private int moveMultiplier;
    private String moveName;
    private String moveTarget; //either self or opponent

    public Move(String moveName, int moveDamage, int moveMultiplier, String moveTarget) {
        // Each move must have all values given to be created.
        this.moveName = moveName;
        this.moveDamage = moveDamage;
        this.moveMultiplier = moveMultiplier;
        this.moveTarget = moveTarget;
    }

    //getter methods
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

    // String version of move is just the moveName.
    @Override
    public String toString() {return moveName;}

    // setter methods
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

