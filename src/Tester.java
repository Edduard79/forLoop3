import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;

public class Tester {
    public Tester(){
    }

    public static void main(String[] args){

        String[] arr = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};


            for(int i = 0; i < arr.length ; i += 2){

                arr[i] = arr[i].replace(arr[i], arr[i].toUpperCase());

            }

            System.out.println(Arrays.toString(arr));

    }
}
