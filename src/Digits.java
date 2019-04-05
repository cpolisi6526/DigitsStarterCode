import java.util.*;
import java.lang.*;

public class Digits
{
    //The list of digits from the number used to //construct this object
    ArrayList<Integer> digitList;

    //Constructs a Digits object that
    //represents num
    public Digits (int num) {
        //implemented in part (a)
        digitList = new ArrayList<Integer>();
        if (num > 0) {
            int remainder = 0;
            while (num > 0) {
                remainder = num % 10;
                num = num / 10;
                digitList.add(0, remainder);
            }
        }
        else{
            digitList.add(0);
        }
    }
        //implemented in part (a)
    public boolean isStrictlyIncreasing()
    {
        for(int k=0;k<digitList.size()-1;k++){
            if(k>k+1){
                return false;
            }
        }
        return true;
        //implemented in part (b)
    }
    //Extra method to make the runner easier to read
    public ArrayList<Integer> getDigitList()
    {
        return digitList;
    }

}
