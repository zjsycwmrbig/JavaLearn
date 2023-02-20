public class Haocheng {
    public static void main(String[] args) {
        System.out.println("Haocheng");
        byte[] bytes = new byte[50];
        for (int i = 0; i < bytes.length; i++) {
            bytes[i] = (byte) (i + 1);
        }
        String string = bytes.toString();
        System.out.println(string);
        
    }
}
