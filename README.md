# Язык ParsoTangue
ParsoTangue - язык программирования, который позволяет делать простые обсчеты с
целыми числами и строками.
## Спецификация языка 
### В этом языке 3 типа данных:
* целые числа (`Integer`)
* строки (`String`)
* логические значения (`Boolean`).

### Константы: 
* целые в 10 с/с
* строковые литералы
* логические True, False

### Язык поддерживает следующие возможности:
* Объявление переменной с присваиванием, тут же должно быть присвоено какое-то выражение
* Арифметические операции: сложение (+), вычитание (-), умножение (*), деление (/), деление с остатком (%)
* Операции сравнения: <=, >=, <, >, ==, !=.
* Условие 
* Объявление функций: возвращающие значения и void. 
* Арифметические операции: сложение (+), вычитание (-), умножение (*), деление (/), деление с остатком (%)
* Операции сравнения: <=, >=, <, >, ==, !=.
* Условный оператор if
* Объявление функций, возвращающих значения и void.   

 На верхнем уровне находятся только функции. То есть, файл с кодом состоит из набора функций. При этом внутри функции не могут быть объявлены другие функции.

Работать можно только в одном файле. Возможность импортировать внешние зависимости не предусмотрена.

* Язык не чувствителен к пробелам и отступам.
* Имена переменных: буквы английского алфавита (большие и маленькие), может быть нижнее подчеркивание '_'.
* Приоритеты операций повторяют приоритеты как в Java. Также есть скобки.

Грамматика языка представлена в папке `Grammar`.

# Технические детали
* Парсер языка реализован автоматически с использованием средств ANTLR. На основе полученного CST с помощью `ParsoTangueVisitorToAST` формируется AST исходного кода. 

* Код ANTLR формируется автоматически при запуске команды ```mvn generate-sources```. Для удобства, файлы из последней генерации добавлены в репозиторий.

* Тестирование результатов работы AST производится с использованием JUnit.
