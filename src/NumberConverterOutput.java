public class NumberConverterOutput {

    public static void main(String[] args) {

        int bottlesOfBeer;

        for (bottlesOfBeer = 100; bottlesOfBeer > 0; bottlesOfBeer--) {

            if(bottlesOfBeer == 1){
                System.out.println(NumberConverter.toText(bottlesOfBeer) + "single bottle of beer on the wall, "
                        + NumberConverter.toText(bottlesOfBeer) + "single bottle of beer! " +
                        "Take it down, pass it around, " + NumberConverter.toText(bottlesOfBeer - 1)
                        + "bottles of beer on the wall!");
            }
            else System.out.println(NumberConverter.toText(bottlesOfBeer) + "bottles of beer on the wall, "
                    + NumberConverter.toText(bottlesOfBeer) + "bottles of beer! " +
                    "Take one down, pass it around, " + NumberConverter.toText(bottlesOfBeer - 1)
                    + "bottles of beer on the wall!");

        }
    }
}

