import java.util.Random;

public class 排序算法 {
    public static void main(String[] args) {
        System.out.println(1-2);
        //生成随机数
        Random random = new Random();
        int aray[] = new int[10];
        for (int i=0;i<10;i++){
            aray[i]=random.nextInt(10);
        }
        insterSort(aray);
        for (int j=0;j<10;j++){
            System.out.println(aray[j]);
        }
    }
    public static void insterSort (int [] aray){
        for (int i=0;i<aray.length;i++){
            int tmp = aray[i];
            int j = i-1;
            for (;j>=0;j--){
                if (aray[j]>tmp){
                    aray[j+1]=aray[j];
                }else {
                    break;
                }
            }
            aray[j+1] = tmp;
        }
    }
}
