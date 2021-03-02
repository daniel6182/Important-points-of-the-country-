
<<<<<<< HEAD
import java.util.Scanner;

/**
 *
 * @author Alessio
 */
public class Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option;

        do {
            System.out.println(" ========= Proyect =======");
            System.out.println("1. -> distance  volcanos");
            System.out.println("2. -> distance  province");
            System.out.println("3. -> percentage population");
            System.out.println("4. -> number of rivers and reserves");
            System.out.println("5. -> percentage visitan");
            System.out.println("6. -> Turistic places");
            System.out.println("7. -> Exit");
            

            System.out.println("Enter your menu option --> ");
            option = input.nextInt();

            switch (option) {

                case 1:
                    double Coordinatex1;
                    double Coordinatex2;
                    double Coordinatey1;
                    double Coordinatey2;
                    double dist;
                    System.out.println(" <-- Insert a coordinatex1 -->");
                    Coordinatex1 = input.nextInt();

                    System.out.println(" <-- Insert a coordinatex2 -->");
                    Coordinatex2 = input.nextInt();

                    System.out.println(" <-- Insert a coordinatey1 -->");
                    Coordinatey1 = input.nextInt();

                    System.out.println(" <-- Insert a coordinatey2 -->");
                    Coordinatey2 = input.nextInt();

                    dist = ShowTheDistanceBetweenTwoEcuatoriansVolcanos(Coordinatex1, Coordinatex2, Coordinatey1, Coordinatey2);
                    System.out.println(" <- dist is -> " + dist);
                    break;

        
case 2:

                    double Sx1;
                    double Sx2;
                    double Sy1;
                    double Sy2;
                    double disites;
                    System.out.println(" <-- Insert a Sx1 -->");
                    Sx1 = input.nextInt();

                    System.out.println(" <-- Insert a Sx2 -->");
                    Sx2 = input.nextInt();

                    System.out.println(" <-- Insert a Sy1 -->");
                    Sy1 = input.nextInt();

                    System.out.println(" <-- Insert a Sy2 -->");
                    Sy2 = input.nextInt();

                    disites = performTheDistanceBetweenTwoPlaces(Sx1, Sx2, Sy1, Sy2);
                    System.out.println(" <- disites is -> " + disites);
                    break;

                case 3:

                    int Currentvariable = 0;
                    int Oldvariable = 0;
                    final int valor = 100;
                    float y = 0;
                    y = calculateThePopulationPercent(Currentvariable, Oldvariable, valor);
                    System.out.println("The percentage is");
                    System.out.println("enter Currentvariable -> ");
                    Currentvariable = input.nextInt();
                    System.out.println("enter Oldvariable -> ");
                    Oldvariable = input.nextInt();
                    y = ((Currentvariable - Oldvariable) / Oldvariable) * valor;

                    y = calculateThePopulationPercent(Currentvariable, Oldvariable, valor);
                    System.out.println(" percentage of" + y + "is equal to ->" + y);
                    break;
                case 4:

                    int mainRivers;
                    int wildlifeReserve;
                    int riversAndReserves;
                    System.out.println("Enter the amount of rivers -> ");
                    mainRivers = input.nextInt();

                    System.out.println("Enter the amount ofwildlifeReserves -> ");
                    wildlifeReserve = input.nextInt();

                    ShowTheNumberOfRiversAndReservesOfEcuador(mainRivers, wildlifeReserve);
                    break;

                case 5:

                    int peopleVisitant = 0;
                    int habitants = 0;
                    final int value = 100;
                    float i = 0;
                    y = vistantPercentage(peopleVisitant, habitants, value);
                    System.out.print("The percentage is");

                    System.out.print("enter peopleVisitant -> ");
                    peopleVisitant = input.nextInt();

                    System.out.println("enter habitants -> ");
                    habitants = input.nextInt();
                    i = (peopleVisitant / habitants) * value;

                    i = vistantPercentage(peopleVisitant, habitants, value);
                    System.out.println("percentage of" + i + "is equal to ->" + i);
                    break;
                    
                    case 6:

                    String[][] atractivosturisticos = new String[4][3];
                    String[] provincias = new String[4];
                    Scanner scan = new Scanner(System.in);
                    principalesLugaresTuristicos(provincias, scan, atractivosturisticos);
                    break;
                default:
                    System.out.println("Invalid option\n\n\n");
                    break;
                    
                case 7:
                    System.out.println("See you later alligators");
                    System.exit(0);
             }

        } while (option != 7);
    }

    public static double ShowTheDistanceBetweenTwoEcuatoriansVolcanos(double Coordinatex1, double Coordinatex2, double Coordinatey1, double Coordinatey2) {
        double dist;
        double first;
        double second;
        first = Math.pow(Coordinatex2 - Coordinatex1, 2);
        second = Math.pow(Coordinatey2 - Coordinatey1, 2);

        dist = (double) Math.sqrt(first + second);

        return (double) dist;

    }

    public static double performTheDistanceBetweenTwoPlaces(double Sx1, double Sx2, double Sy1, double Sy2) {
        double disites;
        double place1;
        double place2;
        place1 = Math.pow(Sx2 - Sx1, 2);
        place2 = Math.pow(Sy2 - Sy1, 2);

        disites = (double) Math.sqrt(place1 + place2);

        return (double) disites;
    }

                
=======
>>>>>>> ae9edb58da7b4c580a3c3bd6ddbd09a49bd212c3
