public class StaticVariables {

    public static void main(String[] args) {
      counter object1 = new counter();
      counter object2 = new counter();
      counter object3 = new counter();
      counter object4 = new counter();
      counter object5 = new counter();
      int count = counter.getInstanceCount();
        System.out.println("Instance created: "+count);
    }
}
