import java.util.*;
public class BinaryTDecimal {
        // by default 
            public static void bintodec(int binnum){
                int mynum = binnum;
                int p =0;
                int d =0;
                while(binnum >0){
                    int lastdigit = binnum % 10;
                    d = d + (int)(lastdigit*Math.pow(2,p));
                    p++;
                    binnum /= 10;
                }
                System.out.println("The Decimal number of "+mynum+" is "+d);

            }

    public static void main(String[] args) {
        // input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the binary number: ");
        int binnum = scanner.nextInt();
        // Convert binary to decimal
        bintodec(binnum);
        scanner.close();
    }
}
