package fr.umontpellier.iut.exercice1;

public class FizzBuzz {


    FizzBuzz() {}

    public String getValue(int i) {
        System.out.println("Fizz Buzz vaut : "+i+"\n");
        return ("Fizz Buzz vaut : "+i+"\n") ;
    }


    public String[] computeList(int i) {
        i++;
        String[] s= new String[i];

        int paopti=i-1;


        for (int j=1;j<i;j++)
        {
            s[j]="";
            if (j%3==0) s[j]="Fizz";
            if (j%5==0) s[j]+="Buzz";
            if (!(j%3==0) ) {if (!(j%5==0)) s[j]+=Integer.toString(j);}
            if (!(j==paopti)) s[j]+=" ; ";

            System.out.print(s[j]);
        }


        return s;
    }
}
