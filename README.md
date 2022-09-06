### Тестовое задание для VDcom № 1
_____

### Условие
   Консольное приложение - `FooBar`

   На вход приложение получает целое число больше 0 (n), далее в консоль выводится
   следующее, все числа от 1 до n, при этом:
   - Если число кратно 3, выводится Foo;
   - Если число кратно 5, выводится Bar;
   - Если число кратно и 3, и 5, выводится FooBar;
   - Если число не кратно 3 или 5, выводится само число.
   Необходимо предоставить минимум три разных решения, используя разные подходы
   (минимум ветвлений, без циклов и т.п.).
____

### Запуск
Требования:
- JAVA 1.8
- Maven

Выполнить команды:

    mvn clean install

    java - jar ./target/vdcom-task1.jar