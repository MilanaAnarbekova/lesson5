package com.company;

/*Создать класс Героя (Hero), с приватными полями здоровье, урон и суперспособность.
 Написать 2 разных конструктора для создания объекта. В одном конструкторе задаются все поля,
 в другом только здоровье и урон. Добавить в класс Hero геттеры для всех полей.
*/
public class Hero {
    private int heroHealth;
    private int heroDamage;
    private String heroesPower;

    public Hero(int heroHealth, int heroDamage, String heroesPower) {
        this.heroHealth = heroHealth;
        this.heroDamage = heroDamage;
        this.heroesPower = heroesPower;

    }

    public Hero(int heroHealth, int heroDamage) {
        this.heroHealth = heroHealth;
        this.heroDamage = heroDamage;
    }

    public int getHeroDamage() {
        return heroDamage;
    }

    public int getHeroHealth() {
        return heroHealth;
    }

    public String getHeroesPower() {
        return heroesPower;
    }
}
