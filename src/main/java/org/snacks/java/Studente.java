package org.snacks.java;

public class Studente {

		
		/*Scrivi una classe Studente con i seguenti attributi: nome, cognome, età. 
		 * Implementa un costruttore che accetta tre parametri per inizializzare questi attributi. 
		 * Aggiungi un metodo che restituisca una stringa concatenata dei valori (es. Anselmo Bitta, 24 anni).*/
		
		String studentName;
		String studentSurname;
		int studentAge;
		
		public Studente (String studentName, String studentSurname, int studentAge){
			
			this.studentName = studentName;
			this.studentSurname = studentSurname;
			this.studentAge = studentAge;
					 
		}
		
		public String studentId () {
			String fullName = studentName + studentSurname + "," + " " + studentAge + "anni ";
			return fullName;
		}
		
		
	}




