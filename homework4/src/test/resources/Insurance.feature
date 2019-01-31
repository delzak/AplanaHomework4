#language: ru

Функционал: Страхование

  Сценарий: Страхование при путешествиях и покупках

    Когда выбран пункт меню "Страхование"
    И выбран раздел "Путешествия и покупки"
    И выполнена проверка наличия заголовка "Страхование путешественников" на странице
    Тогда выполнено нажатие на кнопку - Оформить онлайн

    Когда выбран полис на сумму страховой защиты – Минимальная
    Тогда выполнено нажатие кнопки - Оформить

    Когда заполняются поля:
      |Фамилия застрахованного|Surname|
      |Имя застрахованного|Name|
      |Дата рождения застрахованного|01.01.1991|
      |Фамилия страхователя|Фамилия|
      |Имя страхователя|Имя|
      |Отчество страхователя|Отчество|
      |Дата рождения страхователя|01.01.1991|
      |Серия паспорта|1111|
      |Номер паспорта|222222|
      |Дата выдачи|01.02.2012|
      |Кем выдан|Выдан людьми из паспортного стола|

    Тогда проверяются поля:
      |Фамилия застрахованного|Surname|
      |Имя застрахованного|Name|
      |Дата рождения застрахованного|01.01.1991|
      |Фамилия страхователя|Фамилия|
      |Имя страхователя|Имя|
      |Отчество страхователя|Отчество|
      |Дата рождения страхователя|01.01.1991|
      |Серия паспорта|1111|
      |Номер паспорта|222222|
      |Дата выдачи|01.02.2012|
      |Кем выдан|Выдан людьми из паспортного стола|

    Когда выполнено нажатие кнопки - Продолжить
    Тогда выполнена проверка появления сообщения об ошибке "Заполнены не все обязательные поля"

