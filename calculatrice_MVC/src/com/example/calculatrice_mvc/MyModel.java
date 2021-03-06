package com.example.calculatrice_mvc;

public class MyModel {
	  private double accumulator, opr; 
	  private char op;
		
	  public MyModel() { accumulator = 0.0; } 
	  public void setModel(char c) { 
		switch (c) {
			case 'C':
				opr = 0.0;
				accumulator= 0.0;
				break;
			case '+':; case '-':; case '*':; case '/' : 
				op = c; 
				opr = accumulator;
				accumulator = 0.0;
				break;
			case '=' :
			    switch (op) {
				case '+':
					accumulator = opr + accumulator;
					break;
				case '-':
					accumulator = opr - accumulator;
					break;
				case '*':
					accumulator = opr * accumulator;
					break;
				case '/':
					accumulator = opr / accumulator;
					break;
				default:
			   }
			   break;
			default:	// Assume '0'..'9' digit
				accumulator = accumulator * 10.0 + (c-'0');
				break;
		}
	  }
	  public String getModel() { return accumulator+""; }
	}