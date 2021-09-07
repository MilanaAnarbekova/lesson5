package com.company;

/*В классе Main создать 1 экземпляр босса и задать ему все свойства (значения полям).
 Затем распечатать всю информацию о боссе.
ДЗ на сообразительность:
Добавить метод в классе Main который называется createHeroes,
в теле метода необходимо создать 3х героев с помощью класса Hero,
используя при этом разные варианты конструкторов (либо первый либо второй).
Затем поместить созданные экземпляры героев в массив и вернуть его с помощью команды return,
 как возвращаемый результат метода createHeroes. Hero[]
Затем вызвать этот метод в методе main и распечатать информацию о всех героях массива через цикл.*/
public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setBossHealth(800);
        boss.setBossDamage(60);
        boss.setBossBlock(20);

        System.out.println("Boss block = " + boss.getBossBlock() + "; "
                + "Boss damage = " + boss.getBossDamage() + "; " + "Boss health= " + boss.getBossHealth());
    }

}
