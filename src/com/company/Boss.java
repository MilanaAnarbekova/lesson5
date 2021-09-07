package com.company;

//Создать класс Босса (Boss), с приватными полями здоровье, урон и тип защиты.
//        Добавить в класс геттеры и сеттеры для всех полей.
public class Boss {
    private int bossHealth;
    private int bossDamage;
    private int bossBlock;

    public int getBossHealth() {
        return bossHealth;
    }

    public int getBossDamage() {
        return bossDamage;
    }

    public int getBossBlock() {
        return bossBlock;
    }

    public void setBossHealth(int bossHealth) {
        this.bossHealth = bossHealth;
    }

    public void setBossDamage(int bossDamage) {
        this.bossDamage = bossDamage;
    }

    public void setBossBlock(int bossBlock) {
        this.bossBlock = bossBlock;
    }


}
