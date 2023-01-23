[solid](#solid)\
[enum](#enum-)\
[Интерфейс и Абстрактный класс](#интерфейс-и-абстрактный-класс-)\
[Nested класс](#nested-class-)\
[Анонимный класс](#анонимный-класс-)\
[Клонирование](#клонирование-)\
[Функциональный Интерфейс](functional-interfaces.md)\
[Иерархия исключений](#иерархия-исключений-)\
[Связывание](#связывание-)

**ООП:**\
согласно этой концепции - программа состоит из оъектов, обменивающихся сообщениями. объекты могут хранить состояние и единственный способ изменить состояние - отправить сообщение.

**Основные принципы ООП:**\
[Абстракция](#абстракция)\
[Инкапсуляция](#инкапсуляция)\
[Полиморфизм](#полиморфизм)\
[Наследование](#наследование)\
[Ассоциация Агрегация и Композиция](#композиция)

###### Абстракция 
    Абстракция - скрывает complexity предотавляя только необходимую информацию ползователю, 
    а также добавляет гибкости. позволяя разработчику изменять поведение абстракции.
    - пример частичной абстракции Абстрактный класс 
    - пример полной абстракции Интерфейс

###### Инкапсуляция
    Инкапсуляция - улучшает безопасность данных путем закрытия доступа к полям объекта напрямую, 
    чтобы изменение в классе не влекли за собой изменение внешнего поведения класса. 
    Мы можем использовать класс так как нам надо, не задумываясь о том что под капотом.

###### Полиморфизм
    Полиморфизм - доавляет гибкости коду открывает путь к множественному наследованию.
    декларируя интерфейс, можно легко выбрать реализацию.
    - пример RUNTIME полиорфиза это @Override
    - пример COMPILE-TIME полиорфизма это method overloading.

###### Наследование
    Наследование - позволяет переиспользовать наш код и улушает его читаемоть

###### Ассоциация
    Ассоциация - обозначает связь между объектами.
    Агрегация и Композиция являются частными случаями ассоциации.

###### Аггрегация
    Аггрегация - пример: класс Б создается извне класса А и передаетя в контруктор. 
    Если класс А будет удален, класс Б все равно может исползоватся, если ссылка на объект сохранится.

###### Композиция 
    Композиция - более тесная связь чем агрегация, когда объект не только является частью другого объекта,
    но и вообще не может принадлежать другому объекту наприер если объект Б создаетя в конструкторе класса А.

---

###### SOLID
    solid - это принципы разработки программного обеспечения, следуя которым получается хороший код, 
    который будет хорошо масштабироваться и поддерживаться в рабочем состоянии.

- **S - Single Responsibility Principle** - Каждый класс должен иметь только одну зону
ответственности.
- **O - Open closed Principle** - Классы должны быть открыты для расширения, но закрыты для
изменения.
- **L - Liskov substitution Principle** - Должна быть возможность вместо базового класса подставить
любой его подтип, при этом работа программы не должна измениться.
- **I - Interface Segregation Principle** - Не нужно заставлять класс реализовывать интерфейс,
который не имеет к нему отношения.
- **D - Dependency Inversion Principle** - Модули верхнего уровня не должны зависеть от модулей
нижнего уровня. Абстракции не должны зависеть от деталей. Детали должны зависеть от абстракций.

---

- **JDK** - среда для разработки программ на Java, включающая в себя JRE
- **JRE** - среда для обеспечения запуска Java программ, которая в свою очередь содержит JVM
- **JVM** - интерпретатор кода Java программ.

---

**модиикаторы доступа:**
- **private** - видиость только внутри класса.
- **default** - видимость только внутри пакета.
- **protected** - видимость внутри пакета и в наследниках.
- **public** - доступен всем.

**final:**
- **final** переменные не могут изменить свое значение после инициализации
- **final** параметры методов не могут изменять своё значение внутри метода
- **final** поля не могут изменить свое значение после инициализации
- **final** методы не могут быть переопределен в классах наследниках
- **final** класс не может иметь наследников.

**static:**
- поля
- методы
- вложенные классы
- блоки инициализации
- import

---

###### ENUM:
enum - это класс представляющий группу контант. используется когда набор значений известен на этапе
компиляции. часто enum используется в switch. также enum позволяет итерироваться по всем споим значениям используя метод values(), которы возвращает лист значени enum. enum не может быть использован для создания экземпляров класса и не может наледоваться от других классов.

---

###### Интерфейс и Абстрактный класс: 
- может описывать категорию разных объектов.
- обязательно содержит метод без реализации.
- нельзя инстанировать.
- позволяет определять поля, значения могут задавать классы наследники.
- может иметь методы по умолчанию как и интерфейс.
- наследник абстрактного класса расширяет его функциональность

**Интерфейс** - описывает часть функциональности объекта.
- может иметь поля, но они могут быть только public static final
- может иметь методы по умолчанию, как и абстрактный класс.
- может содержать статические методы.
- не способен сохранять состояния.
- это один из механизмов реализации принципа полиморфизма.
- может наследоваться от одного или нескольких интерфейсов.

**Абстрактный класс лучше всего использовать:**
- чтобы избежать дублирования кода реализуя несколько классов в одной категории
- если наследующие классы имеют много общих свойств и реализуют похожие методы
- поддерживать и дополнять абстрактный класс намного проще, чем добавлять новые методы в
    интерфейс

**Интерфейс лучше всего использовать:**
- если нужно описать логику, которую должны поддерживать не связанные между собой объекты.
- если нужно привести к одному типу группу объектов и гарантировать схожую функциональность.
- если нужно добавить какой-то маркер, говорящий, что классы поддерживают определённую
    логику.

---

###### NESTED CLASS:
- nested класс это класс определенный внутри другого класса.
- nested класс должен создаваться только для того, чтобы обслуживать обрамляющий его класс.
- nested класс имеет доступ ко всем полям и методам внешнего класса, но не наоборот.
- nested класс ассоциируется не с внешним классом, а с его экземпляром.
- Для создания объекта static nested класса объект внешнего класса не требуется.
- Из объекта static nested класса можно обращаться к не static членам главного класса только через ссылку на экземпляр внешнего класса.
- Обычные вложенные классы не могут содержать static членов. static inner классы - могут.
- В объекте non-static inner класса хранится ссылка на объект внешнего класса. Внутри static
класса доступ к экземпляру main класса осуществляется через указание Outer.this
- Static inner класс следует использовать, когда доступ к внешнему классу из внутреннего не предполагается

---

###### АНОНИМНЫЙ КЛАСС:
- это вложенный локальный класс без имени.
- использование разрешено только в одном месте программы - месте его создания.
- применяется для создания объекта функции например реализация интерфейса Comparator
- применяется для создания объекта процесса например экземпляра класса Thread, Runnable
* паметры метода в Java всегда передаются только по значению. примитивы передают копию содержимого, ссылочные типы передают копию ссылки на объект.

---

###### КЛОНИРОВАНИЕ:
метод **clone()** осуществляющий побитовое копирование объекта производного класса чтобы клонировать объект нужно:
- переопределить метод clone() сделав его public,
- в переопределенном методе вызвать super.clone()
- иплементировать интерфейс Cloneable
- клонирование хорошо работает в случае если все поля объекта primitive, wrapped, immutable. иначе будет просто скопирована ссылка.\
**# альтернативы методу clone():**\
- Фабричный метод - статический метод, возвращающий экземпляр своего класса.
- Сериализация - сохранение и последующее восстановление объекта в/из потока байтов.
- Конструктор копирования - конструктор, который принимает объект этого же класса и инициализирует поля создаваемого объекта значениями полей переданного.\
**# Поверхностное клонирование:**
- Если класс имеет только примитивные члены, будет создана новая копия объекта.
- Если класс имеет ссылочные члены - копируются ссылки на объекты этих классов.\
**# Глубокое клонирование:**
- Все члены ссылочного типа в классе должны поддерживать клонирование
- Если ссылочный класс не поддерживает клонирование, вызов метода clone() этого объекта, должен скопировать каждый его член со всеми атрибутами в новый объект класса
Наиболее безопасны способом клонирования через конструктор тк все операции происходят явно.\
**Метод clone()** объявлен в классе **Object**, а не в интерейсе **Cloneable** с указанием модификатора native, чтобы обеспечить доступ к стандартному механизму поверхностного копирования объектов.

---

###### ФУНКЦИОНАЛЬНЫЙ ИНТЕРФЕЙС:
**Функциональные интерыейсы** - это интересы, которые имеют только один абстрактный метод. Функциональный интерфейс может содержать сколько угодно дефолтных (реализованных в интерфейсе) методов, но только 1 абстрактный.\
**@FunctionalInterface** маркирует интерфейс функциональным, и защитит от добавления второго абстрактного метода в интерфейс. Однако аннотация **@FunctionalInterface** не обязательна. Внутри лямбда-выражений запрещено обращаться к дефолтным методам

- **ПРЕДИКАТЫ (Predicates):**\
``Predicate<Person> pred = p -> Gender.MALE.equals(p.gender);``\
принимают один аргумент, возвращают boolean. Интерфейс содержит различные методы по умолчанию, позволяющие строить сложные условия (and, or, negate).

- **ФУНКЦИИ (Functions):**\
``Function<Integer, Integer> func = n -> n+1;``\
принимают один аргумент, возвращают некоторый результат. Интерфейс содержит различные методы по умолчанию, используется для построения цепочек вызовов (compose, andThen).

- **БИФУНКЦИИ (BiFunctions):**\
``BiFunction<Integer, Integer, Integer> biFunc = (one, two) -> one + two;``\
принимают 2 аргумента, возвращают некоторый результат.

- **ПОСТАВЩИКИ (Suppliers):**\
``Suplier<String> supl = () -> "jdbc://localhost:5432/users"``\
не принимают аргументов, предоставляют результат заданного типа.

- **ПОТРЕБИТЕЛИ (Consumers):**\
``Consumer<Person> cons = p -> System.out.println("Hello "+p.name");``\
принимают один аргумент, представляют собой операции, которые производятся над входным аргументом.

- **БиПотребители (BiConsumers):**\
``BiConsumer<Person, Boolean> bicons = (p, showPhone) -> System.out.println(p.name + (showPhone)? p.phone : "")``\
принимают 2 аргумента, представляют собой операции, которые производятся над входными аргументами.

- **КОМПАРАТОРЫ (Comparators):**\
``Comparator<Person> comp = (Person o1, Person o2) -> o1.name.compareTo(o2.name);``
принимают один аргумент, сравнивают входящие аргументы.

---

###### ИЕРАРХИЯ ИСКЛЮЧЕНИЙ:
основные типы исключений **ERROR** и **EXCEPTION**. оба наследуются от класса **Throwable**.\
**ERROR** - согласно спецификации Java не следует обрабатывать поскольку они связаны с проблемами уровня JVM.\
**EXCEPTION** - делятся на checked и unchecked
- **checked exception** - должны обрабатываться блоком catch приер FileNotFoundException.
- **unchecked exception** - обрабатывать не рекомендуется. пример RuntimeException.

---

###### СВЯЗЫВАНИЕ:
**связывание** - это присоединение вызова метода к телу метода. если связывание происходит на этапе компиляции, то это раннее или статическое связывание. если связывание происходит на этапе runtime, то это позднее или динамическое связывание. Для всех методов Java используется именно позднее связывание, если только метод не был объявлен как final.