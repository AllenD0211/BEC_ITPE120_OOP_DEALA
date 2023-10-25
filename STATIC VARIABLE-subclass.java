public class counter {
 private static int instanceCount = 0;

    public counter() {
        instanceCount++;
    }
    public static int getInstanceCount() {
        return instanceCount;
    }
}
