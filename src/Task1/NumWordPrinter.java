package Task1;

public class NumWordPrinter {
    public NumWordPrinter(){}
    public String printWord(int n)
    {
        if(n%2 == 0) {
            return "Even";
        }
        else if(n%11 == 0){
            return "PrimeEleven";
        }
        else
        {
            return "LuckyThirteen";
        }
    }
}
