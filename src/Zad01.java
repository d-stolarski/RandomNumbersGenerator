import java.util.Random;
import java.util.TreeSet;

public class Zad01 {
    final static int AMOUNT_OF_VALUES = 50;

    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        initializeRandomValues(set);
        System.out.println("Ilość elementów w zbiorze: " + set.size());
        System.out.println(set);
        System.out.println("Najmniejsza wartość w zbiorze: " + set.first());
        System.out.println("Największa wartość w zbiorze: " + set.last());
        System.out.println("Srednia ze wszystkich liczb zbioru: " + getAverageValue(set));
        showValuesBiggerThanAverage(set);
    }

    public static void initializeRandomValues(TreeSet set){
        Random rand = new Random();
        for(int i = 0; i < AMOUNT_OF_VALUES; i++){
            int randVal = rand.nextInt(1001);
            boolean isInSet = set.contains(randVal);
            if(isInSet){
                i--;
            } else {
                set.add(randVal);
            }
        }
    }

    public static int getAverageValue(TreeSet<Integer> set){
        int sum = 0;
        for (Integer integer : set) {
            sum += integer;
        }
        int averageValue = sum / AMOUNT_OF_VALUES;
        return averageValue;
    }

    public static void showValuesBiggerThanAverage(TreeSet<Integer> set){
        System.out.println("Liczby większe od średniej: ");
        for (Integer integer : set) {
            if (integer > getAverageValue(set)){
                System.out.print(integer + ", ");
            }
        }
    }
}
