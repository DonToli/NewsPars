Учебное приложение по парсингу новостей.

В проекте использую JSoup, и сохраняю в базе данных используя Spring Data JPA. 
Задача по парсингу запускается автоматически используя Scheduler. 
Также используется Spring Boot как каркас приложения для построение REST API. 
Приложение использует слоенную архитектуру, разделяет на Модели - для маппинга Java объектов с объектами в Базе Данных. 
Использует Репозитории, для работы с запросами в Базе Данных. 
Использует Сервисы для хранения бизнес логики, и слой Контроллера, чтобы отдавать REST API клиентам.