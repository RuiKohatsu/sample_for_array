public class ForPractice05 {
    public static void main(String[] args) {
        for (var i = 0; i < 9; i++) {

            //上
            if (i <= 4) {
                for (var j = 0; j < i + 1; j++) {
                    System.out.print("*");
                }
            }

            //下
            if (i >= 5 && i < 9){
                for (var j = 0; j < 9-i; j++) {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
}
