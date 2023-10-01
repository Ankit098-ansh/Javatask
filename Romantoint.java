package Javatask;
import java.util.HashMap;

public class Romantoint {
    public int romanToDecimal(String s) {
        HashMap<Character,Integer> map= new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int n=s.length();
        int output=0;
        for(int i=0;i<n;i++) {
            if(i<n-1 && map.get(s.charAt(i))<map.get(s.charAt(i+1))) {
                output+=map.get(s.charAt(i+1))-map.get(s.charAt(i));
                i++;
            } else {
                output+=map.get(s.charAt(i));
            }
        }

        return output;
    }

    public static void main(String[] args) {
        Romantoint romanToIntConverter = new Romantoint();
        String romanNumeral = "XIV"; // Replace with the Roman numeral you want to convert
        int decimalValue = romanToIntConverter.romanToDecimal(romanNumeral);
        System.out.println("The decimal value of " + romanNumeral + " is " + decimalValue);
    }
}
