
package com.mycompany.jerseytutorial;
//decimal to Roman
public class DecimalConverter {
   // final int[] VALUES;
    private String[] romanLiterals;
    private int decimal;
    private String roman = " ";
   // private int num;
     
     //constructor   
    public DecimalConverter(){
        //  int[] VALUES;
          //String[] romanLiterals = " ";
         // int decimal ;
          int decimal = 0;
          //String roman = " " ;
          //int num = 0;
    }

//setters and getters and compute method
        public void setDecimal(int decimal){
            this.decimal= decimal;
        }
      
        
        public void setRoman(String roman){
         this.roman = roman;
        }
    
  public void integerToRoman() {

        //System.out.println("Integer: " + num);

       /* final int[] VALUES = {1000,900,500,400,100,90,50,40,10,9,5,4,1};

        String[] romanLiterals = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder roman = new StringBuilder();



        for(int i=0;i<VALUES.length;i++) {

            while(num >= VALUES[i]) {

                num -= VALUES[i];

                roman.append(romanLiterals[i]);*/
           if (decimal < 1 || decimal > 3999)
        roman = "Invalid Roman Number Value";
    while (decimal >= 1000) {
        roman += "M";
        decimal -= 1000;        } 
    while (decimal >= 900) {
        roman += "CM";
        decimal -= 900;
    }
    while (decimal >= 500) {
        roman += "D";
        decimal -= 500;
    }
    while (decimal >= 400) {
        roman += "CD";
        decimal -= 400;
    }
    while (decimal >= 100) {
        roman += "C";
        decimal -= 100;
    }
    while (decimal >= 90) {
        roman += "XC";
        decimal -= 90;
    }
    while (decimal >= 50) {
        roman += "L";
        decimal -= 50;
    }
    while (decimal >= 40) {
        roman += "XL";
        decimal -= 40;
    }
    while (decimal >= 10) {
        roman += "X";
        decimal -= 10;
    }
    while (decimal >= 9) {
        roman += "IX";
        decimal -= 9;
    }
    while (decimal >= 5) {
        roman += "V";
        decimal -= 5;
    }
    while (decimal >= 4) {
        roman += "IV";
        decimal -= 4;
    }
    while (decimal >= 1) {
        roman += "I";
        decimal -= 1;
    
            }

        }
  
public String getRoman(){
    return roman;
}

}

               
               

    

