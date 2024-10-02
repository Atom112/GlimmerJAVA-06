public class Dish_1 extends Dish {      //继承Dish父类
    public Dish_1() {
        super("宫保鸡丁", 15);
    }

    @Override
    public void profile() {
        System.out.println("菜品1名称："+getName());
        System.out.println("价格："+getPrice());
        System.out.println("菜品介绍：宫保鸡丁是一道色香味俱全的传统名菜，属于川菜系。此菜红而不辣，辣而不猛，肉质滑脆。");
    }

    @Override
    public void cook() {
        System.out.println("烹饪方法：将鸡肉切成小丁，用料酒、盐和淀粉腌制。花生米炸至金黄，捞出备用。干辣椒剪成小段，花椒炒香。葱姜蒜切末。调汁：酱油、料酒、米醋、糖、盐和淀粉调成汁。锅中放油，先炒香花椒和干辣椒，再加入葱姜蒜末。加入腌制好的鸡肉丁，翻炒至变色。倒入调好的汁，快速翻炒。最后加入炸好的花生米，翻炒均匀即可出锅。\n");
    }


}
