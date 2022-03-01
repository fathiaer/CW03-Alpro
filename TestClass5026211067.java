class TestClass5026211067{

	public static void main(String[] args){
		ComputeMethods5026211067 com = new ComputeMethods5026211067();
		double dgrC = com.fToC(87.5);
		double hyp = com.hypotenuse(12, 13);
		int diceValue = com.roll();

		System.out.println("Temperature in celcius is "+dgrC);
		System.out.println("Hypotenuse is "+hyp);
		System.out.println("The sum of the dice values is "+diceValue);
	}

}