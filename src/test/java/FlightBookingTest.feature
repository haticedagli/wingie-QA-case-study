Feature:

  Scenario: Book one way flight ticket for given date
    Given Go to Enuygun Flight Ticket Selection Page
    And Choose from which point to board the plane
    And Choose where to go
    And Select departure date
    And Click on find cheap tickets
    And Select first ticket
    And Enter email address
    And Enter telephone number
    And Enter name
    And Enter surname
    And Enter birthday date
    And Enter TC Identification number
    And Enter hes code
    When Click on go to payment button
    Then Verify payment page is opened correctly

  Scenario: Book round-trip flight ticket for given dates
    Given Go to Enuygun Flight Ticket Selection Page
    And Choose from which point to board the plane
    And Choose where to go
    And Select departure date
    And Select return date
    And Click on find cheap tickets
    And Select first ticket
    And Select second ticket
    And Enter email address
    And Enter telephone number
    And Enter name
    And Enter surname
    And Enter birthday date
    And Enter TC Identification number
    And Enter hes code
    When Click on go to payment button
    Then Verify payment page is opened correctly
