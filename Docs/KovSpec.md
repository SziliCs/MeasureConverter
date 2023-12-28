# Követelmény specifikáció
## 1. Vezetői összefoglaló
Egy szállítmányozási cég nemrégiben nemzetközi piacra lépett, és már külföldi országokba is vállalnak szállítást. Azonban nehézségeik adódtak a Magyarországon használatos mértékegységek (kilométer, kilométer/óra, kilogramm, Celsius-fok) és a külföldi országokban használatos mértékegységek (mérföld, mérföld/óra, font, Fahrenheit-fok) közötti átváltásokkal kapcsolatban. Mivel a képletek törtszámokat tartalmaznak, így nehezen megjegyezhetőek az alkalmazottak számára. 
Cégünket azzal a megbízással keresték meg, hogy készítsünk egy könnyen kezelhető, egyszerűen használható alkalmazást, amellyel az alkalmazottak a képletek megtanulása nélkül is gond nélkül átválthatják az értékeket.

## 2. Jelenlegi helyzet leírása
Jelenleg a szállítmányozási cégnek nem áll rendelkezésére olyan alkalmazás, amellyel a számukra fontos mértékegységek között az átváltásokat egyszerűen meg lehetne oldani. A szállítás során internetkapcsolat sem áll folyamatosan rendelkezésre, így az online felületek használata nem nyújt kielégítő megoldást.

## 3. Vágyálomrendszer leírása
A cél az, hogy a sofőrök szállítás közben könnyedén újra tudják kalkulálni a hátrelévő távolság és a jelenlegi sebesség alapján az érkezési időt, valamint a felmerülő költségek függvényében a szállítási díjat. Valamint azt is fontos tudniuk, hogy mekkora tömegű árut szállítanak, a lehetséges vámköltségek miatt. Ehhez személyre szabott alkalmazást szeretnének igénybe venni, amely minden bonyolultságot mellőzve, csak az általuk fontosnak ítélt mértékegységek között végez átváltást mindkét irányba. Igény esetén az alkalmazásban átváltható mértékegységek köre legyen bővíthető. Fontos feltétel még, hogy az alkalmazás használatához ne legyen szükség internetkapcsolatra.
Azonban a cég nem szeretné, hogy az engedélyük nélkül bárki használhassa a számukra készített alkalmazást. Ezért a felhasználóknak a használat előtt be kell jelentkeznie az alkalmazásba. A program egy adatbázisból ellenőrzi, hogy a bejelentkezési adatok megfelelőek-e. Lehetőség lesz regisztrációra, ehhez egy külön ablak fog megjelenni, ahol meg kell adni a szükséges adatokat, ezután az új felhasználó adatai is az adatbázisban tárolódnak. Csak felhasználónév és jelszó lesz eltárolva, további adatokra az alkalmazottak hitelesítéséhez nincs szükség.

## 4. Követelménylista
-	Könnyű kezelhetőség, egyszerű használhatóság.
-	Pontos számítások, megbízhatóság.
-	Ne igényeljen internetkapcsolatot.
-	Átváltás kilométer és mérföld között.
-	Átváltás kilométer/óra és mérföld/óra között.
-	Átváltás kilogramm és font között.
-	Átváltás Celsius-fok és Fahrenheit-fok között.
-	Az átváltások automatikusan történjenek meg valamely érték beírása után.
-	Az átváltások mindkét irányba működjenek.
-	Az egyes mértékegység párok között gyorsan lehessen váltani.
-	Lehetőség legyen a beírt értékeket egyszerre kitörölni.
-	Az alkalmazás használatához szükséges legyen bejelentkezni, a cég adminisztrátorai egy adatbázisból kezelni tudják, ki használhatja a rendszert.
-	Bejelentkezés és regisztráció során a felmerülő hibákat egyértelműen jelezze a program.


