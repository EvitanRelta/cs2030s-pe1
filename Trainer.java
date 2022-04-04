/**
 * CS2030S PE1 Question 1
 * AY21/22 Semester 2
 *
 * @author A0235143N
 */

public class Trainer extends Person {
  private boolean isTraining = false;
  private Customer customer = null;
  private Equipment eqpt = null;

  public Trainer(String name) {
    super(name);
  }

  public void startTraining(Customer cus, Equipment eqpt)
      throws CannotTrainException {
    if (eqpt.isInUse() || this.isTraining) {
      throw new CannotTrainException();
    }
    
    this.isTraining = true;
    eqpt.setInUse(true);
    this.eqpt = eqpt;
    this.customer = cus;
  }

  public void stopTraining() {
    this.isTraining = false;
    this.eqpt.setInUse(false);
    this.eqpt = null;
    this.customer = null;
  }

  public String getStatus() {
    if (this.isTraining) {
      return String.format("%s training %s", this, this.customer);
    }
    return String.format("%s not training", this);
  }

  @Override
  public String toString() {
    return String.format("Trainer: %s", super.toString());
  }
}
