public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double myBmi = service.calculate(57.3, 1.681); //Принимаем за истину, что валидация данных происзходит на фронтенде
        String result = String.format("%.3f", myBmi);
        System.out.println("Ваш индекс массы тела равен " + result + " кг/м2");
    }
}