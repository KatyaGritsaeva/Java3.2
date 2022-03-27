public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 70;
        double height = 1.72;
        double result = service.calculate(weight, height);
        System.out.println("Ваш индекс = " + result);
        System.out.println(" 16 и менее ►  Выраженный дефицит массы тела;");
        System.out.println(" 16 – 18,5  ►  Недостаточная масса тела;");
        System.out.println(" 18,5 – 25  ►  Норма;");
        System.out.println(" 25 – 30    ►  Избыточная масса тела;");
        System.out.println(" 30 – 35   ►  Ожирение 1-й степени;");
        System.out.println(" 35 – 40   ►  Ожирение 2-й степени;");
        System.out.println(" 40 и более ►  Ожирение 3-й степени.");
    }
}