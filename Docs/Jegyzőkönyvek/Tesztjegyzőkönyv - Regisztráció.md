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

![image](https://github.com/SziliCs/MeasureConverter/assets/150517090/dd313eaf-e869-4828-8aab-0662ff400dd7)

- Megadok egy felhasználónevet és egy jelszót, de a jelszót csak egyszer adom meg. Rákattintok a Regisztráció gombra.  
*Elvárt eredmény:* Hibaüzenet: Adja meg a hiányzó adatokat!

![image](https://github.com/SziliCs/MeasureConverter/assets/150517090/6235e6d9-c997-4e9b-8411-5f2e1b998306)



