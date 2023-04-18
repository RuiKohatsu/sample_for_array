import java.util.Scanner;
public class ArrayPractice03 {
    public static void main(String[] args) {
        //配列作成
        int[] num = {1,2,3,4,5,6,7,8,9};
        //9*9の処理
        for(var i = 0; i < 9; i++){
            for(var j = 0; j < 9; j++){
                System.out.println(num[i] +" × "+num[j]+" = "+num[i] * num[j]);
            }
            System.out.println("--------------------------------------------");
        }
    }
}
