package myPractice.Codewars;

/**
 * Your task is to sort a given string. Each word in the String will contain a single number. This number is the position the word should have in the result.

 Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).

 If the input String is empty, return an empty String. The words in the input String will only contain valid consecutive numbers.

 For an input: "is2 Thi1s T4est 3a" the function should return "Thi1s is2 3a T4est"
 */
public class YourOrder {
    public static void main(String[] args) {
        String words = "is2 Thi1s T4est 3a";

        String[] mass = words.split(" ");
        int[] index = new int[mass.length];

        for (int i = 0; i < mass.length; i++) {
            String[] elements = mass[i].split("",mass[i].length());
            for (String element : elements) {
                try {
                    Integer x = Integer.valueOf(element);
                    index[i] = x;
                } catch (NumberFormatException e) {
                    continue;
                }
            }
        }

        String answer = "";
        for (int i = 1; i <= index.length; i++) {
            for (int j = 0; j < index.length; j++) {
                if (i == index[j]){
                    answer += mass[j] + " ";
                }
            }
        }
        answer = answer.substring(0, answer.length()-1);
        System.out.println(answer);
    }
}
