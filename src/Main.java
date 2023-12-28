public class Main {

    public static void main(String[] args) {
        // Создание объектов
        Object obj1 = new Object();
        Object obj2 = new Object();

        // Отметка объекта obj1 как недостижимого
        obj1 = null;

        // Вызов сборщика мусора
        System.gc();

        // Проверка, был ли удален объект obj1
        if (obj1 == null) {
            System.out.println("Объекст obj1 был собран в мусор.");
        }

        // Проверка, был ли удален объект obj2
        if (obj2 == null) {
            System.out.println("Объекст obj2 был собран в мусор.");
        }

    }
}