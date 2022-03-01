import java.util.Random;

class ComputeMethods5026211067{

	public double fToC(double degreesF){
		double degreesC = (5.0/9.0)*(degreesF-32.0);
		double degreesCFinal = Math.round(degreesC)*10.0/10.0;
		return degreesCFinal;
	}

	public double hypotenuse(int a, int b){
		double hypo = Math.sqrt(a*a + b*b);
		return hypo;
	}

	public int roll(){
		Random rndDice = new Random();
		int dice1 = rndDice.nextInt(6) + 1;
		int dice2 = rndDice.nextInt(6) + 1;
		int sumDice = dice1 + dice2;
		return sumDice;
	}

}
