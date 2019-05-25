package pattern.constructure.bridge;

public abstract class Abstraction {
 public Implementor implementor;

 public Implementor getOperator() {
   return this.implementor;
 }

 public void setOperator(Implementor implementor) {
   this.implementor = implementor;
 }

 public abstract void operationAnother();

}
