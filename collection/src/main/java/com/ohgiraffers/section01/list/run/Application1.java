package com.ohgiraffers.section01.list.run;

import java.sql.Array;
import java.util.*;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. 컬렉션 프레임워크에 대해 이해할 수 있다. (list부터)
         *         컬렉션은 주소값을 저장하는 거여서 오토박싱을 통해 가능 */
//      ArrayList list = new ArrayList();               // 자동으로 크기를 조절해줌으로 length 생각 필요 X
//      ArrayList<Object> list = new ArrayList();       // 이처럼 제네릭을 통해서 값을 고정해서 사용하는 경우가 대부분이다.
        List list = new ArrayList();                    // List 계열의 다른 인스턴스로 바껴도 나머지 코드에 영향을 주지
                                                        // 않기 위해 다형성을 적용한 형태로 많이 사용

        /* 설명. 자료형에 구애받지 않고 데이터를 추가할 수 있다. */
        list.add("apple");
        list.add(123);
        list.add(45.67);
        list.add(new java.util.Date());

        /* 설명. 이런 식으로 적어줘도 자동으로 .toString()을 적용시켜 반환 */
        /* 설명. 컬렉션들은 toString() 오버라이딩이 잘 되어 있어 출력해 보기 편함 */
        System.out.println("list 한번에 출력: " + list);

        System.out.println("list.get(0): " + list.get(0));          // 처음 add한 값
        System.out.println("list.get(0): " + list.get(2));          // 세번째 add한 값
        System.out.println("list에 담긴 데이터의 크기: " + list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        /* 설명.
        *   배열보다 ArrayList가 나은 점
        *    1. 처음부터 크기 할당 붎필요
        *    2. 중간에 값을 추가 및 삭제가 용이
       * */

        /* 설명. 배열과 ArrayList를 활용해 각각 원하는 인덱스에 값 추가해보기 */
        int[] intArr = new int[5];
        int num = 0;
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = ++num;
        }
        System.out.println(Arrays.toString(intArr));

        int[] newArr = new int[6];
        System.arraycopy(intArr, 0 ,newArr, 0, intArr.length);
        System.out.println(Arrays.toString(newArr));

        /* 설명. 2번 인덱스 위치에 7을 끼워넣기 */
        for (int i = newArr.length-2; i > 1 ; i--) {
            newArr[i+1] = newArr[i];
        }

        System.out.println(Arrays.toString(newArr));
        newArr[2] = 7;
        System.out.println(Arrays.toString(newArr));

        /* 설명. ArrayList에서 제공하는 add() 메소드로 쉽게 해 보자. - 파이썬의 append()와 비슷한 메소드 */
        ArrayList<Integer> intArrList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            intArrList.add(i+1);
        }
        System.out.println(intArrList);
        intArrList.add(2,7);                // 매개변수 2개짜리 add메소드를 활용
        System.out.println(intArrList);
        System.out.println();

        /* 설명. ArrayList에는 중복(동등(equals, hashcode)) 값이 허용된다. */
        System.out.println(list);
        list.add("apple");                               // new String("apple")과 동일한 개념
        list.add(123);
        System.out.println(list);                        // 동등한 값이여도 들어간다.

        /* 설명. ArrayList가 관리하는 값을 수정하려면 set() 메소드를 활용한다.*/
        list.set(0,777);                                // 수정하는 메소드 set()
        System.out.println(list);

        /* 설명. ArrayList가 관리하는 값을 삭제하려면 remove() 메소드를 활용한다. */
        list.remove(0);
        System.out.println(list);

        list.add(null);
        System.out.println(list);

        /* 설명. ArrayList를 활용한 정렬 */
        /* 설명. 1. 문자열 데이터 정렬 - 타입 안전성을 위해서 String만 사용하는 배열은 <String>으로 지정해서 다운캐스팅을 고려하지 X */
        List<String> stringList = new ArrayList<>();            // ArrayList -> List로 넘어가는 느낌이므로 다형성이다.
        stringList.add("apple");
        stringList.add("orange");
        stringList.add("banana");
        stringList.add("mango");
        stringList.add("grape");
        System.out.println("stringList = " + stringList);

        /* 설명. ArrayList 안에 들어있는 data type에 정의된 정렬 기준으로 정렬 */
        Collections.sort(stringList);                 // String에는 문자열 오름차순(Ascending)에 대한 정의가 되어 있음
        System.out.println("stringList = " + stringList);
        
        List<Integer> integerList  = new ArrayList<>();
        integerList.add(4);
        integerList.add(20);
        integerList.add(5);
        integerList.add(8);
        integerList.add(14);
        System.out.println("integerList = " + integerList);

        /* 설명. 무조건 오름차순 정렬이 아니라 int이라는 data type에 정의된 정렬 기준으로 정렬 - int형은 오름차순 */
        Collections.sort(integerList);
        System.out.println("integerList = " + integerList);

//        Collections.sort(integerList,Collections.reverseOrder());
        Collections.sort(integerList);
        Collections.reverse(integerList);                           // 오름차순으로 정렬된 걸 반대로 돌림(내림차순)

        /* 설명. 내림차순으로 바꾸기 위해 ArraysList에서 LinkedList로 교체   */
        stringList = new LinkedList<String>(stringList);            // <String>에서 String은 생략 가능

        /* 설명. Iterator(반복자)는 hasNext()와 next()를 활용해 들어있는 data를 반복시킬 수 있는 타입이다. */
        /* 설명. 다루는 Iterator와 관련된 컬렉션의 제너릭 타입과 일치하는 제네릭을 꼭 써줘야함(다운캐스팅 고민 없도록) */
        Iterator<String> iter = ((LinkedList<String>)stringList).descendingIterator();  // 다형성에 의해 다운캐스팅 필요
//      Iterator iter = ((LinkedList<String>)stringList).descendingIterator();  // <String>을 안적으면 <Object>로 자동완성
                                                                    // 아래 (String)iter.next() 해야함으로 꼭 <String> 적기
        while(iter.hasNext()){
            System.out.print(iter.next() + " ");
        }



    }
}
