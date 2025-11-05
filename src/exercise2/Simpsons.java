package exercise2;

public class Simpsons {

    //Skriv en metod som läser in ett tal (1-11) och skriver ut en
    // Simpson’s catch phrase för olika karaktärer
    //Skriver man fel tal skriver metoden ut “please choose a
    // correct character”



       public void catchPhrase(int number) {

    //    Scanner scan = new Scanner(System.in);
     //  System.out.println("Skriv ett tal 1-11: ");

        //int tal = scan.nextInt();

        switch (number){
            case 1:
                System.out.println("D’oh!\n");
                break;
            case 2:
                System.out.println("Mmm~mmmmm");
                break;
            case 3:
                System.out.println("¡Ay, caramba!\n");
                break;
            case 4:
                System.out.println("If anyone wants me, I'll be in my room.");
                break;
            case 5:
                System.out.println("(Pacifier Suck)\n");
                break;
            case 6:
                System.out.println("Hi-Diddily-Ho!\n");
                break;
            case 7:
                System.out.println("Excellent!\n");
                break;
            case 8:
                System.out.println("Ha!\n");
                break;
            case 9:
                System.out.println("SEEEEYYYMOOUURRR!\n");
                break;
            case 10:
                System.out.println("Thank You, Come Again!\n");
                break;
            case 11:
                System.out.println("Disco Stu likes disco music.");
                break;
            default:
                System.out.println("“please choose a correct character”\n");
        }


    }
}
