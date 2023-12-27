package oop1;

/*
음악 플레이어와 관련된 데이터 묶기
 */
public class MusicPlayerMain2 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();
        /*
        기존코드는 변수를 지역변수로 선언했는데 여기서는 MusicPlayerData 라는 class 를 만들고 class 안에 변수를 선언했다.
         */

        // 음악 플레이어 켜기
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");

        // 볼륨 증가
        data.volume++;
        System.out.println("음악 플레이어 볼륨: " + data.volume);

        // 볼륨 증가
        data.volume++;
        System.out.println("음악 플레이어 볼륨: " + data.volume);

        // 볼륨 감소
        data.volume--;
        System.out.println("음악 플레이어 볼륨: " + data.volume);

        // 음악 플에이어 상태
        System.out.println("음악 플레이어 상태 확인");
        if (data.isOn) {
            System.out.println("음악 플레이어 ON, 볼륨: " + data.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }

        // 음악 플레이어 끄기
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }
}
