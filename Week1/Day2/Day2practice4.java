class Day2practice4
{
    void findSmallestAndLargest(int[] arr)
    {
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++)
        {
            if( minValue > arr[i] )//if minValue is greater than element then we have to replace
            {
                minValue = arr[i];
            }

            if( maxValue < arr[i])//if minValue is less than element than we have to replace
            {
                maxValue = arr[i];
            } 
        }
        System.out.println("Maximum Value : " + maxValue + " And Minimum : " + minValue);
    }
}