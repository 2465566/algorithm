package pattern.constructure.adapter;

public class AdapterTest {

  public static void main(String[] args) {

    AudioAdapter audioAdapter =  new AudioAdapter();
    audioAdapter.play("mp3", "hahah.mp3");
    audioAdapter.play("mp4", "gagaga.mp4");
    audioAdapter.play("mp5", "tatata.mp5");
  }
}
