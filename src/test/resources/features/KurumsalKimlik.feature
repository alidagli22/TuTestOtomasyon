@KurumsalKimlik
Feature: Kurumsal Kimlik

  Scenario:
    Given user on the Kurumsal Kimlik Page
    Then user should see Logo Indirme title : "Logo İndirme" on Kurumsal Kimlik Page
    Then user should see Normal Kullanim title : "Normal Kullanım" on Kurumsal Kimlik Page
    Then user should see Normal Kullanim Ingilizce title : "Normal Kullanım İngilizce" on Kurumsal Kimlik Page
    Then user should see Yatay Kullanim title : "Yatay Kullanım" on Kurumsal Kimlik Page
    Then user should see Yatay Kullanim Ingilizce title : "Yatay Kullanım İngilizce" on Kurumsal Kimlik Page
    Then user should see Logo Indirme title : "Logo İndirme" on Kurumsal Kimlik Page
    When user click on Kurumsal Kimlik Rehberi Button
    When user click on Anasayfa Button
    When user click on Birim Logolari Button
    When user click on Bize Ulasin Button
    When user click on Trakya Universitesi Button Button
    Then user should see SSS title:"SSS" on Kurumsal Kimlik page
    Then user should see Twitter title : "Twitter" on Kurumsal Kimlik page
    Then user should see Facebook title : "Facebook" on Kurumsal Kimlik page
    Then user should see Youtube title : "Youtube" on Kurumsal Kimlik page


