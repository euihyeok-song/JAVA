package com.ohgiraffers.section02.encapsulation.problem1;

public class Monster {
    String name;
    int hp;

    public void setHP(int hp){
        if (hp > 0){
            this.hp = hp;               // 오른쪽 hp는 매개인자를 통해 넘어온 값
                                        // 왼쪽 hp는 이 method를 호출한 객체(Monster)의 hp값(Monster 객체)
            // hp = hp                  // 왼쪽 오른쪽 매개인자 모두 동일한 값을 가지게 됨 (X)
        }
        else if(hp <= 0) this.hp = 0;
    }
}

