class Main
{
    public static void main(String[] args) {

        int n =5;

        for(int i =1; i<= n ; i++)
        {
            for(int j =1; j<=n; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("________________________");

        // Output:
        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * *

        for(int i =1; i<=n ; i++)
        {
            for(int j =1; j<=n; j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println("________________________");

        // Output:
        // 11111
        // 22222
        // 33333
        // 44444
        // 55555
        for(int i=1; i<=n ; i++)
        {
            for(int j =1 ; j<=n;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("________________________");
    }
}