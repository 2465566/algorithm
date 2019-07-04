package pattern.behavior.mediator;


public class ConcreteColleagueB extends Colleague {
  @Override
  public void send(String message) {
    System.out.println("cb send message: " + message+ ", with media: " + media.hashCode());
    media.forward(this, message);
  }

  @Override
  public void receive(String message) {
    System.out.println("cb received message"+ message +", with media: " + media.hashCode());
  }
}
