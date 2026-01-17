class Variables {
    public static void main (String[] args) {
        int a = 5;
        int b = 10;
        boolean isAEqualB = (a == b);
        System.out.println("Is a equal to b? " + isAEqualB);

        double x = 3.14;
        double y = 2.71;
        boolean isXNotEqualY = (x != y);
        System.out.println("Value of x!=y " +isXNotEqualY);

        double r = 5.0; 
        double s = 5.0;
        boolean isRGreaterThanS = (r > s);
        System.out.println("Is r greater than s? " + isRGreaterThanS);

        String str1 = "test"; 
        String str2 = "test";
        boolean areStringsEqual = str1.equals(str2);
        System.out.println("Are str1 and str2 equal? " + areStringsEqual);

        int num = 10;
        double dec = 10.0;
        boolean isNumEqualDec = (num == dec);
        System.out.println("Is num equal to dec? " + isNumEqualDec);

        char c1 = 'a'; 
        char c2 = 'b';
        boolean isC1LessThanC2 = (c1 < c2);
        System.out.println("Is c1 less than c2? " + isC1LessThanC2);

        int p= 1;
        int q= 2;
        int k= 3;
        System.out.println("Is p less than q and q less than k? " + (p < q && q < k));

        boolean a1 = true;
        boolean a2 = false;
        boolean a3 = true;
        System.out.println("result of (a1 && a2) || a3 is : " + ((a1 && a2) || a3));

        boolean m = false;
        boolean n = true;
        System.out.println("result of !(m && n) is : " + !(m && n));

        // type casting
        String s1 = "25";
        int numFromString = Integer.parseInt(s1);
        System.out.println("The integer value is: " + numFromString);

        int number = 100;
        String strFromNum = Integer.toString(number);
        System.out.println("The string value is: " + strFromNum);

    }
}