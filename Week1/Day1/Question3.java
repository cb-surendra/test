class Question3 //program with conditional statement
{
    String show(Character grade)
    {
        if(grade == 'A')//if grade is A
        {
            return "OutStanding";     
        }
        else if(grade == 'B')//if grade is B
        {
            return "Good";
        }
        else if(grade == 'C')//if grade is C
        {
            return "Fair";
        }
        else if(grade == 'D')//if grade is D
        {
            return "Satisfactory";
        }
        else //if grade is E or F
        {
            return "Fail";
        }
    }
}