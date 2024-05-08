public class MethodsHome {

    public void printNumbers(int begin, int end) {
        for (int i = begin; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MethodsHome methodsHome = new MethodsHome();


        methodsHome.printNumbers(1, 10);
        methodsHome.printNumbers(20, 25);
        methodsHome.printNumbers(-13, 3);
    }
}
