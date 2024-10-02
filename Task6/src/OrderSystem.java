import java.util.List;
public class OrderSystem {
/*-------------------泛型方法管理订单-------------------*/
    public  <T> void manageOrder(List<Order> dishes, T customer) {
        boolean canCook = true;

        for (Order dish : dishes) {         //判定是否可以烹饪
            if (!dish.check()) {
                canCook = false;
                break;
            }
        }

        if (!canCook) {
            System.out.println("取消订单");
        } else {
            int orderNumber = 1;            //初始设置订单编号为1
            for (Order dish : dishes) {
                Dish_1 dish1 = new Dish_1();
                Dish_2 dish2 = new Dish_2();

                dish1.profile();   //调用dish1/2中的方法进行菜品简介和制作方法
                dish1.cook();
                dish2.profile();
                dish2.cook();

                if (customer instanceof TableCustomer) {
                    TableCustomer tc = (TableCustomer) customer;
                    System.out.println("送餐到餐桌：" + tc.getTableId());       //堂食顾客的送餐
                    System.out.println("订单 " + orderNumber++ + " 完成\n");

                } else if (customer instanceof WechatCustomer) {
                    WechatCustomer wc = (WechatCustomer) customer;

                    if (wc.isTakeout()) {
                        System.out.println("外卖送到：" + wc.getAddress());
                        System.out.println("订单 " + orderNumber++ + " 完成\n");//微信顾客的送餐
                    } else {
                        System.out.println("堂食");
                        System.out.println("订单 " + orderNumber++ + " 完成\n");
                    }


            }
        }

        }
    }
}