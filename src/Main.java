public class Main {
    public static void main(String[] args) {
//        comment:It is preferable to write code in English in intellij IDEA

        System.out.println("Hello world!");
        String text1 = "hii killua";
        int largo=text1.length();
        System.out.println(largo);
        //methods
        String texto =text1.replace("hii","bye");
        System.out.println(texto);
        System.out.println(text1);
        System.out.println(texto.startsWith("asd"));
        System.out.println(texto.endsWith("lua"));
        System.out.println(texto.contains("i"));
        System.out.println(texto.indexOf("killua"));
        System.out.println(texto.toUpperCase());
        System.out.println(texto.toLowerCase());

        String bad = "        achooo      ";
        System.out.println(bad.trim());

    }
}