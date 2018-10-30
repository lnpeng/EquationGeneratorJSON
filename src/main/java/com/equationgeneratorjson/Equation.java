// Equation class that contains information about an equation.
package com.equationgeneratorjson;

public class Equation
{
   private int leftOperand;
   private int rightOperand;
   private int result;
   private String operationType;

   // required no-argument constructor
   public Equation()
   {
      this( 0, 0, "add" );
   } // end no-argument constructor

   // constructor that receives the operands and operation type
   public Equation( int leftValue, int rightValue, String type )
   {
      leftOperand = leftValue;
      rightOperand = rightValue;

      // determine result
      if ( type.equals( "add" ) ) // addition
      {
         result = leftOperand + rightOperand;
         operationType = "+";
      } // end if
      else if ( type.equals( "subtract" ) ) // subtraction
      {
         result = leftOperand - rightOperand;
         operationType = "-";
      } // end if
      else // multiplication
      {
         result = leftOperand * rightOperand;
         operationType = "*";
      } // end else
   } // end three argument constructor

   // gets the leftOperand
   public int getLeftOperand()
   {
      return leftOperand;
   } // end method getLeftOperand

   // required setter
   public void setLeftOperand( int value )
   {
      leftOperand = value;
   } // end method setLeftOperand

   // gets the rightOperand
   public int getRightOperand()
   {
      return rightOperand;
   } // end method getRightOperand

   // required setter
   public void setRightOperand( int value )
   {
      rightOperand = value;
   } // end method setRightOperand

   // gets the resultValue
   public int getResult()
   {
      return result;
   } // end method getResult

   // required setter
   public void setResult( int value )
   {
      result = value;
   } // end method setResult

   // gets the operationType
   public String getOperationType()
   {
      return operationType;
   } // end method getOperationType

   // required setter
   public void setOperationType( String value )
   {
      operationType = value;
   } // end method setOperationType
   
   // returns the left hand side of the equation as a String
   public String getLeftHandSide()
   {
      return leftOperand + " " + operationType + " " + rightOperand;
   } // end method getLeftHandSide

   // returns the right hand side of the equation as a String
   public String getRightHandSide()
   {
      return "" + result;
   } // end method getRightHandSide

   // returns a String representation of an Equation
   public String toString()
   {
      return getLeftHandSide() + " = " + getRightHandSide();
   } // end method toString
} // end class Equation
