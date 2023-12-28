# Rendszerterv
# A rendszer célja

Az alkalmazás célja a felhasználók számára egyszerű és hatékony eszköz nyújtása mértékegységek közötti könnyű váltásra. A felhasználóknak lehetőségük van kényelmesen átváltani különböző mértékegységeket, például kilométert mérföldre, fontot kilogrammára, vagy éppen Celsiusból Fahrenheitbe.

---

# Projektterv
### Szerepkörök és felelősségek:
**Product owner:**\
Csordás Szilveszter - Feladata a priorizálás és üzleti kommunikáció a megrendelő felé. Közvetíti a követelményeket a csapat felé és riportál a vevőnek is.\
**Scrum master:**\
Póta László - Feladata, hogy kommunikáljon a csapattal, a sprint időszakán belül daily meeting-eken az elvégzett és a következő feladatokat átbeszélése.

**Frontend:**\
Csordás Szilveszter\
Póta László

**Backend:**\
Csordás Szilveszter\
Póta László

**Tesztelés:**\
Csordás Szilveszter

### Ütemterv

|   |      Funkció / Story      |            Feladat / Task           | Prioritás | Becslés | Aktuális Becslés | Eltelt idő | Hátralévő idő |   |
|---|:-------------------------:|:-----------------------------------:|:---------:|:-------:|:----------------:|:----------:|:-------------:|---|
|   | Követelmény specifikáció  |                                     | 0         | 5       | 5                | 5          | 0             |   |
|   | Funkcionális specifikáció |                                     | 0         | 5       | 5                | 5          | 0             |   |
|   | Rendszerterv              |                                     | 0         | 5       | 2.5              | 5          | 0             |   |
|   | Adattárolás               | Adatbázis megvalósítása a szerveren | 1         | 1       | 1                | 5          | 0             |   |
|   | Alkalmazás                | Képernyőtervek elkészítése          | 2         | 1       | 1                | 5          | 0             |   |
|   | Alkalmazás                | Prototípus elkészítése              | 2         | 3       | 3                | 5          | 0             |   |
|   | Alkalmazás                | Adatbázis létrehozása               | 2         | 1       | 1                | 5          | 0             |   |
|   | Alkalmazás                | Menüstruktúra elkészítése           | 2         | 5       | 5                | 5          | 0             |   |
|   | Alkalmazás                | Kezdőlap funkciók elkészítése       | 2         | 5       | 5                | 5          | 0             |   |
|   | Alkalmazás                | Login funkció megvalósítás          | 2         | 5       | 5                | 5          | 0             |   |
|   | Alkalmazás                | Tesztelés                           | 2         | 5       | 5                | 5          | 0             |   |

### Mérföldkövek
- Adatbázis létrehozása
- Prototípus bemutatása
- Szoftver tesztelése
- Átadás a megrendelő részére

---

# Üzleti folyamatok modellje
Bejelentkezés mindenki számára ugyanolyan lefutású, az alkalmazás indításakor megjelenik ’Felhasználó név’ és ’Jelszó’ beviteli mező. A mezők kitöltése után a ’Belépés’ gombra kattint a felhasználó. Ha az azonosítás sikeres, akkor a felhasználó bejelentkezett és megjelenik minden menüsor. Ha nem sikerül az azonosítás, hibaüzenet jelenik meg.

---

# Követelmények
### Funkcionális követelmények
A felhasználóknak lehetőségük van egyedi felhasználónévvel és jelszóval regisztrálni az alkalmazás használatához. Bejelentkezés után pedig automatikusan hozzáférnek a szoftver teljes funkcionalitásához megkötés nélkül. Az intuitív és felhasználóbarát felületen elérhető minden konverzió tömeg, távolság, és sebesség tekintetében egyaránt.

### Nem-funkcionális követelménye
Használhatósági követelmények:/
A fejlesztésre kerülő szoftver a potenciális felhasználók számára könnyen tanulható és használható, minimális informatikai tudással alkalmazható./
Teljesítmény követelmények:/
Az alkalmazás nem igényel semmilyen speciális hardvert így minden számítógépen képes futni./
Méret követelmények:/
A szoftver mérete nem haladja meg az 10 Megabyte-ot./
Szállítási követelmények:/
A szoftver a szerződésben meghatározozott időpontig kerül átadásra, ellenkező esetben a szerződésben található kötbér illeti meg a megrendelőt./
Implementációs követelmények:/
A program a szerződésben meghatározott gépekre kerül telepítésre, a felhasználók számára teljesen használatra készen, az adatbázisba előre felvételre kerülnek teszt-felhasználók is./
Együttműködési követelmények:/
A szoftverfejlesztő cég szakamberei és a megrendelő közötti kapcsolattartást a szerződésben meghatározott személyek végzik./
Titokvédelmi követelmények:/
A fejlesztő cég munkatársai vállalják, hogy a sem a megrendelő dolgozóinak, sem harmadik fél számára nem adnak át semmilyen adatot./
Biztonsági követelmények:/
A szoftverfejlesztés során a felhasználók számára egylépcsős beléptetési rendszer lesz implementálva./

Jogi követelmények:/

>  2018. évi LIV. törvény az üzleti titok védelméről
> 
>  2015. évi CCXXII. törvény az elektronikus ügyintézés és a bizalmi szolgáltatások általános szabályairól
> 
>  1995. évi LXVI. törvény a köziratokról, a közlevéltárakról és a magánlevéltári anyag védelméről
> 
>  73/2018. (IV. 20.) Korm. rendelet a helyi közszolgáltatás információs rendszerről
> 
> 187/2015. (VII. 13.) Korm. rendelet az elektronikus információs rendszerek biztonsági felügyeletét ellátó hatóságok,
> valamint az információbiztonsági felügyelő feladat- és hatásköréről, továbbá a zárt célú elektronikus információs rendszerek
> meghatározásáról
> 
> 335/2005. (XII. 29.) Korm. rendelet a közfeladatot ellátó szervek iratkezelésének általános követelményeiről
> 
> Az ISO / IEC 12207 a nemzetközi szabvány, amely tartalmazza a szoftver életciklusának kiválasztási, bevezetési és ellenőrzési
> módszerét.
> 
> Az ISO 9000 leírja a termékek előállításának hivatalosan szervezett folyamatát, valamint az előrehaladás irányításának és 
> nyomon követésének módszereit.
> 
> Az ISO / IEC 24744 szoftverfejlesztés - Metamodel for Development Methodologies, egy Powertype-alapú metamodell
> szoftverfejlesztési módszertanhoz.
> 
> ISO / IEC 15504 Információs technológia — folyamatértékelés, más néven a szoftverfolyamat-fejlesztési képesség meghatározása
> (SPICE), "a szoftverfolyamatok értékelésének kerete".

---

# Rendszerhasználati esetek és lefutásaik

Egyszerű felhasználóval rendelkezik csak az alkalmazás, nincsenek különböző jogkörök ezzel is egyszerűsítve a működést./
### Példa használat:
![Megnevezetlen diagram drawio](https://github.com/SziliCs/MeasureConverter/assets/43788835/70034409-429b-4f67-9f3b-4eb3ceb7bd54)

---

# Fizikai környezet

- Nincsenek megvásárolt komponenseinek.
- Az alkalmazás Windows platformra készült.
- Adatbázisszerverhez kapcsolódik közvetlenül az alkalmazás.

Fejlesztő eszközök:/
- MySQL Workbench.
- IntelliJ IDEA.

---

# Architekturális terv

Az Apache http szerveren futó adatbázis szolgálja ki a rendszer felhasználóit, itt kerülnek tárolásra a felhasználók bejelentkezési adatai. A szervert kizárólag az alkalmazáson keresztül lehet elérni. Az alkalmazás egy futtatható .exe állomány segítségével indítható el. A szoftver használatához semmilyen külső szoftver és telepítendő állomány nem szükséges.

---

# Implementációs terv

Az alkalmazás létrehozása kizárólag Java nyelven történik. Amennyire lehetséges az osztályokat külön fájlokba szervezzük. Az alkalmazás képes lesz kommunikálni a hozzákapcsolt adatbázis szerverrel, oda adatot küldeni és onnan adatot olvasni.

---

# Tesztterv

A tesztelések célja a rendszer és a komponensei funkcionalitásának teljes vizsgálata, ellenőrzése, a rendszer által megvalósított üzleti szolgáltatások verifikálása. A tesztelés igény szerint elvégezhető különböző hardveres környezetben. A tesztelés során használt hardverek a napjainkban általánosan elterjedt hardverkonfigurációjú PC-k, laptopok. A tesztelés során a folyamatokhoz tartozó különböző forgatókönyvek eredményét vizsgáljuk. Amennyiben az elvártnak megfelelő eredményt kapjuk a teszteset sikeresnek tekinthető, ellenkező esetben a hibát rögzítjük a jegyzőkönyvben. A teszt során elkészült jegyzőkönyveket mellékeljük a megrendelő részére. Hibatalálat esetén a szoftver kódja javításra kerül, majd ezután újból teljeskörűen teszteljük a szoftvert.

---

# Telepítési terv

- Szükség van egy adatbázis szerverre amelynek az elérése közvetlenül történik az alkalmazásból.
- Elvárás a Windows környezet az alkalmazás futtatásához.
- Külön telepítést nem igényel az alkalmazás.
