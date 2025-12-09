class N{
    N(){
        void pro(){
            new N();
        }
    }
}

// N.java:3: error: illegal start of expression
//         void pro(){
//         ^
// N.java:3: error: ';' expected
//         void pro(){
//                 ^
// 2 errors