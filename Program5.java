public class Program5 {
    public static void main(String[] args) {
int n =5;
//     *
//    **
//   ***
//  ****
// *****

        for(int i =1; i<=n; i++)
        {
            for(int j =1; j<=n-i+1; j++)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
//        1
//        22
//        333
//        4444
//        55555

        System.out.println("---------------------------");


        for(int i =1; i<=n; i++)
        {
            for(int j =1; j<=n-i+1; j++)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=i;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }


        System.out.println("---------------------------");

//        1
//        12
//        123
//        1234
//        12345

        for(int i =1; i<=n; i++)
        {
            for(int j =1; j<=n-i+1; j++)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }


        System.out.println("---------------------------");
    }
}
