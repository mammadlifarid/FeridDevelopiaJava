public class ArraysDemoHome {
    public static void main(String[] args) {
        int[] numbers = { 8, 9, 5, 6, 7};


        for (int number : numbers) {
            System.out.println(number);
        }


        int min = numbers[0];
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("En kicik eded: " + min);
        System.out.println("En boyuk eded: " + max);

        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double EdediOrta = sum / numbers.length;
        System.out.println("Ededlerin Ededi ortasi: " + EdediOrta);
        
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] < numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }


        System.out.print("Azalan sira ile: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
