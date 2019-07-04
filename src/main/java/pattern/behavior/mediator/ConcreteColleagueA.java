package pattern.behavior.mediator;

public class ConcreteColleagueA extends Colleague {

  @Override
  public void send(String message) {
    System.out.println("ca send message: " + message+ ", with media: " + media.hashCode());

    media.forward(this, message);

  }

  @Override
  public void receive(String message) {
    System.out.println("ca received message"+ message +", with media: " + media.hashCode());
  }
}
