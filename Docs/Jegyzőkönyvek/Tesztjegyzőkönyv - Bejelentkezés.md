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

kép

- Megadok egy jelszót, de felhasználónevet nem. Rákattintok a Bejelentkezés gombra.  
*Elvárt eredmény:* Hibaüzenet: Adja meg a hiányzó adatokat!

kép

Folytatás
