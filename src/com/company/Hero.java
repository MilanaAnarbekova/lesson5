package com.company;

/*Создать класс Героя (Hero), с приватными полями здоровье, урон и суперспособность.
 Написать 2 разных конструктора для создания объекта. В одном конструкторе задаются все поля,
 в другом только здоровье и урон. Добавить в класс Hero геттеры для всех полей.
*/
public class Hero {
    private int heroesHealth;
    private int heroesDamage;
    private String heroesPower;
    private String heroesName;

    public Hero(String heroesName ,int heroHealth, int heroDamage, String heroesPower ) {
        this.heroesHealth = heroHealth;
        this.heroesDamage = heroDamage;
        this.heroesPower = heroesPower;
        this.heroesName = heroesName ;

    }

    public Hero(int heroHealth, int heroDamage) {
        this.heroesHealth = heroHealth;
        this.heroesDamage = heroDamage;
    }

    public int getHeroDamage() {
        return heroesDamage;
    }

    public int getHeroHealth() {
        return heroesHealth;
    }

    public String getHeroesPower() {
        return heroesPower;
    }

    public String getHeroesName() {
        return heroesName;
    }
}
