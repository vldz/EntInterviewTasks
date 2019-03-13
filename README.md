# EntInterviewTasks

Poniżej znajdziesz dwa zadania do wykonania. Stworzony kod proszę o umieszczenie na github, bitbucket lub w dowolnym innym repozytorium kodu opartym o GIT. Czas realizacji nie ma większego znaczenia, znaczenie ma dokładność wykonania, obsługa błędów, wyjątków oraz testy jednostkowe (szczególnie w przypadku zadania 1.). W przypadku problemów z realizacją któregoś zadania po prostu je omiń.

	Zadanie 1. Aplikacja RESTowa – Java, Spring, Gradle, Maven
Celem zadania jest wykorzystanie frameworka spring oraz gradle lub maven do stworzenia aplikacji obsługującej 3 endpointy restowe.
	
	Endpoint 1. GET na ścieżce /status/ping nie przyjmujący żadnych parametrów, który odpowiada na sztywno stringiem „pong”
	Endpoint 2. POST na ścieżce /numbers/sort-command umożliwiający sortowanie liczb. Endpoint przyjmuje jako body obiekt zawierający listę liczb do posortowania oraz informacje czy sortowanie ma być rosnące czy malejące. Jako odpowiedź zwraca odpowiedni kod http oraz obiekt zawierający posortowaną listę liczb
Przykładowe body: {
numbers: [1, 5, 3, 9, 7],
order: ”ASC” }
Odpowiedź: {
numbers: [1, 3, 5, 7, 9] }
Uwagi:
- pole numbers może być puste lub może przyjąć wartość null
- pole order przyjmuje wartości ASC oraz DESC
- w przypadku błędnych danych aplikacja powinna zwrócić odpowiedni kod http
	Endpoint 3. POST na ścieżce /currencies/get-current-currency-value-command umożliwiający pobranie z NBP aktualny kurs danej waluty. Endpoint przyjmuje jako body obiekt zawierający kod waluty. Jako odpowiedź zwraca odpowiedni kod http oraz obiekt zawierający informacje o aktualnym kursie waluty.
Przykładowe body: {
currency: ”EUR” }
Odpowiedź: {
value: 4.2954 }
Uwagi:

- zadaniem aplikacji jest połączyć się z NBP po API dostępnym pod adresem http://api.nbp.pl/ (dla ułatwienia chodzi o konkretny endpoint pod adresem http://api.nbp.pl/api/exchangerates/tables/A? format=json). Następnie pobrać kurs waluty zgodnie z parametrem z żądania i zwrócić jego wartość - w przypadku podania nieistniejącej waluty należy zwrócić odpowiedni kod oraz wyjątek

	Zadanie 2. Front end webowy – Javascript, Angular, Angular 2, HTML, jQuery
Celem zadania jest stworzenie prostego interfejsu webowego (strony html) umożliwiającej wprowadzenia listy liczb. Strona ma umożliwiać następnie:
- przesłanie liczb do stworzonego w poprzednim zadaniu endpointu, który je posortuje
- wyświetlenie wyniku
Technologia do stworzenia strony jest dowolna, może to być angular, może być jquery lub coś innego. Nie ma to znaczenia. Wygląd interfejsu może być dowolny, może to być jedno pole, może być więcej.
   
