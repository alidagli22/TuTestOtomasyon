@rektor
Feature:Rektor

  Scenario:
    Given user on the rektor page
    Then user should see Rektor picture
    Then user should see "Biyografi" title
    Then user should see rektor name "Prof. Dr. Erhan TABAKOĞLU"
    Then user should see Yayınlar title
    Then user should see Bildiri title


  Scenario:
    Given User on the rektor page
    When user click on Trakya Universitesi button
    Then user should see trakya universitesi page

  Scenario:
    Given user on the rektor page
    When user click on Personel Arama button
    Then user should see Personel Arama Page

    Scenario:
      Given user on the rektor page
      When user click on Duyuru Takibi
      Then user should see Duyuru takibi page