# Funckionális specifikáció MeasureConverter Alkalmazás - Áttekintés

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
|   | K5           | MérföldPerOra - KilometerPerOra                | A felhasználó mérföld per órából kilométer per órára válthat.                  |   |
|   | K6           | KilométerPerOra - MérföldPerOra                | A felhasználó kilométer per órából mérföld per órára válthat.                  |   |
|   | K7           | Kilogramm - Font                               | A felhasználó kilogrammból fontba válthat.|   |
|   | K8           | Font - Kilogramm                               | A felhasználó fontból kilogrammra.|   |
|   | K9           | Celsius - Fahrenheit                           | A felhasználó Celsiusból Fahrenheitbe válthat.         |   |
|   | K10          | Fahrenheit - Celsius                           | A felhasználó Fahrenheitből Celsiusba válthat.         |   |
|   |              | **Felhasználói Kijelentkezés**                 |                                                        |   |
|   | K11          | Kijelentkezés                                  | A felhasználó bármikor kijelentkezhet az alkalmazásból.                                         |   |
|   |              | **Felhasználói Adatbázis**                     |                                                        |   |
|   | K12          | Felhasználói Adatok Tárolása                   | A felhasználók regisztrációjakor a rendszer tárolja felhasználónevüket és jelszavukat.|   |

---

