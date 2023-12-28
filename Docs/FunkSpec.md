# Funckionális specifikáció MeasureConverter Alkalmazás
## Célkitűzés

Az alkalmazás célja a felhasználók számára egyszerű és hatékony eszköz nyújtása mértékegységek közötti könnyű váltásra. A felhasználóknak lehetőségük van kényelmesen átváltani különböző mértékegységeket, például kilométert mérföldre, fontot kilogrammára, vagy éppen Celsiusból Fahrenheitbe.

Az alkalmazás modern és felhasználóbarát felülettel rendelkezik, hogy a felhasználók könnyen eligazodjanak és gyorsan elvégezhessék a kívánt mértékegységváltásokat. Az egyszerűség és funkcionalitás kombinációjával a MeasureConverter alkalmazás egy hasznos eszköz lehet mindennapi életünkben.

---

# Jelenlegi Helyzet

Az alkalmazás elkészítésének hátterében a következő igények és szükségletek állnak a megrendelő részéről:
- **Mértékegységváltások Gyors és Kényelmes Kezelése**
- **Univerzális Használhatóság**
- **Felhasználóbarát Felület**
- **Felhasználói Fiókok Kezelése**

---

# Követelménylista

|   | **Modul ID** | **Funkció**                                    | **Leírás**                                                                                      |   |
|---|--------------|------------------------------------------------|-------------------------------------------------------------------------------------------------|---|
|   |              | **Felhasználói Regisztráció és Bejelentkezés** |                                                                                                 |   |
|   | K1           | Felhasználói Regisztráció                      | A felhasználóknak lehetőségük van regisztrálni egy fiókot, megadva felhasználónevet és jelszót. Ha valamelyik adat ezek közül hiányzik akkor a felhasználó hibaüzenetet kap |   |
|   | K2           | Bejelentkezés                                  | A regisztrált felhasználók bejelentkezhetnek a rendszerbe felhasználónevével és jelszavával. Ha a megadott adatok nem megfelelőek akkor a felhasználó hibaüzenetet kap.| |
|   |              | **Mértékegységváltó Fülek**                    |                                                        |   |
|   | K3           | Kilométer - Mérföld                            | A felhasználó kilométert mérföldre válthat.            |   |
|   | K4           | Mérföld - Kilométer                            | A felhasználó mérföldből kilométerre válthat.          |   |
|   | K5           | MérföldPerÓra - KilométerPerÓra                | A felhasználó mérföld per órából kilométer per órára válthat.                  |   |
|   | K6           | KilométerPerÓra - MérföldPerÓra                | A felhasználó kilométer per órából mérföld per órára válthat.                  |   |
|   | K7           | Kilogramm - Font                               | A felhasználó kilogrammból fontba válthat.|   |
|   | K8           | Font - Kilogramm                               | A felhasználó fontból kilogrammra.|   |
|   | K9           | Celsius - Fahrenheit                           | A felhasználó Celsiusból Fahrenheitbe válthat.         |   |
|   | K10          | Fahrenheit - Celsius                           | A felhasználó Fahrenheitből Celsiusba válthat.         |   |
|   |              | **Felhasználói Kijelentkezés**                 |                                                        |   |
|   | K11          | Kijelentkezés                                  | A felhasználó bármikor kijelentkezhet az alkalmazásból.                                         |   |
|   |              | **Felhasználói Adatbázis**                     |                                                        |   |
|   | K12          | Felhasználói Adatok Tárolása                   | A felhasználók regisztrációjakor a rendszer tárolja felhasználónevüket és jelszavukat.|   |

---

# Jelenlegi üzleti folyamatok modellje

A mai világban az emberek gyakran szükségét érzik a mértékegységek közötti könnyű és gyors átváltásnak. Jelenleg az ilyen típusú igényeket véletlenszerű online keresésekkel különféle weboldalakon próbálják kielégíteni, ami nem mindig kényelmes vagy hatékony. Ezek gyakran nem rendelkeznek egységes és felhasználóbarát felülettel.

---

# Igényelt üzleti folyamatok modellje

Az alkalmazás használatával könnyedén és gyorsan végezhetők el a mértékegységváltások. Az alkalmazás azonnal visszajelzést Az időmegtakarítás is jelentős, mivel nincs szükség hosszú kalkulációkra vagy keresgélésre a megfelelő mértékegység megtalálásához. Az alkalmazás rugalmasan használható bárhonnan és bármikor, így a használatával a felhasználóknak egyszerűbb és könnyebb lesz a mértékegységváltásokkal kapcsolatos mindennapi tevékenységeik elvégzése.

--- 

# Használati Esetek és Forgatókönyv

A felhasználók első lépésként regisztrálnak az alkalmazásba, megadva egyedi felhasználónevet és jelszót. Ezután bejelentkeznek, és ezzel elérhetővé válnak számukra a mértékegységváltó fülek. A felhasználók egyszerűen kiválaszthatják a kívánt mértékegységváltást, és az alkalmazás azonnal visszajelzést ad a helyes átváltásról. Amikor a felhasználó befejezte a mértékegységváltást, bármikor kijelentkezhet, lezárva ezzel az aktuális munkamenetet.

---

# Képernyőtervek

## Regisztráció:
![image](https://github.com/SziliCs/MeasureConverter/assets/43788835/8b621e65-82e6-43ed-bd1b-c1473fb3b13e)

## Bejelentkezés:
![image](https://github.com/SziliCs/MeasureConverter/assets/43788835/e9e007e6-a83f-4255-97f1-dd1b43121b1a)

## Főoldal és fülek:
![image](https://github.com/SziliCs/MeasureConverter/assets/43788835/2652e621-bd3c-45cb-a7f5-faf6f8c9e2c0)

---


