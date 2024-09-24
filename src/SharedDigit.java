public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(12, 34));
    }

    private static boolean hasSharedDigit(int first, int second) {

        if (first < 10 || first > 99 || second < 10 || second > 99) {
            return false;
        }


        while (first > 0) {
            int firstCheck = first % 10;
            int secondCopy = second;


            while (secondCopy > 0) {
                int secondCheck = secondCopy % 10;

                if (firstCheck == secondCheck) {
                    return true;
                }
                secondCopy /= 10;
            }
            first /= 10;
        }

        return false;
    }
}

