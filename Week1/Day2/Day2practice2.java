class Day2practice2
{
    Float findSimpleInterest(Float P, Float r, Integer t)//SI = P(1+rt) P-principle, r=rate, t=time;
    {
        return P*(1+r*t);
    }

    Double findCompoundInterest(Float P, Float r, Integer n, Integer t)
    {
        return P*Math.pow( (double) (1+r/n), (double) n*t);
    }
}