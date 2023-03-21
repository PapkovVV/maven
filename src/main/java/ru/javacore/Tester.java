package ru.javacore;

public class Tester {

	public String name;
	public String surName;
	public int experienceInYears;
	public String englishLevel;
	public double salary;


	public Tester() {

	}

	public Tester(String name) {
		this.name = name;
	}

	public Tester(String name, String surname, int experienceInYears, String englishLevel) {
		this(name);
		this.surName = surname;
		this.experienceInYears = experienceInYears;
		this.englishLevel = englishLevel;
	}

	public Tester(String name, String surname, int experienceInYears, String englishLevel, double salary) {
		this(name, surname, experienceInYears, englishLevel);
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Имя: " + name + "\nФамилия: " + surName + "\nОпыт в годах: " +
			experienceInYears + "\nУровень английского: " + englishLevel + "\nЗарплата: " + salary;
	}


	public Integer method( int n1, int n2)
	{
		return n1 + n2;
	}

	public String method(String str1, String str2)
	{
		return str1 + str2;
	}

	public boolean method(double a, double b)
	{
		return (a > b);
	}

	public static void Strochka() {
		System.out.println("Статический метод :)");;
	}
}
