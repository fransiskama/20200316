package Function;

public class functionSumTheMultiples {
    public static void main(String[] args){
        int n;
        for(n=7;n<=500;n++)
            if(n%7==0||n%9==0)
                System.out.print(n);
    }
}
