package xyz.kumaraswamy.topologicalsort;

public class Child extends Node {

   public static Child child(Object value) {
      Node.addInstanceCount();
      return new Child(value);
   }

   public final Object value;

   public Child(Object value) {
      super(value);
      this.value = value;
   }

   @Override
   public String toString() {
      return "Child{" + value + '}';
   }
}
