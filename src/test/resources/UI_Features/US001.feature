Feature: US001_Kayıt olmak icin SSN, Firstname ve Lastname bilgileri girililebilmelidir.


  @d
  Scenario : US001_TC01_SSN boş bırakılamaz
    Given Kullanici "medunna_url" sayfasina gider
    And   Kullanici Anasayfada  kullanici ikonu altinda yer alan register butonuna tiklar
    When Kullanici SSN kutucuğuna tıklar
    Then SSN kutucuğunu  boş bırakır
    And 'Your SSN is required.' uyarı mesajını görüntüler

