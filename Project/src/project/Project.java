
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

                
=======
>>>>>>> ae9edb58da7b4c580a3c3bd6ddbd09a49bd212c3
