import java.util.*;


public class Zadania
{
    public int[] zadanie1()
    {
        int[] tab = new int[10];
        Random rand = new Random();

        for (int i = 0; i < tab.length; ++i)
        {
            tab[i] = rand.nextInt(2);
            System.out.print(tab[i] + " ");
        }
        return tab;
    }

    public void zadanie2()
    {
        int[] x = zadanie1();
        int quantityOne = 0;
        int quantityZero = 0;
        System.out.println();
        for (int i = 0; i < x.length; ++i)
        {
            if (x[i] == 0)
            {
                quantityZero++;
            } else
            {
                quantityOne++;
            }
        }
        System.out.println("Ilość zer w tablicy z zadania1 =" + quantityZero);
        System.out.println("Ilość jedynek w tablicy z zadania1 =" + quantityOne);
    }

    public void zadanie3()
    {
        Random rand = new Random();
        int[] tablica = new int[Math.abs(rand.nextInt())];
        //wiem wiem nie zadziała "java.lang.OutOfMemoryError" proszę o commita

        System.out.println(tablica.length);
    }

    public void zadanie4()
    {
        double[] tab = new double[10];
        Random rand = new Random();

        for (int i = 0; i < tab.length; ++i)
        {
            tab[i] = (rand.nextDouble() * rand.nextInt());
            System.out.print(tab[i] + " ");
        }

        for (int i = 0; i < tab.length; ++i)
        {
            if (i % 2 == 0)
            {
                System.out.println("tab[" + i + "]=" + tab[i]);
            }
        }

        for (int i = 0; i < tab.length; ++i)
        {
            if ((int) tab[i] > 0)
            {
                System.out.print((int) tab[i] + " ");
            }
        }

    }

    public void zadanie5()
    {
        int[] tab = {1, 0, 0, 0, 2, 0, 0, 0, 3};
        for (int i = 0; i < tab.length; ++i)
        {
            System.out.print(tab[i] + " ");
            if ((i + 1) % 3 == 0)
            {
                System.out.println();
            }
        }
        System.out.println();
        int x = 3;
        for (int i = 2; i >= 0; i--)
        {
            for (int j = 0; j < x; j++)
            {
                System.out.print(tab[x * i + j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = (tab.length - 1); i >= 0; i--)
        {
            System.out.print(tab[i] + " ");
            if (i % 3 == 0)
            {
                System.out.println();
            }
        }
    }

    public void zadanie6()
    {
        int tab[] = {};
        System.out.println(tab);
        System.out.println("czyli to samo otrzymam:");
        System.out.println(tab.getClass() + "@" + Integer.toHexString(tab.hashCode()));

    }

    public void zadanie7()
    {
        int[] tab = {789, 678, 567};
        for (int i = 0; i < tab.length; i++)
        {
            for (int j = i; j < tab.length; j++)
            {
                System.out.println(tab[i] - tab[j]);
            }
        }

    }

    public void zadanie8()
    {
        int[][] tab =
                {{1, 0, 0},
                        {0, 1, 0},
                        {0, 0, 1},
                };
        //Is the table a square ?
        boolean isSquare = true;
        for (int i = 0; i < tab.length; i++)
        {
            if (tab.length != tab[i].length)
            {
                System.out.println("Tablica nr: " + i + " jest złego rozmiaru");
                isSquare = false;
                break;
            }
        }


        int licznik = 0;
        boolean sameZera = true;
        for (int i = 0; i < tab.length; ++i)
        {
            for (int j = 0; j < tab[i].length; ++j)
            {
                if (i == j)
                {
                    if (tab[i][j] > 0)
                    {
                        licznik++;
                    }
                }
                if (i != j)
                {
                    if (tab[i][j] != 0)
                    {
                        System.out.println("tablica nie jest diagonalna");
                        sameZera = false;
                        break;
                    }
                }
            }
        }

        if (licznik == tab.length & sameZera == true & isSquare == true)
        {
            System.out.println("tablica jest diagonalna");
        } else if (licznik == tab.length & sameZera == false)
        {
            System.out.println("tablica nie jest diagonalna");
        }
    }

    public int[][] makeTables5x5()
    {
        int[][] tab = new int[5][5];
        Random rand = new Random();
        //Make two-dimensional tables with random numbers
        for (int i = 0; i < tab.length; i++)
        {
            for (int j = 0; j < tab[i].length; j++)
            {
                tab[i][j] = rand.nextInt(10);
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
        return tab;
    }


    public void zadanie9()
    {
        int[][] tab = makeTables5x5();
        // Create tables for first diagonal
        System.out.println();
        int[] przekatna1 = new int[tab.length];
        for (int i = 0; i < tab.length; ++i)
        {
            przekatna1[i] = tab[i][i];
            System.out.print(przekatna1[i] + " ");
        }
        //Create tables for second diagonal
        System.out.println();
        int[] przekatna2 = new int[tab.length];
        for (int i = 0; i < tab.length; ++i)
        {
            przekatna2[i] = tab[i][tab.length - 1 - i];
            System.out.print(przekatna2[i] + " ");
        }

        //Check first diagonal
        Map<Integer, Integer> mapDiagonal = new HashMap<>();
        for (int i = 0; i < przekatna1.length; i++)
        {
            if (mapDiagonal.containsKey(przekatna1[i]))
            {
                int value = mapDiagonal.get(przekatna1[i]);
                value++;
                mapDiagonal.put(przekatna1[i], value);
            } else
            {
                mapDiagonal.put(przekatna1[i], 1);
            }

        }
        System.out.println();
        Set<Integer> listOfKey1 = mapDiagonal.keySet();
        for (int i : listOfKey1)
        {
            if (mapDiagonal.get(i) >= 2)
            {
                System.out.println("Na pierwszej przekątnej liczba: " + i + " występuje: " + mapDiagonal.get(i) + " razy");
            }
        }
        //Check second diagona2
        Map<Integer, Integer> mapDiagona2 = new HashMap<>();
        for (int i = 0; i < przekatna2.length; i++)
        {
            if (mapDiagona2.containsKey(przekatna2[i]))
            {
                int value = mapDiagona2.get(przekatna2[i]);
                value++;
                mapDiagona2.put(przekatna2[i], value);
            } else
            {
                mapDiagona2.put(przekatna2[i], 1);
            }

        }
        System.out.println();
        Set<Integer> listOfKey2 = mapDiagona2.keySet();
        for (int i : listOfKey2)
        {
            if (mapDiagona2.get(i) >= 2)
            {
                System.out.println("Na drugiej przekątnej liczba: " + i + " występuje: " + mapDiagona2.get(i) + " razy");
            }
        }

    }

    public void zadanie10()
    {
        int tab[][] = makeTables5x5();

        System.out.println();
        Set<Integer> rowS = new HashSet<>();
        int count = 0;
        for (int i = 0; i < tab.length; i++)
        {
            for (int j = 0; j < tab[i].length; j++)
            {
                count = count + tab[i][j];
            }
            rowS.add(count);
            count = 0;
        }
        System.out.println();
        count = 0;
        Set<Integer> column = new HashSet<>();
        for (int i = 0; i < tab.length; i++)
        {
            for (int j = 0; j < tab[i].length; j++)
            {
                count = count + tab[j][i];
            }
            column.add(count);
            count = 0;
        }
        for (int i : column)
        {
            if (rowS.contains(i))
            {
                System.out.println("Hurra mamy pare liczb");
                break;
            }

        }


    }

    public void zadanie11()
    {
        String[] slowa= {"Ala","kota","ma","ma","a","kot","Ale"};

        System.out.print(slowa[0]+" ");
        System.out.print(slowa[2]+" ");
        System.out.print(slowa[1]+" ");
        System.out.print(slowa[4]+" ");
        System.out.print(slowa[5]+" ");
        System.out.print(slowa[3]+" ");
        System.out.print(slowa[6]+" ");

    }

    public void zadanie12()
    {
        String zdanie = "Ala ma kota a kot ma Ale";
        System.out.println(zdanie);
        char[] zmienna = zdanie.toCharArray();
        int counter=0;
        for (int i = 0; i <zdanie.length() ; i++)
        {
            if (zmienna[i]=='a')
            {
                counter++;
            }
        }
        System.out.println("Litera \"a\" występuje w zdaniu: "+counter+" razy");
    }

    public void zadanie13()
    {
        int[] tab= new int[20];
        Random rand = new Random();
        int[] tabPomoc = new int[20];

        System.out.println("Tablica wypełniona losowymi liczbami:");
        for (int i = 0; i <tab.length-1 ; i++)
        {
            tab[i]= rand.nextInt(10);
            System.out.print(tab[i]+" ");
        }
        System.out.println();
        for (int i = tab.length/2; i <tab.length ; i++)
        {
            tabPomoc[i]=tab[i];
        }

        System.out.println("Tablica po dodaniu elementu -1:");
        tab[tab.length/2]=-1;
        for (int i = (tab.length/2)+1; i <tab.length ; i++)
        {
            tab[i]=tabPomoc[i-1];
        }
        for (int i = 0; i <tab.length ; i++)
        {
            System.out.print(tab[i]+" ");
        }
    }

    public void zadanie14()
    {
        int[] tab= new int[10];
        Random rand = new Random();
        int counter=0;
        for (int i = 0; i <tab.length ; i++)
        {
            tab[i]= rand.nextInt(2);
            System.out.print(tab[i]+" ");
        }
        System.out.println();
        for (int i = 0; i <tab.length-3 ; i++)
        {
            if (tab[i]==1 & tab[i+1]==0 & tab[i+2]==1)
            {
                counter++;
            }
        }
        System.out.println(counter+"-tyle razy wystąpiła sekwencja liczb \"1,0,1\"");
    }

    public void zadanie15() //NIE ROZWIĄZANE
    {

    }

    public void zadanie16() //Slabo wykonane przypisanie malych tablic do dużej
    {
        Random rand = new Random();
        int[] tab1 = new int[rand.nextInt(10)+1];
        int[] tab2 = new int[rand.nextInt(10)+1];
        int[] tab3 = new int[rand.nextInt(10)+1];
        int[][] tablicaTablic = new int[3][];
        tablicaTablic[0]= new int[tab1.length];
        tablicaTablic[1]= new int[tab2.length];
        tablicaTablic[2]= new int[tab3.length];


        for (int i = 0; i <tab1.length ; i++)
        {
            tab1[i]=rand.nextInt(10);
            System.out.print(tab1[i]+" ");
        }
        System.out.println();
        for (int i = 0; i <tab2.length ; i++)
        {
            tab2[i]=rand.nextInt(10);
            System.out.print(tab2[i]+" ");
        }
        System.out.println();
        for (int i = 0; i <tab3.length ; i++)
        {
            tab3[i]=rand.nextInt(10);
            System.out.print(tab3[i]+" ");
        }
        System.out.println();
        for (int i = 0; i <tablicaTablic.length ; i++)
        {
            for (int j = 0; j <tablicaTablic[i].length ; j++)
            {
                if (i==0)
                {
                    tablicaTablic[i][j]=tab1[j];
                }if (i==1)
                {
                    tablicaTablic[i][j]=tab2[j];
                }if (i==2)
                {
                    tablicaTablic[i][j]=tab3[j];
                }
                System.out.print(tablicaTablic[i][j]+" ");
            }
            System.out.println();
        }


    }


}
