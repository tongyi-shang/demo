package 设计模式;

/**
 * 策略模式就是一个接口下有多个实现类，而每种实现类会处理某一种情况。
 */
public class 策略设计模式 {
    public interface PrizerSender{
        /**
         * 判断当前是否支持奖励发放
         */
        boolean support(SendPrizeRequest request);
        /**
         * 发放奖品类型
         */
        void sendPrize(SendPrizeRequest request);
    }

    public static void main(String[] args) {
        Prizerden prizerden = new Prizerden();
        SendPrizeRequest request = new SendPrizeRequest();
        request.aBoolean=true;
        // 发放积分
        prizerden.support(request);
        prizerden.sendPrize(request);
    }

}
//发放积分
class Prizerden implements 策略设计模式.PrizerSender{

    @Override
    public boolean support(SendPrizeRequest request) {
        return request.aBoolean;
    }

    @Override
    public void sendPrize(SendPrizeRequest request) {
        System.out.println("发放积分！！！！");
    }
}
//发放物品
class Prizerwp implements 策略设计模式.PrizerSender{

    @Override
    public boolean support(SendPrizeRequest request) {
        return request.aBoolean;
    }

    @Override
    public void sendPrize(SendPrizeRequest request) {
        System.out.println("发放物品！！！！");
    }
}
//发放钱财
class Prizerqc implements 策略设计模式.PrizerSender{

    @Override
    public boolean support(SendPrizeRequest request) {
        return request.aBoolean;
    }

    @Override
    public void sendPrize(SendPrizeRequest request) {
        System.out.println("发放钱财！！！！");
    }
}