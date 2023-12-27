package array;

public class ArrayDi4 {
    public static void main(String[] args) {
        // 2x3 2차원 배열, 초기화
        int[][] arr = new int[2][3];

        int i = 1;
        // 순서대로 1씩 증가하는 값을 입력한다.
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                arr[row][column] = i++;
            }
        }

        // 2차원 배열의 길이를 활용
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();
        }
        /*
        - 중첩된 `for` 문을 사용해서 값을 순서대로 입력한다.
        - `arr[row][column] = i++` 후의 증감 연산자( `++` )를 사용해서 값을 먼저 대입한 다음에 증가한다.
            - 코드에서 `inti=1` 으로 `i` 가1부터시작한다.
         */
    }
}
