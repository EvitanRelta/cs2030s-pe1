/**
 * CS2030S PE1 Question 1
 * AY21/22 Semester 2
 *
 * @author A0235143N
 */

public abstract class Equipment {
  private boolean beingUsed = false;

  public void setInUse(boolean beingUsed) {
    this.beingUsed = beingUsed;
  }

  public boolean isInUse() {
    return this.beingUsed;
  }

  public void repair() {

  }
}
