public class Dish_2 extends Dish {            //继承Dish父类
    public Dish_2() {
        super("清蒸鲈鱼",20);
    }

    @Override
    public void profile() {
        System.out.println("菜品2名称："+getName());
        System.out.println("价格："+getPrice());
        System.out.println("菜品介绍：清蒸鲈鱼是一道广东省的传统名菜，属于粤菜系。肉质鲜嫩洁白，肥而不腻。");
    }

    @Override
    public void cook() {
        System.out.println("烹饪方法：鲈鱼洗净，去鳞去内脏，从背部切开，不要切断。 在鱼身上抹上适量的盐和料酒，腌制10-15分钟。 姜切片，葱切段，放在鱼身上。 锅中加水烧开，将鱼放入蒸锅，大火蒸8-10分钟（视鱼的大小而定）。 蒸好后，取出鱼，倒掉蒸出的水分。 将葱姜丝放在鱼身上，淋上蒸鱼豉油。 锅中烧热油，浇在葱姜丝上，让香味四溢。\n");
    }


}