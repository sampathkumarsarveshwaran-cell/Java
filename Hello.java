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

    }
}