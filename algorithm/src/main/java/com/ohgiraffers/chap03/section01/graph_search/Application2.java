package com.ohgiraffers.chap03.section01.graph_search;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/* 수업목표. BFS와 x, y좌표를 활용한 문제를 해결할 수 있다. (feat.배열의 인덱스와 좌표는 반대 개념) */
/* 설명.
 *  너비 우선 탐색(Breadth-First Search)
 *   선입선출 구조의 queue를 활용한다.
 *   시작 노드에서 출발해 시작 노드를 기준으로 가까운 노드를 먼저 방문하면서 탐색하는 알고리즘이다.
*/
public class Application2 {

    public static BufferedReader toBufferedReader(String str){
        InputStream is = new ByteArrayInputStream(str.getBytes());
        return new BufferedReader(new InputStreamReader(is));
    }

    /* 설명. BFS로 문제 해결을 하기 위한 Queue 중 LinkedList 사용*/
    static Queue<Node> q = new LinkedList<>();

    /* 설명. 각 원소마다 위아래를 (x,y)로 보기 -> 하(0,-1) 상(0,1) 좌(-1,0) 우(1,0)*/
    static int[] dirX = {0, 0, -1, 1};
    static int[] dirY = {-1, 1, -0, 0};

    /* 설명. 배추밭 */
    static int map[][];

    /* 설명. 방문한 배추의 좌표 배열 */
    static boolean visit[][];

    /* 설명. 현재 위치에 대한 좌표 */
    static int cur_x, cur_y;

    /* 설명. 배추밭의 크기(너비/높이), 심어진 배추의 수 */
    static int M, N, K;

    /* 설명. 필요한 지렁이의 수 */
    static int count;


    /* 설명. 자신의 node와 edge를 모두 저장하기 위한 객체 클래스
    *       x와 y를 가지는 static 내부 클래스(inner 클래스) */
    static class Node{
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static int solution(String input) throws IOException {

        BufferedReader br = toBufferedReader(input);
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        M = Integer.valueOf(st.nextToken());            // 가로(열)
        N = Integer.valueOf(st.nextToken());            // 세로(행)
        K = Integer.valueOf(st.nextToken());

        /* 설명. 주의사항 = 1. 행 먼저 이후 열 (N,M) 2. 인덱스가 0부터 시작임으로 [N][M] */
        map = new int[N][M];
        visit = new boolean[N][M];

        /* 설명. 배추밭에 배추 심기 */
        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.valueOf(st.nextToken());
            int y = Integer.valueOf(st.nextToken());

            /* 설명. 좌표와 인덱스 개념이 반대이니 주의!!!! */
            map[y][x] = 1;

        }

        count = 0;

        /* 설명. 반복문의 i와 j는 캐릭터를 이동시키는 것과 같은 효과를 낸다.(또는 캐릭터의 좌표를 의미)*/
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {

                /* 설명. 방문 안한 위치에 배추가 심어져 있다면(지렁이를 심자) */
                if(visit[i][j] == false && map[i][j] == 1){
                    count++;

                    /* 설명. 1. 상하좌우를 훑어보면서 배추를 찾아서 지렁이를 넣고 주변을 보았을 때, 아래에 배추가 붙어있어서 지렁이를 넣고
                        방문 check하면, 다음 줄에서 출발할 경우 지렁이가 있음을 인지하고 한번만 넣어야 할 경우에 사용
                            2. 해당 위치 및 붙어있는 배추밭을 방문체크하고 que로 제거한다. (붙어있는 배추 묶음 파악)*/
                    bfs(j,i);           // bfs의 인자는 x좌표, y좌표 순으로 받을 것이라 i와 j를 확인하고 넘겨주자
                }
            }
        }
        return count;
    }

    /* 설명. 상하좌우에 배추를 심어져 있으면 한번씩 동작
        반복: 배추 들어옴->주변 살핌(배추존재)->주변 배추를 하나씩 쌓음->배추 나감(나가면서 좌표 알려줌)->주변 살핌(아까 들어왔던 것 제외 들어옴) */
    static void bfs(int x, int y) {
        q.offer(new Node(x,y));                // 배추 1포기를 쌓는 개념
//        q.add(new Node(x,y));                // LinkedList는 add()도 사용 가능한다.
        visit[y][x] = true;

        /* 설명. 연속적으로 상하좌우에 배추가 심어져 있다면 해당 위치를 방문한 것으로 체크하고 que를 통해 비워내는 작업을 반복 */
        while(!q.isEmpty()) {
            Node node = q.poll();              // 선입 선출 개념으로 상하좌우에 존재하는 배추가 다 쌓이면 queue에서 빠져나가는 구조

            /* 설명. 상하좌우를 살펴보는 개념 */
            for (int i = 0; i < 4; i++) {      // 위에서 나가는 node가 나가면서 본인의 좌표를 알려줌 -> 그 부분의 주변을 살핌 -> 쌓음
                cur_x = node.x + dirX[i];
                cur_y = node.y + dirY[i];

                /* 설명. 지금 보는 방향이 좌표로써 존재하면서(index가 존재하는 경우만 살펴봄) 방문한 적이 없고 배추가 심어져 있다면 */
                if(range_check() && visit[cur_y][cur_x] == false && map[cur_y][cur_x] == 1){
                    q.offer(new Node(cur_x,cur_y));
                    visit[cur_y][cur_x] = true;
                }
            }
        }
    }

    /* 설명. index를 벗어나지 않았는지 확인하는 메소드 */
    private static boolean range_check() {
        return cur_x >= 0 && cur_x < M && cur_y >= 0 && cur_y < N;
    }
}
