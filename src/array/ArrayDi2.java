package array;

public class ArrayDi2 {
    public static void main(String[] args) {
        // 2x3 2차원 배열을 만든다.
        int[][] arr = new int[2][3]; //행(row), 열(column)

        arr[0][0] = 1; //0행, 0열
        arr[0][1] = 2; //0행, 1열
        arr[0][2] = 3; //0행, 2열
        arr[1][0] = 4; //1행, 0열
        arr[1][1] = 5; //1행, 1열
        arr[1][2] = 6; //1행, 2열

        //0행 출력
        for (int row = 0; row < 2; row++) {
            for (int column = 0; column < 3; column++) {
                System.out.print(arr[row][column] + " ");
            }
            System.out.println(); //한 행이 끝나면 라인을 변경한다.
        }
        /*
         - for 문을 2번 중첩해서 사용하는데, 첫번째 for 문은 행을 탐색하고, 내부에 있는 두번째 for 문은 열을 탐색한다.
         - 내부에 있는 for 문은 앞서 작성한 다음 코드와 같다. for 문을 사용해서 열을 효과적으로 출력했다.
         */

        //1행 출력
        System.out.print(arr[1][0] + " "); //0열 출력
        System.out.print(arr[1][1] + " "); //1열 출력
        System.out.print(arr[1][2] + " "); //2열 출력
        System.out.println(); //한 행이 끝나면 라인을 변경한다.
    } // 이 코드는 2차원 배열을 만들고, 배열에 값을 1부터 6까지 순서대로 직접 입력한다.
}
