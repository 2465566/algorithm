package pattern.bridge;

public abstract class Abstraction {
 public Implementor implementor;

 public Implementor getOperator() {
   return this.implementor;
 }

 public void setOperator(Implementor implementor) {
   this.implementor = implementor;
 }

 public void operation() {
   implementor.operator();
 }
}
