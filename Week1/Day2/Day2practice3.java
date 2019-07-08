class Day2practice3
{
    int findFibo(int n)
    {
        if( n <= 1 )
            return 1;
        else
            return findFibo(n-1) + findFibo(n-2);//recurssion relation to find the nth fibonnaci number 
        //as an = an-1 + an-2;
        //1 1 2 3 5 8 13 ......
    }
}