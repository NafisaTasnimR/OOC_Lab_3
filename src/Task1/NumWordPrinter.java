package Task1;

public class NumWordPrinter {
    public NumWordPrinter(){}
    public String checkNumber(int n)
    {
        if(n%2 == 0 && n%11==0 && n%13==0) {
            return "EvenPrimeLucky";
        }
        else if(n%2 == 0 && n%11==0) {
            return "EvenPrimeEleven";
        }
        else if(n%13 == 0)
        {
            return "LuckyThirteen";
        }
        else if(n%11 == 0){
            return "PrimeEleven";
        }
        else if(n%2 == 0){
            return "Even";
        }
        else {
            return "OddOneOut";
        }
    }

    public String printWord(int n,boolean b)
    {
        NumWordPrinter numWordPrinter = new NumWordPrinter();
        String s = numWordPrinter.checkNumber(n);
        if(b)
        {
            return s.toUpperCase();
        }
        else {
            return s;
        }
    }
}
