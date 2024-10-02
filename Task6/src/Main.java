import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        OrderSystem os = new OrderSystem();       //新建os对象
        List<Order> dishes = new ArrayList<>();   //调用泛型
        dishes.add(new Dish_1());                 //添加Dish_1
        dishes.add(new Dish_2());                 //添加Dish_2
        TableCustomer tc = new TableCustomer(6);    //设置堂食顾客桌号
        WechatCustomer wc = new WechatCustomer("成都市成华区电子科技大学", Math.random() < 0.5);   //设置微信顾客外送地址和要求外送的概率（假设为50%）
        os.manageOrder(dishes, tc);               //添加堂食顾客
        os.manageOrder(dishes, wc);               //添加微信顾客

    }
}