package pattern.constructure.adapter._object;

public class AdapterTest {

  public static void main(String[] args) {

    AudioAdapter audioAdapter =  new AudioAdapter();
    /**
     * 比如之前只能播mp3, 现在想播mp4
     */
    audioAdapter.play("mp3", "hahah.mp3");
    audioAdapter.play("mp4", "gagaga.mp4");
    audioAdapter.play("mp5", "tatata.mp5");
  }
}
