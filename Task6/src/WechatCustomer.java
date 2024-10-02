public class WechatCustomer {
    private String address;
    private boolean takeout;

    public WechatCustomer(String address, boolean takeout) {//微信用户的堂食和外送服务选择
        this.address = address;
        this.takeout = takeout;
    }

    public String getAddress() {
        return address;
    }

    public boolean isTakeout() {
        return takeout;
    }
}

