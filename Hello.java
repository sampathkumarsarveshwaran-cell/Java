class Hello
{
    public static void main(String[] args)
    {
        System.out.println("Hello, World!!");
        int a = 5;
        byte b = 10;
        short c = 15;
        long d = 20L;
        float e = 3.2f;
        double f = 3.23445;
        char g = 'A';
        boolean h = true;
        String str = "This is a string";
        System.out.println("Integer: " + a);
        System.out.println("Byte: " + b);
        System.out.println("Short: " + c);
        System.out.println("Long: " + d);   
        System.out.println("Float: " + e);
        System.out.println("Double: " + f);
        System.out.println("Character: " + g);
        System.out.println("Boolean: " + h);
        System.out.println("String: " + str);

        // Literals
        int i = 0b1010; // Binary literal
        int j = 012;    // Octal literal
        int k = 10;     // Decimal literal
        int l = 0xA;    // Hexadecimal literal
        System.out.println("Binary Literal (0b1010): " + i);
        System.out.println("Octal Literal (012): " + j);
        System.out.println("Decimal Literal (10): " + k);
        System.out.println("Hexadecimal Literal (0xA): " + l);

        int ii = 1_000_000_000; // Using underscores for readability
        System.out.println("Integer with underscores: " + ii);

        double df = 1.5e3; // Scientific notation
        System.out.println("Double in scientific notation (1.5e3): " + df);

        char ch = '\u0041'; // Unicode literal for 'A'
        System.out.println("Unicode character (\\u0041): " + ch);

        char chh = '\n'; // Escape sequence for newline
        System.out.println("Escape sequence for newline (\\n): " + chh + "This is a new line.");

        char ca = 'b'; // Character literal
        System.out.println("Character literal ('b'): " + ca);
        ca ++;
        System.out.println("Character literal after increment: " + ca);

        //Type Casting
        byte byteVar = 10;
        int intVar = byteVar; // Implicit casting
        System.out.println("Implicitly casted int from byte: " + intVar);

        // % (size of byte = 256, range -128 to 127)
        int intVar2 = 256;
        byte byteVar2 = (byte) intVar2; // Explicit casting
        System.out.println("Explicitly casted byte from int (256): " + byteVar2);
        intVar2 = 257;
        byteVar2 = (byte) intVar2; // Explicit casting
        System.out.println("Explicitly casted byte from int (257): " + byteVar2);

        float floatVar = 10.5f;
        int intVar3 = (int) floatVar; // Explicit casting
        System.out.println("Explicitly casted int from float (10.5): " + intVar3);

        byte byteVar3 = 100;
        float floatVar2 = byteVar3; // Implicit casting
        System.out.println("Implicitly casted float from byte (100): " + floatVar2);

        byte byteVar4 = 50;
        byte byteVar5 = 60;
        int intVar4 = byteVar4 + byteVar5; // byte + byte results in int // example of type promotion
        System.out.println("Result of byte + byte (50 + 60): " + intVar4);

        // Examples of implicit type promotion in expressions
        byte byteVar6 = 40;
        short shortVar = 50;    
        int intVar5 = 100;
        long longVar = 5000L;
        float floatVar3 = 5.67f;
        double doubleVar = 0.1234;
        double result = byteVar6 + shortVar + intVar5 + longVar + floatVar3 + doubleVar;
        System.out.println("Result of mixed type expression: " + result);
        
        // Preincrement Vs Post Increment
        int i1 = 10;
        i1 ++;
        System.out.println(i1);
        ++ i1;
        System.out.println(i1);
        int r1 ;
        r1 = i1;
        System.out.println(r1);
        r1 = i1++;
        System.out.println(r1);
        System.out.println(i1);
        r1 = ++i1;
        System.out.println(r1);
        System.out.println(i1);

        int aa=5,iii;

        iii=++aa + ++aa + aa++; // iii = 6+7+7 = 20
        iii=aa++ + ++aa + ++aa; // iii = 8+10+11 = 29
        aa=++aa + ++aa + aa++;  // aa = 12+13+13 = 38

        System.out.println(aa);
        System.out.println(iii);

        // a++ -> increments value of a by 1
        // ++a -> increments value of a by 1
        // b = a++ -> the value of a before incrementing is assigned to b, then the value of a is incremented
        // b = ++a -> the value of a is incremented and then assigned to b

    }
}