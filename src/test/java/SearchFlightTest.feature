Feature:

  Scenario: Search for one way flight ticket for given date
    Given Go to Enuygun Flight Ticket Selection Page
    And Choose from which point to board the plane
    And Choose where to go
    And Select departure date
    When Click on find cheap tickets
    Then Verify page listing one-way flight tickets

  Scenario: Search for round-trip flight ticket for given dates
    Given Go to Enuygun Flight Ticket Selection Page
    And Choose from which point to board the plane
    And Choose where to go
    And Select departure date
    And Select return date
    And Click on find cheap tickets
    When Select first ticket
    Then Verify page listing return flight tickets



