public class Number {
    public static void main(String[] args) {
        boolean isDiv = true;
        int div;

        for (div =1 ;; div++) {
            isDiv = true;
            for (int num = 1; num <= 20; num++) {
                if (div % num != 0) {
                    isDiv=false;
                    break;
                }
            }
            if (isDiv) {
                break;
            }
        }
        System.out.println(div);


    }
}
