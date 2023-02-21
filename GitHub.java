interface gitable{
    default void UseGit(){
        System.out.println("Use Git");
    }
}
class User implements  gitable{
    String username;
    User(){
        this.username = "张靳生";
    }
    public void UseGit(){
        System.out.println(this.username+"can "+"Use Git");
    }
}
public class GitHub {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        User user = new User();
        user.UseGit();
    }
}
