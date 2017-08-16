Mój projekt składa się z trzech klas: CacheItemClass, CacheViewClass i CacheClass które implementują odpowiadające im interfejsy.
Do przechowywania obiektów CacheItem użyłem tablicowej implementacji listy. Myślę, że lista wiązana również byłaby dobrym wyborem 
ze względu na częste dodawanie i usuwanie obiektów.

Problemem może być brak zagwarantowanej unikalności klucza CacheItemów, przez co w funkcji zwracającej obiekt zidentyfiokwany
po kluczu zwracalibyśmy tylko pierwsze jego wystąpienie.
