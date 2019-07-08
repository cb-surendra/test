class Question1 //for printing the pascal traingle
{
    void show()
    {
        int n = 4;
        int cnt = 1;
        for(int i = n-1; i >= 0; i--)
        {
            for(int j = 0; j < i; j++)
            {
                System.out.print(" ");
            }
            
            for(int j = 1; j <= cnt; j++)
            {
                System.out.print(j);
            }
            Integer temp = cnt-1;
            while(temp > 0)
            {
                System.out.print(temp);
                temp--;
            }
            cnt = cnt + 1;
            System.out.println();
        }
    }
}