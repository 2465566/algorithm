package pattern.constructure.adapter._object;

import pattern.constructure.adapter._class.Adapter;
import pattern.constructure.adapter._class.MediaPlayer;

/**
 * 对象适配，因为adapter是通过聚合的方式而非继承
 */

public class AudioAdapterObjectMethod implements MediaPlayer {

  private pattern.constructure.adapter._class.Adapter adapter;

  @Override
  public void play(String type, String fileName) {

    if ("mp3".equals(type) || "mp4".equals(type)) {
      adapter = new Adapter();
      adapter.setAdvancedMediaPlayer(type);
      adapter.play(type, fileName);
    } else {
      System.out.println("不支持的文件格式: " + type);
    }
  }
}
