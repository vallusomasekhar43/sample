package simple.example.problems;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n =10,firstTerm=0,secondTerm=1;
        System.out.println("Fibonacci series till"+n+"terms");

        for(int i=0;i<=n;++i){
            System.out.printf(firstTerm+",");

            int nextTerm = firstTerm+secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
