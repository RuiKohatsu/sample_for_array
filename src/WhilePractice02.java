import java.util.Scanner;
public class WhilePractice02 {
        public static void main(String[] args) {
            var sum = 0;
            while(true){
                System.out.print("数値を入力してください：");
                var sc = new Scanner(System.in);
                var s1 = sc.nextLine();
                var num = Integer.parseInt(s1);
                if (num != 0){
                    sum += num;
                }
                else{
                    break;
                }
            }
            System.out.println(sum);
        }
}
