package array.sample1;

public class Pattern {
    public static void main(String[] args) {
        int lines = 4;
        int i,j;
        for (i=0;i<=lines;i++){
            for(j=0;j<=lines;j++){
                if(i==j)
                    System.out.print("*");
                else
                    System.out.print("0");
            }
            j--;
            System.out.print("*");
            while(j>=0){
                if(i==j)
                    System.out.print("*");
                else
                    System.out.print("0");
                j--;
            }
            System.out.println();
        }
    }
}
