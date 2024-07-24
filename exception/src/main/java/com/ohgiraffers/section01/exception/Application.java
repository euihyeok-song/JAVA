package com.ohgiraffers.section01.exception;

public class Application {

    /* 설명. try-catch 대신 throws로 처리하면 메소드를 호출한 대상(throw 객체를 생성한 곳)에게 예외처리를 위임한다.*/
//  public static void main(Sting[] args) throws Exception{
    public static void main(String[] args) {

        /* 수업목표. 예외에 대해 이해하고 이를 처리하기 위한 문법을 활용할 수 있다. */
        /* 필기.
         *  1. throws를 통한 위임
         *  2. try-catch블럭를 통한 처리
        */

        ExceptionTest et = new ExceptionTest();

        /* 설명. try-catch를 통해 예외상황을 원하는 의도대로 처리할 수 있다. */
        try {

            /* 설명. 우리가 처리할 예외가 발생할 수 있는 적당한 범위를 try블럭으로 감싼다. */
            et.checkEnoughMoney(10000, 50000);
            et.checkEnoughMoney(50000, 10000);         // 예외상황이므로 ExceptionTest에 의해 객체 생성
            System.out.println("이전에 문제가 없었으면 실행될 출력 구문");   // 실행 전 위에 예외상황 발생하면 출력되지 X
        } catch (Exception e) {                                    // 위에서 만들어진 예외 객체는 e("호주머니~")로 대입됨

            /* 설명. 우리가 원하는 방식대로 try블럭에서 발생한 예외 타입 객체를 활용해서 처리할 수 있다. */
            /* 설명. try 블럭에세 예외가 발생하지 않으면 실행되지 않는 블럭*/
            System.out.println("뭔가 예외가 발생했나 보네? ");
            System.out.println("그 예외는 " + e.getMessage() + "!!!!");
            System.out.println("돈 좀 넉넉히 들고 다니지..");

            /* 설명. 내가 원하는 시점에 프로그램을 종료할 수 있음 */
//            System.exit(0);

            /* 설명. jvm처럼 우리도  예외가 각각 어떤 흐름으로 발생하는지 처리할 수 있음*/
//          e.printStackTrace();                                    // 예외를 추적해서 jvm이 예외처리해주는 내용을 출력해줌
                                                                    // 프로그램을 종료하는 기능은 X
        }

//        et.checkEnoughMoney(50000, 10000);                         // throws 할 때 잠깐 활용한 구문

        try {
            int num = 10;
            System.out.println(num / 0);                           // 예외처리 없이 알아서 기본 처리
        } catch (ArithmeticException e){

            /* 설명. unchecked exception도 우리가 처리할 수 있고 exception 객체까지 활용할 수 있다. */
            System.out.println("잘 좀 나누지~ 0이 뭐냐~ ");             // 기본 처리가 되어 있지만 우리 방식으로 출력 가능
            System.out.println(e.getMessage() + " 때문이라잖아~~");
        }

        System.out.println("프로그램을 종료합니다.");
    }
}
