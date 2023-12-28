# MeasureConverter tesztjegyzőkönyv - Bejelentkezés
## Tesztelést végezte: Csordás Szilveszter
## Operációs rendszer: Windows 10
## Dátum: 2023.12.28.
## Talált hibák száma: 0

## A grafikus felület helyes megjelenése
Az alkalmazás elindításakor a grafikus felület helyesen jelenik meg, minden felirat jól olvasható.  
*Elvárt eredmény:* a felület az ábrán látható módon jelenik meg. Az ablak átméretezése nem engedélyezett.  

![image](https://github.com/SziliCs/MeasureConverter/assets/150517090/18fe953a-8146-4629-8347-9cb71f1cd767)

## A bejelentkezési feltételek ellenőrzése
Található egy címke az oldalon, ami alapértelmezetten üres. Akkor jelenik meg benne szöveg, ha a felhasználó rákattint a Bejelentkezés gombra, de valamelyik adat hibás, vagy nincs kitöltve, ezért nem sikerült a bejelentkezés.  
- Egy lehetséges hiba, ha valamelyik mező üresen marad. Ekkor a program figyelmezteti a felhasználót, hogy adja meg a hiányzó adatokat.  
A hibaüzenet: **Adja meg a hiányzó adatokat!**  
Először nem adok meg semmilyen adatot, csak rákattintok a Bejelentkezés gombra.  
*Elvárt eredmény:* Hibaüzenet: Adja meg a hiányzó adatokat!

![image](https://github.com/SziliCs/MeasureConverter/assets/150517090/f8e2f442-4a62-4bdd-8d5c-13bd80a4c0fe)

- Megadok egy felhasználónevet, de jelszót nem. Rákattintok a Bejelentkezés gombra.  
*Elvárt eredmény:* Hibaüzenet: Adja meg a hiányzó adatokat!

![image](https://github.com/SziliCs/MeasureConverter/assets/150517090/7570ebc5-0ec1-4ce6-bb80-5098c8cf343b)

- Megadok egy jelszót, de felhasználónevet nem. Rákattintok a Bejelentkezés gombra.  
*Elvárt eredmény:* Hibaüzenet: Adja meg a hiányzó adatokat!

![image](https://github.com/SziliCs/MeasureConverter/assets/150517090/ccf7490a-d15a-42f6-b42e-baa3cb4d30fa)

- Egy másik lehetséges hiba, ha olyan adatokkal szeretne a felhasználó bejelentkezni, amellyel korábban nem regisztráltak. Ekkor a program figyelmezteti a felhasználót, hogy hibás bejelentkezési adatokat adott meg.  
A hibaüzenet: **Hibás bejelentkezési adatok!**  
Megadok egy felhasználónevet, és egy jelszót is, de ilyen adatokkal nincs regisztrált felhasználó az adatbázisban. Rákattintok a Bejelentkezés gombra.  
*Elvárt eredmény:* Hibaüzenet: Hibás bejelentkezési adatok!  

![image](https://github.com/SziliCs/MeasureConverter/assets/150517090/f4f8cd45-a62c-4510-8505-3628c065f041)

- Ha a felhasználó helyesen adja meg mindkét adatot, akkor a rendszer bejelentkezteti, és megjelenik a konvertáló ablak.  
Megadok egy felhasználónevet, és egy jelszót is, de ilyen adatokkal nincs regisztrált felhasználó az adatbázisban. Rákattintok a Bejelentkezés gombra.  
*Elvárt eredmény:* Sikeres bejelentkezés, megnyílik az alkalmazás konvertáló ablaka.

![image](https://github.com/SziliCs/MeasureConverter/assets/150517090/27d5a0bc-e791-4d9d-9d73-d5f246963e7f)

## A regisztrációs gomb működése
A bejelentkező felület jobb oldalán található még egy gomb, amely a bejelentkező oldalról a regisztrációs oldalra viszi át a felhasználót. A regisztrációs felület egy új ablakban nyílik meg.  
- Rákattintok a gombra, amely a regisztrációs oldalra visz. A grafikus felület helyesen jelenik meg, minden felirat jól olvasható.  
*Elvárt eredmény:* a felület az ábrán látható módon jelenik meg, egy új ablakban. Az ablak átméretezése nem engedélyezett.  

![image](https://github.com/SziliCs/MeasureConverter/assets/150517090/5a027197-3ef3-4481-b991-a2a7b6e22cbd)
