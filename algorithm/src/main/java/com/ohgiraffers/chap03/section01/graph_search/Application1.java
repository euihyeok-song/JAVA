package com.ohgiraffers.chap03.section01.graph_search;

import java.io.*;
import java.util.StringTokenizer;


/* 수업목표. DFS를 활용(재귀함수)하는 예제를 이해할 수 있다.  */
/* 필기.
 *  깊이 우선 탐색(Depth-First Search)
 *   후입선출 구조에 stack 또는 재귀함수를 활용
 *   한쪽 분기를 정하여 최대 깊이까지 탐색 후 분기를 이동하여 다시 탐색하는 알고리즘
*/
public class Application1 {

    static boolean[] visit;         // 방문 배열 - 값 넣지 않고 초기화하면 false가 들어가있음

    static int[][] map;             // 그래프를 2차원 배열로 mapping(인접 리스트)

    static int count = 0;           // 오염된 컴퓨터의 수(출력값)

    static int node, edge;          // node와 edge의 개념을 저장


    /* 설명. 문자열에서 한줄씩 읽어들이기 위한 BufferedReader를 반환하는 메소드(readLine()) */
    public static BufferedReader toBufferedReader(String str){
        InputStream is = new ByteArrayInputStream(str.getBytes());
        return new BufferedReader(new InputStreamReader(is));
    }

    public static Integer solution(String input) throws IOException {       // readLine()을 try-catch가 아닌 throws로 처리
        BufferedReader br = toBufferedReader(input);
        node = Integer.parseInt(br.readLine());        // 노드의 갯수
        edge = Integer.parseInt(br.readLine());        // 엣지의 갯수

        /* 설명. 노드와 간선(엣지)에 대한 정보가 담길 map을 작성(node의 갯수 및 번호에 기반한 int형 2차원 배열 */
        map = new int[node+1][node+1];                 // 0번 index를 사용하지 않고 인덱스 번호와 노드의 번호를
                                                       // 일치시키기 위한 배열 크기

        /* 설명. 방문 배열 작성(지나갔던 노드를 다시 방문하지 않기 위함, 재귀 호출의 stackoverflow(infinite loop)를 방지용) */
        visit = new boolean[node+1];                   // 방문 배열 - 방문하면 true로 변경

        /* 설명. 인접리스트(map)로 그래프에 대한 정보 작성 */
        for (int i = 0; i < edge; i++) {
//            StringTokenizer str = new StringTokenizer(br.readLine()," ");     // (1 2)를 배열의 원소로 넣어야함
            StringTokenizer str = new StringTokenizer(br.readLine());           // 안적어도 자동으로 띄어쓰기 기준으로 잘라줌

            int a = Integer.valueOf(str.nextToken());           // row
            int b= Integer.valueOf(str.nextToken());            // col

            /* 설명. 대각행렬의 개념으로 경로를 나타내는 map을 작성
            *       무방향(양방향) 그래프로 처리되기 위해 노드 번호들(인덱스 번호)을 반대로도 적용한디. */
            map[a][b] = map[b][a] = 1;
        }

        /* 설명. map을 출력해 살표보기 */
        for (int j = 0; j < node + 1; j++) {
            for (int k = 0; k < node + 1; k++) {
                System.out.println(map[j][k] + " ");
            }
            System.out.println();
        }

        dfs(1);

        return count - 1;               // 1번 노드를 제외
    }

    /* 설명. 인자로 넘어온 것부터 재귀함수로 dfs 알고리즘을 구현할 메소드 */
    private static void dfs(int start){
        visit[start] = true;
        count++;

        for (int i = 1; i <= node; i++) {
            if(map[start][i] == 1 && !visit[i]){          // map[strat][i] = 1 이면 연결된 노드 + !visit[i]는 방문 X
                dfs(i);
            }
        }

    }
}
