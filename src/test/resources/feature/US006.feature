Feature: US1001 Kullanici Amazon Sayfasinda Arama Yapar

  @Nutella  @ikisi
  Scenario: Tc01 kulanici amazonda Nutella aratir

    Given Kullanıcı  Medunna url sayfasina gider
    Then Kullanici giris ikon'una tiklar
    And Kullanıcı "Sign in" butonuna tiklar
    And Kullanıcı gecerli User name girer
    And Kullanıcı gecerli Password girer
    And Kullanıcı "Sign in" butonuna tiklar ve oturum acar


