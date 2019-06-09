@Youtube

Feature: Youtube

  Scenario Outline: Gv to vid
    Given I go to youtube page for vid: '<Video>' and play it for 30 secs

    Examples:
      | Video       |
      | zweK6x8-DkE |
      | xy7WIDHI89c |
      | NS1GKlqP4NY |