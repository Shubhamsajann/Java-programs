public class Program4 {
    public static void main(String[] args) {
int n =5;

//*****
//****
//***
//**
//*
        for(int i =1; i<=n;i++)
        {
            for(int j=1; j<=n-i+1; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("-------------------------------");

//        11111
//        2222
//        333
//        44
//        5
        for(int i =1; i<=n;i++)
        {
            for(int j=1; j<=n-i+1; j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }

        System.out.println("-------------------------------");
//        12345
//        1234
//        123
//        12
//        1
        for(int i =1; i<=n;i++)
        {
            for(int j=1; j<=n-i+1; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("-------------------------------");
    }
}
