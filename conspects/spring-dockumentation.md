**Spring framework**\
является реализацией принципа инверсии контроля (IoC).

---

**IoC**\
процесс когда <ins>Beans</ins> сами определяют свои зависимости, а <ins>Spring Container</ins> берет на себя ответственность за управлением их жизненным циклом. Этот процесс позволяет достичь слабой связности между объектами.

---

**Spring Framework IoC Container**\
основные пакеты:\
``org.springframework.beans``\
``rg.springframework.context``

---

**BeanFactory**\
интерфейс предоставляет базовую функциональность и конфигурацию фреймворка. Также позволяет регистрировать бины из-за пределов контейнера

---

**ApplicationContext**\
наследует от <ins>BeanFactory</ins> и представляет собой **Spring Container (IoC)**.\
Этот интерфейс ответственный за:\
``создание``\
``конфигурацию``\
``композицию бинов``

---

**Beans**\
объекты составляющие основу приложения, жизненным циклом которых управляет <ins>IoC</ins>.\
Описание ``бинов`` и ``Dependencies`` между ними отражаются в ``Bean Metadata``, которую использует <ins>IoC</ins>. 

---

**Dependencies**\
это другие объекты или свойства, с которыми взаимодействует <ins>Bean</ins>. Зависимости в Bean могут быть установлены:\
``через аргументы конструктора``\
``через аргументы фабричного метода``\
``через properties``

---

**Bean Metadata**\
это метаданные, которые содержат информацию о том как <ins>IoC</ins> должен сконфигурировать <ins>Bean</ins>. есть разные способы конфигурации бина:\
``XML configuration``\
``Groovy based configuration``\
``Annotation based configuration JSR-250 (Spring)``\
``Java based configuration JSR-330 (Java)``

---

**BeanDefinition**\
это представление ``Bean`` и ``Bean Metadata`` внутри <ins>IoC</ins>. и по сути является рецептом для создания бина.\
BeanDefinition содержит следующую информацию:

| Property                 | Link                     |
|:-------------------------|:-------------------------|
| Class                    | Instantiating Beans      |
| Name                     | Naming Beans             |
| Scope                    | Bean Scope               |
| Constructor arguments    | Dependency Injection     |
| Properties               | Dependency Injection     |
| Autowiring mode          | Autowiring Collaborators |
| Lazy initialization mode | Lazy-initialized Beans   |
| Initialization method    | Initialization Callbacks |
| Destruction method       | Initialization Callbacks |

---

**Создание контекста** выглядит следующим образом:\
``ApplicationContext context = new ClassPathXmlApplicationContext("services.xml", "daos.xml");``

---

**Получить bean из контекста** можно следующим образом:\
``SomeService service = context.getBean("someService", SomeService.class);``\
*Однако делать этого не стоит, кроме как для тестовых целей или дебага.

---

``ApplicationContext`` позволяет регистрировать бины, из за пределов контейнера. Сделать это можно используя ``BeanFactory``.\
вызвать фабрику можно используя метод:\
``ApplicationContext.getBeanFactory()``.\
зарегистрировать бин можно используя метод:\
``registerSingleton() и registerBeanDefinition().``\
Этот механизм позволяет переопределять бины и метаданные в <ins>runtime</ins>, а также создавать новые. Но хотя создание новых бинов в <ins>runtime</ins> возможно, но не рекомендовано, тк велик шанс схватить <ins>ConcurrentAccessException</ins> или запороть консистентность <ins>bean контейнера</ins>, или все вместе.\
*Однако несмотря на возможность переопределять бины или создавать новые в runtime, большинство приложений не используют этот функционал, тк этот механизм череват ошибками.

---

**Naming Beans:**\
каждый ``bean`` имеет один или более идентификаторов. В рамках одного <ins>IoC</ins> идентификатор бина должен быть уникальным. Но если предполагается использовать несколько бинов одного типа - дополнительные бины должны быть именованы вручную.\
Используя конфигурацию, основанную на аннотациях - предпочтительно возложить обязанность именования на <ins>IoC</ins>, тк он способен самостоятельно именовать бины, если этого не сделаем мы.\
Более того, Spring лучше справится с этой задачей особенно в случае с использованием ``Inner Beans`` и ``Autowiring Collaborators``.\
Название бинам дается на этапе ``Сomponent scanning``\
Для именования бинов в Spring принято использовать Java конвенцию. Пример ``userDao``

---

**Instantiating Beans**\
под капотом создание бина работает следующим образом:

Instantiation with a Constructor:\
<ins>IoC</ins> получает <ins>Сlass</ins> будущего бина из ``BeanDefinition`` и используя рефлексию вызывает его конструктор. Это очень похоже на использование ключевого слова <ins>new</ins> в Java.

Instantiation with a Static Factory Method:\
для создания бина на базе статичного фабричного метода, <ins>IoC</ins> должен знать ``Class`` фабрики и ``метод``, который возвращает нужный нам объект.

Instantiation by Using an Instance Factory Method:\
для создания бина на базе статичного фабричного экземрляра, <ins>IoC</ins> вызывает фабричный метод существующего бина.\
<ins>IoC</ins> должен знать имя ``bean``, содержащего <ins>фабричный метод</ins> и <ins>название метода</ins>, который возвращает нужный нам объект.\
Этот подход показвыает, что самим фабричным компонентом можно управлять посредством внедрения зависимостей.

Instantiation of a Nested static class:\
Для конфигурации ``BeanDefinition`` для ``Nested`` класса, <ins>IoC</ins> должен знать имя Nested класса.\
Можно указать имя следующим способом: ``com.example.SomeThing.OtherThing`` или ``com.example.SomeThing$OtherThing``

Determining a Bean’s Runtime Type:\
``Runtime type`` определить непросто, тк указанный класс в метаданных компонента, это лишь ссылка на порождающий класс. В случае если бин был создан через <ins>статичный фабричный метод</ins>.\
Определение ``Runtime Type`` может быть невозможно, в случае если бин был создан через <ins>фабричный метод экземпляра</ins>.

---



