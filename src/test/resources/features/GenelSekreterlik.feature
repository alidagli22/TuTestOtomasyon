@GenelSekreterlik

Feature: Genel Sekreterlik

  Scenario:
    Given user on the Genel Sekreterlik Page
    Then user should see Duyurular title : "Duyurular" on Genel Sekreterlik page
    Then user should see Radyo Gunebakan on Genel Sekreterlik Page

    Scenario:
      Given user on the Genel Sekreterlik Page
      When user click Yazi Isleri Button on Genel Sekreterlik Page
      Then user should see Bilgi Islem Ahmet Göktas title: "Bilg.İşl. Ahmet GÖKTAŞ" in yazi isleri on Genel Sekreterlik Page
      Then user should see Bilgi Islem Musatafa Sahin title: "Bilg.İşl. Mustafa ŞAHİN" in yazi isleri on Genel Sekreterlik Page
      Then user should see Bilgi Islem Serpil Gici title: "Bilg.İşl. Serpil GICI" in yazi isleri on Genel Sekreterlik Page
      Then user should see Bilgi Islem Memur Aysecan Yavuz title: "Memur Ayşecan YAVUZ" in yazi isleri on Genel Sekreterlik Page


  Scenario:
    Given user on the Genel Sekreterlik Page
    When user click Yonetim ve Senato Button on Genel  Sekreterlik Page
    Then user should see Bilgi Islem Ahmet Onder OZTURMEN title: "Bilg.İşl. Ahmet Önder ÖZTÜRMEN" in yönetim ve senato on Genel Sekreterlik Page
    Then user should see Bilgi Islem Cuneyt Kaptan title: "Bilg.İşl. Cüneyt KAPTAN" in yönetim ve senato on Genel Sekreterlik Page



  Scenario:
    Given user on the Genel Sekreterlik Page
    When user click EBYSE-IMZA Button on Genel Sekreterlik Page
    Then user should see Ogr.Gor. Gungor Ilkiz YUKSEL title:"Öğr.Gör. Güngör İlkiz YÜKSEL" in EBYSE-IMZA on on Genel Sekreterlik Page


  Scenario:
    Given user on the Genel Sekreterlik Page
    When user click Sekreterya Button on Genel Sekreterlik Page
    Then user should see Kdr.Isc. Oguz BATUR title:"Kdr.İşç. Oğuz BATUR" in Sekreterya on Genel Sekreterlik Page

  Scenario:
    Given user on the Genel Sekreterlik Page
    When user click Evrak Kayit Button on Genel Sekreterlik Page
    Then user should see Bilg.İsl. Ayten GILAN title:"Bilg.İşl. Ayten GİLAN" in Evrak Kayit on Genel Sekreterlik Page
    Then user should see Bilg.İsl. Cıhat CINAR title:"Bilg.İşl. Cihat ÇINAR" in Evrak Kayit on Genel Sekreterlik Page
    Then user should see Ogr.Gor Gungor Ilkiz YUKSEL title:"Öğr.Gör Güngör İlkyiz YÜKSEL" in Evrak Kayit on Genel Sekreterlik Page



  Scenario:
    Given user on the Genel Sekreterlik Page
    When user click Afet ve ACil Durum button on Genel Sekreterlik Page
    When user click Sivil Savunma button on Genel Sekreterlik page
    Then user should see Bilg.İsl. Huseyin Turkel title: "Bilg.İsl. Hüseyin TÜRKEL" in Sivil Savunma on Genel Sekreterlik page


  Scenario:
    Given user on the Genel Sekreterlik Page
    When user click Bir Ogrenci de Sen Okut button on Genel Sekreterlik Page
    Then user should see Ogr.Gor Gungor Ilkiz Yuksel title: "Ogr.Gor Gungor Ilkiz Yuksel" in Bir Ogrenci de Sen Okut button on Genel Sekreterlik Page


  Scenario:
    Given user on the Genel Sekreterlik Page
    When user click Servis Odasi button on Genel Sekreterlik Page
    Then user should see Hizmetli Fedai AKGUN title: "Hizmetli Fedai AKGÜN" in Servis Odasi on Genel Sekreterlik Page



