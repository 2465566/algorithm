package pattern.behavior.mediator;

public class Test {

  public static void main(String[] args) {
    Media media = new ConcreteMedia();
    Colleague ca = new ConcreteColleagueA();
    Colleague cb = new ConcreteColleagueB();

    media.register(ca);
    media.register(cb);

    ca.setMedia(media);
    cb.setMedia(media);

    ca.send("ca发送给其他人的请求");
    cb.send("ca发送给其他人的请求");

  }
}
