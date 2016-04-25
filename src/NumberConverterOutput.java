import java.util.Scanner;

public class NumberConverterOutput {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Prompt for location
        System.out.println("From what will they be removed?");
        String removalSurface = input.next();
        System.out.println(removalSurface);
        //Prompt for kind of container
        System.out.println("What kind of container?");
        String containerType = input.next();
        System.out.println(containerType);
        //Prompt for what is contained
        System.out.println("What's in the containers?");
        String containerContent = input.next();
        System.out.println(containerContent);
        //Prompt for number of bottles to begin with
        System.out.println("How many to begin with?");
        int startingNumber = input.nextInt();
        System.out.println(startingNumber);

        //Prompt for number of bottles to be taken down
        System.out.println("How many to take down each time?");
        int removalNumber = input.nextInt();
        System.out.println(removalNumber);

        int bottlesOfBeer;

        for (bottlesOfBeer = startingNumber; bottlesOfBeer > 0; bottlesOfBeer = bottlesOfBeer - removalNumber) {

            if(bottlesOfBeer == 1){
                System.out.println(NumberConverter.toText(bottlesOfBeer) + "single " + containerType + " of " + containerContent + " on the " + removalSurface + " , "
                        + NumberConverter.toText(bottlesOfBeer) + "single " + containerType + " of " + containerContent + "!  " +
                        "Take it down, pass it around, " + NumberConverter.toText(bottlesOfBeer - removalNumber)
                        + containerType + " of " + containerContent + " on the " + removalSurface + "!");
            } else if(removalNumber > 1){
                System.out.println(NumberConverter.toText(bottlesOfBeer) + containerType + "s of " + containerContent + " on the " + removalSurface + ", "
                        + NumberConverter.toText(bottlesOfBeer) + containerType + "s of " + containerContent +
                        ".  Take " + NumberConverter.toText(removalNumber) + "down, pass them around, " + NumberConverter.toText(bottlesOfBeer - removalNumber)
                        + containerType + "s of " + containerContent + " on the " + removalSurface + "!");
            } else System.out.println(NumberConverter.toText(bottlesOfBeer) + containerType + "s of " + containerContent + " on the " + removalSurface + ", "
                    + NumberConverter.toText(bottlesOfBeer) + containerType + "s of " + containerContent +
                    ".  Take " + NumberConverter.toText(removalNumber) + "down, pass it around, " + NumberConverter.toText(bottlesOfBeer - removalNumber)
                    + containerType + "s of " + containerContent + " on the " + removalSurface + "!");

        }
    }
}

