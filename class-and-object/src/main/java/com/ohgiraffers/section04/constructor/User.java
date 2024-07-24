package com.ohgiraffers.section04.constructor;

public class User {
    private String id = "user888";
    private String pwd;
    private String name;
    private java.util.Date enrollDate;                  // SQL이 아닌 util의 Date임을 명시하기 위해 full로 작성

    /* 설명. 기본 생성자( 매개변수가 없는 )를 활용한 객체 생성 ( 반드시 명시정으로 써 줄 것!) */
    /* 설명. 기본 생성자로 객체를 생성한다. + 반환형이 X ( != void형) + 항상 이름이 클래스형과 동일 */
    /* 설명. 필드내의 값을 jvm이 기본값을 넣어서 배열에 넣어서 heap에 올리고, User메소드를 거친 후 객체 생성*/
    public User() {
        System.out.println("User 객체 생성 됩니다~~!");
    }

    /* 설명. 아래의 매개변수 생성자의 값을 this()롤 통해서 toss 받는 개념*/
    public User(String id, String pwd, String name) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
    }

    /* 설명. 매개변수 생성자: 원하는 필드를 초기화하는 매개변수 있는 생성자를 활용한 객체 생성*/
    /* 설명. 생성자들 중에서는 하나만 실행됨. 필드에서 정의한 값과는 무관하게, 매개변수 생성자를 사용하면 여기서 정의한 값이 들어감*/
    public User(String id, String pwd, String name, java.util.Date enrollDate){

        /* 설명. 생성자 내부의 this.은 이 생성자로 생성될 객체를 뜻한다. + 이 부분은 this를 생성 X (구분이 안된다)*/
//        this.id =  id;
//        this.pwd = pwd;
//        this.name = name;

        /* 설명. 1. this()를 통해 다른 생성자를 활용하여 코드의 줄 수 를 줄일 수 있다.
        *       2. this()를 통해 다른 생성자를 활용할 때 한번만 코드 첫 줄에서 활용 가능하다. */
        this(id,pwd,name);
        this.enrollDate = enrollDate;
    }

    public String information() {
        return "id: " + this.id + ", pwd: " + this.pwd + ", name: " + this.name
                      + ", enrollDate: " + this.enrollDate;
    }
}
