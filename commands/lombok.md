Полный список аннотаций **lombok** с описанием можно найти [по ссылке](https://projectlombok.org/features/)

| annotation                                                                 | description                                                                                        |
|:---------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------|
| [@NonNull](https://projectlombok.org/features/NonNull)                     | для валидации метода или конструктора                                                              |
| [@Getter](https://projectlombok.org/features/GetterSetter)                 | сгененрирует геттер для аннотированного поля                                                       |
| [@Setter](https://projectlombok.org/features/GetterSetter)                 | сгененрирует сеттер для аннотированного поля                                                       |
| [@ToString](https://projectlombok.org/features/ToString)                   | сгенерирует метод toString                                                                         |
| [@EqualsAndHashCode](https://projectlombok.org/features/EqualsAndHashCode) | сгенерирует методы equals и hashcode                                                               |
| [@NoArgsConstructor](https://projectlombok.org/features/constructor)       | сгенерирует конструктор по умолчанию                                                               |
| [@AllArgsConstructor](https://projectlombok.org/features/constructor)      | сгенерирует конструктор для всех полей класса                                                      |
| [@RequiredArgConstructor](https://projectlombok.org/features/constructor)  | сгенерирует конструктор для всех **final** полей класса                                            |
| [@Data](https://projectlombok.org/features/Data)                           | сгенерирует **getter, setter** для всех полей а также **equals** и **hashcode**                    |
| [@Builder](https://projectlombok.org/features/Builder)                     | предоставит реализацию паттерна **builder** для ннотированного класса                              |
| [@SneakyThrows](https://projectlombok.org/features/SneakyThrows)           | обернет метод в **try catch** и вместо **CheckedException** выбросит RuntimeException              |
| [@Synchronized](https://projectlombok.org/features/Synchronized)           | используется для синхронизации метода                                                              |
| [@With](https://projectlombok.org/features/With)                           | это **setter** для **immutable** класса. отличие в том, что **with** вернет новый экземпляр класса |
| [@Log](https://projectlombok.org/features/log)                             | создаст экземпляр лога для аннотированного класса                                                  |
| [@Cleanup](https://projectlombok.org/features/Cleanup)                     | аннотация для класса имплементироующего **Closable** заменяет **try with resources**               |