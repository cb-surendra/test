class Question2//rotate the matrix 90 degree by left or right
{
    void show(int [][]arr, int n)
    {
        int[][] res = new int[n][n];

        System.out.println("Input : ");
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        for(int i = 0; i < n; i++)
        {
            for(int j = 0, k = n-1; j < n; j++, k--)
            {
                res[k][i] = arr[i][j];
            }
        }
        System.out.println("Output : ");
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                System.out.print(res[i][j]+ " ");
            }
            System.out.println();
        }
    }
}