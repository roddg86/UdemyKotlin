### Kotlin, разработка приложения под Android, изучение основноого языка разработки под Android и создание своего приложение (Роман Панёв)

#### 1. Переменные и типы данных

Kotlin - строго типизированный язык

**Изменяемая переменная**

**var** это variable, переменная

```kotlin
var a: Int = 5  // обьявление переменной, сокр. variable, присвоить значение 5
                // : Int - тип данных который может находиться в переменной
var b: Int = 3
var s: Int = a * b
println(s)
```
```kotlin
var a: Int = 5                 // целое число
var name: String = "rectangle" // строка
var diagonal: Double = 5.83    // дробное число
var isSquare: Boolean = false  // истина лож
```

тип переменной можно не указывать, компилятор сам поймет какой тип значения будет
```kotlin
    var a = 5
```

```kotlin
// присвоить новое значение

a = 10
```

**Неизменяемая переменная**

**val** это value, значение

```kotlin
val a: Int = 5
a = 10 // будет ошибка
```
Переменные лучше обьявлять через val, и если понимаешь что у переменной будет изменяться значение менять с var на val

Переменные хранятся в оперативной памяти компьютера, при перезапуске программы теряют свои значения.

---

#### 2. Ввод и вывод данных
вывод в консоль
```kotlin
println("hello")
```
ввод данных в коде
```kotlin
val a: Int = 5
val b: Int = 10
```
ввод данных с консоли
```kotlin
// целое число
val a: Int = readLine()!!.toInt()
// строка
val b: String = readLine()!!.toString()
```
обработка данных
```kotlin
val sum: Int = a + b
```

---

#### 3. Комментарии и naming

```kotlin
// это комментарий однострочный

/*
 это 
многострочный 
комментарий, 
делается через комбинацию ctrl+shift+/ */
```
**именование переменных**

Имена переменных должны отражать свои функции, пишутся с маленькой буквы, cemalCase

например переменная зарплата: 

```kotlin
val salary: Int = 646464 
```

например переменная имя пользователя:
```kotlin
val userName: String = "Kirill"
```

---

#### 4. Работа с простыми типами данных

Увеличить значение переменной
```kotlin
a++
a = a + 5
a += 5
```

Сравнение чисел
```kotlin
a > 19
a == 19
```

Добавить в стринг
```kotlin
var text: String = "hello"
text += "sdfgds"
```

Длинна переменной
```kotlin
var text: String = "hello"
val textLength: Int = text.length
println(textLength)
```

Обратится к элементу с индексом 2 в этой строке
```kotlin
var text: String = "hello"
val letter: Char = text[2]
println(letter)
```

Форматированный вывод

```kotlin
val name: String = "Ivan"
val age: Int = 27
val document: String = "passport"

println("пассажир $name, возраст: $age, тип документа: $document")
```

---

#### 5. Преобразование типов(приведение типов)

```kotlin
val text: String = "234"
val sum: Int = text.toInt()+10
println(sum )
```

---

#### 6. Условный оператор if-else

```kotlin
val passangerAge: Int = 19

if(passangerAge > 14)
    println("Предоставь паспорт")
else
    println("Предоставь свидетельство о рождении")
```

Присвоим результат переменной
```kotlin
val passangerAge: Int = 12

val document = if(passangerAge > 14)
    "Паспорт"
else
    "Cвидетельство о рождении"

println(document)
```

---

#### 7. Конструкция When. Логические операторы. Тип Boolean

&& оператор И(AND)

|| оператор ИЛИ

== оператор сравнение

! - отрицание

true false

false true

```kotlin

val number1: Int = 12
val number2: Int = 23
val number3: Int = 8

if (number1>number2 && number1>number3)
    println(number1)
else if(number2>number1 && number2>number3)
    println(number2)
else
    println(number3)
```
множественное условие
```kotlin
    val rating: Int = 3
    if (rating == 1 || rating == 2)
        println("плохо")
    else if (rating == 3)
        println("нормально")
    else if (rating == 4)
        println("хорошо")
    else if (rating == 5)
        println("отлично")
```
**when** оператор в kotlin когда нужно сделать множествнное условие взамен if
```kotlin
when(rating){
        1,2 -> println("плохо")
        3 -> println("нормально")
        4 -> println("хорошо")
        5 -> println("отлично")
    }
```
истинность на примере типа boolean

>таблица истинности:
>
>**|| - или**
>
>true||true true
>
>true||false true
>
>false||true true
>
>false||false false
>
>**&& - и**
>
>true&&true true
>
>true&&false false
>
>false&&true false
>
>false&&false false

```kotlin
val rating: Int = 3
val condition1: Boolean = rating == 1 || rating == 2
```

#### 8. Все о функциях

имена функций пишутся с маленькой буквы и в cemalCase

ввод данных
```kotlin
val a: Int = 3
val b: Int = 10
```

нахождение максимального числа
```kotlin
val maxNumber: Int = getMaxNumber(a, b)   
```
вывод данных
```kotlin
println(maxNumber)
```
каркас функции
```kotlin
fun имяФункции(аргументы функции): возвращаемый тип {
    тело функции
    return возвращаемое значение
}
```
функция нахождения максимального числа
```kotlin
fun getMaxNumber(firstNumber: Int, secondNumber: Int): Int {
  
    val result: Int = if(firstNumber > secondNumber)
        firstNumber
    else
        secondNumber
    return result
}
```
---
#### 9. Дата-классы

Дата классы нужны, чтобы сгруппировать свойства(состояния) которые относятся к одной сущности.

Дата класс описывает шаблон как должна выглядеть любая сущность.

создание объекта класса
```kotlin

val user1 = User("Kirill", 23)
val user2 = User("Olga", 35)
```

обратимся к имени пользователя и выведем его
```kotlin
println(user1.name)
```
выведем возраст второго пользователя
```kotlin
println(user2.age)
```
вывести всю информацию о пользователе
```kotlin
println(user2)
```
результат выполнения нашей функции запишем в переменную
```kotlin
val maxAgeUser = getMaxNumber(user1,user2)
```
форматированный вывод
```kotlin
println("Пользователь ${maxAgeUser.name} старше. Его возраст: ${maxAgeUser.age}")
```
в аргументы функции передадим типы дата класса User
функция на выходе будет возвращать объект User
```kotlin
fun getMaxNumber(user1: User, user2: User): User {
    //функция нахождения максимального возраста пользователя
    val maxAgeUser = if(user1.age > user2.age)
        user1
    else
        user2
    return maxAgeUser
}
```
дата класс на примере пользователя
```kotlin
data class User(val name: String, val age: Int)
```
---
#### 10. Коллекции и циклы

коллекция чисел
```kotlin
val numbers = listof(45,87,4,216,1)
```
обратимся к нулевому элементу
```kotlin
numbers[0] 
```
перебрать все элементы коллекции в цикле, вывести на экран
```kotlin
for (number in numbers)
    println(number)
```
перебрать все элементы коллекции в цикле, вывести на экран только те если они больше 10
```kotlin
for (number in numbers)
    if (number > 10) 
        println(number)
```
переменную обьявленную перед циклом увеличим на единицу 
столько раз сколько чисел больше 10 в коллекции и выведем на экран
```kotlin
var counter = 0
for (number in numbers) {
    if(number > 10)
        counter++
}
println(counter)
```

**изменяемые и не изменяемые коллекции**

неизменяемая коллекция
```kotlin
val numbers = listof(45,87,4,216,1)
```
изменяемая коллекция
```kotlin
val weekSales = mutableListOf(45,87,4,216,1)
```
добавить элемент в изменяемую коллекцию
```kotlin
weekSales.add(89)
```
удалить элемент из изменяемой коллекции
```kotlin
weekSales.remove(4)
```
удалить элемент по индексу, удалит 87
```kotlin
weekSales.removeAt(1)
```

**var и val в коллекциях**

оператор var позволяет изменить коллекцию только целиком
```kotlin
var weekSales = listOf(45,87,4,216,1)
```

вторая коллекция для замены
```kotlin
val sales2 = listOf(12,45)
```

вторая коллекция заменит первую потому что первая var
```kotlin
weekSales = sales2
```

listof - это функция, тип переменной в коллекции будет List< Int >
```kotlin
var weekSales: List<Int> = listOf(45,87,4,216,1)
```
передать коллекцию целых чисел в аргументы функции
```kotlin
fun some(list: List<Int>){
    тело функции
}
```
---
#### 11. Все о лямбда-выражениях

Лямбда выражения - это просто другой способ записи функции, это анонимные функции записанные в определённом виде.

Обычная функция
```kotlin
fun max(a: Int, b: Int): Int {
    val result = if (a > b)
        a
    else
        b
    return result
}
```

та же функция только через лямбда выражение, у нее нет названия поэтому она анонимная,
return подразумевается писать его не нужно
```kotlin
val lambda = {a: Int, b: Int ->
    val result = if(a>b)
        a
    else
        b
    result
}
```

упростим лямбду, запишем в одну строчку, положим в переменную,
так можно записать любую функцию в таком виде
```kotlin
val lambda = {a: Int, b: Int -> if(a>b) a else b}
```
положим результат выполнения нашей лямбды в переменную, выведем на экран
```kotlin
val result = lambda(6,3)
println(result)
```

**Пример:** лучше пересмотреть в видео, начиная с 3:38

обьявим дата класс
```kotlin
data class User(val name: String, val age: Int)
```

создадим экземпляры этого класса
```kotlin
val user1 = User("Kirill", 23)
val user2 = User("Kirill", 17)
val user3 = User("Kirill", 32)
val user4 = User("Kirill", 21)
```

положим их в общий список
```kotlin
val users = listOf(user1,user2,user3,user4)
```

отфильтруем пользователей по условию, что первая буква K, 
для этого применим стандарную функцию в котлин,
и передадим в параметр лямбда выражение, где
**it** означает этот обьект. Так как параметр стоит последним круглые скобки опускаются.
```kotlin
val filteredUsersStandart = users.filter { it.name[0] == 'K' }
```
---
#### 12. Классы и объекты, инкапсуляция. Введение ООП.

this - получить ссылку на сам объект у которого вызвана функция.  

:: - операторо получает ссылку на функцию, создает ссылку на элемент или ссылку на класс, [ключевые слова и операторы](https://kotlinlang.ru/docs/reference/keyword-reference.html)

Инкапсуляция - это скрытие внутренней реализации объекта. 

Пример описания объекта(модели):

класс имеет состояние(поля) и поведение(функции)
```kotlin
class Employee(
    //внешние поля инициализируются при создании экземпляра
    val name: String, 
    val salary: Int
){
    //внутреннее поле доступное только внутри класса, инкапсуляция
    private val projects: MutableList<String> = mutableListOf<String>()
    
    fun callToClient(clientName: String){
        // действие, которое может выполнять класс
        // позвонить клиенту
        println("Сотрудник ${name}: звоню клиенту $clientName ")
    }
    
    fun addProject(projectName: String) {
        // действие, которое может выполнять класс
        // добавить проект
        projects.add(projectName)
        println("Сотрудник ${name}: начал работу над проектом $projectName")
    }
    
    fun printAllProjects(){
        // действие, которое может выполнять класс
        // вывести на экран все проекты
        for (project in projects)
            println(project)
    }
}

```
создание экземпляров объекта, вызов функций объекта
```kotlin
val employee1 = Employee("Kirill", 100000)
val employee2 = Employee("Olga", 100000)

employee1.addProject("Проект 1")
employee1.addProject("Проект 2")
employee1.addProject("Проект 3")
employee1.printAllProjects()

employee2.addProject("Проект №1 для Ольги")
employee2.printAllProjects()

employee1.projects.add("Новый проект")

```
---
#### 13. Что такое наследование

Наследование - позволяет избавится от дублирования кода

open - модификатор открытого класса, означает что от него можно наследоваться

классы наследники обязаны инициализировать все поля супер класса.

Базовый класс, супер класс

```kotlin
open class Employee(
        val name: String,
        val salary: Int
) {
    private val projects: MutableList<String> = mutableListOf<String>()

    fun addProject(projectName: String) {
        projects.add(projectName)
        println("Сотрудник ${name}: начал работу над проектом $projectName")
    }

    fun printAllProjects() {
        println("Проекты сотрудника $name: ${projects.joinToString()}")
    }
}
```

Наследники супер класса, поля передаются в конструктор,
значение полей будут получены снаружи и передадутся в конструктор супер класса
```kotlin
class Programmer(name: String, salary: Int): Employee(name,salary){
    fun readArticle(articleName: String) {
        println("Программист $name: читаю статью $articleName")
    }
}
```

```kotlin
class Manager(name: String, salary: Int): Employee(name,salary){
    fun callToClient(articleName: String) {
        println("Менеджер $name: звоню клиенту $articleName")
    }
}
```

Создание объекта, и вызов унаследованных функций
```kotlin
    val programmer1 = Programmer("Kirill", 233454)
    val programmer2 = Programmer("Kirill", 233664)

    programmer1.readArticle("article")
    programmer1.printAllProjects()
    programmer1.addProject("project1")
    programmer1.addProject("project2")
    programmer2.addProject("project3")

    val employees = listOf<Employee>(programmer1, programmer2, manager1)
    for(employee in employees)
        employee.addProject("Общий проект")

    for(employee in employees)
        employee.printAllProjects()


```

#### 14. Абстрактные классы, полиморфизм

Полиморфизм - это когда какая-то функция описанная в базовом классе без реализации,
а реализация у каждого класса наследника своя.

abstract модификатор, функция не имеет реализации, 
поэтому любой наследник может реализовать функцию по своему, 
заголовок один реализация разная

если в классе есть хоть одна абстрактная функция то и весь класс тоже становится абстрактным

если класс абстрактный значит от него кто-то будет наследоватся

обьекты абстрактных классов создавать нельзя

override модификатор переопределения функции

protected модификатор, значит функция доступна всем наследникам но не доступна никому за пределами класса

```kotlin
abstract class Employee(
        val name: String,
        val salary: Int
) {
    private val projects: MutableList<String> = mutableListOf<String>()

    
    abstract fun addProject(projectName: String)

    fun printAllProjects() {
        println("Проекты сотрудника $name: ${projects.joinToString()}")
    }
}
```

Наследники супер класса, поля передаются в конструктор,
значение полей будут получены снаружи и передадутся в конструктор супер класса
```kotlin
class Programmer(name: String, salary: Int): Employee(name,salary){
    fun readArticle(articleName: String) {
        println("Программист $name: читаю статью $articleName")
    }

    fun addProject(projectName: String) {
        projects.add(projectName)
        println("Программист ${name}: начал работу над проектом $projectName")
    }
}
```

```kotlin
class Manager(name: String, salary: Int): Employee(name,salary){
    fun callToClient(articleName: String) {
        println("Менеджер $name: звоню клиенту $articleName")
    }

    fun addProject(projectName: String) {
        projects.add(projectName)
        println("Менеджер ${name}: передал работу над проектом $projectName программистам")
    }
}
```

Функция принимает на вход любой объект супер класса, и может примениться для обьектов,
которые наследуют супер класс, обьект увидит все функции супер класса, но не увидит функции наследников
```kotlin
fun some(employee: Employee){
    
}
```

Функция принимает на вход хоть программиста хоть менеджера
```kotlin
val programmer1 = Programmer("Kirill", 34232)
val manager1 = Manager("Oleg", 876687)

some(programmer1)
some(manager1)
```




















