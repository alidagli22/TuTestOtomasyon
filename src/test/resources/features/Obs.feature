@OBS
  Feature: OBS
    Scenario: OBS Login
      Given user on the Obs login page
      When user fill the empty boxes on Obs login page
      When user click log in button on Obs login page
      Then user should see logged in on Obs login page
      Then user should see welcome page on Obs login page
      When user click OBS button on Obs login page
      Then user should see Obs homepage page on Obs page
      Then user should click Kapat button on Obs page
      Then user should see Ogrenci no Title : "Öğrenci No" on Obs page
      Then user should see Ana Adi Title : "Ana Adı" on Obs page
      Then user should see Dogum Yeri Title : "Doğum Yeri" on Obs page
      Then user should see Sinif Title : "Sınıf" on Obs page
      Then user should see Ikincil E-Posta Title : "İkincil E-Posta" on Obs page
      Then user should see  GSM No Title : "GSM Numarası" on Obs page
      Then user should see Danisman E-Posta Title : "Danışman E-Posta" on Obs page
      Then user should see Birim Title : "Birim" on Obs page
      Then user should see Program Title : "Program" on Obs page
      Then user should see Mufredat Ad Title : "Müfredat" on Obs page
      Then user should see TC Kimlik No Title : "TC Kimlik No" on Obs page
      Then user should see Baba Adi Title : "Baba Adı" on Obs page
      Then user should see Yari Yil Title : "Yarı Yıl" on Obs page
      Then user should see Danisman-1 Title : "Danışman-1" on Obs page
      Then user should see Bolum Title : "Bölüm" on Obs page
      Then user should see Durum Title : "Durum" on Obs page
      Then user should see Ad Soyad Title : "Ad Soyad" on Obs page
      Then user should see Dogum Tarihi Title : "Doğum Tarihi" on Obs page
      Then user should see Kurumsal E-Posta Title : "Kurumsal E-Posta" on Obs page
      Then user should see Danisman-2 Title : "Danışman-2" on Obs page
      Then user should see Ana Bilim Dali Title : "Ana Bilim Dalı" on Obs page
      When user click ogrenci bilgileri button on the OBS page
      When user click Ders Programi button on the OBS page
      Then should see Ders Programi title: "Ders Programı" in Ders Programi page on Obs page
      Then user sholud see Pazartasi Title:"Pazartesi" in Ders Programi page on the Obs
      Then user sholud see Sali Title:"Salı" in Ders Programi page on the Obs page
      Then user sholud see Carsamba Title:"Çarşamba" in Ders Programi page on the Obs page
      Then user sholud see Persembe Title:"Perşembe" in Ders Programi page on the Obs page
      Then user sholud see Cuma Title:"Cuma" in Ders Programi page on the Obs page
      Then user sholud see Cumartesi Title:"Cumartesi" in Ders Programi page on the Obs page
      Then user sholud see Pazar Title:"Pazar" in Ders Programi page on the Obs page
      When user click ogrenci bilgileri button on the OBS page
      When user click Google Classroom button on the OBS page
      Then user sholud see Google Classroom Title:"Google Classroom / Microsoft Teams" in Ders Programi page on the Obs page
      When user click ogrenci bilgileri button on the OBS page
      When user click Tum Ders Mufreddati button on the OBS page
      Then user sholud see Tum Ders Mufredati Title:"Tüm Ders Müfredatı" in Ders Programi page on the Obs page
      When user click ogrenci bilgileri button on the Obs page
      When user click Devam Durumu button on the Obs page
      Then user should see Devam Durumu title : "Devam Durumu" in Devam Durumu page on the Obs page
      When user click ogrenci bilgileri button on the Obs page
      When user click Sinav Programi button on the Obs page
      Then user should see Sinav Programi title: "Sınav Programı" in Sinav Programi page on the Obs page
      When user click Ogrenci Bilgileri button on Obs page
      When user click Akademik Takvim button on the Obs page
      Then user should se Akademik Takvim title: "Akademik Takvim" in Akademik Takvim on the Obs page
      Then user should see Aktivite takvim gecmistir title: "Aktivite tarihi geçmiştir" in Akademik Takvim page on the Obs page
      Then user should see Aktivite tarihi icerisindesiniz title : "Aktivite tarihi içerisindesiniz" in Akademik takvim page on the Obs page
      Then user should see Aktivite tarihi gelmemistir title: "Aktivite tarihi gelmemiştir" in Akademik Takvim page on the Obs page
      When user click on Ogrenci Bilgi button on the Obs page
      When user click Ogrenci Disiplin Cezalari button on the Obs page
      Then user should see Kalite Koordinatorlugu PageOgrenci Disiplin Cezalari title: "Öğrenci Disiplin Cezaları" in Ogrenci Disiplin Cezalari on the Obs page
      When user click Ogrenci Bilgileri button on the Obs page
      When user click Taleplerim button on the Obs page
      Then user should see Taleplerim title: "Taleplerim" in Taleplerim page on the Obs page
      When user click Kayit Yenileme İslemleri page on the Obs page
      When user click Ders Kayit Islemleri page on the Obs page
      Then user should see Ogrenci No title: "Öğrenci No" in Ders Kayit Islemleri on the Obs page
      Then user should see Sinif title: "Sınıf" in Ders Kayit Islemleri on the Obs page
      Then user should see Danisman title: "Danışman" in Ders Kayit Islemleri on the Obs page
      Then user should see Bolum title: "Bölüm" in Ders Kayit Islemleri on the Obs page
      Then user should see Program title: "Program" in Ders Kayit Islemleri on the Obs page
      Then user should see Ad Soyad title: "Ad Soyad" in Ders Kayit Islemleri on the Obs page
      Then user should see Yari Yil title: "Yarı Yıl" in Ders Kayit Islemleri on the Obs page
      Then user should see Birim title: "Birim" in Ders Kayit Islemleri on the Obs page
      Then user should see Ana Bilim Dali title: "Ana Bilim Dalı" in Ders Kayit Islemleri on the Obs page
      Then user should see Harc Borcu title: "Harç Borcu" in Ders Kayit Islemleri on the Obs page
      When user click Not Islemleri button on the Obs page
      When user click Not Goruntuleme button on the Obs page
      Then user should see Not Goruntuleme title: "Not Görüntüleme" in Not Goruntuleme on the Obs page
      When user click Not Islemleri button on the Obs page
      When user click Onur-Yuksek Onur Belgesi button on the Obs page
      Then user should see Onur-Yuksek Onur Belgesi title: " Onur-Yüksek Onur Belgesi" in Not Islemleri on the Obs page
      When user click Sinav Talep Islemleri button on the Obs page
      When user click Muafiyet Basvurusu button on the Obs page
      Then user should see Muafiyet Basvurusu title: " Muafiyet Başvurusu" in Sinav Talep Islemleri on the Obs page
      When user click Erasmus Basvuru Islemleri button on the Obs page
      When user click Erasmus Basvurulari button on the Obs page
      Then should see Erasmus Basvurulari title: "Erasmus Başvuruları" in Erasmus Basvuru Islemleri on the Obs page
      When user click Harc Borc Islemleri button on the Obs page
      When user click Banka Bilgilerim button on the Obs page
      Then user should see Banka Bilgilerim title: "Banka Bilgilerim" in Harc Borc Islemleri on the Obs page
      When user click Harc Borc Islemleri button on the Obs page
      When user click Harc Borc Bilgileri button on the Obs page
      Then user should see Harc Bilgileri title: "Harç Billgileri" in Harc Borc Islemleri on the Obs page
      When user click Basvuru Islemleri button on the Obs page
      When user click CAP Ve YAP Basvurulari button on the Obs page
      Then user should see Aday Başvurulari title: "Aday Başvuruları" in CAP Ve YAP Basvurulari on the Obs page
      Then user should see Basvuru Turu title: "Başvuru Türü" in CAP Ve YAP Basvurulari on the Obs page
      Then user should  see Yil title: "Yıl" in CAP Ve YAP Basvurulari on the Obs page
      Then user should see Donem title: "Dönem" in CAP Ve YAP Basvurulari on the Obs page
      When user click Basvuru Islemleri button on the Obs page
      When user click Kurum Ici button on the Obs page
      Then user should see Basvurular title: "Başvurular" in Basvuru Islemleri on the Obs page
      When user click Basvuru Islemleri button on the Obs page
      When user click Staj Basvuru Islemleri button on the Obs page
      Then user should see Basvuru Yapilabilecek Acık Staj Ilanlari title:"Başvuru Yapılabilecek Açık Staj İlanları" in Staj Basvuru Islemleri on the Obs page
      Then user should see Staj Basvurulariniz title: "Staj Başvurularınız" in Staj Basvuru Islemleri on the Obs page















