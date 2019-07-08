class Day2practice1//calculate the sum of index of the characte in the string 
{
    int show(String s)
    {
        Character ch;
        int sum = 0;
        for(int i = 0; i < s.length(); i++)
        {
            ch  = Character.valueOf(s.charAt(i));
            sum = sum + (ch -'a') + 1;
        }
        return sum;
    }
}