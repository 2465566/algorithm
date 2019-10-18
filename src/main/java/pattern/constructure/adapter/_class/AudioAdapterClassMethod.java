package pattern.constructure.adapter._class;

/**
 * 类适配方式， 通过继承而非聚合
 */
public class AudioAdapterClassMethod extends Adapter implements MediaPlayer {

    @Override
    public void play(String type, String fileName) {

        if ("mp3".equals(type) || "mp4".equals(type)) {
            super.setAdvancedMediaPlayer(type);
            super.play(type, fileName);
        } else {
            System.out.println("不支持的文件格式: " + type);
        }
    }
}
