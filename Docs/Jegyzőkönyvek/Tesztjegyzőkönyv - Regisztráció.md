# MeasureConverter tesztjegyzőkönyv - Regisztráció
## Tesztelést végezte: Csordás Szilveszter
## Operációs rendszer: Windows 10
## Dátum: 2023.12.28.
## Talált hibák száma: 0

## A grafikus felület helyes megjelenése
A bejelentkező ablakból a gombra való kattintáskor a grafikus felület helyesen jelenik meg, minden felirat jól olvasható.  
*Elvárt eredmény:* a felület az ábrán látható módon jelenik meg. Az ablak átméretezése nem engedélyezett.  

![image](https://github.com/SziliCs/MeasureConverter/assets/150517090/f59512f4-1b82-4cf8-be94-108fb7842b98)

## A regisztrációs feltételek ellenőrzése
Található egy címke az oldalon, ami alapértelmezetten üres. Akkor jelenik meg benne szöveg, ha a felhasználó rákattint a Regisztráció gombra, de valamelyik adat hibás, vagy nincs kitöltve, ezért nem sikerült a regisztráció.  
- Egy lehetséges hiba, ha valamelyik mező üresen marad. Ekkor a program figyelmezteti a felhasználót, hogy adja meg a hiányzó adatokat.  
A hibaüzenet: **Adja meg a hiányzó adatokat!**  
Először nem adok meg semmilyen adatot, csak rákattintok a Regisztráció gombra.  
*Elvárt eredmény:* Hibaüzenet: Adja meg a hiányzó adatokat!

![image](https://github.com/SziliCs/MeasureConverter/assets/150517090/8b3ad27e-3454-4ba3-82fa-a51b280e92d4)

- Megadok egy felhasználónevet, de jelszót nem. Rákattintok a Regisztráció gombra.  
*Elvárt eredmény:* Hibaüzenet: Adja meg a hiányzó adatokat!

![image](https://github.com/SziliCs/MeasureConverter/assets/150517090/feea8efc-fc39-4b21-9d6a-0e62256494ca)

- Megadok egy jelszót, de felhasználónevet nem. Rákattintok a Regisztráció gombra.  
*Elvárt eredmény:* Hibaüzenet: Adja meg a hiányzó adatokat!

![image](https://github.com/SziliCs/MeasureConverter/assets/150517090/222160d9-2e38-44b0-bfdf-694c661aae68)

- Megadok egy felhasználónevet és egy jelszót, de a jelszót csak egyszer adom meg. Rákattintok a Regisztráció gombra.  
*Elvárt eredmény:* Hibaüzenet: Adja meg a hiányzó adatokat!

![image](https://github.com/SziliCs/MeasureConverter/assets/150517090/1e67245a-b301-4c4a-a0a0-67209113d83c)

- Egy másik lehetséges hiba, ha a felhasználó nem ugyanazt a jelszót adja meg a két jelszómező valamelyikében. Ekkor a program figyelmezteti a felhasználót, hogy a két jelszó nem egyezik.
A hibaüzenet: **A két jelszó nem egyezik!**  
Megadok minden adatot, de a két jelszómezőbe eltérő jelszót írok. Rákattintok a Regisztráció gombra.  
*Elvárt eredmény:* Hibaüzenet: A két jelszó nem egyezik!

![image](https://github.com/SziliCs/MeasureConverter/assets/150517090/48021b6d-a268-4eda-984c-76c9bf061764)

- Ha a felhasználó helyesen adja meg mindhárom adatot, akkor a rendszer leregisztrálja.  
Megadok egy felhasználónevet, és egy jelszót kétszer, a két jelszómezőbe azonos jelszót írok. Rákattintok a Regisztráció gombra.  
*Elvárt eredmény:* Üzenet: Sikeres regisztráció! A beviteli mezők értékei törlődnek.

![image](https://github.com/SziliCs/MeasureConverter/assets/150517090/5a97ed6b-8ed6-4789-9b18-125d559ad0d8)

## A Vissza gomb működése
A regisztrációs felület bal alsó részén található még egy gomb, amely a regisztrációs oldalról a bejelentkező oldalra viszi vissza a felhasználót. A regisztrációs felület bezáródik, és ismét látható a bejelentkező felület.  
- Rákattintok a Vissza gombra, amely a bejelentkező oldalra visz. A grafikus felület helyesen jelenik meg, minden felirat jól olvasható.  
*Elvárt eredmény:* a felület az ábrán látható módon jelenik meg, egy új ablakban. Az ablak átméretezése nem engedélyezett.  

![image](https://github.com/SziliCs/MeasureConverter/assets/150517090/18fe953a-8146-4629-8347-9cb71f1cd767)

