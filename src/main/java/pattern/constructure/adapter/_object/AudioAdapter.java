package pattern.constructure.adapter._object;

public class AudioAdapter implements MediaPlayer {

  private Adapter adapter;

  @Override
  public void play(String type, String fileName) {

    if ("mp3".equals(type) || "mp4".equals(type)) {
      adapter = new Adapter(type);
      adapter.play(type, fileName);
    } else {
      System.out.println("不支持的文件格式: " + type);
    }
  }
}
