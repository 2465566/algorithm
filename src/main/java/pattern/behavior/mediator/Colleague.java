package pattern.behavior.mediator;

public abstract class Colleague {
   Media media;

   void setMedia(Media media) {
     this.media = media;
   }
   public abstract void send(String message);
   public abstract void receive(String message);

}
