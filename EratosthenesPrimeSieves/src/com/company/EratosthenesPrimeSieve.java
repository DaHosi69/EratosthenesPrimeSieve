package com.company;
public class EratosthenesPrimeSieve implements PrimeSieves
{

    public static void main(String[] args)
    {
        EratosthenesPrimeSieve eratosthenesPrimeSieve = new EratosthenesPrimeSieve();
        eratosthenesPrimeSieve.printPrimes();
    }

    public boolean[] isPrime()
    {

        boolean[] Primearr = new boolean[MAX+1];
        for (int i = 2; i <= MAX; i++) {
            Primearr[i] = true;
        }


        for (int factor = 2; factor*factor <= MAX; factor++)
        {
            if (Primearr[factor])
            {
                for (int j = factor; factor*j <= MAX; j++)
                {
                    Primearr[factor*j] = false;
                }
            }
        }
        return Primearr;
    }


    public void printPrimes()
    {
        boolean[] primes = isPrime();
        for (int i = 2; i <= MAX; i++)
        {
            if(primes[i]) System.out.println(i);
        }
    }
}
