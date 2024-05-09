# Дипломный проект по профессии «Инженер по тестированию»

---

## Тестирование мобильного приложения «Мобильный хоспис»

[Ссылка на задание](https://github.com/netology-code/qamid-diplom)

---

## Описание приложения

Приложение даёт функционал по работе с претензиями хосписа и включает в себя:

- информацию о новостях и функционал для работы с ними;
- тематические цитаты;
- информацию о приложении.

---

## Документация

- [План тестирования](https://github.com/AlexeyKost/Diplom/blob/main/Plan.md)
- [Чек-лист](https://github.com/AlexeyKost/Diplom/blob/main/Check.xlsx)
- [Тест-кейсы](https://github.com/AlexeyKost/Diplom/blob/main/Cases.xlsx)
- [Отчет о тестировании](https://github.com/AlexeyKost/Diplom/blob/main/Result.md)

---

## Процедура запуска приложения и автотестов

---

- Клонировать репозиторий командой `git clone git@github.com:AleksandrMuzhev/qamid-diplom.git`;
- Открыть проект в Android Studio;
- Запустить приложение на эмуляторе Medium Phone API 29;
- Запустить тесты из командной строки`./gradlew connectedAndroidTest`;
- Подождать пока пройдут все тесты и посмотреть результат.

## Формирование отчета AllureReport

---

- Перейти к папке с тестами fmh-android\app\src\androidTest\java\ru\iteco\fmhandroid\ui\tests нажать ПКМ и выбрать Run 'Tests in 'ru.iteco.fmhandroid.ui.test' или комбинацией клавиш Ctrl+Shift+F10
- Выгрузить каталог `/data/data/ru.iteco.fmhandroid/files/allure-results` с эмулятора;
- Выполнить команду `allure serve`в терминале, находясь на уровень выше allure-results;
- Подождать генерации отчета и посмотреть его в открывшемся браузере.
