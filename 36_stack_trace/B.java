class B { 
    public static void main (String[] args) {
    bbb();
}
    static void aaa(){
        ccc();
    }
    static void bbb(){
        aaa();
    }
    static void ccc(){
        System.out.println("------start");
    
    int y = 12/0;
    System.out.println("----end");
}
}




// ------start
// Exception in thread "main" java.lang.ArithmeticException: / by zero
//         at B.ccc(B.java:14)
//         at B.aaa(B.java:6)
//         at B.bbb(B.java:9)
//         at B.main(B.java:3)