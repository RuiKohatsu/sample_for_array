import java.util.Scanner;

public class ArrayPractice01 {
    public static void main(String[] args) {
        int[] array = new int[10];
        var sum = 0;

        //入力受付
        var sc = new Scanner(System.in);
        for(var i = 0; i<10; i++) {
            System.out.print("数値を入力してください：");
            var s1 = sc.nextLine();
            var num = Integer.parseInt(s1);
            array[i] = num;
        }

        //合計点処理
        for(var i = 0; i < 10; i++){
            sum += array[i];
        }

        double average = sum/10;

        System.out.println("合計点 "+sum);
        System.out.println("平均点 "+average);

        sc.close();
    }
}
