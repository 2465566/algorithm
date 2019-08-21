package pattern.constructure.adapter.impl;

import pattern.constructure.adapter.AdvancedMediaPlayer;

public class MP3Player implements AdvancedMediaPlayer {

  @Override
  public void playMP3(String fileName) {
    System.out.println("play mp3: " + fileName);
  }

  @Override
  public void playMP4(String fileName) {

  }
}
