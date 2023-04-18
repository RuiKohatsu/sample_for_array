import java.util.Scanner;

public class ArrayPractice02 {
    public static void main(String[] args) {

        var sum = 0;

        //入力受付
        var sc = new Scanner(System.in);
        System.out.print("配列数を入力してください：");
        var s1 = sc.nextLine();
        var num = Integer.parseInt(s1);

        //要素数が入力値の配列を作成する
        int[] array = new int[num];

        for(var i = 0; i < num; i++) {
            System.out.print("数値を入力してください：");
            var s2 = sc.nextLine();
            var num2 = Integer.parseInt(s2);
            array[i] = num2;
        }

        //合計点処理
        for(var i = 0; i < num; i++){
            sum += array[i];
        }

        double average = sum/num;

        System.out.println("合計点 "+sum);
        System.out.println("平均点 "+average);

        sc.close();
    }
}
