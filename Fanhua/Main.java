package Fanhua;

class Fan<T> {
    T data;
    void GetData(T data){
        this.data = data;
        System.out.println(data);
    }
}

public class Main {
    public static void main(String[] args) {
        Fan<String> f = new Fan<String>();
        f.GetData("hello");
    }
}
