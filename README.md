# App 20 Shared Preferences
- A partir de l'App18_ViewModel de Pokemon

## Què fa?
Aquesta app és molt simple.
A partir de l'App18 que mostra el nom del pokemon que s'ha triat d'una llista, el que fa aquesta App és mostrar, a més del pokemon que s'ha triat, mostrar també l'anterior.
L'anterior es recupera de les SharedPreferences i, cada vegada que es tria un pokemon, es recupera l'anterior i actualitza el nou.  (veure DetailViewModel.init())
