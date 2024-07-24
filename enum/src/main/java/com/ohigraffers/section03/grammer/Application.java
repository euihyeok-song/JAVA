package com.ohigraffers.section03.grammer;

import java.util.EnumSet;
import java.util.Iterator;

public class Application {
    public static void main(String[] args) {

        /* 수업목표. Enum의 문접에 대해 이해하고 활용할 수 있다. (클래스적인 면모) */
        /* 설명.
         *  enum 타입의 필드를 최초 사용 시에만 열거 타입의 인스턴스를 생성하고(싱글톤) 생성자를
         *  따로 호출하지 않는다. 또한 enum 타입은 set으로 바꿔 반복시키며 필드들을
         *  한번에 확인하고 활용할 수 있다.
         * */
        UserRole1 admin  = UserRole1.ADMIN;                 // 싱글톤으로 사용되는 유일한 ADMIN 객체를 처음에 호출되면 생성
        System.out.println(admin.name());
        System.out.println(admin.getNameToLowerCase());

        UserRole2 consumer = UserRole2.CONSUMER;
        /* 설명. ordinal() 과 name()은 enum형의 메소드, getDESCRIPTION()은 우리가 만든 메소드(UserRole2)*/
        System.out.println(consumer.ordinal() + ", " +consumer.name() + ", " + consumer.getDESCRIPTION());

        System.out.println("Set으로 바꿔 반복자를 활용해 보자. ");
        /* 설명. enum 클래스의 필드를 출력하는 코드 */
        EnumSet<UserRole2> roles = EnumSet.allOf(UserRole2.class);      // UserRole2.class => UserRole2만의 타입 (enum)
        Iterator<UserRole2> iter = roles.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next().name());
        }

    }
}
