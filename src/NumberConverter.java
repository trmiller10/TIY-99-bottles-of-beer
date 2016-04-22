//creates new class NumberConverter containing static method for turning integers into text
public class NumberConverter {


    //creates a static method toText()that works with integer variable 'number' and returns the result as a string
    public static String toText(int number) {

        if (number < 10) {
            return handleSingles(number);
        } else if (number >= 10 && number < 20) {
            return handleTeens(number);
        } else if (number >= 20 && number < 100) {
            return handleTens(number);
        } else if (number >= 100 && number < 1000) {
            return handleHundreds(number);
        } else if (number >= 1000 && number < 1000000) {
            return handleThousands(number);
        } else if (number >= 1000000 && number < 1000000000) {
            return handleMillions(number);
        }

        return "sdfgh";
    }

    public static String handleSingles(int number) {


        String singleString = "singles default";

        switch (number) {
            case 0:
                singleString = "zero";
                //ends case program flow
                break;
            case 1:
                singleString = "one ";
                break;
            case 2:
                singleString = "two ";
                break;
            case 3:
                singleString = "three ";
                break;
            case 4:
                singleString = "four ";
                break;
            case 5:
                singleString = "five ";
                break;
            case 6:
                singleString = "six ";
                break;
            case 7:
                singleString = "seven ";
                break;
            case 8:
                singleString = "eight ";
                break;
            case 9:
                singleString = "nine ";
                break;
        }
        return singleString;
    }//public static String handleSingles(int number){


    public static String handleTeens(int number){

        String teenString = "teen default";

        switch(number) {
            case 10:
                teenString = "ten ";
                break;
            case 11:
                teenString = "eleven ";
                break;
            case 12:
                teenString = "twelve ";
                break;
            case 13:
                teenString = "thirteen ";
                break;
            case 14:
                teenString = "fourteen ";
                break;
            case 15:
                teenString = "fifteen ";
                break;
            case 16:
                teenString = "sixteen ";
                break;
            case 17:
                teenString = "seventeen ";
                break;
            case 18:
                teenString = "eighteen ";
                break;
            case 19:
                teenString = "nineteen ";
                break;
        }
        return teenString;
    }

    public static String handleTens(int number) {

        //if pulled from handleHundreds() and is followed by a zero
        if(number > 1 && number < 10){
            number = number * 10;
        }

        int tens = number / 10;

        int singles = number % 10;

        //if pulled from handleHundreds and both tens and singles were zero
        if(tens == 0 && singles == 0){
            return "";
        }


        if(number == 0){
            return handleSingles(number);
        }
        if(number >= 11 && number < 20){
            return handleTeens(number);
        }

        if(tens == 0){
            return handleSingles(number);
        }

        String tenString = "default";

        //if tens is followed by a zero
        if (singles == 0){
            switch (tens){
                case 1: tenString = "ten ";
                    break;
                case 2: tenString = "twenty ";
                    break;
                case 3: tenString = "thirty ";
                    break;
                case 4: tenString = "forty ";
                    break;
                case 5: tenString = "fifty ";
                    break;
                case 6: tenString = "sixty ";
                    break;
                case 7: tenString = "seventy ";
                    break;
                case 8: tenString = "eighty ";
                    break;
                case 9: tenString = "ninety ";
                    break;
            } return tenString;
        }//if (singles == 0){
        //if followed by non-zero single
        switch (tens) {
            case 0:
                tenString = "";
                break;
            case 2:
                tenString = "twenty " + handleSingles(singles);
                break;
            case 3:
                tenString = "thirty " + handleSingles(singles);
                break;
            case 4:
                tenString = "forty " + handleSingles(singles);
                break;
            case 5:
                tenString = "fifty " + handleSingles(singles);
                break;
            case 6:
                tenString = "sixty " + handleSingles(singles);
                break;
            case 7:
                tenString = "seventy " + handleSingles(singles);
                break;
            case 8:
                tenString = "eighty " + handleSingles(singles);
                break;
            case 9:
                tenString = "ninety " + handleSingles(singles);
                break;
        } //switch (tens)
        return tenString;

    } //public static String handleTens(int number) {



    public static String handleHundreds(int number){
        int hundreds = number / 100;
        if(hundreds == 0){
            return handleTens(number);
        }
        int tensSeparateDigit = number / 10 % 10;
        int singles = number % 10;
        if(tensSeparateDigit == 1){
            number = 10 + singles;
        }
        String teenString = handleTeens(number);


        String hundredString = "hundred default";

        //if hundreds followed by two zeroes
        if (tensSeparateDigit == 0 && singles == 0){
            switch(hundreds){
                case 1: hundredString = "one hundred ";
                    break;
                case 2: hundredString = "two hundred ";
                    break;
                case 3: hundredString = "three hundred ";
                    break;
                case 4: hundredString = "four hundred ";
                    break;
                case 5: hundredString = "five hundred ";
                    break;
                case 6: hundredString = "six hundred ";
                    break;
                case 7: hundredString = "seven hundred ";
                    break;
                case 8: hundredString = "eight hundred ";
                    break;
                case 9: hundredString = "nine hundred ";
                    break;

            } return hundredString;
            //if hundreds followed by tens=0 and singles=nonzero
        } else if (tensSeparateDigit == 0 && singles != 0){
            switch(hundreds){
                case 1: hundredString = "one hundred " + handleSingles(singles);
                    break;
                case 2: hundredString = "two hundred " + handleSingles(singles);
                    break;
                case 3: hundredString = "three hundred  " + handleSingles(singles);
                    break;
                case 4: hundredString = "four hundred " + handleSingles(singles);
                    break;
                case 5: hundredString = "five hundred " + handleSingles(singles);
                    break;
                case 6: hundredString = "six hundred " + handleSingles(singles);
                    break;
                case 7: hundredString = "seven hundred " + handleSingles(singles);
                    break;
                case 8: hundredString = "eight hundred " + handleSingles(singles);
                    break;
                case 9: hundredString = "nine hundred " + handleSingles(singles);
                    break;

            } return hundredString;
            //if hundreds is followed by tens=nonzero and singles=0
        } else if (tensSeparateDigit == 1){
            switch(hundreds){
                case 1: hundredString = "one hundred " + teenString;
                    break;
                case 2: hundredString = "two hundred " + teenString;
                    break;
                case 3: hundredString = "three hundred " + teenString;
                    break;
                case 4: hundredString = "four hundred " + teenString;
                    break;
                case 5: hundredString = "five hundred " + teenString;
                    break;
                case 6: hundredString = "six hundred " + teenString;
                    break;
                case 7: hundredString = "seven hundred " + teenString;
                    break;
                case 8: hundredString = "eight hundred " + teenString;
                    break;
                case 9: hundredString = "nine hundred " + teenString;
                    break;
            } return hundredString;
        }

        else if (tensSeparateDigit != 0 && singles == 0){
            switch(hundreds){
                case 1: hundredString = "one hundred " + handleTens(tensSeparateDigit);
                    break;
                case 2: hundredString = "two hundred " + handleTens(tensSeparateDigit);
                    break;
                case 3: hundredString = "three hundred " + handleTens(tensSeparateDigit);
                    break;
                case 4: hundredString = "four hundred " + handleTens(tensSeparateDigit);
                    break;
                case 5: hundredString = "five hundred " + handleTens(tensSeparateDigit);
                    break;
                case 6: hundredString = "six hundred " + handleTens(tensSeparateDigit);
                    break;
                case 7: hundredString = "seven hundred " + handleTens(tensSeparateDigit);
                    break;
                case 8: hundredString = "eight hundred " + handleTens(tensSeparateDigit);
                    break;
                case 9: hundredString = "nine hundred " + handleTens(tensSeparateDigit);
                    break;

            } return hundredString;
        }
        //if hundreds is followed by nonzero, nonteen tens and singles
        switch(hundreds){
            case 1: hundredString = "one hundred "  + handleTens(tensSeparateDigit) + handleSingles(singles);
                break;
            case 2: hundredString = "two hundred "  + handleTens(tensSeparateDigit) + handleSingles(singles);
                break;
            case 3: hundredString = "three hundred " + handleTens(tensSeparateDigit) + handleSingles(singles);
                break;
            case 4: hundredString = "four hundred " + handleTens(tensSeparateDigit) + handleSingles(singles);
                break;
            case 5: hundredString = "five hundred " + handleTens(tensSeparateDigit) + handleSingles(singles);
                break;
            case 6: hundredString = "six hundred "  + handleTens(tensSeparateDigit) + handleSingles(singles);
                break;
            case 7: hundredString = "seven hundred " + handleTens(tensSeparateDigit) + handleSingles(singles);
                break;
            case 8: hundredString = "eight hundred " + handleTens(tensSeparateDigit) + handleSingles(singles);
                break;
            case 9: hundredString = "nine hundred " + handleTens(tensSeparateDigit) + handleSingles(singles);
                break;

        }
        return hundredString;

    } //public static String handleHundreds(int number){

    public static String handleThousands(int number) {

        int thousands = number / 1000;
        int hundreds = number % 1000;

        String thousandString = "thousand default";
        if (thousands >= 1 && thousands < 10) {
            thousandString = handleSingles(thousands) + "thousand "
                    + handleHundreds(hundreds);
        } else if (thousands >= 10 && thousands < 20) {
            thousandString = handleTeens(thousands) + "thousand "
                    + handleHundreds(hundreds);
        } else if (thousands >= 20 && thousands < 100) {
            thousandString = handleTens(thousands) + "thousand "
                    + handleHundreds(hundreds);
        } else if (thousands >= 100 && thousands < 1000) {
            thousandString = handleHundreds(thousands) + "thousand "
                    + handleHundreds(hundreds);
        } else if (thousands == 0){
            thousandString = "";
        }

        return thousandString;
    }


    public static String handleMillions(int number) {

        int millions = number / 1000000;
        int thousands = number % 1000000;
        // int hundreds = % 1000;

        String millionString = "million default";
        if(millions >= 1 && millions < 10) {
            millionString = handleSingles(millions) + "million "
                    + handleThousands(thousands);
        } else if (millions >= 10 && millions < 20) {
            millionString = handleTeens(millions) + "million "
                    + handleThousands(thousands);
        } else if (millions >= 20 && millions < 100) {
            millionString = handleTens(millions) + "million "
                    + handleThousands(thousands);
        } else if (millions >= 100 && millions < 1000) {
            millionString = handleHundreds(millions) + "million "
                    + handleThousands(thousands);
        }

        return millionString;
    }

} //public class NumberConverter {
