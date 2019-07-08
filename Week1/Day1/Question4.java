class Question4
{
    Integer smallestPower(Integer a, Integer b)//finding the smallest power of a which is greater than b
    {
        Integer count = 1;
        while( a <= b )
        {
            count = count + 1;
            Integer temp = a;
            temp = temp *a;
            a = temp;   
        }
        return count;
    }
}