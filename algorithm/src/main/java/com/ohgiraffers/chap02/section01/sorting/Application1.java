package com.ohgiraffers.chap02.section01.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

/* 수업목표. 버블정렬을 이해할 수 있다.*/
/* 필기.
 *  정렬 알고리즘
 *   데이터를 특정 순서대로 배열하는데 사용한다. (일반적으로는 배열의 정렬을 뜻함)
 *
 * 필기.
 *  버블 정렬(Bubble Sort)
 *  두 인접한 데이터의 크기를 비교해 정렬하는 방법이다. ( 2개씩 비교 )
 *  버블의 모든 요소애 대해 반복하며서, 각 반복마다 가장 큰(작은) 요소가 배열의 끝으로
 *  "버블링(이동)" 된다.
 *  시간 복잡도는 O(n^2)이라 효율적이지는 않다.
*/
public class Application1 {

    /* 설명.
     *  문제 내용
     *   : N개의 정수가 주어졌을 때, 버블 정렬 알고리즘을 사용하여 오름차순으로 정렬하는 프로그램을 작성하시오.
     *  입력
     *   - 첫 번째 줄에 자연수 N(1 <= N <= 100)이 주어진다.
     *   - 두 번째 줄에 N개의 정수가 공백으로 구분되어 입력된다. 각 정수는 -10^9 이상, 10^9 이하이다.
     *  출력
     *   - 오름차순으로 정렬된 수열을 공백으로 구분하여 출력한다.
     *
     *  설명.
     *   예시 입력 1
     *     - 7
     *       34 23 5 24 1 9 12
     *   예시 출력 1
     *     - 1 5 9 12 23 24 34
     *
     *  설명.
     *   예시 입력 2
     *     - 6
     *       40 47 38 8 33 35
     *   예시 출력 2
     *     - 8 33 35 38 40 47
     * */

    public static void main(String[] args) {

        /* 설명. 입력 데이터 받기 */
//        Scanner sc = new Scanner(System.in);
//        int length = sc.nextInt();
//        int [] arr = new int[length];
//        for (int i = 0; i < length; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        System.out.println("length = " + length);
//        System.out.println("arr = " + Arrays.toString(arr));

//        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        /* 설명. try문에 인자로 스트림을 넣어주면 자동으로 close()를 통해서 스트림을 닫아줌 */
        try (BufferedReader br= new BufferedReader(new InputStreamReader(System.in))){
            int length = Integer.parseInt(br.readLine());  // Integer의 parseInt를 사용하면 받아온걸 int로 반환해줌

            /* 설명. mapToInt는 String을 IntStream으로 바꿔주기 위한 메소드 */
            IntStream intStream = Arrays.stream(br.readLine().split(" ")).mapToInt(x -> Integer.parseInt(x));
            int[] arr = intStream.toArray();

            /* 설명. 알고리즘 실행 - arr는 주소값을 넘겨주는 call by reference여서 외부 함수에서 정렬하여도 main내부에서 적용됨*/
            solution(length, arr);

            /* 설명. stream을 이용한 출력 (단순 메소드 참조(System.out::println)가 아닌 정도에선 굳이 스트림 문법 활용 필요 X*/
//            Arrays.stream(arr).forEach(x -> System.out.print(x + " "));

            /* 설명. foreach문 이용한 출력 */
            for(int i: arr){
                System.out.print(i + " ");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    /* 설명. 넘어온 데이터를 가지고 버블 정렬 알고리즘 작성 시작 */
    public static void solution(int length, int[] arr) {

        for (int i = 0; i < length-1; i++) {
            System.out.println((i+1) + "번째 순회:" + Arrays.toString(arr));
            for (int j = 0; j < length-1; j++) {
                /* 설명. 오름차순 */
                if(arr[j] > arr[j+1]){
                /* 설명. 내림차순*/
//                if(arr[j] < arr[j+1]){
                    /* 설명. j번째와 그 다음인 (j+1)번쨰의 위치를 서로 바꾼다.(swap)*/
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
