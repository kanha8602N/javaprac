class b {
    static int y = 9;
    static int x =10;

    public static void main(String[] args) {
        System.out.println(b.y);
        System.out.println(b.x);

        b.pro();
    }   
    
    static void pro() {
        System.out.println("Hello");
    }
}
