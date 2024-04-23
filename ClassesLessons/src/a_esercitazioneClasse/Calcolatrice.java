package a_esercitazioneClasse;

import java.util.Scanner;

public class Calcolatrice {
	
	double firstNumber;
	double secondNumber;
	
	public Calcolatrice(double firstNumber, double secondNumber) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	}
	
	public double sum() 
	{
		return this.firstNumber + this.secondNumber;
	}
	
	public double sub() 
	{
		return this.firstNumber - this.secondNumber;
	}
	
	public double mul() 
	{
		return this.firstNumber * this.secondNumber;
	}
	
	public double spare() 
	{
		return this.firstNumber % this.secondNumber;
	}
	
	public double div() 
	{
		if(this.secondNumber!=0) 
		{
		return this.firstNumber / this.secondNumber;
		} else 
		{
			System.out.println("Can't divide by 0");
			return -1;
		}
	}
	
	public static void suspenceTimerFourSeconds() {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "Calcolatrice [firstNumber=" + firstNumber + ", secondNumber=" + secondNumber + "]";
	}
}
