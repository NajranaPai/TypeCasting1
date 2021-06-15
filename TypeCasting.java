import java.util.*;

public class TypeCasting {
      
     public static int i;
     public static long l;
     public static float f; 
     public static double d;
    public static void main(String[] args) throws Exception {
     /* Typecasting String to Primitive_DataType*/
        
        /* Implicit TypeCasting*/
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter a Character:");
         char c=sc.next().charAt(0);
         ConvertingChar(c);
         
         System.out.print("\nEnter a Integer Value:");
         i=sc.nextInt();
         ConvertingInt(i);
         System.out.print("\nEnter a Long Value:");
         l=sc.nextLong();
         ConvertingLong(l);

         System.out.print("\nEnter a Float Value:");
         f=sc.nextFloat();
         ConvertingFloat(f);

         System.out.print("\nEnter a Double Value:");
         d=sc.nextDouble();
         ConvertingDouble(d);
         sc.close();
     }
     
     
    static void ConvertingChar(char c)
    {
         
        i=c;
        l=c;
        f=c;
        d=c;
        System.out.println("Implicit Conversation of character:");
         System.out.println("Converting Character to integer:"+i);
         System.out.println("Converting Character to long:"+l);
         System.out.println("Converting Character to float:"+f);
         System.out.println("Converting Character to double:"+d);
         System.out.println("");
         System.out.println("Explicit Conversation of character:");
         System.out.println("Converting Character to byte:"+(byte)c);
         System.out.println("Converting Character to short:"+(short)c);
    }
    static void ConvertingInt(int i)
     {
        l=i;
        f=i;
        d=i;
         
         System.out.println("Implicit Conversation of Integer:");
         System.out.println("Converting Integer to long:"+l);
         System.out.println("Converting Integer to float:"+f);
         System.out.println("Converting Integer to double:"+d);
         System.out.println("");
         System.out.println("Explicit Conversation of Integer:");
        
         System.out.println("Converting Integer to byte:"+(byte)i);
         System.out.println("Converting Integer to short:"+(short)i);
         System.out.println("Converting Integer to char:"+(char)i);
     }
    
     static void ConvertingLong(Long L)
     {
        System.out.println("Implicit Conversation of Long:");
        f=l;
        d=l;
         
         System.out.println("Converting Long to Float:"+f);
         System.out.println("Converting Long to double:"+d);

         System.out.println("");
         System.out.println("Explicit Conversation of Long:");
         System.out.println("Converting Long to byte:"+(byte)l);
         System.out.println("Converting Long to short:"+(short)l);
         System.out.println("Converting Long to int:"+(int)l);
         System.out.println("Converting Long to char:"+(char)l); 
     }
     static void ConvertingFloat(Float f)
      {
        System.out.println("Implicit Conversation of Float:");
         
        d=f;
         
         System.out.println("Converting Float to double:"+d);

         System.out.println("");
         System.out.println("Explicit Conversation of Float:");
         System.out.println("Converting Float to byte:"+(byte)TypeCasting.f );
         System.out.println("Converting Float to short:"+(short)TypeCasting.f);
         System.out.println("Converting Float to int:"+(int)TypeCasting.f);
         System.out.println("Converting Float to long:"+(long)TypeCasting.f);
         System.out.println("Converting Float to char:"+(char)(int)TypeCasting.f);
          
      }
      static void ConvertingDouble(Double d)
      {
        System.out.println("Implicit Conversation of double:\t We cannot convert implicity with Double");
          
         System.out.println("");
         System.out.println("Converting Double to byte:"+(byte)TypeCasting.d );
         System.out.println("Converting Double to short:"+(short)TypeCasting.d);
         System.out.println("Converting Double to int:"+(int)TypeCasting.d);
         System.out.println("Converting Double to Long:"+(long)TypeCasting.d);
         System.out.println("Converting Double to Float:"+(float)TypeCasting.d);
         System.out.println("Converting Double to char:"+(char)TypeCasting.d);
          
      }     
}
