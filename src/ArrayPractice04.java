import java.util.Scanner;
public class ArrayPractice04 {
    public static void main(String[] args) {
        //配列作成
        int[] array = new int[10];

        array[0] = 6;
        array[1] = 8;
        array[2] = 5;
        array[3] = 10;
        array[4] = 2;
        array[5] = 4;
        array[6] = 1;
        array[7] = 9;
        array[8] = 7;
        array[9] = 3;

        //アルゴリズム
        for(var j = 0; j < 9; j++) {
            for(var k = 9; k >= j + 1; k--) {
                if(array[k] < array[k - 1]) {
                    var temp = array[k -1];
                    array[k - 1] = array[k];
                    array[k] = temp;
                }
            }
        }

        //出力
        for(var i = 0; i<10; i++) {
            System.out.println(array[i]);
        }
    }
}
