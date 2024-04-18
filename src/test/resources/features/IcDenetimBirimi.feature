@IcDenetimBirimi

Feature: Ic Denetim Birimi

  Scenario:
    Given user on the Ic Denetim Birimi page
    Then user should see Ic Denetim Birimi title : "İç Denetim Birimi" on Ic Deneteim Birimi page

  Scenario:
    Given user on the Ic Denetim Birimi page
    Then user should see Ic Denetim Yonergesi Button


  Scenario:
    Given user on the Ic Denetim Birimi page
    When user click Gorev ve Sorumluluklar button on Ic Denetim Birimi page
    Then user should see Gorev ve Sorumluluklar title:"Görev Yetki ve Sorumluluklar" in Gorev ve Sorumluluklar on Ic Denetim Birimi page
    Then user should see Ic Denetcinin Gorevleri title: "İÇ DENETÇİNİN GÖREVLERİ" in Gorev ve Sorumluluklar on Ic Denetim Birimi page

  Scenario:
    Given user on the Ic Denetim Birimi page
    When user click Ic Denetim Rehberi button on Ic Denetim Birimi page
    Then user should see Ic Denetim Rehberi title : "İç Denetim Rehberi" on Ic Deneteim Birimi page

  Scenario:
    Given user on the Ic Denetim Birimi page
    Then user should see Kamu Ic Denetimi Standartları button


