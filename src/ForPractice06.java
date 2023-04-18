public class ForPractice06 {
    public static void main(String[] args) {
        for (var i = 0; i < 9; i++) {
            if (i <= 4){
                for (var j = 0; j < 10; j++) {
                    if (j <= i || j >= 10 - (i + 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }

            if (i >= 5){
                for (var j = 0; j < 10; j++) {
                    if (j < 10 - (i + 1) || j > i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        }
    }
}
