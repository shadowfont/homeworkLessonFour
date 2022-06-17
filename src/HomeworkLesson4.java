public class HomeworkLesson4 {
    public static void main(String[] args) {


// Задание №1

    for (int n = 1; n <= 100 ; n++) {
    System.out.print(n + "a ");
    }

    System.out.println(" ");

//  Задание №2

    int age = 30;
        if (age <=6) {
            System.out.println("Ходит в сад");
        }
        if (age >6){
            if (age <=11){
                System.out.println("Ходит в начальную школу");
            }
        }
        if (age >11){
            if (age <=17){
                System.out.println("Ходит в среднюю школу");
            }
        }
        if (age >17){
            if (age <=25){
                System.out.println("Поступил в университет");
            }
        }
        if (age >25){
            if (age <=61.5)
            System.out.println("Уже работает вовсю!");
        }
        if(age >61.5){
            System.out.println("Вышел на пенсию");
        }

//        Задача №3

        boolean chicken = true;
        boolean vegetables = false;
        boolean sour = true;
        boolean toast = true;
        boolean sausage = true;
        boolean eggs = true;
        boolean trueCaesar = (chicken && vegetables && sour && toast);
        boolean trueOlivier = (vegetables && (sausage || chicken) && eggs);
        if (trueCaesar){
            System.out.println("Можно цезарь");
        } else if (trueOlivier) {
            System.out.println("Можно оливье");
        } else if (vegetables) {
            System.out.println("Можно овошной");
        } else {
            System.out.println("Ничего нет");
        }

//        Задача № 4

        Dog dog = new Dog(4,"есть", "гав" );
//      Выводим инфу
        System.out.println(dog.getInfo());
//      Проверяем геттер
        System.out.println(dog.getPaws());
//      Проверяем сеттер
        dog.setPaws(3);
        dog.setVoice("Мычит");
        System.out.println(dog.getInfo());

        Snake snake = new Snake( 0, "есть", "шипит");
//      Выводим инфу
        System.out.println(snake.getInfo());
//      Проверяем сеттер
        snake.setPaws(3);
        snake.setTail("потеряла");
        snake.setVoice("заматерилась на Русском");
        System.out.println(snake.getInfo());



    }
  }








// Домашка

//            //
//            // Задание №3
//            // Дано:
//            boolean chicken = true;
//            boolean vegetables = false;
//            boolean sour = true;
//            boolean toast = true;
//            boolean sausage = true;
//            boolean eggs = true;
//            // Задача: Повара попросили сделать салат.
//            // Если у повара есть все ингредиенты для "Цезаря" (курица, овощи, соус и гренки), то лучше сделать "Цезарь".
//            // Если для "Цезаря" ингредиентов не нашлось, то сделать Оливье (овощи, колбаса или курица, яйца).
//            // Если и для Оливье не нашлось ингредиентов, то сделать Овощной салат (нужны только овощи).
//            // Если ингредиентов нет, то повар объявляет: У меня ничего нет
//            // Написать набор условий, приготовления салатов, по приоритету (от Цезаря к овощному). Либо объявить о невозможности сделать салат.
//            // Ожидаемый результат: вывод на экран сделанного салата или объявление о том, что ничего нет.
//            // Проверьте работоспособность условий, через изменение значения переменных.
//
//            // Задание №4
//            // Создать два класса, которые описывают какое либо животное (имеют два атрибута).
//            // Написать к ним конструктор, сеттеры, геттеры.