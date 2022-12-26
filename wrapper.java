// objective
// to wrap primitive type into object type, so that we can handle primitives also just like object
// to define some utility methods for primitives
// 1. toString()      2. valueOf()      3.parseXxx()  4. xxxValue()

// constructors 
// almost all the wrapper class contains two constructors --

// 1. one can take corresponding primitive type
// 2. another can take string as argument 



public class wrapper {
    public static void main(String[] args) {
    // wrapper classes in java
    // 1. int -- Integer 
    @Deprecated
    Integer i1 = new Integer(10);

    Integer i3 = Integer.valueOf(10);  // recommmended to use for primitive to object conversion

    @Deprecated
    Integer i2 = new Integer("10"); 
    
    Integer i4 = Integer.valueOf("10"); // recommmended to use for primitive to object conversion

    // 2. byte -- Byte
    @Deprecated
    Byte b1 = new Byte((byte) 10);

    Byte b3 = Byte.valueOf("10"); // recommmended to use for primitive to object conversion

    @Deprecated
    Byte b2 = new Byte("10");

    Byte b4 = Byte.valueOf("10"); // recommmended to use for primitive to object conversion

    // 3. short -- Short
    Short s1 = new Short((short)19);
    Short s2 = new Short("10");

    // recommmended to use for primitive to object conversion
    Short s3 = Short.valueOf("10");
    Short s4 = Short.valueOf((short)10);

    // 4. long -- Long
    Long l1 = new Long("101");
    Long l2 = new Long(101);

    // recommmended to use for primitive to object conversion
    Long l3 = Long.valueOf("101");
    Long l4 = Long.valueOf(99);

    // 5. float -- Float
    Float f1 = Float.valueOf("101.1f");
    Float f2 = Float.valueOf(101.1f);


    // 6. double -- Double
    Double d1 = Double.valueOf("101.98");
    Double d2 = Double.valueOf(101.8);

    // 7. boolean -- Boolean
    Boolean b11 = Boolean.valueOf("true");  //true
    Boolean b12 = Boolean.valueOf("True"); //true
    Boolean b13 = Boolean.valueOf(true);
    // Boolean b14 = Boolean.valueOf(True); 
    Boolean z = Boolean.valueOf(null); //false
    Boolean z1 = Boolean.valueOf(true); // true
    Boolean z3 = Boolean.valueOf("zeus"); // false
    Boolean z4 = Boolean.valueOf("tRuE"); // true
    

    // if we are passing boolean type as arg the only allowed values are ==> true false (lower case) otherwise we'll get C.E.
    
    // if passing string value only true (in any case) considered as true other than this rest all are considered as boolena false


    // 8. char -- Character
    Character ch = Character.valueOf('c');


    // public static wrapper valueOf(String s);  available in all wrapper class except character
    // public static wrapper valueOf(primitive p); available in all wrapper class

    // only applicable for Integral type wrapper classes (Integer, Short, Byte, Long)
    // public static wrapper valueOf(String a, radix r);
    // valid range of r = 2 to 36
    Integer num1 = Integer.valueOf("1111",2); // binary to decimal
    System.out.println(num1);
    Short num2 = Short.valueOf("174",8); // octal to decimal
    System.out.println(num2);
    Long num3 = Long.valueOf("f", 16);  // hexadecimal to decimal
    System.out.println(num3);
    
    // Byte num4 = Byte.valueOf("45", 32);
    // System.out.println(num4);


}}
