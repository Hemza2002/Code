public class Fraction {
   //setting numerator and denominator to private 
   private int numerator;
   private int denominator;

    public Fraction() { //no-arg constructor 
       this.numerator = 0; //setting numerator to 0 
       this.denominator = 1; //setting denominator to 1 

}

   public Fraction(int numerator, int denominator) { //Same class and paramater for numerator and denominator
       this.numerator = numerator; //setting numerator to numerator and if statment which says if denominator equals zero then set denominator to 1 and then reducing
       if(denominator==0) 
       {
           this.denominator = 1;
       }
       else
       {
       this.denominator = denominator;
       }
      
       this.reduce();
}

    public int getNumerator() { //getter for numerator
       return numerator;
}

    public void setNumerator(int numerator) { //setter for numerator  
       this.numerator = numerator;
}

    public int getDenominator() { //getter for denominator 
       return denominator;
}

    public void setDenominator(int denominator) { //setter for denominator 
       this.denominator = denominator;
}
  
    public boolean equals(Object other) 
   {
       Fraction f = (Fraction) other;
       if(this.numerator==f.numerator && this.denominator==f.denominator)
       {
           return true;
       }
       else
       {
           return false;
       }
}

@Override
   public String toString() {
       return numerator + "/" + denominator;
}
  
    public void reduce() {
// reduces this fraction to lowest form
    int GCD = gcdByEuclidsAlgorithm(getNumerator(), getDenominator());
    setNumerator(getNumerator() / GCD);
    setDenominator(getDenominator() / GCD);
}
// method to find the gcd of numerator and denominator
//citations: https://www.baeldung.com/java-greatest-common-divisor
public int gcdByEuclidsAlgorithm(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return gcdByEuclidsAlgorithm(n2, n1 % n2);
    }
}