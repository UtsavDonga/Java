public class StringDemo {
    public static void main(String[] args) {
        String str = "Hello World";

        char arr[] = {'J','a','v','a'};
        String str1 = new String(str);
        String str2 = new String(arr);

        System.out.println("String : " +str);

        System.out.println("String1 : " +str1);

        System.out.println("String2 : " +str2);
    }
}
