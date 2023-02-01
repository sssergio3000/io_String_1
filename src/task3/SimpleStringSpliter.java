package task3;

public class SimpleStringSpliter {
    public static void main(String[] args) {


        String str = "Необходимо создать строку с текстом (текст взять любой из интернета). " +
                "Разбить эту строку на 2 подстроки равной длине и вывести на экран " +
                "каждое предложения с новой строки.";
        String str1 = str.substring(0, str.length() / 2);
        String str2 = str.substring(str.length() / 2);
        System.out.println(str1);
        System.out.println(str2);
    }

}
