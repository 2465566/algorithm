package pattern.constructure.adapter._class;

public class AdapterTest {

  public static void main(String[] args) {

    AudioAdapterClassMethod audioAdapterObjectMethod =  new AudioAdapterClassMethod();
    /**
     * 比如之前只能播mp3, 现在想播mp4
     */
    audioAdapterObjectMethod.play("mp3", "hahah.mp3");
    audioAdapterObjectMethod.play("mp4", "gagaga.mp4");
    audioAdapterObjectMethod.play("mp5", "tatata.mp5");
  }
}
