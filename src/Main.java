public class Main {
    public static void main(String[] args) {
        // Создаем переменную с любимым временем года и выводим информацию о ней
        Season favoriteSeason = Season.SUMMER;
        System.out.println("Мой любимый сезон, это " + favoriteSeason);
        System.out.println("Температура: " + favoriteSeason.getTemperature());
        System.out.println("Описание: " + favoriteSeason.getDescription());

        // Выводим информацию о всех временах года
        for (Season season : Season.values()) {
            System.out.println("\nСезон: " + season);
            System.out.println("Температура: " + season.getTemperature());
            System.out.println("Описание: " + season.getDescription());
        }

        System.out.println("");

        // Вызываем метод Year для переменной WINTER
        Year(Season.WINTER);
    }

    public static void Year(Season season) {
        switch (season) {
            case WINTER:
                System.out.println("Я люблю зиму!");
                break;
            case SUMMER, SPRING, AUTUMN:
                System.out.println("Мне не нравится это время года");
                break;
        }
    }
}
