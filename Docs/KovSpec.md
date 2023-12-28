# Követelmény specifikáció MeasureConverter Alkalmazás - Áttekintés
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

## 5. Jelenlegi üzleti folyamatok modellje
**Üzleti szereplők:**  
- megrendelő (vevő)
  
**Üzleti munkatárs:**  
- szállító
  
**Üzleti entitások:**  
- szállítmány (megrendelt termékek)  
- csomagolás  
- teherszállító gépjármű  
- szállítási jegyzőkönyv  
- kiadási jegyzőköny
  
**Üzleti folyamatok:**
- Szállítási jegyzőkönyv vezetése: a megrendelés alapján a jegyzőkönyvbe kerülnek a szállítmánnyal kapcsolatos információk (megnevezés, ár, szükség esetén egyéb tulajdonságok); a szállítás igényelt ideje (a megrendelő igénye); az indulási pont és a szállítási cél, valamint a kettő közti távolság => a szállítás során a szállító felvezeti a jegyzőkönyvbe a szállítással kapcsolatos információkat (például: késedelem, szállítmányban esett kár), szükség esetén feljegyzi az új várható szállítási időtartamot => a szállítmány kézbesítése után feljegyzi a tényleges szállítási időtartamot.
- Kiadási jegyzőkönyv vezetése: a jegyzőkönyvbe kerül a szállított termékek ára, szállítás alapdíja (ami a szállító munkadíja), a szállított termékek után fizetendő ÁFA,  valamint a szállítmány tömege után fizetendő adó => a szállítás során a szállító felvezeti a jegyzőkönyvbe a szállítással kapcsolatos egyéb költségeket, például a tankolt üzemanyag árát és a szállítás során keletkezett esetleges károk árát => a szállítmány kézbesítése után feljegyzi a megrendelő által fizetett összeget.
- Kommunikáció a megrendelővel: a megrendelő a megadott telefonszámra emlékeztető üzenetet (SMS-t) kap a várható szállítási időpont előtt egy órával, majd még egy emlékeztetőt kap a várható szállítási időpont előtt 10 perccel => a szállítás során felmerülő bármilyen késedelemmel vagy problémával kapcsolatosan szintén üzenetet kap a megrendelő => amennyiben a megrendelővel a szállítás menete közben bármilyen egyeztetés szükséges, a szállítő telefonon keresi a megrendelőt.

## 6. Igényelt üzleti folyamatok modellje
A cég nem kíván jelentős változtatásokat eszközölni a már alkalmazott és bevált üzleti folyamatokban.  
**Üzleti folyamatok:**
- Szállítási jegyzőkönyv vezetése: a megrendelés alapján a jegyzőkönyvbe kerülnek a szállítmánnyal kapcsolatos információk (megnevezés, ár, szükség esetén egyéb tulajdonságok); a szállítás igényelt ideje (a megrendelő igénye); az indulási pont és a szállítási cél, valamint a kettő közti távolság => a szállítás során a szállító felvezeti a jegyzőkönyvbe a szállítással kapcsolatos információkat (például: késedelem, szállítmányban esett kár), szükség esetén feljegyzi az új várható szállítási időtartamot => a szállítmány kézbesítése után feljegyzi a tényleges szállítási időtartamot.  
Belföldi szállítmányok esetében nem lesz változás a jegyzőkönyv vezetésében. **Külföldi szállítmányok esetében a Magyarországon használatos mértékegységek (kilométer, kilométer/óra, kilogramm, Celsius-fok) helyett a külföldi országokban használatos mértékegységeket (mérföld, mérföld/óra, font, Fahrenheit-fok) kell a jegyzőkönyvben alkalmazni.**  
- Kiadási jegyzőkönyv vezetése: a jegyzőkönyvbe kerül a szállított termékek ára, szállítás alapdíja (ami a szállító munkadíja), a szállított termékek után fizetendő ÁFA,  valamint  a szállítmány tömege után fizetendő adó => a szállítás során a szállító felvezeti a jegyzőkönyvbe a szállítással kapcsolatos egyéb költségeket, például a tankolt üzemanyag árát, a vámköltséget és a szállítás során keletkezett esetleges károk árát => a szállítmány kézbesítése után feljegyzi a megrendelő által fizetett összeget.  
Belföldi szállítmányok esetében nem lesz változás a jegyzőkönyv vezetésében. **Külföldi szállítmányok esetében a Magyarországon használatos mértékegységek (kilométer, kilométer/óra, kilogramm, Celsius-fok) helyett a külföldi országokban használatos mértékegységeket (mérföld, mérföld/óra, font, Fahrenheit-fok) kell a jegyzőkönyvben alkalmazni. Továbbá a szállítási díj külföldi szállítás esetén kiegészül a vámköltséggel.**  
- Kommunikáció a megrendelővel: a megrendelő a megadott telefonszámra emlékeztető üzenetet (SMS-t) kap a várható szállítási időpont előtt egy órával, majd még egy emlékeztetőt kap a várható szállítási időpont előtt 10 perccel => a szállítás során felmerülő bármilyen késedelemmel vagy problémával kapcsolatosan szintén üzenetet kap a megrendelő => amennyiben a megrendelővel a szállítás menete közben bármilyen egyeztetés szükséges, a szállítő telefonon keresi a megrendelőt.  
Belföldi szállítmányok esetében nem lesz változás a megrendelővel történő kommunikációban. **Külföldi szállítmányok esetében a Magyarországon használatos mértékegységek (kilométer, kilométer/óra, kilogramm, Celsius-fok) helyett a külföldi országokban használatos mértékegységeket (mérföld, mérföld/óra, font, Fahrenheit-fok) kell a megrendelőnek küldött üzenetben használni.**

## 7. Fogalomszótár
**Szállítási díj:** A szállítás díját számos tényező befolyásolja. A szállított termékek árán és az alapdíjon túl függ a távolságtól, amelyet a sofőrnek meg kell tennie, ebből kifolyólag nyilvánvalóan függ az üzemanyagáraktól, külföldi szállítás esetén a vámköltségektől, valamint lehetnek egyéb felmerülő költségek is.  
**Szállítási jegyzőkönyv:** minden, a azállítás menetével kapcsolatos információt ez a jegyzőkönyv tartalmaz. Leírja aszállíott termék tulajdonságait (megnevezés, ár, szükség esetén egyéb tulajdonságok); a szállítás igényelt idejét (a megrendelő igénye); az indulási pontot és a szállítási célt, valamint a kettő közti távolságot; a szállítás végeztével az igénybe vett tényleges időtartamot.  
**Kiadási jegyzőköny:** minden, a azállítás során felmerült költséget és kiadást ez a jegyzőkönyv tartalmaz. Ez elsősorban a szállított termékek árát, a szállító munkadíját és a tankolt üzemanyag árát jelenti, de kiegészülhet más költségekkel, például az ÁFA-val, a szállítmány tömege után fizetett adóval, külföldi szállítmány esetén a vámköltséggel, végül ide tartoznak a szállítás során keletkezett esetleges károk (akár a szállítmányban vagy a teherszállító gépjárműben esett károk).
