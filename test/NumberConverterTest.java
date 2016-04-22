import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by Taylor on 4/22/16.
 */
public class NumberConverterTest {

    @Test
    /**
     * Given NumberConverter, when integer 0 is input, then "zero" is returned.
     */
    public void whenInteger0ThenZero() {
        //Arrange

        //Act
        String zero = NumberConverter.toText(0);
        //Assert
        assertThat(zero, is("zero"));
    }
    @Test
    /**
     * Given: NumberConverter
     * When: Integer 5 is input
     * Then: "Five" is returned
     */
    public void whenInteger5ThenFive() {
        //Arrange

        //Act
        String five = NumberConverter.toText(5);
        //Assert
        assertThat(five, is("five "));
    }

    @Test
    /**
     * Given: NumberConverter
     * When: Integer 10 is input
     * Then: "ten" is returned
     */
    public void whenInteger10ThenTen() {
        //Arrange

        //Act
        String ten = NumberConverter.toText(10);
        //Assert
        assertThat(ten, is("ten "));
    }

    @Test
    /**
     * Given: NumberConverter
     * When: Integer 11 is input
     * Then: "eleven" is returned
     */
    public void whenInteger11ThenEleven() {
        //Arrange

        //Act
        String eleven = NumberConverter.toText(11);
        //Assert
        assertThat(eleven, is("eleven "));
    }

    @Test
    /**
     * Given: NumberConverter
     * When: Integer 20 is input
     * Then: "twenty" is returned
     */
    public void whenInteger20ThenTwenty() {
        //Arrange

        //Act
        String twenty = NumberConverter.toText(20);
        //Assert
        assertThat(twenty, is("twenty "));
    }

    @Test
    /**
     * Given: NumberConverter
     * When: Integer 25 is input
     * Then: "twenty five" is returned
     */
    public void whenInteger25ThenTwentyFive() {
        //Arrange

        //Act
        String twentyFive = NumberConverter.toText(25);
        //Assert
        assertThat(twentyFive, is("twenty five "));
    }

    @Test
    /**
     * Given: NumberConverter
     * When: Integer 50 is input
     * Then: "fifty" is returned
     */
    public void whenInteger50ThenFifty() {
        //Arrange

        //Act
        String fifty = NumberConverter.toText(50);
        //Assert
        assertThat(fifty, is("fifty "));
    }

    @Test
    /**
     * Given: NumberConverter
     * When: Integer 99 is input
     * Then: "ninety nine" is returned
     */
    public void whenInteger99ThenNinetyNine() {
        //Arrange

        //Act
        String ninetyNine = NumberConverter.toText(99);
        //Assert
        assertThat(ninetyNine, is("ninety nine "));
    }
    @Test
    /**
     * Given: NumberConverter
     * When: Integer 100 is input
     * Then: "one hundred" is returned
     */
    public void whenInteger100ThenOneHundred() {
        //Arrange

        //Act
        String oneHundred = NumberConverter.toText(100);
        //Assert
        assertThat(oneHundred, is("one hundred "));
    }
    @Test
    /**
     * Given: NumberConverter
     * When: Integer 101 is input
     * Then: "one hundred" is returned
     */
    public void whenInteger101ThenOneHundredOne() {
        //Arrange

        //Act
        String oneHundredOne = NumberConverter.toText(101);
        //Assert
        assertThat(oneHundredOne, is("one hundred one "));
    }
    @Test
    /**
     * Given: NumberConverter
     * When: Integer 110 is input
     * Then: "one hundred ten" is returned
     */
    public void whenInteger110ThenOneHundredTen() {
        //Arrange

        //Act
        String oneHundredTen = NumberConverter.toText(110);
        //Assert
        assertThat(oneHundredTen, is("one hundred ten "));
    }
    @Test
    /**
     * Given: NumberConverter
     * When: Integer 111 is input
     * Then: "one hundred eleven" is returned
     */
    public void whenInteger111ThenOneHundredEleven() {
        //Arrange

        //Act
        String oneHundredEleven = NumberConverter.toText(111);
        //Assert
        assertThat(oneHundredEleven, is("one hundred eleven "));
    }
    @Test
    /**
     * Given: NumberConverter
     * When: Integer 120 is input
     * Then: "one hundred twenty" is returned
     */
    public void whenInteger120ThenOneHundredTwenty() {
        //Arrange

        //Act
        String oneHundredTwenty = NumberConverter.toText(120);
        //Assert
        assertThat(oneHundredTwenty, is("one hundred twenty "));
    }
    @Test
    /**
     * Given: NumberConverter
     * When: Integer 125 is input
     * Then: "one hundred twenty five" is returned
     */
    public void whenInteger100ThenOneHundredTwentyFive() {
        //Arrange

        //Act
        String oneHundredTwentyFive = NumberConverter.toText(125);
        //Assert
        assertThat(oneHundredTwentyFive, is("one hundred twenty five "));
    }
    @Test
    /**
     * Given: NumberConverter
     * When: Integer 150 is input
     * Then: "one hundred fifty " is returned
     */
    public void whenInteger150ThenOneHundredFifty() {
        //Arrange

        //Act
        String oneHundredFifty = NumberConverter.toText(150);
        //Assert
        assertThat(oneHundredFifty, is("one hundred fifty "));
    }
    @Test
    /**
     * Given: NumberConverter
     * When: Integer 199 is input
     * Then: "one hundred ninety nine  " is returned
     */
    public void whenInteger150ThenOneHundredNinetyNine() {
        //Arrange

        //Act
        String oneHundredNinetyNine = NumberConverter.toText(199);
        //Assert
        assertThat(oneHundredNinetyNine, is("one hundred ninety nine "));
    }
    @Test
    /**
     * Given: NumberConverter
     * When: Integer 200 is input
     * Then: "one hundred fifty " is returned
     */
    public void whenInteger200ThenTwoHundred() {
        //Arrange

        //Act
        String twoHundred = NumberConverter.toText(200);
        //Assert
        assertThat(twoHundred, is("two hundred "));
    }
    @Test
    /**
     * Given: NumberConverter
     * When: Integer 150 is input
     * Then: "one hundred fifty " is returned
     */
    public void whenInteger555ThenFiveHundredFiftyFive() {
        //Arrange

        //Act
        String fiveHundredFiftyFive = NumberConverter.toText(555);
        //Assert
        assertThat(fiveHundredFiftyFive, is("five hundred fifty five "));
    }
    @Test
    /**
     * Given: NumberConverter
     * When: Integer 1000 is input
     * Then: "one thousand " is returned
     */
    public void whenInteger1000ThenOneThousand() {
        //Arrange

        //Act
        String oneThousand = NumberConverter.toText(1000);
        //Assert
        assertThat(oneThousand, is("one thousand "));
    }
    @Test
    /**
     * Given: NumberConverter
     * When: Integer 1001 is input
     * Then: "one thousand one " is returned
     */
    public void whenInteger1001ThenOneThousandOne() {
        //Arrange

        //Act
        String oneThousandOne = NumberConverter.toText(1001);
        //Assert
        assertThat(oneThousandOne, is("one thousand one "));
    }
    @Test
    /**
     * Given: NumberConverter
     * When: Integer 1010 is input
     * Then: "one thousand ten " is returned
     */
    public void whenInteger1010ThenOneThousandTen() {
        //Arrange

        //Act
        String oneThousandTen = NumberConverter.toText(1010);
        //Assert
        assertThat(oneThousandTen, is("one thousand ten "));
    }
    @Test
    /**
     * Given: NumberConverter
     * When: Integer 1011 is input
     * Then: "one thousand eleven " is returned
     */
    public void whenInteger1011ThenOneThousandEleven() {
        //Arrange

        //Act
        String oneThousandEleven = NumberConverter.toText(1011);
        //Assert
        assertThat(oneThousandEleven, is("one thousand eleven "));
    }
    @Test
    /**
     * Given: NumberConverter
     * When: Integer 1019 is input
     * Then: "one thousand nineteen " is returned
     */
    public void whenInteger1019ThenOneThousandNineteen() {
        //Arrange

        //Act
        String oneThousandNineteen = NumberConverter.toText(1019);
        //Assert
        assertThat(oneThousandNineteen, is("one thousand nineteen "));
    }
    @Test
    /**
     * Given: NumberConverter
     * When: Integer 1020 is input
     * Then: "one thousand twenty " is returned
     */
    public void whenInteger1020ThenOneThousandTwenty() {
        //Arrange

        //Act
        String oneThousandTwenty = NumberConverter.toText(1020);
        //Assert
        assertThat(oneThousandTwenty, is("one thousand twenty "));
    }
    @Test
    /**
     * Given: NumberConverter
     * When: Integer 1025 is input
     * Then: "one thousand twenty five " is returned
     */
    public void whenInteger1025ThenOneThousandTwentyFive() {
        //Arrange

        //Act
        String oneThousandTwentyFive = NumberConverter.toText(1025);
        //Assert
        assertThat(oneThousandTwentyFive, is("one thousand twenty five "));
    }
    @Test
    /**
     * Given: NumberConverter
     * When: Integer 1100 is input
     * Then: "one thousand one hundred " is returned
     */
    public void whenInteger1100ThenOneThousandOneHundred() {
        //Arrange

        //Act
        String oneThousandOneHundred = NumberConverter.toText(1100);
        //Assert
        assertThat(oneThousandOneHundred, is("one thousand one hundred "));
    }
    @Test
    /**
     * Given: NumberConverter
     * When: Integer 1101 is input
     * Then: "one thousand one hundred one " is returned
     */
    public void whenInteger1101ThenOneThousandOneHundredOne() {
        //Arrange

        //Act
        String oneThousandOneHundredOne = NumberConverter.toText(1101);
        //Assert
        assertThat(oneThousandOneHundredOne, is("one thousand one hundred one "));
    }
    @Test
    /**
     * Given: NumberConverter
     * When: Integer 1111 is input
     * Then: "one thousand one hundred eleven" is returned
     */
    public void whenInteger1111ThenOneThousandOneHundredEleven() {
        //Arrange

        //Act
        String oneThousandOneHundredEleven = NumberConverter.toText(1111);
        //Assert
        assertThat(oneThousandOneHundredEleven, is("one thousand one hundred eleven "));
    }
    @Test
    /**
     * Given: NumberConverter
     * When: Integer 1500 is input
     * Then: "one thousand five hundred " is returned
     */
    public void whenInteger1500ThenOneThousandFiveHundred() {
        //Arrange

        //Act
        String oneThousandFiveHundred = NumberConverter.toText(1500);
        //Assert
        assertThat(oneThousandFiveHundred, is("one thousand five hundred "));
    }
    @Test
    /**
     * Given: NumberConverter
     * When: Integer 1550 is input
     * Then: "one thousand five hundred fifty " is returned
     */
    public void whenInteger1550ThenOneThousandFiveHundredFifty() {
        //Arrange

        //Act
        String oneThousandFiveHundredFifty = NumberConverter.toText(1550);
        //Assert
        assertThat(oneThousandFiveHundredFifty, is("one thousand five hundred fifty "));
    }
    @Test
    /**
     * Given: NumberConverter
     * When: Integer 5718 is input
     * Then: "five thousand seven hundred eighteen" is returned
     */
    public void whenInteger5718ThenFiveThousandSevenHundredEighteen() {
        //Arrange

        //Act
        String fiveThousandSevenHundredEighteen = NumberConverter.toText(5718);
        //Assert
        assertThat(fiveThousandSevenHundredEighteen, is("five thousand seven hundred eighteen "));
    }
    @Test
    /**
     * Given: NumberConverter
     * When: Integer 10000 is input
     * Then: "ten thousand" is returned
     */
    public void whenInteger10000ThenTenThousand() {
        //Arrange

        //Act
        String tenThousand = NumberConverter.toText(10000);
        //Assert
        assertThat(tenThousand, is("ten thousand "));
    }
    @Test
    /**
     * Given: NumberConverter
     * When: Integer 10001 is input
     * Then: "ten thousand one " is returned
     */
    public void whenInteger10001ThenTenThousandOne() {
        //Arrange

        //Act
        String tenThousandOne = NumberConverter.toText(10001);
        //Assert
        assertThat(tenThousandOne, is("ten thousand one "));
    }
    @Test
    /**
     * Given: NumberConverter
     * When: Integer 10011 is input
     * Then: "ten thousand eleven " is returned
     */
    public void whenInteger10011ThenTenThousandEleven() {
        //Arrange

        //Act
        String tenThousandEleven = NumberConverter.toText(10011);
        //Assert
        assertThat(tenThousandEleven, is("ten thousand eleven "));
    }
    @Test
    /**
     * Given: NumberConverter
     * When: Integer 10111 is input
     * Then: "ten thousand one hundred eleven " is returned
     */
    public void whenInteger10111ThenTenThousandOneHundredEleven() {
        //Arrange

        //Act
        String tenThousandOneHundredEleven = NumberConverter.toText(10111);
        //Assert
        assertThat(tenThousandOneHundredEleven, is("ten thousand one hundred eleven "));
    }

    @Test
    /**
     * Given: NumberConverter
     * When: Integer 11000 is input
     * Then: "eleven thousand " is returned
     */
    public void whenInteger11000ThenElevenThousand() {
        //Arrange

        //Act
        String elevenThousand = NumberConverter.toText(11000);
        //Assert
        assertThat(elevenThousand, is("eleven thousand "));
    }
    @Test
    /**
     * Given: NumberConverter
     * When: Integer 11001 is input
     * Then: "eleven thousand one " is returned
     */
    public void whenInteger11001ThenElevenThousandOne() {
        //Arrange

        //Act
        String elevenThousandOne = NumberConverter.toText(11001);
        //Assert
        assertThat(elevenThousandOne, is("eleven thousand one "));
    }
    @Test
    /**
     * Given: NumberConverter
     * When: Integer 11011 is input
     * Then: "eleven thousand eleven " is returned
     */
    public void whenInteger11011ThenElevenThousandEleven() {
        //Arrange

        //Act
        String elevenThousandEleven = NumberConverter.toText(11011);
        //Assert
        assertThat(elevenThousandEleven, is("eleven thousand eleven "));
    }
    @Test
    /**
     * Given: NumberConverter
     * When: Integer 11111 is input
     * Then: "eleven thousand one hundred eleven" is returned
     */
    public void whenInteger11111ThenElevenThousandOneHundredEleven() {
        //Arrange

        //Act
        String elevenThousandOneHundredEleven = NumberConverter.toText(11111);
        //Assert
        assertThat(elevenThousandOneHundredEleven, is("eleven thousand one hundred eleven "));
    }
    @Test
    /**
     * Given: NumberConverter
     * When: Integer 58020 is input
     * Then: "fifty eight thousand twenty " is returned
     */
    public void whenInteger58020ThenFiftyEightThousandTwenty() {
        //Arrange

        //Act
        String fiftyEightThousandTwenty = NumberConverter.toText(58020);
        //Assert
        assertThat(fiftyEightThousandTwenty, is("fifty eight thousand twenty "));
    }
    @Test
    /**
     * Given: NumberConverter
     * When: Integer 100000 is input
     * Then: "one hundred thousand " is returned
     */
    public void whenInteger100000ThenOneHundredThousand() {
        //Arrange

        //Act
        String oneHundredThousand = NumberConverter.toText(100000);
        //Assert
        assertThat(oneHundredThousand, is("one hundred thousand "));
    }
    @Test
    /**
     * Given: NumberConverter
     * When: Integer 100001 is input
     * Then: "one hundred thousand one" is returned
     */
    public void whenInteger100001ThenOneHundredThousandOne() {
        //Arrange

        //Act
        String oneHundredThousandOne = NumberConverter.toText(100001);
        //Assert
        assertThat(oneHundredThousandOne, is("one hundred thousand one "));
    }
    @Test
    /**
     * Given: NumberConverter
     * When: Integer 100110 is input
     * Then: "one hundred thousand one hundred ten" is returned
     */
    public void whenInteger100110ThenOneHundredThousandOneHundredTen() {
        //Arrange

        //Act
        String oneHundredThousandOneHundredTen = NumberConverter.toText(100110);
        //Assert
        assertThat(oneHundredThousandOneHundredTen, is("one hundred thousand one hundred ten "));
    }
    @Test
    /**
     * Given: NumberConverter
     * When: Integer 101000 is input
     * Then: "one hundred one thousand " is returned
     */
    public void whenInteger101000ThenOneHundredOneThousand() {
        //Arrange

        //Act
        String oneHundredOneThousand = NumberConverter.toText(101000);
        //Assert
        assertThat(oneHundredOneThousand, is("one hundred one thousand "));
    }
    @Test
    /**
     * Given: NumberConverter
     * When: Integer 111111 is input
     * Then: "one hundred eleven thousand one hundred eleven " is returned
     */
    public void whenInteger111111ThenOneHundredElevenThousandOneHundredEleven() {
        //Arrange

        //Act
        String oneHundredElevenThousandOneHundredEleven = NumberConverter.toText(111111);
        //Assert
        assertThat(oneHundredElevenThousandOneHundredEleven, is("one hundred eleven thousand one hundred eleven "));
    }
    @Test
    /**
     * Given: NumberConverter
     * When: Integer 999909 is input
     * Then: "nine hundred ninety nine thousand nine hundred nine " is returned
     */
    public void whenInteger999909ThenNineHundredNineThousandNineHundredNine() {
        //Arrange

        //Act
        String nineHundredNineThousandNineHundredNine = NumberConverter.toText(999909);
        //Assert
        assertThat(nineHundredNineThousandNineHundredNine, is("nine hundred ninety nine thousand nine hundred nine "));
    }
    @Test
    /**
     * Given: NumberConverter
     * When: Integer 1000000 is input
     * Then: "one million " is returned
     */
    public void whenInteger1000000ThenOneMillion() {
        //Arrange

        //Act
        String oneMillion = NumberConverter.toText(1000000);
        //Assert
        assertThat(oneMillion, is("one million "));
    }
    @Test
    /**
     * Given: NumberConverter
     * When: Integer 2200000 is input
     * Then: "two million two hundred thousand" is returned
     */
    public void whenInteger2200000ThenTwoMillionTwoHundredThousand() {
        //Arrange

        //Act
        String twoMillionTwoHundredThousand = NumberConverter.toText(2200000);
        //Assert
        assertThat(twoMillionTwoHundredThousand, is("two million two hundred thousand "));
    }
    @Test
    /**
     * Given: NumberConverter
     * When: Integer 3330000 is input
     * Then: "three million three hundred thirty three thousand" is returned
     */
    public void whenInteger3330000ThenThreeMillionThreeHundredThirtyThousand() {
        //Arrange

        //Act
        String threeMillionThreeHundredThirtyThousand = NumberConverter.toText(3330000);
        //Assert
        assertThat(threeMillionThreeHundredThirtyThousand, is("three million three hundred thirty thousand "));
    }
    @Test
    /**
     * Given: NumberConverter
     * When: Integer 4444000 is input
     * Then: "four million four hundred forty four thousand" is returned
     */
    public void whenInteger4444000ThenFourMillionFourHundredFortyFourThousand() {
        //Arrange

        //Act
        String fourMillionFourHundredFortyFourThousand = NumberConverter.toText(4444000);
        //Assert
        assertThat(fourMillionFourHundredFortyFourThousand, is("four million four hundred forty four thousand "));
    }
    @Test
    /**
     * Given: NumberConverter
     * When: Integer 5555500 is input
     * Then: "five million five hundred fifty five thousand five hundred" is returned
     */
    public void whenInteger5555500ThenFiveMillionFiveHundredFiftyFiveThousandFiveHundred() {
        //Arrange

        //Act
        String fiveMillionFiveHundredFiftyFiveThousandFiveHundred = NumberConverter.toText(5555500);
        //Assert
        assertThat(fiveMillionFiveHundredFiftyFiveThousandFiveHundred, is("five million five hundred fifty five thousand five hundred "));
    }
    @Test
    /**
     * Given: NumberConverter
     * When: Integer 6666660 is input
     * Then: "six million six hundred sixty six thousand six hundred sixty" is returned
     */
    public void whenInteger6666660ThenSixMillionSixHundredSixtySixThousandSixHundredSixty() {
        //Arrange

        //Act
        String sixMillionSixHundredSixtySixThousandSixHundredSixtySix = NumberConverter.toText(6666660);
        //Assert
        assertThat(sixMillionSixHundredSixtySixThousandSixHundredSixtySix, is("six million six hundred sixty six thousand six hundred sixty "));
    }
    @Test
    /**
     * Given: NumberConverter
     * When: Integer 7777777 is input
     * Then: "seven million seven hundred seventy seven thousand seven hundred seventy seven" is returned
     */
    public void whenInteger7777777ThenSevenMillionSevenHundredSeventySevebThousandSevenHundredSeventySeven() {
        //Arrange

        //Act
        String sevenMillionSevenHundredSeventySevebThousandSevenHundredSeventySeven = NumberConverter.toText(7777777);
        //Assert
        assertThat(sevenMillionSevenHundredSeventySevebThousandSevenHundredSeventySeven, is("seven million seven hundred seventy seven thousand seven hundred seventy seven "));
    }
    @Test
    /**
     * Given: NumberConverter
     * When: Integer 10000000 is input
     * Then: "ten million " is returned
     */
    public void whenInteger10000000ThenTenMillion() {
        //Arrange

        //Act
        String tenMillion = NumberConverter.toText(10000000);
        //Assert
        assertThat(tenMillion, is("ten million "));
    }
    @Test
    /**
     * Given: NumberConverter
     * When: Integer 100000000 is input
     * Then: "ten million " is returned
     */
    public void whenInteger100000000ThenOneHundredMillion() {
        //Arrange

        //Act
        String oneHundredMillion = NumberConverter.toText(100000000);
        //Assert
        assertThat(oneHundredMillion, is("one hundred million "));
    }

}
