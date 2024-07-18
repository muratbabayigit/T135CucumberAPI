@Api
Feature: collectAPI sorgu

  Scenario: collectApi Eczaneler

    Given kullanici collectApi adresine gider
    Then kullanici path parametresi icin "health/dutyPharmacy" degerlerini girer
    Then kullanici query parametresi olarak key degerine "il" value degerine "İstanbul" girer
    Then kullanici donen respnse degerini kaydeder
    And kullanici donden response deerini yazdiri

  Scenario: Doviz Fiyatlari
    Given kullanici collectApi adresine gider
    Then kullanici path parametresi icin "economy/currencyToAll" degerlerini girer
    Then kullanici query parametresi olarak key degerine "int" value degerine 1 girer "base" degerine "TRY" girer
    Then kullanici donen respnse degerini kaydeder
    And kullanici donden response deerini yazdiri