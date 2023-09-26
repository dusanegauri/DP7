package com.predictOutput;
class Test
{
	public static void method(int i)
    {
        System.out.println(i);
           
    }
   
  
    public static void method(double d)
    {
      System.out.println(d);
    }
   
   
   
   
    public static void main(String[] args)
    {
       
        method('a');// ascii value will be output
       
       
        method(2);
       
        
        method(2.0f);
       
      
    }
}
