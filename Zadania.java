import java.util.Random;

public class Zadania
{
    public  int[] zadanie1()
    {
        int[] tab= new int[10];
        Random rand = new Random();

        for(int i=0;i<tab.length;++i)
        {
            tab[i]=rand.nextInt(2);
            System.out.print(tab[i]+" ");
        }
        return tab;
    }

    public void zadanie2()
    {
        int[] x = zadanie1();
        int quantityOne=0;
        int quantityZero=0;
        System.out.println();
        for(int i=0;i<x.length;++i)
        {
            if(x[i]==0)
            {
                quantityZero++;
            }else
            {
                quantityOne++;
            }
        }
        System.out.println("Ilość zer w tablicy z zadania1 ="+ quantityZero);
        System.out.println("Ilość jedynek w tablicy z zadania1 ="+ quantityOne);
    }

    public void zadanie3()
    {
       Random rand = new Random();
       int[] tablica= new int[Math.abs(rand.nextInt())];
       //wiem wiem nie zadziała "java.lang.OutOfMemoryError" proszę o commita

        System.out.println(tablica.length);
    }
}
