public class ForPractice08 {
    public static void main(String[] args) {
        for (var k = 0; k < 3; k++) {
            for (var i = 0; i < 9; i++) {
                if (i <= 4) {
                    for (var j = 0; j < 50; j++) {
                        if (j % 10 <= i || j % 10 >= 9 - i) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println("");
                }
                if (i >= 5) {
                    for (var j = 0; j < 50; j++) {
                        if (j % 10 > i || j % 10 < 9 - i) {
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
}