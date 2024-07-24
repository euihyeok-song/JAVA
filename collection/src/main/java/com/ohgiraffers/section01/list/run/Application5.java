package com.ohgiraffers.section01.list.run;

import java.util.*;

public class Application5 {
    public static void main(String[] args) {

        /* 수업목표. Queue에 대해 이해하고 활용할 수 있다. */
        /* 필기.
         *  Queue란?
         *   선형 메모리 공간에 데이터를 저장하여 순서를 유지하기 위한 선입선출(FIFO) 방식의 자료구조
         *   대부분 LinkedList를 많이 사용한다.
         *      시간에 상관없이 데이터가 들어오는 순서에 맞게 정확하게 처리하기 위한 경우 사용
        */

//        Queue que = new Queue();                              // 불가
//        Queue<String> que = new LinkedList<>();               // Queue는 단방향
//        LinkedList<String> que = new LinkedList<>();          // LinkedList는 Queue 중 Dequeue의 기능으로 양방향 가능
                                                                // offerFirst()나 offerLast() 같은 메소드도 제공

        /* 설명. PriorityQueue를 활용하면 선입선출 + 정렬의 개념을 가져갈 수 있다. */
//        PriorityQueue<String> que = new PriorityQueue<>();     // poll()로 내보냈을 경우 자료형의 정렬 기준(오름/내림차순)으로 출력
        PriorityQueue<String> que = new PriorityQueue<>(Collections.reverseOrder());    // 기존 정렬 기준의 반대 적용

        /* 설명. queue.offer()은 append()와 동일한 역할*/
        que.offer("first");
        que.offer("second");
        que.offer("third");
        que.offer("fourth");
        que.offer("fifth");

        System.out.println("que = " + que);

        /* 설명. queue.peek()는 맨 처음에 있는 것을 보여주는 역할*/
        System.out.println("que.peek() = " + que.peek());

        /* 설명. queue.poll()는 맨 앞에 있는 것을 뺴주는 역할*/
        System.out.println("que.poll() = " + que.poll());
        System.out.println("que = " + que);
        System.out.println("que.poll() = " + que.poll());
        System.out.println("que = " + que);
        System.out.println("que.poll() = " + que.poll());
        System.out.println("que = " + que);
        System.out.println("que.poll() = " + que.poll());
        System.out.println("que = " + que);
        System.out.println("que.poll() = " + que.poll());
        System.out.println("que = " + que);



    }
}
