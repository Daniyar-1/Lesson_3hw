public class Main {

    public static void main(String[] args) {
        String[] names = new String[3];

        names[0] = "Joe";
        names[1] = "Lisa";
        names[2] = "Laura";

        System.out.println(names[0]+ " "+ names[1]+ " "+names[2]);

        names = new String[4];

        System.out.println("_____________________________");

        int name = 3;
        switch (name) {
            case 1:
                System.out.println("Доброе утро Joe");
                break;
            case 2:
                System.out.println("Добрый день Lisa");
                break;
            case 3:
                System.out.println("Добрый вечер Laura");
                break;
            case 4:
                System.out.println("Спокойной ночи");
                break;

        }

    }
}
