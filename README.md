# TeliaSuvi2022
Telia suvepraktika kodutöö 2022

## Tehtud tööst
Töö on jaotatud kahte peamisesse kausta, millest ühes on front-end ja teises on back-end. Kuna mul läks vahepeal kiireks, siis on töö veel tiba poolik.

## Front-end
Front-end on tehtud React põhiselt. Arenduskeskkonnaks Visual Studio Code.

Front-end tegemine jäi rohkem poolikuks kui back-end. Arendamise ajal kasutasin serveri jooksutamiseks **npm**-i.
Rakenduse *layout* sai peaaegu valmis, puudub ühendus back-end osaga.

### Front-end jooksutamiseks
- Navigeeru front-end kausta
- Jooksuta projekti **npm**-iga

## Back-end
Back-end on tehtud Spring Boot põhiselt, andmebaasi aluseks PostgreSQL. Arenduskeskkonnaks IntelliJ.

Back-end osa on põhimõtteliselt valmis, puudu ainult mõned väiksemad lihvimised, mis kaasneksid sellega kui ühendaks front-end osaga.

### Back-end jooksutamiseks
- Jooksuta klassi `..src\main\java\com\homework\betting\BettingApplication.java` oma eelistatud arenduskeskkonnas
- Juhul kui andmebaasi ei genereeru automaatselt:
  - loo andmebaas nimega `betting` ning anna ligipääs kasutajale `postgres` parooliga `admin` (tabelid tekitatakse app'i poolt)
  - jooksuta andmebaas kohalikus serveris portil `5432`
