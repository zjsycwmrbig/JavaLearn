/**
 * @author zjs
 * @date 2020/12/20
 * @category 直接使用中文了
 * 
 */

// 接口必须加default

interface flyable {
    default void fly(){};//定义 飞翔接口
}
interface swimable {
    default void swim(){};//定义 游泳接口
}
interface runable {
    default void run(){};//定义 跑步接口
}


class AllCards implements flyable, swimable, runable {
    public void fly(){
        System.out.println("fly");
    }
    public void swim(){
        System.out.println("swim");
    }
    public void run(){
        System.out.println("run");
    }
}

public class 接口 {
    public static void main(String[] args) {
        AllCards car = new AllCards();
        car.fly();
        // github hash
        // make a change
    }
}
