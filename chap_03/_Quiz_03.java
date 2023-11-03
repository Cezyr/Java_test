package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        String m1 = "901231-1234567";
        String f1 = "030708-4567890";

        System.out.println(m1.substring(0,8));
        System.out.println(f1.substring(0,8)); // 인덱스 위치 0부터 8위치 직전까지

        System.out.println(m1.substring(0, m1.indexOf("-") + 2));
        System.out.println(f1.substring(0, f1.indexOf("-") + 2)); // 인덱스 위치 0부터 하이픈(-) 위치 +2 직전까지



    }
}
