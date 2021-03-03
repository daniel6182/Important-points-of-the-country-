
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

                