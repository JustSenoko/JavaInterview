package lesson2.task1;

public class MeteoStation {
    public static void main(String[] args) {
        MeteoStore meteoDb = new MeteoStore();

        MeteoSensor ms200_1 = new MS200(1);
        meteoDb.save(ms200_1);

        // Здесь надо вызвать метод getData у класса ST500Info. Полученные данные отправить в метод save объекта meteoDb
        ST500Info st = new ST500Info();
        STAdapter adapter = new STAdapter(st.getData());

        meteoDb.save(adapter);
    }
}
