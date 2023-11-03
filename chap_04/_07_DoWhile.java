package chap_04;

public class _07_DoWhile {
    public static void main(String[] args) {
        // 반복문 DoWhile
        int distance = 25; // 전체 이동 거리 25M
        int move = 0; // 현재 이동 거리 0M
        int height = 2; // 키 2M??
        while (move + height < distance) {
            System.out.println("발차기를 계속합니다.");
            System.out.println("현재 이동거리 : " + move);
            move += 3; // 3M 씩 이동
        }
        System.out.println("도착했습니다.");

        System.out.println(" --- 반복문 #1 ---");

        // 키가 엄청나게 큰 사람?
        move = 0;
        height = 25; // 키가 25M ㄷㄷ
        while (move + height < distance) {
            System.out.println("발차기를 계속합니다.");
            System.out.println("현재 이동거리 : " + move);
            move += 3; // 3M 씩 이동
        }
        System.out.println("도착했습니다.");

        System.out.println(" --- 반복문 #2 ---");

        // Do While 반복문
        do {
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리 : " + move);
            move += 3;
        } while (move + height < distance);
        System.out.println("도착했습니다.");
    }
}
