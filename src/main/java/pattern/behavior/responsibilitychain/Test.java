package pattern.behavior.responsibilitychain;

public class Test {

  public static void main(String[] args) {
    JavaHandler javaHandler = new JavaHandler();
    PythonHandler pythonHandler = new PythonHandler();
    javaHandler.setNextHandler(pythonHandler);

    javaHandler.handler("Python");
  }
}
