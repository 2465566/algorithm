package pattern.behavior.mediator;

public abstract class Colleague {
   protected Media media;

   public void setMedia(Media media) {
     this.media = media;
   }
   public abstract void send(String message);
   public abstract void receive(String message);

}
