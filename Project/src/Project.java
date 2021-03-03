
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

                
