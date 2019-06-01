package pattern.constructure.adapter;

public class MP3Player implements AdvancedMediaPlayer {

  @Override
  public void playMP3(String fileName) {
    System.out.println("play mp3: " + fileName);
  }

  @Override
  public void playMP4(String fileName) {

  }
}
