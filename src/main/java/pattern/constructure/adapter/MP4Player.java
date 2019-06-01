package pattern.constructure.adapter;

public class MP4Player implements AdvancedMediaPlayer {

  @Override
  public void playMP3(String fileName) {

  }

  @Override
  public void playMP4(String fileName) {
    System.out.println("play mp4: " + fileName);
  }
}
