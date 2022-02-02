import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] myArray = new int[]{1,2,3,4,5};

        int temp = myArray[0]; //замена первого и последнего элемента массива
        myArray[0] = myArray[4];
        myArray[4]=temp;


        int num = myArray[myArray.length - 3]; //сумма последнего среднего элемента массива
        int summ = myArray[4] + num;
        System.out.println(summ);
    }
}
