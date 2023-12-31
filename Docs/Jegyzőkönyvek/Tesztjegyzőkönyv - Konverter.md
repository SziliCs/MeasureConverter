# MeasureConverter tesztjegyzőkönyv - Konverter
## Tesztelést végezte: Csordás Szilveszter
## Operációs rendszer: Windows 10
## Dátum: 2023.12.28.
## Talált hibák száma: 0

## A grafikus felület helyes megjelenése
Bejelentkezés után a grafikus felület helyesen jelenik meg, minden felirat jól olvasható.  
*Elvárt eredmény:* a felület az ábrán látható módon jelenik meg. Az ablak átméretezése nem engedélyezett.  

![image](https://github.com/SziliCs/MeasureConverter/assets/150517090/27d5a0bc-e791-4d9d-9d73-d5f246963e7f)

A fenti fülekkel lehet váltani a különböző mértékegységek között.  
*Elvárt eredmény:* a füleken kattintva mindegyik felület az alábbi ábrákon látható módon jelenik meg.  

![image](https://github.com/SziliCs/MeasureConverter/assets/150517090/74f2a4b8-322a-4bee-9e23-ef839624bc94)

![image](https://github.com/SziliCs/MeasureConverter/assets/150517090/2437e2ad-c6ca-4135-aa85-9e306d9b5387)

![image](https://github.com/SziliCs/MeasureConverter/assets/150517090/eb92b054-e334-4b7d-9497-0ec24d414506)

![image](https://github.com/SziliCs/MeasureConverter/assets/150517090/c3229aee-8664-440f-a02a-b45446d3df42)

## A konvertáló felület működése
A MeasureConverter alkalmazás használata nagyon egyszerű. A felhasználónak mindössze ki kell választani a fenti füleken navigálva, hogy melyik mértékegység páros között szeretne átváltani. Majd a két beviteli mező valamelyikébe be kell írnia az átváltani kívánt értéket, és a másik mezőben megjelenik az átszámított érték.  
- Beírok egy értéket a konvertáló felület egyik mezőjébe.  
*Elvárt eredmény:* a program azonnal érzékeli, ha az egyik mező eddigi tartalma megváltozott, és minden további teendő (gombnyomás vagy az Enter billentyű leütése nélkül) már azonnal ki is számolja az átváltott értéket.  

![image](https://github.com/SziliCs/MeasureConverter/assets/150517090/ad9f2ec8-c7cf-4c66-8eeb-e47c983d8f9e)

- Beírok egy értéket a konvertáló felület másik mezőjébe.  
*Elvárt eredmény:* a program azonnal érzékeli, ha a mező eddigi tartalma megváltozott, és azonnal ki is számolja az átváltott értéket.

![image](https://github.com/SziliCs/MeasureConverter/assets/150517090/34506bbf-05c5-428a-8d4d-364bf6a820af)

- A többi konvertáló fülön is kipróbálom a konvertálást, előbb az egyik, majd a másik mezőbe írok be egy értéket.  
*Elvárt eredmény:* a program azonnal érzékeli, ha a mező eddigi tartalma megváltozott, és azonnal ki is számolja az átváltott értéket.  

- Ezúttal törtszámot írok a mezőbe, mert természetesen nem csak egész értékeket szükséges konvertálni.  
*Elvárt eredmény:* a program azonnal érzékeli, ha a mező eddigi tartalma megváltozott, és azonnal ki is számolja az átváltott értéket.  

![image](https://github.com/SziliCs/MeasureConverter/assets/150517090/0395fff5-5405-4c6e-b3d8-37646bc13be6)

- Megnyomom az oldalon található Törlés gombot.  
*Elvárt eredmény:* a beviteli mezők értékei törlődnek.  

![image](https://github.com/SziliCs/MeasureConverter/assets/150517090/86a2ace2-b974-46e8-9736-c9972a4073fe)

## A Kijelentkezés gomb működése
A konvertáló felület Kijelentkezés fülén található még egy gomb, amely a kijelentkezteti, és a konvertáló oldalról a bejelentkező oldalra viszi vissza a felhasználót. A konvertáló felület bezáródik, és ismét látható a bejelentkező felület.  
- Rákattintok a Kijelentkezés fülön található Kijelentkezés gombra, amely a bejelentkező oldalra visz. A grafikus felület helyesen jelenik meg, minden felirat jól olvasható.  
*Elvárt eredmény:* a felület az ábrán látható módon jelenik meg, egy új ablakban. Az ablak átméretezése nem engedélyezett.  

![image](https://github.com/SziliCs/MeasureConverter/assets/150517090/18fe953a-8146-4629-8347-9cb71f1cd767)
