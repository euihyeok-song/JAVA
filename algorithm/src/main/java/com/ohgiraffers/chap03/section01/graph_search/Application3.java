package com.ohgiraffers.chap03.section01.graph_search;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/* 수업목표. BFS와 방문 배열을 활용한 최단거리 문제를 해결할 수 있다. */
public class Application3 {

    public static BufferedReader toBufferedReader(String str){
        InputStream is = new ByteArrayInputStream(str.getBytes());
        return new BufferedReader(new InputStreamReader(is));
    }

    static boolean[][] visit;

    static int[][] map;

    static int[] dirX = {0,0,-1,1};
    static int[] dirY = {1,-1,0,0};

    static int N, M;               // N 은 x ,M은 y  -> 배열 [M][N] : 반대로 생각하면 OK

    static class Node{
        int x;
        int y;

        public Node(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    public static int solution(String input) throws IOException {

        BufferedReader br = toBufferedReader(input);
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.valueOf(st.nextToken());
        M = Integer.valueOf(st.nextToken());

        map = new int[N][M];                         // 0번 인덱스 사용 가능하기 때문에 N과 M사용 OK
        visit = new boolean[N][M];

        /* 설명. 입력값이 공백 없이 이어서 들어옴에 따라 한 문자씩 뜯어서 int 배열(map)에 옮겨 담는 반복문 */
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            char[] ch = str.toCharArray();          // 문자열 -> char[]

            for (int j = 0; j < ch.length; j++) {
                map[i][j] = Character.getNumericValue(ch[j]);       // Char를 숫자로 바꿔줌 ('1' -> 1 )
            }
        }
        visit[0][0] = true;                     // start 위치 방문 체크부터 시작
        bfs(0,0);

        return map[N-1][M-1];                   // 도착지(우하단) 위치의 값을 반환(도착할 때까지 최적의 경로 수)
    }

    private static void bfs(int x, int y) {

        Queue<Node> q = new LinkedList<>();
        q.add(new Node(x,y));                   // 현재 위치에 서있는 캐릭터를 생성하는 개념

        while(!q.isEmpty()){
            Node n = q.poll();

            /* 설명. 상하좌우를 둘러보는 개념의 for문(벽이 있는지, 유효한 범위인지, 지나온 길인지) */
            for(int i = 0; i < 4; i ++){
                int curX = n.x + dirX[i];
                int curY = n.y + dirY[i];

                /* 설명. 현 위치의 상하좌우를 살펴보았을 경우(curX, curY) map 내의 위치인지 확인 (app2에서 range_check() 개념) */
                if(curX < 0 || curY < 0 || curX >= N || curY >= M){
                    continue;
                }

                /* 설명. 방문을 했던 좌표이거나 벽이라면 pass */
                if(visit[curX][curY] || map[curX][curY] == 0){
                    continue;
                }

                q.add(new Node(curX,curY));                       // 다음 경로르 queue에 추가
                map[curX][curY] = map[n.x][n.y] + 1;              // 경로의 총 cost를 구해야함으로 다음 경로는 현재 경로의 +1

                /* 설명. log를 찍어보는 습관을 들이자! */
                System.out.println("curX = " + curX);
                System.out.println("curY = " + curY);
                System.out.println("map[curX][curY] = " + map[curX][curY]);

                visit[curX][curY] = true;                         // 방문 후 check
            }
        }


    }
}
