package pattern.constructure.composite.safe;

public class CompositeTest {

  public static void main(String[] args) {

    Composite root = new Composite("D盘");

    Composite picture = new Composite("图片文件夹");
    Composite movie = new Composite("视频文件夹");
    Composite doc = new Composite("文档文件夹");

    picture.addComponent(new Leaf("1.jpg"));
    picture.addComponent(new Leaf("2.jpg"));
    picture.addComponent(new Leaf("3.jpg"));

    movie.addComponent(new Leaf("1.avi"));
    movie.addComponent(new Leaf("2.avi"));
    movie.addComponent(new Leaf("3.avi"));

    doc.addComponent(new Leaf("1.word"));
    doc.addComponent(new Leaf("2.word"));
    doc.addComponent(new Leaf("3.word"));

    root.addComponent(picture);
    root.addComponent(movie);
    root.addComponent(doc);

    root.printStr();
  }

}
