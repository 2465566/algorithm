package pattern.constructure.adapter._object;

import pattern.constructure.adapter._object.impl.MP3Player;
import pattern.constructure.adapter._object.impl.MP4Player;

public class Adapter {
  private AdvancedMediaPlayer advancedMediaPlayer;

  Adapter(String type) {
    if("mp3".equals(type)) {
      advancedMediaPlayer = new MP3Player();
    } else if ("mp4".equals(type)) {
      advancedMediaPlayer = new MP4Player();
    }
  }

  public void play(String type, String fileName) {
    if("mp3".equals(type)) {
      advancedMediaPlayer.playMP3(fileName);
    } else if ("mp4".equals(type)) {
      advancedMediaPlayer.playMP4(fileName);
    }
  }
}
