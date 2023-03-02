package polymorphismexamples;
//runtime polymorphism - dynamic method dispatch
//overload a static method in java - compile time poly
//overridden method called by the reference variable of papa class
//overridden method is resolved at runtime rather than compile time
public class Runtimepoly {
	public static void main(String[] args) {
		Java_student js;  //reference variable of parent class
		js=new Sana();
		System.out.println("quality of sana is:"+js.quality());
		js=new Hemant();
		System.out.println("quality of hemant is:"+js.quality());
}}
class Java_student{ //parent class
	String quality() {
		return null;
	}}
class Ritu extends Java_student{ //child class 1
	String quality() {
		return "artist";
	}}
class Hemant extends Java_student{ //child class 2
	String quality() {
		return "active";
	}}
class Sana extends Java_student{ //child class 3
	String quality() {
		return "good in nature";
	}}
class Prince extends Java_student{ //child class 4
	String quality() {
		return "unable to run code";
	}}


