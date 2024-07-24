package com.ohgiraffers.section02.superkeyword;

import java.util.Date;

public class Computer extends Product {

    private String cpu;
    private int hdd;
    private int ram;
    private String operatingSystem;

    /* 설명. 부모 + 자식 필드값을 모두 null로 채우는 기본 생성자*/
    public Computer() {
        //super();                      자동 생성 되어 있음
    }

    /* 설명. 부모는 기본 생성자로 자식은 매개변수를 집어넣어주는 매개변수 생성자*/
    public Computer(String cpu, int hdd, int ram, String operatingSystem) {
        //super();                      자동 생성 되어 있음
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operatingSystem = operatingSystem;
    }

    /* 설명. 부모 + 자식의 필드 값을 모두 넣는 매개변수 생성자 */
    public Computer(String code, String brand, String name, int price, Date manufacturingDate, String cpu, int hdd, int ram, String operatingSystem) {
        super(code, brand, name, price, manufacturingDate);
//        super.setCode(code);                          // 위를 하나씩 아래처럼 등록가능
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operatingSystem = operatingSystem;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }




    /* 설명. control + enter 해서 toString에서 옵션을 클릭하여 groovy에 해당하는 것 2가지에 해당*/
    /* 설명. 자식 단에서 부모의 변수들도 모두 보기 위한 개선 방법 1*/
    @Override
    public String toString() {
        return "Computer{" +
//                "code=" + super.code +                    // 부모클래스의 private 변수이므로 접근 X (우회 필요)
                "code= " + super.getCode() +                // 부모클래스의 객체로 접근하여 우회자인 getter사용
//              "code=" + this.gerCode() +                       // 가능
//              "code=" + getCode() +                            // 가능
                ", brand= " + super.getBrand() +
                ", name= " + super.getName() +
                ", price= " + super.getPrice() +
                ", manufacturingDate= " + super.getManufacturingDate() +
                ", cpu='" + cpu + '\'' +
                ", hdd=" + hdd +
                ", ram=" + ram +
                ", operatingSystem='" + operatingSystem + '\'' +
                '}';
        /* 설명. 자식 단에서 부모의 변수들도 모두 보기 위한 개선 방법2 ( super.toString()은 부모의 toString()을 가져옴 */
//        return super.toString() +
//                "Computer{" +
//                "cpu='" + cpu + '\'' +
//                ", hdd=" + hdd +
//                ", ram=" + ram +
//                ", operatingSystem='" + operatingSystem + '\'' +
//                '}';
    }
}
