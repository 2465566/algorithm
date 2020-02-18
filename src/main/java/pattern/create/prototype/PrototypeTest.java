package pattern.create.prototype;

public class PrototypeTest {

  public static void main(String[] args) {
    Resume resume = new Resume();
    resume.setAge(20);
    resume.setCompany("cou");
    resume.setName("rico");

    Resume cloneResume = resume.clone();

    System.out.println("equals: " + (resume.equals(cloneResume)));
    System.out.println(resume.getClass() == cloneResume.getClass());
    System.out.println(resume.hashCode() + " --"  +cloneResume.hashCode());
  }
}
