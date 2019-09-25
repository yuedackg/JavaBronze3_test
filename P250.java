public class P250{
    private String size;
    private String title;

    P250 (){

    }
    P250( String title){
        this.title = title;
    }

    void printInfo(){
        System.out.println( title + " " + size);
    }
    public static void main( String[] args){
        P250 p = new P250( );
        p.printInfo();
    }
}