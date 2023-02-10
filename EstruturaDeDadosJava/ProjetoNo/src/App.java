public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        No<String> no1 = new No<String>("Content nó 1");

        No<String> no2 = new No<String>("Content nó 2");
        no1.setProximoNo(no2);

        No<String> no3 = new No<String>("Content nó 3");
        no2.setProximoNo(no3);

        No<String> no4 = new No<String>("Content nó 4");
        no3.setProximoNo(no4);

        System.out.println(no1);

    }
}
